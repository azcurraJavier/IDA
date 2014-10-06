package Listas;

/**
 *
 * @author javier
 * Esta clase se usa para cargar datos de referencias de id desde el parser
 * para luego ser mostrado en las tablas correspondientes
 */
public class UsoId {    
    
    private String linea;
    private String columna;
    private String id;
    private String alcance;//local, global, clase
    private String ubicacion;//en que metodo constructor usado
    
    private boolean esMetodo = false;
    
    private String asoClase;// esta var se usa cuando el uso de un id esta asociado a una clase
                            //ejemplo: Color.var en este caso tendrá Color!
    
    
    public UsoId(String id,Integer linea, Integer columna) {
        this.linea = linea.toString();
        this.columna = columna.toString();
        this.id=id;        
        this.alcance = "";
    }

    public UsoId(String id,Integer linea, Integer columna, String alcance) {
        this(id,linea,columna);
        this.alcance = alcance;
    }
    
    public UsoId(String id,Integer linea, Integer columna, String alcance, boolean esMetodo) {
        this(id,linea,columna,alcance);
        this.esMetodo = esMetodo;
    }
    
    public UsoId(String id,Integer linea, Integer columna, boolean esMetodo) {
        this(id,linea,columna);
        this.esMetodo = esMetodo;
        this.alcance = "";
    } 
    
    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void setEsMetodo(boolean esMetodo) {
        if (esMetodo) {
            //si es un metodo ento es global
            this.alcance = "global";
        }

        this.esMetodo = esMetodo;
    }

    public void setAsoClase(String asoClase) {
        
        this.alcance = "clase";//variable de clase
        this.asoClase = asoClase;
    }
    
    public String getLinea() {
        return linea;
    }

    public String getAlcance() {
        return alcance;
    }
    
    public String getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getColumna() {
        return columna;
    }

    public boolean isEsMetodo() {
        return esMetodo;
    }

    public String getAsoClase() {
        return asoClase;
    }
    
}
