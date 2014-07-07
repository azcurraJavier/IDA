package ExpandID;

import DictionaryDB.OperationDB;
import Listas.Clase;
import Listas.Comentario;
import Listas.ListaClase;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author javier
 */
public class ExpandBasic {

    private static ArrayList<String> listPalabras = new ArrayList();;

    private static ArrayList<String> listFrases = new ArrayList();

    //////////////
    private static ArrayList<String> listExp = new ArrayList();

    private static String unicaExp;
    
    private static boolean frasesProc = false;


    public static String ejecutar(String w) {
        
        if(w == null || w.isEmpty()){
            return "";
        }        
        
        unicaExp = w;
        
        if(!frasesProc){
            procesarFrases();
        }
        
        w = w.toLowerCase();
        

        if (OperationDB.select("stop_dict", w)) {            
            return w;
        }

        //abreviacion comun
        String cand = expandirAbrev(w);

        if (cand != null) {
            listExp.add(cand);
        }

        //acronimo
        cand = expandirAcro(w);

        if (cand != null) {
            listExp.add(cand);
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

        return unicaExp;
    }

    private static void procesarFrases() {
        
//        for (Clase c : ListaClase.getLisClases()) {          
//
//            for (Comentario com : c.getLisComentario()) {
//
//                //filtrar palabras irrelevantes
//                String arrayCom[] = com.getCom().trim().split(" ");                
//
//                String frase = "";
//
//                for (String pal : arrayCom) {
//                    
//                    //para evitar problemas todo con minuscula
//                    pal = pal.toLowerCase();
//
//                    if (!OperationDB.select("stop_dict", pal)) {
//                        //si no es una palabra irrelevante la agrego
//                        listPalabras.add(pal);
//                        frase += pal + " ";
//                    }
//
//                }
//                
//                if(!frase.isEmpty()){
//                    frase = frase.substring(0, frase.length()-1);
//                    listFrases.add(frase);                
//                }
//
//            }
//
//        }        
        
//        if(Main.getDicPanel() == null){
//        
//        }
        
        frasesProc = true;

    }

    private static String expandirAbrev(String w) {

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

        for (String cand : listPalabras) {

            if (pat1.matcher(cand).matches() || pat2.matcher(cand).matches()) {
                return cand;
            }

        }

        return null;

    }

    private static String expandirAcro(String w) {

        for (String frase : listFrases) {

            String f[] = frase.split(" ");

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
