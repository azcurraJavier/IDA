
package Listas;

public class Id {
    
    private String nomID;    
    
    private String strContenido;
    
    private int line;
    
    private int column; //sirve para ubicacion precisa del código

    public Id(String nom, int l, int c) {
        nomID = nom;        
        strContenido = new String();
        line = l;
        column = c;
    }

    public String getNomID() {
        return nomID;
    }

    public String getStrContenido() {
        return strContenido;
    }

    public void setStrContenido(String strContenido) {
        this.strContenido = strContenido;
    }
    
    public int getLine() {
        return line;
    } 

    public int getColumn() {
        return column;
    }   
    
}
