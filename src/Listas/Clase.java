package Listas;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class Clase {

    private File punteroArchivo = null;
    private String nomPaq;   //Paquete
    private String modClase; //Modificador de la Clase  
    private Id ide;          //Nombre de la Clase
    //Lista de declaraciones/metodos de la clase:
    private ArrayList<ClassBodyDecl> LisClassBodyDecl;
    //Lista de comentatios del archivo (clase)
    private ArrayList<Comentario> LisComentario;
    //Lista de literales del archivo (clase)
    private ArrayList<String> LisLiterales;
    //Para mostrar los id por la tabla
    private ArrayList<MostrarTabla> lisMostrarTabla = new ArrayList<MostrarTabla>();
    //Para calculo en Samurai
    private int cantTotalId = 0;

    public Clase(ArrayList<ClassBodyDecl> lcbd) {
        this.LisClassBodyDecl = lcbd;
        this.LisComentario = new ArrayList<Comentario>();
        this.modClase = new String();
    }

    public ArrayList<ClassBodyDecl> getClassBodyDecl() {
        return LisClassBodyDecl;
    }

    public void setIde(Id ide) {
        this.ide = ide;
    }

    public void setModClase(String modClase) {
        this.modClase = modClase;
    }

    public void setLisClassBodyDecl(ArrayList<ClassBodyDecl> LisClassBodyDecl) {
        this.LisClassBodyDecl = LisClassBodyDecl;
    }

    public Id getIde() {
        return ide;
    }

    public String getModClase() {
        return modClase;
    }

    public ArrayList<Comentario> getLisComentario() {
        return LisComentario;
    }

    public void setLisComentario(ArrayList<Comentario> LisComentario) {
        this.LisComentario = LisComentario;
    }

    public void setNomPaq(String nomPaq) {
        this.nomPaq = nomPaq;
    }

    public String getNomPaq() {
        return nomPaq;
    }

    public void setPunteroArchivo(File punteroArchivo) {
        this.punteroArchivo = punteroArchivo;
    }

    public File getPunteroArchivo() {
        return punteroArchivo;
    }

    public void setearAmbienteCometario() {

        for (Comentario com : this.LisComentario) {
            com.setAmbiente("Clase " + this.getIde().getNomID());//por defecto seteo con el nombre de la clase

            int lineaMet;
            for (ClassBodyDecl cBd : this.getClassBodyDecl()) {

                Metodo met = cBd.getMetodo();
                lineaMet = cBd.getLineaMetodoComentarioAmbiente();
                if (met != null) {
                    if (com.getLinea() >= lineaMet) {//si el comentario esta dentro del comentario

                        com.setAmbiente("Método " + met.getIde().getNomID());//seteo el ambiente del comentario con el nom del met
                    }
                }
            }
        }

    }

    public void cargarIdTablaClase() {

        MostrarTabla m;

        for (ClassBodyDecl c : LisClassBodyDecl) {

            String ambiente = "@" + this.getIde().getNomID();

            m = new MostrarTabla(ambiente);//seteo ambiente(nombre de la clase)

            if (c.getLisDecl() != null) {
                for (Iterator<Entry<String, Declaracion>> it = c.getLisDecl().entrySet().iterator(); it.hasNext();) {
                    Declaracion d = it.next().getValue();
                    m.setNomId(d.getIdent().getNomID());
                    m.setNumApa(d.getIdent().getCantAp());
                    m.setModificador(d.getModificador());
                    m.setTipo(d.getTipo());
                    m.setStrAsignado(d.getIdent().getStrContenido());

                    lisMostrarTabla.add(m);
                    m = new MostrarTabla(ambiente);//seteo ambiente(nombre de la clase)
                    this.cantTotalId++;

                }
            }

            Metodo met = c.getMetodo();
            if (met != null) {

                m.setNomId(met.getIde().getNomID());
                m.setNumApa(met.getIde().getCantAp());
                m.setModificador(met.getModif());
                m.setTipo(met.getTipo());
                lisMostrarTabla.add(m);//agrego el metodo
                this.cantTotalId++;

                lisMostrarTabla.addAll(met.cargarIdTablaMetodo());//luego agrego todo la info asociada            
                this.cantTotalId += met.getCantTotalId();//sumo la cant de id del metodo!
            }
        }

        m = new MostrarTabla("Clase Global");//clase
        m.setModificador(this.modClase);
        m.setNomId(this.ide.getNomID());
        lisMostrarTabla.add(m);
        this.cantTotalId++;


        if (this.nomPaq != null && !this.nomPaq.isEmpty()) {
            m = new MostrarTabla("Clase Global");//paquete
            m.setNomId(this.nomPaq);
            lisMostrarTabla.add(m);
            this.cantTotalId++;
        }
    }

    public ArrayList<MostrarTabla> getIdTablaClase() {
        return this.lisMostrarTabla;
    }

    public int getCantTotalId() {
        return cantTotalId;
    }

    public void setLisLiterales(ArrayList<String> LisLiterales) {
        this.LisLiterales = LisLiterales;
    }

    public ArrayList<String> getLisLiterales() {
        return LisLiterales;
    }

    private void searchDecl(String e) {//busca en las declaraciones globales y aumenta la cantidad de apariciones

        if (this.LisClassBodyDecl != null && this.LisClassBodyDecl.size() > 0) {
            
            for (ClassBodyDecl c : this.LisClassBodyDecl) {
                
                if (c.getLisDecl() != null && c.getLisDecl().size() > 0) {

                    if (c.getLisDecl().containsKey(e)) {
                        c.getLisDecl().get(e).getIdent().sumCantAp();
                    } else {
                        
//                        try {
//                            throw new Exception("Error: Quedan elementos sin analisis de cantidad: "+ e);
//                        } catch (Exception ex) {
//                            Logger.getLogger(ClassBodyDecl.class.getName()).log(Level.SEVERE, null, ex);
//                        }
                       
                    }
                
                }
                
                if(c.getMetodo() != null && c.getMetodo().getIde().getNomID().equals(e)){
                    c.getMetodo().getIde().sumCantAp();
                }
                
                
            }
            
        }

    }

    public void buscarUso(ArrayList<String> lstStr) {

        if (lstStr != null && lstStr.size() > 0) {

            for (String e : lstStr) {
                searchDecl(e);

            }
        }

    }
}
