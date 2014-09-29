package Listas;

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

}   
