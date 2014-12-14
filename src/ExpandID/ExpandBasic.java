package ExpandID;

import DictionaryDB.Dictionary;
import DictionaryDB.OperationDB;
import Listas.Archivo;
import Listas.Clase;
import Listas.ClassBodyDecl;
import Listas.Comentario;
import Listas.Literal;
import Listas.Metodo;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

/**
 *
 * @author javier
 */
public class ExpandBasic {

    private  ArrayList<String> palabrasCap;

    private  ArrayList<String> frasesCap;

    private  ArrayList<String[]> palabrasArrayCap;

    private  ArrayList<String[]> frasesArrayCap;

    private  ArrayList<String> listExp;

    private  String unicaExp;

    private  String clase;
    private  String metodo;

    public ExpandBasic(Archivo archivo) {

        palabrasCap = new ArrayList();

        frasesCap = new ArrayList();

        palabrasArrayCap = new ArrayList();

        frasesArrayCap = new ArrayList();

        listExp = new ArrayList();

        unicaExp = "";
        clase = "";
        metodo = "";

        ArrayList<String[]> comCap = new ArrayList<>();
        String[] e;

        for (Comentario com : archivo.getLisComentario()) {

            e = new String[3];

            e[0] = com.getCom();
            procesarClasMetLin(archivo, com.getCom(), com.getLinea());
            e[1] = clase;
            e[2] = metodo;

            comCap.add(e);

        }

        for (Literal l : archivo.getLisLiterales()) {

            e = new String[3];

            e[0] = l.getText();
            procesarClasMetLin(archivo, l.getText(), l.getLine());
            e[1] = clase;
            e[2] = metodo;

            comCap.add(e);
        }

        for (String[] elem : comCap) {

            String fr = elem[0];

            //limpieza
            fr = fr.replaceAll("\"", "").trim();
            //excluir simbolos
            fr = fr.replaceAll("[^A-Za-z ]", "");

            if (fr.isEmpty()) {
                continue;
            }

            //filtrar palabras irrelevantes
            String arrayCom[] = fr.split(" ");

            String frase = "";

            for (String pal : arrayCom) {

                if (pal == null || pal.isEmpty()) {
                    continue;
                }

                //para evitar problemas todo con minuscula
                pal = pal.toLowerCase();

                if (!OperationDB.select("stop_dict", pal)) {
                    //si no es una palabra irrelevante la agrego

                    elem[0] = pal;

                    palabrasArrayCap.add(elem.clone());
                    palabrasCap.add(pal);
                    frase += pal + " ";

                }

            }

            if (!frase.isEmpty()) {
                frase = frase.substring(0, frase.length() - 1);
                elem[0] = frase;
                frasesArrayCap.add(elem.clone());
                frasesCap.add(frase);
            }

        }

    }

    private  void procesarClasMetLin(Archivo archivo, String com, int lin) {

        clase = "";
        metodo = "";

        for (Clase c : archivo.getLisClases()) {

            if (c.getLineaCom() <= lin && lin <= c.getLineaFin()) {//localiza la clase donde está ubicado

                clase = c.getIde().getNomID();

                for (ClassBodyDecl cbd : c.getClassBodyDecl()) {

                    Metodo met = cbd.getMetodo();

                    if (met == null) {
                        continue;
                    }

                    //localiza el metodo donde está ubicado
                    if (met.getLineaCom() <= lin && lin <= met.getLineaFin()) {

                        metodo = met.getIde().getNomID();

                        return;

                    }

                }
            }

        }

    }

    public  ArrayList<String[]> getFrasesCap() {
        return frasesArrayCap;
    }

    public  String ejecutar(String w, String clase, String met) {

        if (w == null || w.isEmpty()) {
            return "";
        }

        unicaExp = w;

        //procesarFrases();        
        w = w.toLowerCase();

        //si esta en stop list no se ejecuta la expansion
        if (Dictionary.searchWordDic("stop_dict", w)) {
            return w;
        }

        //acronimo
        String cand = expandirAcro(w, clase, met);

        if (cand != null) {
            //listExp.add(cand);
            return cand;
        }

        //abreviacion comun
        cand = expandirAbrev(w, clase, met);

        if (cand != null) {
            //listExp.add(cand);
            return cand;
        }

        //Busqueda en diccionario - ultimo recurso
        if (Dictionary.searchWordDic("words_dict", w)) {
            return w;
        }

        if (w.length() == 1 || w.length() == 3) {//exige 3 sino el like trae muchos resultados
            //no más de 3 porque expande casos que no los debe expandir
            listExp = OperationDB.like("words_dict", w);

            if (listExp == null || listExp.isEmpty()) {
                listExp = OperationDB.like2("words_dict", w);
            }

        }

        if (listExp == null || listExp.isEmpty()) {
            return w;
        }

        if (listExp.size() == 1) {
            unicaExp = listExp.get(0);
        } else {
            Random generator = new Random();
            int i = generator.nextInt(listExp.size() - 1) + 1;

            //retorna aleatoriamente un resultado
            unicaExp = listExp.get(i);

            //System.out.println("rand: "+i);
//            System.out.println("La palabra: " + w + " posee: " + listExp.size() + " expansiones, expansión aleatoria: " + unicaExp);
        }

        listExp.clear();

        return unicaExp;
    }

    private  String expandirAbrev(String w, String clase, String met) {

        ArrayList<String> palCapMet = new ArrayList();

        String cand = null;

        if (met != null && !met.isEmpty()) {

            for (String s[] : palabrasArrayCap) {

                //busqueda estricta
                if (s[2].equals(met) && !clase.isEmpty() && s[1].equals(clase)) {
                    palCapMet.add(s[0]);
                }

            }            
            cand = buscarAbrev(palCapMet, w);
            //si encuentra candidato no sigue buscando
            if (cand != null) {
                return cand;
            }

           palCapMet.clear();            
        }    
       
        //caso contrario busca por clase
        if (clase != null && !clase.isEmpty()) {        
        
            for (String s[] : palabrasArrayCap) {

                if (s[1].equals(clase) && s[2].isEmpty()) {
                    palCapMet.add(s[0]);
                }

            }

            cand = buscarAbrev(palCapMet, w);
        
        }
        
        if (cand != null) {
            return cand;
        }

        palCapMet.clear();
        
        
        for(String s[] : palabrasArrayCap){
        
            //busqueda con alcance global, aquellas que estan fuera de la clase
            if(s[1].isEmpty()){
                palCapMet.add(s[0]);
            }
        }
        
        cand = buscarAbrev(palCapMet, w);
        
        if (cand != null) {
            return cand;
        }
        
        //si no encuentra pruebo con la lista completa
        return buscarAbrev(palabrasCap, w);

    }

    private  String buscarAbrev(ArrayList<String> palCap, String w) {
        
        if(palCap.isEmpty()){
            return null;
        }        

        String original = w;

        //abreviatura basica ej: triang -> triangule
        Pattern pat1 = Pattern.compile(w + "[a-z]*");

        String[] ary = w.split("");

        w = "";

        boolean first = true;

        for (String s : ary) {

            if (first) {
                first = false;
                continue;
            }

            w += s + "[a-z]*";

        }

        //abreviatura compleja ej: tang -> triangule
        Pattern pat2 = Pattern.compile(w);

        for (String cand : palCap) {

            if (original.equals(cand)) {
                continue;//puede que la abreviatura tang este en lo comentarios debo descartar
            }

            if (pat1.matcher(cand).matches() || pat2.matcher(cand).matches()) {
                return cand;
            }

        }

        return null;

    }

    //==============================================
    private  String expandirAcro(String w, String clase, String met) {

        int len = w.length();

        //solo se consideran aquellos de 2 o 3 caracteres
        if (len != 2 && len != 3) {
            return null;
        }

        ArrayList<String> fraCapMet = new ArrayList();

        String cand = null;

        if (met != null && !met.isEmpty()) {
            
            for (String s[] : frasesArrayCap) {

                //busqueda estricta
                if (s[2].equals(met) && !clase.isEmpty() && s[1].equals(clase)) {
                    fraCapMet.add(s[0]);
                }

            }   
            cand = buscarAcro(fraCapMet, w);
            //si encuentra candidato no sigue buscando
            if (cand != null) {
                return cand;
            }         
            
            fraCapMet.clear();
            
        }
              
        //caso contrario busca por clase
        if (clase != null && !clase.isEmpty()) {

            for (String s[] : frasesArrayCap) {

                if (s[1].equals(clase) && s[2].isEmpty()) {
                    fraCapMet.add(s[0]);
                }

            }
            
            cand = buscarAcro(fraCapMet, w);

        }        

        if (cand != null) {
            return cand;
        }
        
        fraCapMet.clear();
        
        for (String s[] : frasesArrayCap) {

            //busqueda con alcance global, aquellas que estan fuera de la clase
            if (s[1].isEmpty()) {
                fraCapMet.add(s[0]);
            }

        }   
        
        cand = buscarAcro(fraCapMet, w);

        if (cand != null) {
            return cand;
        }

        //si no encuentra pruebo con toda la lista
        return buscarAcro(frasesCap, w);


    }

    private  String buscarAcro(ArrayList<String> fraCap, String w) {
        
        if(fraCap.isEmpty()){
            return null;
        }

        for (String frase : fraCap) {

            String f[] = frase.split(" ");

            //si la longitud no coincide sigo
            if (f.length != w.length()) {
                continue;
            }

            int i = 0;

            for (String cand : f) {

                if (cand.charAt(0) != w.charAt(i)) {
                    i = 0;
                    break;
                }

                i++;

            }

            //si la long de la palabra == al i entonces la frase coincide
            if (w.length() == i) {
                return frase;
            }

        }

        return null;

    }

}
