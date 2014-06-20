package ExpandID;

import DictionaryDB.ConnectionDB;
import DictionaryDB.OperationDB;
import Listas.Clase;
import Listas.Comentario;
import Listas.ListaClase;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author javier
 */
public class ExpandBasic {

    ArrayList<String> listPalabras;

    ArrayList<String> listFrases;

    //////////////
    ArrayList<String> listExp;

    String unicaExp;

    public ExpandBasic() {

        listExp = new ArrayList();
        listPalabras = new ArrayList();
        listFrases = new ArrayList();
        //carga la lista de frases y de palabras desde los comentarios
        procesarFrases();
    }

    public String ejecutar(String w) {
        
        if(w == null || w.isEmpty()){
            return null;
        }

        w = w.toLowerCase();

        Connection con = ConnectionDB.AbrirConBD();

        if (OperationDB.select("stop_dict", w, con)) {
            ConnectionDB.CerrarConBD();
            return null;
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
        if (listExp.isEmpty()) {

            listExp = OperationDB.like("word_dict", w, con);

        }

        ConnectionDB.CerrarConBD();

        if (listExp.size() == 1) {
            unicaExp = listExp.get(0);
        }

        return unicaExp;
    }

    private void procesarFrases() {

        for (Clase c : ListaClase.getLisClases()) {
            
            Connection con = ConnectionDB.AbrirConBD();

            for (Comentario com : c.getLisComentario()) {

                //filtrar palabras irrelevantes
                String arrayCom[] = com.getCom().split(" ");                

                String frase = "";

                for (String pal : arrayCom) {
                    
                    //para evitar problemas todo con minuscula
                    pal = pal.toLowerCase();

                    if (!OperationDB.select("stop_dict", pal, con)) {
                        //si no es una palabra irrelevante la agrego
                        listPalabras.add(pal);
                        frase += pal + " ";
                    }

                }
                
                if(!frase.isEmpty()){
                    frase = frase.substring(0, frase.length()-1);
                    listFrases.add(frase);                
                }

            }
            
            ConnectionDB.CerrarConBD();

        }

    }

    private String expandirAbrev(String w) {

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

    private String expandirAcro(String w) {

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
