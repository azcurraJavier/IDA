package Listas;

/**
 *
 * @author Javier Azcurra
 */
public class MostrarTabla {
    
    private String nomId;
    private String tipo;
    private String modificador;    
    private String strAsignado;//solo en caso de literales
    private int numLinea;
    
    private int numColumna;//sirve para precicion en código
    
    private String representa;
    
    private String idExpandido; //lo elige el usuario
    
    private String ambClase;
    private String ambMet;
    
    //tablas extras: decl y ref
//    private ArrayList<MostrarListaRef> listaRef;
    
    public MostrarTabla(String ambienteClase, String ambienteMet){
    
        this.strAsignado = "";
        this.nomId = "";
        this.tipo = "";
        this.modificador = "";        
        this.strAsignado = "";
        this.numLinea = 0;
        this.numColumna = 0;
        
        this.representa = "";//parametro var local var global clase
        this.idExpandido = "";
        
        this.ambClase = ambienteClase;
        this.ambMet = ambienteMet;
        
    }

    public void setModificador(String modificador) {
        this.modificador = modificador;
    }

    public void setNomId(String nomId) {
        this.nomId = nomId;
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
    
    public void setNumLinea(String numLinea) {
        this.numLinea = Integer.parseInt(numLinea);
    }

    public void setRepresenta(String representa) {
        this.representa = representa;
    } 

    public void setIdExpandido(String idExpandido) {
        this.idExpandido = idExpandido;
    }

    public void setNumColumna(int numColumna) {
        this.numColumna = numColumna;
    }

    public void setAmbClase(String ambClase) {
        this.ambClase = ambClase;
    }

    public void setAmbMet(String ambMet) {
        this.ambMet = ambMet;
    }
    
    
    

    public String getModificador() {
        return modificador;
    }

    public String getNomId() {
        return nomId;
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

//    public ArrayList<MostrarListaRef> getListaRef() {
//        return listaRef;
//    }  
//    
//    public void addListaRef(String l, String c,String u){
//        listaRef.add(new MostrarListaRef(l,c,u));
//    }

    public String getIdExpandido() {
        return idExpandido;
    }

    public int getNumColumna() {
        return numColumna;
    }

    public String getAmbClase() {
        return ambClase;
    }

    public String getAmbMet() {
        return ambMet;
    }
    
}
