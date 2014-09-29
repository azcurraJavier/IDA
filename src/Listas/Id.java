
package Listas;

public class Id {
    
    private String nomID;    
    
    private String strContenido;
    
    private int line;

    public Id(String nom, int l) {
        nomID = nom;        
        strContenido = new String();
        line = l;
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
    
}
