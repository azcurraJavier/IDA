package ExpandID;

import DictionaryDB.OperationDB;
import Listas.Clase;
import Listas.Comentario;
import Listas.Literal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 *
 * @author javier
 */
public class ExpandBasic {

    private static ArrayList<String> palabrasCap = new ArrayList();

    private static ArrayList<String> frasesCap = new ArrayList();

    //////////////
    private static ArrayList<String> listExp = new ArrayList();

    private static String unicaExp;
    
    
    
    public static void procesarFrases(Clase c) {
        
        
        Set<String> comCap = new HashSet<>();
        
        for (Comentario com : c.getLisComentario()) {
            comCap.add(com.getCom());
        }
        
        for (Literal l : c.getLisLiterales()) {
            comCap.add(l.getText());
        }            
            
        //se limpia todo
        frasesCap.clear();
        palabrasCap.clear();
        
        
        for (String linea : comCap) {

            //limpieza
            linea = linea.replaceAll("\"", "").trim();
            //excluir simbolos
            linea = linea.replaceAll("[^A-Za-z ]", "");
            
            if(linea.isEmpty()){
                continue;
            }

            //filtrar palabras irrelevantes
            String arrayCom[] = linea.split(" ");

            String frase = "";

            for (String pal : arrayCom) {
                
                if(pal == null || pal.isEmpty() || pal.length()<2){
                    continue;
                }

                //para evitar problemas todo con minuscula
                pal = pal.toLowerCase();

                if (!OperationDB.select("stop_dict", pal)) {
                    //si no es una palabra irrelevante la agrego
                    palabrasCap.add(pal);
                    frase += pal + " ";                   
                    
                }

            }

            if (!frase.isEmpty()) {
                frase = frase.substring(0, frase.length() - 1);
                frasesCap.add(frase);
            }            
            

        }
       
    }

    public static ArrayList<String> getFrasesCap() {
        return frasesCap;
    }

    public static ArrayList<String> getPalabrasCap() {
        return palabrasCap;
    }
    

    public static String ejecutar(String w) {
        
        if(w == null || w.isEmpty()){
            return "";
        }        
        
        unicaExp = w;
     
        //procesarFrases();        
        
        w = w.toLowerCase();        

        if (OperationDB.select("stop_dict", w)) {            
            return w;
        }

        //acronimo
        String cand = expandirAcro(w);

        if (cand != null) {
            //listExp.add(cand);
            return cand;
        }        
        
        //abreviacion comun
        cand = expandirAbrev(w);

        if (cand != null) {
            //listExp.add(cand);
            return cand;
        }
        
        //Busqueda en diccionario - ultimo recurso
        if (w.length()>2 && listExp.isEmpty()) {
            //exige 3 o más sino el like trae muchos resultados
            listExp = OperationDB.like("words_dict", w);

        }       

        if (listExp.size() == 1) {
            unicaExp = listExp.get(0);
        }else{
            System.out.println("La palabra: "+w+" posee: " + listExp.size()+" expansiones");        
        }
        
        listExp.clear();
        
        return unicaExp;
    }

    private static String expandirAbrev(String w) {
        
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

        for (String cand : palabrasCap) {
            
            if(original.equals(cand)){
                continue;//puede que la abreviatura tang este en lo comentarios debo descartar
            }

            if (pat1.matcher(cand).matches() || pat2.matcher(cand).matches()) {
                return cand;
            }

        }

        return null;

    }

    private static String expandirAcro(String w) {
        
        if(w == null){
            return null;
        }        
        
        int len = w.length();
        
        //solo se consideran aquellos de 2 o 3 caracteres
        if(len != 2 && len != 3){
            return null;
        }

        for (String frase : frasesCap) {
            
            String f[] = frase.split(" ");
            
            //si la longitud no coincide sigo
            if(f.length != w.length()){
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
