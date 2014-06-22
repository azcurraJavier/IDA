
package Listas;

public class Id {
    
    private String nomID;
    private int cantAp;
    
    private String strContenido;
    
    private int line;

    public Id(String nom, int l) {
        nomID = nom;
        cantAp = 1;
        strContenido = new String();
        line = l;
    }

    public int getCantAp() {
        return cantAp;
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
    
    public void sumCantAp(){
        cantAp ++;
    }

    public int getLine() {
        return line;
    } 
    
}
