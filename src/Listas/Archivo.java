package Listas;

import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class Archivo {
    
    private String code; //codigo leido de archivo
    private String fileName; //nombre de archivo .java
    private String fileNamePath; //ruta del archivo \home\entrada.java
    private String nomPaq;   //Paquete
    private int linPaq;   //Paquete linea      
    
    //Lista de comentatios del archivo (clase)
    private ArrayList<Comentario> lisComentario;
    //Lista de literales del archivo (clase)
    private ArrayList<Literal> lisLiterales;   
    
    //Lista de Clases del archivo
    private ArrayList<Clase> lisClases;
    
    //Para mostrar los id por la tabla
    private ArrayList<MostrarTabla> lisMostrarTabla;

    public Archivo() {
        lisComentario = new ArrayList<>();
        lisLiterales = new ArrayList<>();
        lisClases = new ArrayList<>();
        lisMostrarTabla = new ArrayList<>();
    }
    
    public void cargarInfoTabla(){
        
        for(Clase c : lisClases){
            
            //se carga información de cada tabla...
            c.cargarTablaClase();
            
            //...luego se agrega a esta lista...
            lisMostrarTabla.addAll(c.getIdTablaClase());
        } 
        //informacion del paquete
        if (this.nomPaq != null && !this.nomPaq.isEmpty()) {
            MostrarTabla m = new MostrarTabla("Clase Global");//paquete
            m.setRepresenta("Paquete");                
            m.setNomId(this.nomPaq);   
            m.setNumLinea(this.linPaq);
            lisMostrarTabla.add(m);
        }   
        
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileNamePath(String fileNamePath) {
        this.fileNamePath = fileNamePath;
    }

    public void setLisClases(ArrayList<Clase> LisClases) {
        this.lisClases = LisClases;
    }

    public void setNomPaq(String nomPaq) {
        this.nomPaq = nomPaq;
    }

    public void setLinPaq(int linPaq) {
        this.linPaq = linPaq;
    }

    public void setLisMostrarTabla(ArrayList<MostrarTabla> lisMostrarTabla) {
        this.lisMostrarTabla = lisMostrarTabla;
    }    
    

    public void setLisComentario(ArrayList<Comentario> LisComentario) {
        this.lisComentario = LisComentario;
    }

    public void setLisLiterales(ArrayList<Literal> LisLiterales) {
        this.lisLiterales = LisLiterales;
    }  
    

    public String getCode() {
        return code;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileNamePath() {
        return fileNamePath;
    }

    public ArrayList<Clase> getLisClases() {
        return lisClases;
    }

    public String getNomPaq() {
        return nomPaq;
    }

    public int getLinPaq() {
        return linPaq;
    } 
    

    public ArrayList<Comentario> getLisComentario() {
        return lisComentario;
    }

    public ArrayList<Literal> getLisLiterales() {
        return lisLiterales;
    }    

    public ArrayList<MostrarTabla> getLisMostrarTabla() {
        return lisMostrarTabla;
    }   
    
    
}
