package ExpandID;

import DictionaryDB.ConnectionDB;
import DictionaryDB.OperationDB;
import ExtractID.Main;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author javier
 */
public class ExpandBasic {

    private static ArrayList<String> listPalabras = new ArrayList();

    private static ArrayList<String> listFrases = new ArrayList();

    //////////////
    private static ArrayList<String> listExp = new ArrayList();

    private static String unicaExp;
    

    public static String ejecutar(String w) {
        
        if(w == null || w.isEmpty()){
            return "";
        }        
        
        unicaExp = w;
     
        procesarFrases();        
        
        w = w.toLowerCase();
        

        if (OperationDB.select("stop_dict", w)) {            
            return w;
        }

        //abreviacion comun
        String cand = expandirAbrev(w);

        if (cand != null) {
            //listExp.add(cand);
            return cand;
        }

        //acronimo
        cand = expandirAcro(w);

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

        return unicaExp;
    }

    private static void procesarFrases() {
       
        //para evitar problemas cierro la conexion y la vuelvo abrir
       ConnectionDB.CerrarConBD();
        
       //palabras del panel de diccionario
       listFrases = Main.getDicPanel().getFrasesCap();
       listPalabras = Main.getDicPanel().getPalabrasCap();
       
       ConnectionDB.AbrirConBD();
       
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
