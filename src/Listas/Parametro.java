
package Listas;


public class Parametro {    
    
    private String modif;// final o vacio
    private String tipo;
    
    private Id ident;

    public Parametro(String m, String t, Id ide) {
        modif =m;
        tipo = t;
        ident = ide;
    }

    public Id getIdent() {
        return ident;
    }

    public String getModif() {
        return modif;
    }

    public String getTipo() {
        return tipo;
    }
        
}
