package Listas;

import java.util.ArrayList;

/**
 *
 * @author Javier Azcurra
 */
public class Metodo {

    private String modif;
    private String tipo; // vacio si es constructor !!
    private Id ide;
        
    private ArrayList<Parametro> listaParam;
    private ArrayList<Declaracion> listaDecl;
    
    //Para mostrar los id por la tabla
    private ArrayList<MostrarTabla> lisMostrarTabla = new ArrayList<>();//lo uso para mostrar los id por la tabla   

    
    private int lineaCom;//linea comienza el método (alg. expansión)
    private int lineaFin;//linea fin el método (alg. expansión)

    public Metodo() {
        this.modif = "";
        this.tipo = "";
        this.ide = null;
        this.listaDecl = null;
        this.listaParam = null;

        this.lineaCom = -1;
        this.lineaFin = -1;
    }

    public Metodo(String modif, String tipo, Id ide) {

        this.modif = modif;
        this.tipo = tipo;
        this.ide = ide;
    }
 
    public void addListDecl(ArrayList<Declaracion> de) {
        this.listaDecl = de;
    }
    
    public void addListParam(ArrayList<Parametro> pa) {
        this.listaParam = pa;
    }

    public Id getIde() {
        return ide;
    }

    public String getModif() {
        return modif;
    }

    public String getTipo() {
        return tipo;
    }

    public void setLineaCom(int lineaCom) {
        this.lineaCom = lineaCom-1;//-1 para que quede excato en la linea
    }

    public void setLineaFin(int lineaFin) {
        this.lineaFin = lineaFin-1;//-1 para que quede excato en la linea
    }
    
    public void setLineaCom(String lineaCom) {
        this.lineaCom = Integer.parseInt(lineaCom);
    }

    public void setLineaFin(String lineaFin) {
        this.lineaFin = Integer.parseInt(lineaFin);
    }    

    public int getLineaCom() {
        return lineaCom;
    }

    public int getLineaFin() {
        return lineaFin;
    }    

    public void setIde(Id ide) {
        this.ide = ide;
    }


    //nuevo
    public ArrayList<MostrarTabla> cargarTablaMetodo(String nomClase) {

        MostrarTabla m;

        if (this.listaDecl != null && !this.listaDecl.isEmpty()) {

            //for (Iterator<Entry<String, Declaracion>> it = lisDecl.entrySet().iterator(); it.hasNext();) {
            for(Declaracion d : this.listaDecl){    
            //for(int i;i<3;i++){
                m = new MostrarTabla(nomClase,this.getIde().getNomID());//seteo ambiente(nombre del metodo)
                m.setRepresenta("Variable Local");
                //Declaracion d = it.next().getValue();

                m.setNomId(d.getIdent().getNomID());                
                m.setNumLinea(d.getIdent().getLine());
                m.setNumColumna(d.getIdent().getColumn());
                m.setModificador(d.getModificador());
                m.setTipo(d.getTipo());
                m.setStrAsignado(d.getIdent().getStrContenido());


                lisMostrarTabla.add(m);
            }
        }

        if (this.listaParam != null && !this.listaParam.isEmpty()) {

            //for (Iterator<Entry<String, Parametro>> it = lisParam.entrySet().iterator(); it.hasNext();) {
            for(Parametro p : this.listaParam){     
                
                m = new MostrarTabla(nomClase,this.getIde().getNomID());//seteo ambiente(nombre del metodo)
                m.setRepresenta("Parámetro");
                //Parametro p = it.next().getValue();

                m.setNomId(p.getIdent().getNomID());                
                m.setNumLinea(p.getIdent().getLine());
                m.setNumColumna(p.getIdent().getColumn());
                m.setModificador(p.getModif());
                m.setTipo(p.getTipo());
                m.setStrAsignado(p.getIdent().getStrContenido());

                lisMostrarTabla.add(m);

            }

        }

        return lisMostrarTabla;
    }

}
