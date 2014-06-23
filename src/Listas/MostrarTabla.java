package Listas;


public class MostrarTabla {
    
    private String ambiente;
    private String nomId;
    private String tipo;
    private String modificador;
    private int numApa;
    private String strAsignado;//solo en caso de literales
    private int numLinea;
    
           
    
    public MostrarTabla(String ambiente){
    
        this.ambiente = ambiente;
        this.strAsignado = "";
        this.nomId = "";
        this.tipo = "";
        this.modificador = "";
        this.numApa = 1;
        this.strAsignado = "";
        this.numLinea = 0;
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
    
    
}
