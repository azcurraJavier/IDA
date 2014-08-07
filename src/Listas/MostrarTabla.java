package Listas;

import java.util.ArrayList;


public class MostrarTabla {
    
    private String ambiente;
    private String nomId;
    private String tipo;
    private String modificador;
    private int numApa;        //ver este porque creo que no se usa
    private String strAsignado;//solo en caso de literales
    private int numLinea;
    
    private String representa;
    
    //tablas extras: decl y ref
    private ArrayList<MostrarListaRef> listaRef;
    
    public MostrarTabla(String ambiente){
    
        this.ambiente = ambiente;//Clase pepe metodo toto
        this.strAsignado = "";
        this.nomId = "";
        this.tipo = "";
        this.modificador = "";
        this.numApa = 1;
        this.strAsignado = "";
        this.numLinea = 0;
        
        this.representa = "";//parametro var local var global clase
        this.listaRef = new ArrayList<>();
        
    }

    public void setModificador(String modificador) {
        this.modificador = modificador;
    }

    public void setNomId(String nomId) {
        this.nomId = nomId;
    }

    public void setNumApa(int numApa) {
        this.numApa = numApa;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setStrAsignado(String strAsignado) {
        this.strAsignado = strAsignado;
    }

    public void setNumLinea(int numLinea) {
        this.numLinea = numLinea;
    }    

    public void setRepresenta(String representa) {
        this.representa = representa;
    }  
    

    public String getAmbiente() {
        return ambiente;
    }

    public String getModificador() {
        return modificador;
    }

    public String getNomId() {
        return nomId;
    }

    public int getNumApa() {
        return numApa;
    }

    public String getStrAsignado() {
        return strAsignado;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumLinea() {
        return numLinea;
    }

    public String getRepresenta() {
        return representa;
    }      

    public ArrayList<MostrarListaRef> getListaRef() {
        return listaRef;
    }  
    
    public void addListaRef(String l, String u){
        listaRef.add(new MostrarListaRef(l,u));
    }
 
    
    
}
