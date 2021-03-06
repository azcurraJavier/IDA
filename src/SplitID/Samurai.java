package SplitID;

import DictionaryDB.Dictionary;
import DictionaryDB.OperationDB;
import Listas.Archivo;
import Listas.Comentario;
import Listas.Literal;
import Listas.MostrarTabla;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Javier Azcurra
 */
public class Samurai {

    private  int frecuenciaLocal;

    //Tablas de frecuencia
    private  Map<String, Integer> localFreqTable;
    private  Map<String, Integer> globalFreqTable;

    public Samurai(Archivo archivo) {

        frecuenciaLocal = 0;
        
        localFreqTable = new HashMap();
        globalFreqTable = new HashMap();


        for (Comentario com : archivo.getLisComentario()) {
            fraseProces(com.getCom());
        }

        for (Literal l : archivo.getLisLiterales()) {
            fraseProces(l.getText());
        }

        //conserv
        String softwordDiv;

        for (MostrarTabla mt : archivo.getLisMostrarTabla()) {

            //separa simbolos especiales
            softwordDiv = SplitUtils.splitSymbol(mt.getNomId());

            //separa camelcase
            softwordDiv = SplitUtils.splitLowerToUpper(softwordDiv);
            
            //debe haberse separado sino el softword tendra score y no se separara
            if(softwordDiv.contains(" ")){
                
                fraseProces(softwordDiv);
                            
            }            
            
        }

        String id;
        for (Map.Entry mapEntry : localFreqTable.entrySet()) {
            id = mapEntry.getKey().toString();
            globalFreqTable.put(id, frecuenciaGlobal(id));
        }

    }

    private  void fraseProces(String linea) {

        //limpieza
        linea = linea.replaceAll("\"", "").trim();
        //excluir simbolos
        linea = linea.replaceAll("[^A-Za-z ]", "");

        if (linea.isEmpty()) {
            return;
        }

        //filtrar palabras irrelevantes
        String arrayCom[] = linea.split(" ");

        for (String pal : arrayCom) {

            if (pal == null || pal.isEmpty()) {
                continue;
            }

            //para evitar problemas todo con minuscula
            pal = pal.toLowerCase();

            //las letras no convienen
            if (pal.length()> 1 && !OperationDB.select("stop_dict", pal)) {
                //si no es una palabra irrelevante la agrego                    
                addTokenLocalFreqTable(pal, 1);
            }

        }
    }

    public  Map<String, Integer> getLocalFreqTable() {
        return localFreqTable;
    }

    public  Map<String, Integer> getGlobalFreqTable() {
        return globalFreqTable;
    }

    public  String ejecutar(String id) {

        return divisionHardWord(id);
    }

    //Manipulacion de tablas de frecuencia
    private  void addTokenLocalFreqTable(String id, int cantOcc) {

        if (id == null || id.trim().isEmpty() || cantOcc <= 0) {
            return;
        }

        //importante: deben ir todos con minusculas
        id = id.toLowerCase();

        int temp = 0;

        if (localFreqTable.containsKey(id)) {

            temp = localFreqTable.get(id);

            localFreqTable.remove(id);

        }

        temp = temp + cantOcc;

        localFreqTable.put(id, temp);

    }

    private  int frecuenciaLocal(String id) {//Freq(t; p)        

        if (id == null || id.trim().isEmpty()) {
            return 0;
        }

        if (localFreqTable.containsKey(id)) {
            return ((int) localFreqTable.get(id));
        }

        return 0;

    }

    private  int frecuenciaGlobal(String id) {//globalFreq(t)

        if (id == null || id.trim().isEmpty()) {
            return 0;
        }

        return Dictionary.selectFreq("sam_freq_table", id);

    }

    private  int todasFreqStr() {//AllStrsFreq(p)

//        return freAcum;
        if (frecuenciaLocal > 0) {
            return frecuenciaLocal;
        }
        for (Map.Entry mapEntry : localFreqTable.entrySet()) {
            frecuenciaLocal += (int) mapEntry.getValue();
        }

        return frecuenciaLocal;

    }

    private  double score(String id) {

        if (id == null || id.trim().isEmpty()) {
            return 0.0;
        }

        double freqApa = frecuenciaLocal(id);//Freq(t; p)
        double freqGlobal = frecuenciaGlobal(id);//globalFreq(t)
        double todasFreqStr = todasFreqStr();//AllStrsFreq(p)        

        //Freq(t; p) + globalFreq(t)/log10(AllStrsFreq(p))        
        double logFreq = Math.log10(todasFreqStr);

        return freqApa + (freqGlobal / logFreq);
    }

    private  String splitOnLowercaseToUppercase(String token) {

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < token.length() - 1; i++) {//-1 sino puede dar excepción en i+1

            newStr.append(token.charAt(i));

            if (token.charAt(i) != ' ' && 
                    Character.isLowerCase(token.charAt(i)) && 
                        Character.isUpperCase(token.charAt(i + 1))) {

                newStr.append(" ");
            }

        }

        newStr.append(token.charAt(token.length() - 1));

        token = newStr.toString();

        return token;
    }

    private  int existUpperToLower(String s) {

        if (s == null || s.trim().isEmpty()) {
            return -1;
        }

        int i = 0;

        while (i < s.length() - 1) {//-1 sino puede dar excepción en i+1
            if (Character.isUpperCase(s.charAt(i)) && Character.isLowerCase(s.charAt(i + 1))) {
                return i;
            }
            i++;
        }

        return -1;
    }

    private  String subStr(String s, int x, int y) {

        if (s == null || s.trim().isEmpty()) {
            return "";
        }

        if (x < 0 || y < 0 || x > y) {
            System.out.println("subStr: Limites invalidos: <x,y> " + x + y);
            return "";
        }

        return s.substring(x, y);

    }

    private  String divisionHardWord(String token) {

        String sToken = "";

        token = SplitUtils.splitSymbol(token);
        token = splitOnLowercaseToUppercase(token);

        String lisToken[] = token.split(" ");

        for (String s : lisToken) {//este for es para casos camelcase

            int i = existUpperToLower(s);

            s = s.toLowerCase();

            if (i == -1) {
                //si stoken es vacio asigno el s directamente
                sToken = sToken.equals("") ? s : sToken + " " + s;

                //si no hay Mayus seguida de Minus continua con el prox s.
                continue;
            }

            int n = s.length();

            double camelScore;

            camelScore = score(subStr(s, i, n));

            double altScore = score(subStr(s, i + 1, n));

            double raizAltSco = Math.sqrt(altScore);

            if (camelScore > raizAltSco) {
                if (i > 0) {

                    s = subStr(s, 0, i) + " " + subStr(s, i, n);
                }
            } else {

                if (camelScore != raizAltSco) {

                    s = subStr(s, 0, i + 1) + " " + subStr(s, i + 1, n);
                }
            }

            //si stoken es vacio asigno el s directamente
            sToken = sToken.equals("") ? s : sToken + " " + s;
        }

        token = sToken.toLowerCase();
        sToken = "";

        lisToken = token.split(" ");

        for (String s : lisToken) {

            sToken = sToken.equals("") ? divisionSoftWord(s, score(s)) : sToken + " " + divisionSoftWord(s, score(s));
        }

        return sToken;
    }

    private  String divisionSoftWord(String s, double score) {

        String splitS = s;
        int n = s.length();//se sca el -1 porque subStr es exclusivo
        double maxScore = -1;

        double scoreL, scoreR;
        boolean prefix, toSplitL, toSplitR;

        //tomo i = 1 por lo de limite exclusivo
        for (int i = 0; i <= n; i++) {//el = igual va porque sino no analiza toda la palabra

            scoreL = score(subStr(s, 0, i));
            scoreR = score(subStr(s, i, n));

            prefix = isPrefix(subStr(s, 0, i)) || isSuffix(subStr(s, i, n));

            toSplitL = Math.sqrt(scoreL) > Math.max(score(s), score);
            toSplitR = Math.sqrt(scoreR) > Math.max(score(s), score);

            if (!prefix && toSplitL && toSplitR) {

                if ((scoreL + scoreR) > maxScore) {
                    maxScore = scoreL + scoreR;
                    splitS = subStr(s, 0, i) + " " + subStr(s, i, n);
                }

            } else if (!prefix && toSplitL) {
                //llamada recursiva
                String temp = divisionSoftWord(subStr(s, i, n), score);

                if (temp.contains(" ")) {//temp se dividió?
                    splitS = subStr(s, 0, i) + " " + temp;
                }

            }

        }

        return splitS;
    }

    private  boolean isPrefix(String s) {

        if (s == null || s.isEmpty()) {
            return false;
        }

        return Dictionary.searchWordDic("sam_pref", s);

    }

    private  boolean isSuffix(String s) {

        if (s == null || s.isEmpty()) {
            return false;
        }

        return Dictionary.searchWordDic("sam_suf", s);

    }

}
