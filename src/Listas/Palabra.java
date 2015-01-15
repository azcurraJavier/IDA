package Listas;

/**
 *
 * @author Javier Azcurra
 */
public class Palabra {
    
    private String pal;
    private int cantApa;

    public int getCantApa() {
        return cantApa;
    }

    public String getPal() {
        return pal;
    }
    
    public Palabra(String p, int cant){
        
        this.pal = p;
        this.cantApa = cant;
    
    }
    
}
