
package Listas;


public class Declaracion {    
    
    private String modificador;
    private String tipo;
    
    private Id ident;
    
    public Declaracion(String m, String t, Id ide){
        
        this.modificador= m;
        this.tipo = t;
        this.ident = ide;    
    
    }
    
    public Declaracion(Id ide){
        this.ident = ide;    
    }

    public void setModificador(String modificador) {
        this.modificador = modificador;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Id getIdent() {
        return ident;
    }

    public String getModificador() {
        return modificador;
    }

    public String getTipo() {
        return tipo;
    }   
    
}
