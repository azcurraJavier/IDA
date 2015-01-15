package Listas;

import java.util.ArrayList;
import java.util.Map;


/**
 *
 * @author Javier Azcurra
 */
public class ClassBodyDecl {
    
    private Metodo me;
    private int lineaMetodoComentarioAmbiente;//me sirve para saber amibente de comentarios
    
    private Map<String,Declaracion> lisDecl;
    private ArrayList<Declaracion> listaDecl;

    public ClassBodyDecl() {
        this.me = null;
        this.lisDecl = null;
        this.listaDecl = null;
    }    

    public ClassBodyDecl(Metodo m) {
        this.me = m;
        this.lisDecl = null;        
        this.listaDecl = null;
    }
    
    public ClassBodyDecl(Map<String,Declaracion> l) {
        this.lisDecl = l;
        this.me = null;    
    }
    
    public ClassBodyDecl(ArrayList<Declaracion> l) {
        this.listaDecl = l;
        this.me = null;    
    }

    public Map<String,Declaracion> getLisDecl() {
        return lisDecl;
    }

    public ArrayList<Declaracion> getListaDecl() {
        return listaDecl;
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

    public void setLisDecl(ArrayList<Declaracion> listaDecl) {
        this.listaDecl = listaDecl;
    }   
    
    public void setMe(Metodo me) {
        this.me = me;
    }

}