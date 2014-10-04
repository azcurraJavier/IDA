package Listas;

/**
 *
 * @author javier
 * Para carga de tabla referencia
 */
public class MostrarListaRef {
    
    private String linea;
    private String columna;
    private String ubicacion;

    public MostrarListaRef(String linea, String columna,String ubicacion) {
        this.linea = linea;
        this.columna = columna;
        this.ubicacion = ubicacion;
    }   
    
    public String getLinea() {
        return linea;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getColumna() {
        return columna;
    }    
    
}
