package SplitID;

import DictionaryDB.Dictionary;
import Listas.Clase;
import Listas.MostrarTabla;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SamuraiPaper {

    private Clase claseActual;
    private String identificador;
    //private int cantTotalIde;

    static int frecuenciaLocal;

    //Tablas de frecuencia
    static Map localFreqTable;
    static Map globalFreqTable;

    public SamuraiPaper(Clase claseAc, String ide) {

        this.frecuenciaLocal = 0;

        this.claseActual = claseAc;
        this.identificador = ide;
        //this.cantTotalIde = claseAc.getCantTotalId();

        this.localFreqTable = new HashMap();
        this.globalFreqTable = new HashMap();

        //cargar tablas
        for (MostrarTabla m : claseActual.getIdTablaClase()) {

            addTokenLocalFreqTable(m.getNomId(), m.getNumApa());
        }

    }
    
    public static String ejecutar(String id){

       return mixedCaseSplit(id);
    }

    //Manipulacion de tablas de frecuencia
    public static void addTokenLocalFreqTable(String id, int cantOcc) {

        if (id == null || id.trim().isEmpty() || cantOcc <= 0) {
            return;
        }

        int temp = 0;

        if (localFreqTable.containsKey(id)) {

            temp = (int) localFreqTable.get(id);

            localFreqTable.remove(id);

        }

        temp = temp + cantOcc;

        localFreqTable.put(id, temp);

    }

    public static int frecuenciaLocal(String id) {//Freq(t; p)        

//        int cantApa = 0;
//        for (MostrarTabla m : claseActual.getIdTablaClase()) {
//
//            if (id.equals(m.getNomId())) {
//                cantApa = m.getNumApa();
//                break;
//            }
//        }
//
//        return cantApa / cantTotalIde;
        if (id == null || id.trim().isEmpty()) {
            return 0;
        }

        if (localFreqTable.containsKey(id)) {
            return (int) localFreqTable.get(id);
        }

        return 1;

    }

    public static int frecuenciaGlobal(String id) {//globalFreq(t)

//        int cantApa = 0;
//
//        for (Iterator<Clase> it = ListaClase.getLisClases().iterator(); it.hasNext();) {
//            Clase cla = it.next();
//
//
//            for (MostrarTabla m : cla.getIdTablaClase()) {
//
//                if (identificador.equals(m.getNomId())) {
//                    cantApa += m.getNumApa();
//                }
//            }
//
//        }
//
//        return cantApa / cantTotalIde;
        if (id == null || id.trim().isEmpty()) {
            return 0;
        }

        if (id.length() == 1) {
            return 50;
        }

        if (id.length() == 2) {
            return 35;
        }

        if (id.length() == 3 && Dictionary.searchWordDic("acro_dict", id)) {
            return 12;
        }

        if (id.length() >= 4) {

            int temp = Dictionary.likeWordDic("words_dict", id).size();

            return temp * 5;

        }

        return 1;

    }

    public static int todasFreqStr() {//AllStrsFreq(p)

//        double freAcum = 0.0;
//
//        for (Iterator<Clase> it = ListaClase.getLisClases().iterator(); it.hasNext();) {
//            Clase cla = it.next();
//
//
//            for (MostrarTabla m : cla.getIdTablaClase()) {
//
//
//                freAcum += frecuenciaLocal(m.getNomId());
//
//            }
//
//        }
//
//        return freAcum;
        if (frecuenciaLocal != 0) {
            return frecuenciaLocal;
        }

        for (Iterator<Map> it = localFreqTable.entrySet().iterator(); it.hasNext();) {
            Map.Entry mapEntry = (Map.Entry) it.next();
            frecuenciaLocal += (int) mapEntry.getValue();
        }

        return frecuenciaLocal;

    }

    public static double score(String id) {

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

    public static String splitOnLowercaseToUppercase(String token) {

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < token.length() - 1; i++) {//-1 sino puede dar excepción en i+1

            newStr.append(token.charAt(i));
            if (Character.isLowerCase(token.charAt(i)) && Character.isUpperCase(token.charAt(i + 1))) {
                newStr.append(" ");
            }

        }

        newStr.append(token.charAt(token.length() - 1));

        token = newStr.toString();

        return token;
    }

    public static int existUpperToLower(String s) {

//        for (int i = 0; i < s.length() - 1; i++) {//-1 sino puede dar excepción en i+1
//            if (Character.isUpperCase(s.charAt(i)) && Character.isLowerCase(s.charAt(i + 1))) {
//                return i;
//            }
//        }
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

    public static String subStr(String s, int x, int y) {

        if (s == null || s.trim().isEmpty()) {
            return "";
        }

        if (x < 0 || y < 0 || x > y) {
            System.out.println("subStr: Limites invalidos: <x,y> " + x + y);
            return "";
        }

        return s.substring(x, y);

    }

    public static String mixedCaseSplit(String token) {
        
        String sToken = "";        

        token = SplitUtils.splitSymbol(token);
        token = splitOnLowercaseToUppercase(token);

        String lisToken[] = token.split(" ");

        for (String s : lisToken) {//este for es para casos camelcase

            int i = existUpperToLower(s);

            if (i == -1) {
                //si stoken es vacio asigno el s directamente
                sToken = sToken.equals("") ? s : sToken + " " + s;
                
                //si no hay Mayus seguida de Minus continua con el prox s.
                continue;
            }

            int n = s.length() - 1;

            double camelScore;

            camelScore = score(subStr(s, i, n));

            double altScore = score(subStr(s, i + 1, n));

            double raizAltSco = Math.sqrt(altScore);

            if (camelScore > raizAltSco) {
                if (i > 0) {

                    s = subStr(s, 0, i - 1) + " " + subStr(s, i, n);
                }
            } else {

                s = subStr(s, 0, i) + " " + subStr(s, i + 1, n);
            }

            //si stoken es vacio asigno el s directamente
            sToken = sToken.equals("") ? s : sToken + " " + s;
        }

        token = sToken;
        sToken = "";

        lisToken = token.split(" ");

        for (String s : lisToken) {

            sToken = sToken.equals("") ? sameCaseSplit(s, score(s)) : sToken + " " + sameCaseSplit(s, score(s));
        }
        
        return sToken;
    }

    public static String sameCaseSplit(String s, double score) {

        String splitS = s;
        int n = s.length();//se sca el -1 porque subStr es exclusivo
        double maxScore = -1;

        double scoreL, scoreR;
        boolean prefix, toSplitL, toSplitR;

        //tomo i = 1 por lo de limite exclusivo
        for (int i = 1; i < n; i++) {

            scoreL = score(subStr(s, 0, i));
            scoreR = score(subStr(s, i, n));

            prefix = isPrefix(subStr(s, 0, i)) || isSuffix(subStr(s, 0, i));

            toSplitL = Math.sqrt(scoreL) > Math.max(score(s), score);
            toSplitR = Math.sqrt(scoreR) > Math.max(score(s), score);

            if (!prefix && toSplitL && toSplitR) {

                if ((scoreL + scoreR) > maxScore) {
                    maxScore = scoreL + scoreR;
                    splitS = subStr(s, 0, i) + " " + subStr(s, i, n);
                }

            } else if (!prefix && toSplitL) {
                //llamada recursiva
                String temp = sameCaseSplit(subStr(s, i, n), score);

                if (temp.contains(" ")) {//temp se dividió?
                    splitS = subStr(s, 0, i) + " " + temp;
                }

            }

        }

        return splitS;
    }

    public static boolean isPrefix(String s) {

        return Dictionary.searchWordDic("sam_pref", s);

    }

    public static boolean isSuffix(String s) {

        return Dictionary.searchWordDic("sam_suf", s);

    }

}
