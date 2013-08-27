package Listas;

import java.util.Map;

public class ClassBodyDecl {
    
    private Metodo me;
    private int lineaMetodoComentarioAmbiente;//me sirve para saber amibente de comentarios
    
    private Map<String,Declaracion> lisDecl;

    public ClassBodyDecl() {
        this.me = null;
        this.lisDecl = null;
    }    

    public ClassBodyDecl(Metodo m) {
        this.me = m;
        this.lisDecl = null;        
    }
    
    public ClassBodyDecl(Map<String,Declaracion> l) {
        this.lisDecl = l;
        this.me = null;    
    }

    public Map<String,Declaracion> getLisDecl() {
        return lisDecl;
    }

    public Metodo getMetodo() {
        return me;
    }

    public int getLineaMetodoComentarioAmbiente() {
        return lineaMetodoComentarioAmbiente;
    }
    
    public void setLineaMetodo(int linea){
        this.lineaMetodoComentarioAmbiente = linea;
    }

    public void setLisDecl(Map<String, Declaracion> lisDecl) {
        this.lisDecl = lisDecl;
    }

    public void setMe(Metodo me) {
        this.me = me;
    }

}