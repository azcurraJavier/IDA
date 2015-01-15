package Listas;

/**
 *
 * @author Javier Azcurra
 */
public class Comentario {
    
    private int linea;
    private String com;    

    public Comentario(int i, String g) {
        this.linea = i;
        this.com = g;            
    }

    public String getCom() {
        return com;
    }

    public int getLinea() {
        return linea;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }
    
    public void setLinea(String linea) {
        this.linea = Integer.parseInt(linea);
    }

}   
