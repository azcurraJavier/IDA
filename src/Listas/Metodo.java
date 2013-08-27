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
    //Para calculo en Samurai
    private int cantTotalId = 0;

    public Metodo() {
        this.modif = "";
        this.tipo = "";
        this.ide = null;
        this.lisDecl = null;
        this.lisParam = null;
    }

    public Metodo(String modif, String tipo, Id ide) {
        this.lisParam = new HashMap<String, Parametro>();
        this.lisDecl = new HashMap<String, Declaracion>();
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

    public ArrayList<String> buscarUsoDecl(ArrayList<String> lstStr) {        
        
        
        if (this.lisDecl != null && this.lisDecl.size() > 0) {
            
            ArrayList<String> newLst = new ArrayList<String>();

            for (String e : lstStr) {

                if (lisDecl.containsKey(e)) {
                    lisDecl.get(e).getIdent().sumCantAp();
                   
                }
                else{
                    newLst.add(e); //la idea es sacar los elementos ya analizados
                }
                
            }            
            
            return newLst;
        }
        
        return lstStr;
    }

    public ArrayList<String> buscarUsoParam(ArrayList<String> lstStr) {
        
        if (this.lisParam != null && this.lisParam.size() > 0) {
            
            ArrayList<String> newLst = new ArrayList<String>();

            for (String e : lstStr) {

                if (lisParam.containsKey(e)) {
                    lisParam.get(e).getIdent().sumCantAp();
                   
                }
                else{
                    newLst.add(e); //la idea es sacar los elementos ya analizados
                }
                
            }            
            
            return newLst;
        }
        
        return lstStr;
    }

    public ArrayList<MostrarTabla> cargarIdTablaMetodo() {

        MostrarTabla m;
        
        if (this.lisDecl != null) {

            for (Iterator<Entry<String, Declaracion>> it = lisDecl.entrySet().iterator(); it.hasNext();) {
                m = new MostrarTabla(this.getIde().getNomID());//seteo ambiente(nombre del metodo)

                Declaracion d = it.next().getValue();

                m.setNomId(d.getIdent().getNomID());
                m.setNumApa(d.getIdent().getCantAp());
                m.setModificador(d.getModificador());
                m.setTipo(d.getTipo());
                m.setStrAsignado(d.getIdent().getStrContenido());

                lisMostrarTabla.add(m);
                this.cantTotalId++;
            }

        }

        if (this.lisParam != null) {
            
            for (Iterator<Entry<String, Parametro>> it = lisParam.entrySet().iterator(); it.hasNext();) {
                m = new MostrarTabla(this.getIde().getNomID());//seteo ambiente(nombre del metodo)

                Parametro p = it.next().getValue();

                m.setNomId(p.getIdent().getNomID());
                m.setNumApa(p.getIdent().getCantAp());
                m.setModificador(p.getModif());
                m.setTipo(p.getTipo());
                m.setStrAsignado(p.getIdent().getStrContenido());

                lisMostrarTabla.add(m);
                this.cantTotalId++;
            }

        }

        return lisMostrarTabla;
    }

    public int getCantTotalId() {
        return cantTotalId;
    }    
    
}
