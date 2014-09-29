package SplitID;

public abstract class SplitUtils {

    final static char PESO = '$';
    final static char GBAJO = '_';
    final static char PUNTO = '.';
    final static char GMEDIO = '-';

    public static enum idCases {

        simbolo, camelCase, UPPERlower
    }
    
    public static String splitSymbol(String c){
    
        c = c.replace(PESO, ' ');
        c = c.replace(GBAJO, ' ');
        c = c.replace(GMEDIO, ' ');
        c = c.replace(PUNTO, ' ');      
        
        return c;
    
    }
    
    public static String splitCamelCase(String c) {

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < c.length() - 1; i++) {//-1 sino puede dar excepción en i+1

            newStr.append(c.charAt(i));

            if (c.charAt(i) != ' ' && 
                    Character.isLowerCase(c.charAt(i)) && 
                        Character.isUpperCase(c.charAt(i + 1))) {

                newStr.append(" ");
            }

        }

        newStr.append(c.charAt(c.length() - 1));

        c = newStr.toString();

        return c;

    }    
    
}
