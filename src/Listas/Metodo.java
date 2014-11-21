package Listas;

import java.util.ArrayList;

public class Metodo {

    private String modif;
    private String tipo; // vacio si es constructor !!
    private Id ide;
        
    private ArrayList<Parametro> listaParam;
    private ArrayList<Declaracion> listaDecl;
    
    //Para mostrar los id por la tabla
    private ArrayList<MostrarTabla> lisMostrarTabla = new ArrayList<>();//lo uso para mostrar los id por la tabla   

    private ArrayList<UsoId> lisUsoIdDecl;
    private ArrayList<UsoId> lisUsoIdPara;

    public Metodo() {
        this.modif = "";
        this.tipo = "";
        this.ide = null;
        this.listaDecl = null;
        this.listaParam = null;
        this.lisUsoIdDecl = null;
        this.lisUsoIdPara = null;
    }

    public Metodo(String modif, String tipo, Id ide) {
        this.lisUsoIdDecl = new ArrayList<>();
        this.lisUsoIdPara = new ArrayList<>();
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

//    public ArrayList<UsoId> buscarUsoIdDec(ArrayList<UsoId> lstId) {
//
//        if (lstId == null || lstId.isEmpty()) {
//            return lstId;
//        }
//
//        ArrayList<UsoId> filtraUso = new ArrayList<>();
//
//        for (UsoId e : lstId) {
//
//            e.setUbicacion("Método " + this.getIde().getNomID());
//            
//            if(e.getAlcance().equals("clase") && e.getAsoClase() != null){             
//                
//                if(this.lisDecl != null && lisDecl.containsKey(e.getAsoClase())){                    
//                    //setear clase asociada en la variable
//                    e.setAsoClase(lisDecl.get(e.getAsoClase()).getTipo());                    
//                }
//                
//            }
//
//            //si no es global y esta en los var local es una referencia!
//            if (this.lisDecl != null && !this.lisDecl.isEmpty()
//                    && !e.getAlcance().equals("global") && !e.getAlcance().equals("clase")
//                    && lisDecl.containsKey(e.getId())) {
//
//                this.lisUsoIdDecl.add(e);
//            } else {
//                filtraUso.add(e); //la idea es sacar los elementos ya analizados
//            }
//
//        }
//
//        return filtraUso;
//
//    }
//
//    public ArrayList<UsoId> buscarUsoIdPar(ArrayList<UsoId> lstId) {
//
//        if (lstId == null || lstId.isEmpty()) {
//            return lstId;
//        }
//
//        ArrayList<UsoId> filtraUso = new ArrayList<>();
//
//        for (UsoId e : lstId) {
//
//            e.setUbicacion("Método " + this.getIde().getNomID());
//                        
//            if(e.getAlcance().equals("clase") && e.getAsoClase() != null){
//                if(this.lisParam != null && lisParam.containsKey(e.getAsoClase())){                    
//                    //setear clase asociada en la variable
//                    e.setAsoClase(lisParam.get(e.getAsoClase()).getTipo());                    
//                }
//                
//            }
//
//            //si no es global y esta en los parametros es una referencia!
//            if (this.lisParam != null && !this.lisParam.isEmpty()
//                    && !e.getAlcance().equals("global") && !e.getAlcance().equals("clase")
//                    && lisParam.containsKey(e.getId())) {
//
//                this.lisUsoIdPara.add(e);
//            } else {
//                filtraUso.add(e); //la idea es sacar los elementos ya analizados
//            }  
//
//        }
//
//        return filtraUso;
//
//    }

    //nuevo
    public ArrayList<MostrarTabla> cargarTablaMetodo() {

        MostrarTabla m;

        if (this.listaDecl != null && !this.listaDecl.isEmpty()) {

            //for (Iterator<Entry<String, Declaracion>> it = lisDecl.entrySet().iterator(); it.hasNext();) {
            for(Declaracion d : this.listaDecl){    
            //for(int i;i<3;i++){
                m = new MostrarTabla(this.getIde().getNomID());//seteo ambiente(nombre del metodo)
                m.setRepresenta("Variable Local");
                //Declaracion d = it.next().getValue();

                m.setNomId(d.getIdent().getNomID());                
                m.setNumLinea(d.getIdent().getLine());
                m.setNumColumna(d.getIdent().getColumn());
                m.setModificador(d.getModificador());
                m.setTipo(d.getTipo());
                m.setStrAsignado(d.getIdent().getStrContenido());

//                for (UsoId u : this.lisUsoIdDecl) {
//                    //se agregan referancias para mostrar en la tabla
//                    if (d.getIdent().getNomID().equals(u.getId())) {
//                        m.addListaRef(u.getLinea(), u.getColumna(), u.getUbicacion());
//                    }
//                }

                lisMostrarTabla.add(m);
            }
        }

        if (this.listaParam != null && !this.listaParam.isEmpty()) {

            //for (Iterator<Entry<String, Parametro>> it = lisParam.entrySet().iterator(); it.hasNext();) {
            for(Parametro p : this.listaParam){     
                
                m = new MostrarTabla(this.getIde().getNomID());//seteo ambiente(nombre del metodo)
                m.setRepresenta("Parámetro");
                //Parametro p = it.next().getValue();

                m.setNomId(p.getIdent().getNomID());                
                m.setNumLinea(p.getIdent().getLine());
                m.setNumColumna(p.getIdent().getColumn());
                m.setModificador(p.getModif());
                m.setTipo(p.getTipo());
                m.setStrAsignado(p.getIdent().getStrContenido());

//                for (UsoId u : this.lisUsoIdPara) {
//                    //se agregan referancias para mostrar en la tabla
//                    if (p.getIdent().getNomID().equals(u.getId())) {
//                        m.addListaRef(u.getLinea(), u.getColumna(), u.getUbicacion());
//                    }
//                }

                lisMostrarTabla.add(m);

            }

        }

        return lisMostrarTabla;
    }

}
