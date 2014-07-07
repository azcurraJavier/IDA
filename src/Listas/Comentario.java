package Listas;

public class Comentario {
    
    private int linea;
    private String com;
    private String ambiente;    

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

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }    

}   
