package SplitID;

import java.util.LinkedList;

public abstract class SplitUtils {

    final static char PESO = '$';
    final static char GBAJO = '_';
    final static char PUNTO = '.';
    final static char GMEDIO = '-';
    private static String cadena;
    private static LinkedList<String> listaSubcadena;

    public static enum idCases {

        simbolo, camelCase, UPPERlower
    }

    private static idCases detectarCaso(String c) {

        if (c.contains("$") || c.contains("_") || c.contains("$") || c.contains(".") || c.contains("-")) {
            return idCases.simbolo;
        } 
            
        for (int i = 0; i < c.length() - 1; i++) {
                if (Character.isUpperCase(c.charAt(i)) && Character.isUpperCase(c.charAt(i + 1))) {
                    return idCases.UPPERlower;
                }
        }
        

        return idCases.camelCase;
    }

    public static String ejecutar(String c, boolean casoUpperLower) {

        StringBuilder newStr;

        boolean upLow;//true uppercase - false lowercase
        
        if(c.isEmpty()){
            return "";
        }

        idCases idc = detectarCaso(c);

        switch (idc) {

            case simbolo://reemplazo símbolo por espacio en blanco
                c = c.replace(PESO, ' ');
                c = c.replace(GBAJO, ' ');
                c = c.replace(GMEDIO, ' ');
                c = c.replace(PUNTO, ' ');

                //collector(c, idc);                 
                cadena = c;
                break;

            case camelCase:
                newStr = new StringBuilder();

                newStr.append(c.charAt(0));//ignoro el 1er caracter

                for (int i = 1; i < c.length(); i++) {//i=1 ignoro el 1er caracter
                    if (Character.isUpperCase(c.charAt(i))) {
                        newStr.append(' ');//agrego espacio antes de la Mayúscula                      
                    }
                    newStr.append(c.charAt(i));
                }

                //collector(newStr.toString(), idc);
                cadena = newStr.toString();
                break;

            case UPPERlower:

                newStr = new StringBuilder();
                newStr.append(c.charAt(0));//ignoro el 1er caracter                              

                upLow = Character.isUpperCase(c.charAt(1));

                for (int i = 1; i < c.length(); i++) {
                    newStr.append(c.charAt(i));

                    if ((i != c.length() - 1) && (Character.isUpperCase(c.charAt(i + 1)) != upLow)) {
                        newStr.append(' '); //
                        upLow = !upLow;
                    }

                }

                //collector(newStr.toString(), idc);              
                cadena = newStr.toString();
                break;
            /*
             * case UPPERLower2:              *
             * newStr = new StringBuilder(); newStr.append(c.charAt(0));//ignoro
             * el 1er caracter              *
             * upLow = Character.isUpperCase(c.charAt(1));
             *
             * for (int i =1;i<c.length();i++){              *
             * if((i!=c.length()-1)&&((Character.isUpperCase(c.charAt(i))== true
             * && Character.isUpperCase(c.charAt(i+1))== false) ||
             * (Character.isUpperCase(c.charAt(i))== false &&
             * Character.isUpperCase(c.charAt(i+1))== true))){ newStr.append('
             * '); upLow = !upLow; } newStr.append(c.charAt(i)); }
             *
             * //collector(newStr.toString(), idc); cadena = newStr.toString();
             * break;
             */

        }

        return cadena;

    }
    
    public static String splitSymbol(String c){
    
        c = c.replace(PESO, ' ');
        c = c.replace(GBAJO, ' ');
        c = c.replace(GMEDIO, ' ');
        c = c.replace(PUNTO, ' ');      
        
        return c;
    
    }
    
    public static String splitCamelCase(String c){
                
        StringBuilder newStr;       
        
        newStr = new StringBuilder();

        newStr.append(c.charAt(0));//ignoro el 1er caracter

        for (int i = 1; i < c.length(); i++) {//i=1 ignoro el 1er caracter
            if (Character.isUpperCase(c.charAt(i))) {
                newStr.append(' ');//agrego espacio antes de la Mayúscula                      
            }
            newStr.append(c.charAt(i));
        }

        //collector(newStr.toString(), idc);
        return newStr.toString();
    
    }
    
    public static String splitUpLow(String c){
        
        if(c.isEmpty()){
            return "";
        }
        
        StringBuilder newStr;
        
        boolean upLow;//true uppercase - false lowercase
        
        newStr = new StringBuilder();
        newStr.append(c.charAt(0));//ignoro el 1er caracter                              

        upLow = Character.isUpperCase(c.charAt(1));

        for (int i = 1; i < c.length(); i++) {
            newStr.append(c.charAt(i));

            if ((i != c.length() - 1) && (Character.isUpperCase(c.charAt(i + 1)) != upLow)) {
                newStr.append(' '); //
                upLow = !upLow;
            }

        }

        //collector(newStr.toString(), idc);              
        return newStr.toString();    
    
    }
    
    
}
