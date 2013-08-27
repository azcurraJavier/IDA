
package Listas;

public class Id {
    
    private String nomID;
    private int cantAp;
    
    private String strContenido;

    public Id(String nom) {
        nomID = nom;
        cantAp = 1;
        strContenido = new String();
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
    
}
