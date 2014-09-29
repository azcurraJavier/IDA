package Listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Metodo {

    private String modif;
    private String tipo; // vacio si es constructor !!
    private Id ide;
    private Map<String, Parametro> lisParam;
    private Map<String, Declaracion> lisDecl;
    
    //Para mostrar los id por la tabla
    private ArrayList<MostrarTabla> lisMostrarTabla = new ArrayList<MostrarTabla>();//lo uso para mostrar los id por la tabla   

    private ArrayList<UsoId> lisUsoIdDecl;
    private ArrayList<UsoId> lisUsoIdPara;

    public Metodo() {
        this.modif = "";
        this.tipo = "";
        this.ide = null;
        this.lisDecl = null;
        this.lisParam = null;
        this.lisUsoIdDecl = null;
        this.lisUsoIdPara = null;
    }

    public Metodo(String modif, String tipo, Id ide) {
        this.lisParam = new HashMap<>();
        this.lisDecl = new HashMap<>();
        this.lisUsoIdDecl = new ArrayList<>();
        this.lisUsoIdPara = new ArrayList<>();
        this.modif = modif;
        this.tipo = tipo;
        this.ide = ide;
    }

    public void addListDecl(Map<String, Declaracion> de) {
        this.lisDecl = de;
    }

    public void addListParam(Map<String, Parametro> pa) {
        this.lisParam = pa;
    }

    public Id getIde() {
        return ide;
    }

    public Map<String, Declaracion> getLisDecl() {
        return lisDecl;
    }

    public Map<String, Parametro> getLisParam() {
        return lisParam;
    }

    public String getModif() {
        return modif;
    }

    public String getTipo() {
        return tipo;
    }

//    public ArrayList<String> buscarUsoDecl(ArrayList<String> lstStr) {
//
//        if (this.lisDecl != null && this.lisDecl.size() > 0) {
//
//            ArrayList<String> newLst = new ArrayList<String>();
//
//            for (String e : lstStr) {
//
//                if (lisDecl.containsKey(e)) {
//                    lisDecl.get(e).getIdent().sumCantAp();
//
//                } else {
//                    newLst.add(e); //la idea es sacar los elementos ya analizados
//                }
//
//            }
//
//            return newLst;
//        }
//
//        return lstStr;
//    }
//    public ArrayList<String> buscarUsoParam(ArrayList<String> lstStr) {
//
//        if (this.lisParam != null && this.lisParam.size() > 0) {
//
//            ArrayList<String> newLst = new ArrayList<String>();
//
//            for (String e : lstStr) {
//
//                if (lisParam.containsKey(e)) {
//                    lisParam.get(e).getIdent().sumCantAp();
//
//                } else {
//                    newLst.add(e); //la idea es sacar los elementos ya analizados
//                }
//
//            }
//
//            return newLst;
//        }
//
//        return lstStr;
//    }
    public ArrayList<UsoId> buscarUsoIdDec(ArrayList<UsoId> lstId) {

        if (lstId == null || lstId.isEmpty()) {
            return lstId;
        }

        ArrayList<UsoId> filtraUso = new ArrayList<>();

        for (UsoId e : lstId) {

            e.setUsadoEn("Método " + this.getIde().getNomID());

            //si no es global y esta en los var local es una referencia!
            if (this.lisDecl != null && !this.lisDecl.isEmpty()
                    && !e.getAlcance().equals("global")
                    && lisDecl.containsKey(e.getId())) {

                this.lisUsoIdDecl.add(e);
            } else {
                filtraUso.add(e); //la idea es sacar los elementos ya analizados
            }

        }

        return filtraUso;

    }

    public ArrayList<UsoId> buscarUsoIdPar(ArrayList<UsoId> lstId) {

        if (lstId == null || lstId.isEmpty()) {
            return lstId;
        }

        ArrayList<UsoId> filtraUso = new ArrayList<>();

        for (UsoId e : lstId) {

            e.setUsadoEn("Método " + this.getIde().getNomID());

            //si no es global y esta en los parametros es una referencia!
            if (this.lisParam != null && !this.lisParam.isEmpty()
                    && !e.getAlcance().equals("global")
                    && lisParam.containsKey(e.getId())) {

                this.lisUsoIdPara.add(e);
            } else {
                filtraUso.add(e); //la idea es sacar los elementos ya analizados
            }

        }

        return filtraUso;

    }

//    public ArrayList<MostrarTabla> cargarIdTablaMetodo() {
//
//        MostrarTabla m;
//
//        if (this.lisDecl != null) {
//
//            for (Iterator<Entry<String, Declaracion>> it = lisDecl.entrySet().iterator(); it.hasNext();) {
//                m = new MostrarTabla(this.getIde().getNomID());//seteo ambiente(nombre del metodo)
//
//                Declaracion d = it.next().getValue();
//
//                m.setNomId(d.getIdent().getNomID());
//                //m.setNumApa(d.getIdent().getCantAp());
//                m.setModificador(d.getModificador());
//                m.setTipo(d.getTipo());
//                m.setStrAsignado(d.getIdent().getStrContenido());
//
//                lisMostrarTabla.add(m);
//                this.cantTotalId++;
//            }
//
//        }
//
//        if (this.lisParam != null) {
//
//            for (Iterator<Entry<String, Parametro>> it = lisParam.entrySet().iterator(); it.hasNext();) {
//                m = new MostrarTabla(this.getIde().getNomID());//seteo ambiente(nombre del metodo)
//
//                Parametro p = it.next().getValue();
//
//                m.setNomId(p.getIdent().getNomID());
//                m.setNumApa(p.getIdent().getCantAp());
//                m.setNumLinea(p.getIdent().getLine());
//                m.setModificador(p.getModif());
//                m.setTipo(p.getTipo());
//                m.setStrAsignado(p.getIdent().getStrContenido());
//
//                lisMostrarTabla.add(m);
//                this.cantTotalId++;
//            }
//
//        }
//
//        return lisMostrarTabla;
//    }

    //nuevo
    public ArrayList<MostrarTabla> cargarTablaMetodo() {

        MostrarTabla m;

        if (this.lisDecl != null && !this.lisDecl.isEmpty()) {

            for (Iterator<Entry<String, Declaracion>> it = lisDecl.entrySet().iterator(); it.hasNext();) {
                m = new MostrarTabla(this.getIde().getNomID());//seteo ambiente(nombre del metodo)
                m.setRepresenta("Variable Local");
                Declaracion d = it.next().getValue();

                m.setNomId(d.getIdent().getNomID());                
                m.setNumLinea(d.getIdent().getLine());
                m.setModificador(d.getModificador());
                m.setTipo(d.getTipo());
                m.setStrAsignado(d.getIdent().getStrContenido());

                for (UsoId u : this.lisUsoIdDecl) {
                    //se agregan referancias para mostrar en la tabla
                    if (d.getIdent().getNomID().equals(u.getId())) {
                        m.addListaRef(u.getLinea(), u.getUbicacion());
                    }
                }

                lisMostrarTabla.add(m);
            }
        }

        if (this.lisParam != null && !this.lisParam.isEmpty()) {

            for (Iterator<Entry<String, Parametro>> it = lisParam.entrySet().iterator(); it.hasNext();) {
                m = new MostrarTabla(this.getIde().getNomID());//seteo ambiente(nombre del metodo)
                m.setRepresenta("Parámetro");
                Parametro p = it.next().getValue();

                m.setNomId(p.getIdent().getNomID());                
                m.setNumLinea(p.getIdent().getLine());
                m.setModificador(p.getModif());
                m.setTipo(p.getTipo());
                m.setStrAsignado(p.getIdent().getStrContenido());

                for (UsoId u : this.lisUsoIdPara) {
                    //se agregan referancias para mostrar en la tabla
                    if (p.getIdent().getNomID().equals(u.getId())) {
                        m.addListaRef(u.getLinea(), u.getUbicacion());
                    }
                }

                lisMostrarTabla.add(m);

            }

        }

        return lisMostrarTabla;
    }

}
