package Listas;

/**
 *
 * @author javier
 * Para carga de tabla referencia
 */
public class MostrarListaRef {
    
    private String linea;
    private String ubicacion;

    public MostrarListaRef(String linea, String ubicacion) {
        this.linea = linea;
        this.ubicacion = ubicacion;
    }   
    
    public String getLinea() {
        return linea;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
