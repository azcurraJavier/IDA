package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Clase {
    
    private String modClase; //Modificador de la Clase  
    private Id ide;          //Nombre de la Clase
    
    //Lista de declaraciones/metodos de la clase:
    private ArrayList<ClassBodyDecl> lisClassBodyDecl;

    //Para mostrar los id por la tabla
    private ArrayList<MostrarTabla> lisMostrarTabla;
        
    private boolean varSinDeclarar = false;
    
    //se utiliza para ver las referencias de las var de clase y metodos
    private ArrayList<UsoId> lisUsoIdDecl;
    private ArrayList<UsoId> lisUsoIdMet;

    public Clase(ArrayList<ClassBodyDecl> lcbd) {
        this.lisClassBodyDecl = lcbd;
        this.modClase = new String();
        lisMostrarTabla = new ArrayList<>();
        
        this.lisUsoIdDecl = new ArrayList<>();
        this.lisUsoIdMet = new ArrayList<>();
    }

    public ArrayList<ClassBodyDecl> getClassBodyDecl() {
        return lisClassBodyDecl;
    }

    public void setIde(Id ide) {
        this.ide = ide;
    }

    public void setModClase(String modClase) {
        this.modClase = modClase;
    }

    public void setLisClassBodyDecl(ArrayList<ClassBodyDecl> LisClassBodyDecl) {
        this.lisClassBodyDecl = LisClassBodyDecl;
    }  

    public Id getIde() {
        return ide;
    }

    public String getModClase() {
        return modClase;
    }   


//    public void setearAmbienteCometario() {
//
//        for (Comentario com : this.LisComentario) {
//            com.setAmbiente("Clase " + this.getIde().getNomID());//por defecto seteo con el nombre de la clase
//
//            int lineaMet;
//            for (ClassBodyDecl cBd : this.getClassBodyDecl()) {
//
//                Metodo met = cBd.getMetodo();
//                lineaMet = cBd.getLineaMetodoComentarioAmbiente();
//                if (met != null) {
//                    if (com.getLinea() >= lineaMet) {//si el comentario esta dentro del comentario
//
//                        com.setAmbiente("Método " + met.getIde().getNomID());//seteo el ambiente del comentario con el nom del met
//                    }
//                }
//            }
//        }
//
//    }

//    public void cargarIdTablaClase() {
//
//        MostrarTabla m;
//
//        for (ClassBodyDecl c : LisClassBodyDecl) {
//
//            String ambiente = "@" + this.getIde().getNomID();
//
//            m = new MostrarTabla(ambiente);//seteo ambiente(nombre de la clase)
//
//            if (c.getLisDecl() != null) {
//                for (Iterator<Entry<String, Declaracion>> it = c.getLisDecl().entrySet().iterator(); it.hasNext();) {
//                    Declaracion d = it.next().getValue();
//                    m.setNomId(d.getIdent().getNomID());
//                    m.setNumLinea(d.getIdent().getLine());
//                    m.setNumApa(d.getIdent().getCantAp());
//                    m.setModificador(d.getModificador());
//                    m.setTipo(d.getTipo());
//                    m.setStrAsignado(d.getIdent().getStrContenido());
//
//                    lisMostrarTabla.add(m);
//                    m = new MostrarTabla(ambiente);//seteo ambiente(nombre de la clase)
//                    this.cantTotalId++;
//
//                }
//            }
//
//            Metodo met = c.getMetodo();
//            if (met != null) {
//
//                m.setNomId(met.getIde().getNomID());
//                m.setNumLinea(met.getIde().getLine());
//                m.setNumApa(met.getIde().getCantAp());
//                m.setModificador(met.getModif());
//                m.setTipo(met.getTipo());
//                lisMostrarTabla.add(m);//agrego el metodo
//                this.cantTotalId++;
//
//                lisMostrarTabla.addAll(met.cargarIdTablaMetodo());//luego agrego todo la info asociada            
//                this.cantTotalId += met.getCantTotalId();//sumo la cant de id del metodo!
//            }
//        }
//
//        m = new MostrarTabla("Clase Global");//clase
//        m.setModificador(this.modClase);
//        m.setNomId(this.ide.getNomID());
//        m.setNumLinea(this.ide.getLine());
//        lisMostrarTabla.add(m);
//        this.cantTotalId++;
//
//
//        if (this.nomPaq != null && !this.nomPaq.isEmpty()) {
//            m = new MostrarTabla("Clase Global");//paquete
//            m.setNomId(this.nomPaq);            
//            lisMostrarTabla.add(m);
//            this.cantTotalId++;
//        }
//    }

    public ArrayList<MostrarTabla> getIdTablaClase() {
        return this.lisMostrarTabla;
    }

//    private void searchDecl(String e) {//busca en las declaraciones globales y aumenta la cantidad de apariciones
//
//        if (this.LisClassBodyDecl != null && this.LisClassBodyDecl.size() > 0) {
//            
//            for (ClassBodyDecl c : this.LisClassBodyDecl) {
//                
//                if (c.getLisDecl() != null && c.getLisDecl().size() > 0) {
//
//                    if (c.getLisDecl().containsKey(e)) {
//                        c.getLisDecl().get(e).getIdent().sumCantAp();
//                    } else {
//                        
////                        try {
////                            throw new Exception("Error: Quedan elementos sin analisis de cantidad: "+ e);
////                        } catch (Exception ex) {
////                            Logger.getLogger(ClassBodyDecl.class.getName()).log(Level.SEVERE, null, ex);
////                        }
//                       
//                    }
//                
//                }
//                
//                if(c.getMetodo() != null && c.getMetodo().getIde().getNomID().equals(e)){
//                    c.getMetodo().getIde().sumCantAp();
//                }
//                
//                
//            }
//            
//        }
//
//    }
    
    public void cargarTablaClase(ArrayList<UsoId> usoIdClase) {

        MostrarTabla m;

        for (ClassBodyDecl c : lisClassBodyDecl) {

            String ambiente = "@" + this.getIde().getNomID();

            m = new MostrarTabla(ambiente);//seteo ambiente(nombre de la clase)
            

            if (c.getLisDecl() != null) {
                for (Iterator<Entry<String, Declaracion>> it = c.getLisDecl().entrySet().iterator(); it.hasNext();) {
                    Declaracion d = it.next().getValue();
                    m.setRepresenta("Variable de Clase");
                    m.setNomId(d.getIdent().getNomID());
                    m.setNumLinea(d.getIdent().getLine());   
                    m.setNumColumna(d.getIdent().getColumn());
                    m.setModificador(d.getModificador());
                    m.setTipo(d.getTipo());
                    m.setStrAsignado(d.getIdent().getStrContenido());
                    
                    for (UsoId u : this.lisUsoIdDecl) {
                        //se agregan referancias para mostrar en la tabla
                        if (d.getIdent().getNomID().equals(u.getId())) {
                            m.addListaRef(u.getLinea(), u.getColumna() ,u.getUbicacion());
                        }
                    }
                    
                    //referencias de clase desde otra clase
                    //TopGun tp
                    //
                    //tp.shoot                    
                    for(UsoId u : usoIdClase){
                        //
                        if(d.getIdent().getNomID().equals(u.getId())
                                && u.getAsoClase()!=null && this.ide.getNomID().equals(u.getAsoClase())
                                &&!u.isEsMetodo()){
                            m.addListaRef(u.getLinea(), u.getColumna(),u.getUbicacion());                            
                        }                    
                    }
                    
                    lisMostrarTabla.add(m);
                    
                    m = new MostrarTabla(ambiente);//seteo ambiente(nombre de la clase)                   

                }
            }

            Metodo met = c.getMetodo();
            if (met != null) {
                
                m.setNomId(met.getIde().getNomID());
                m.setNumLinea(met.getIde().getLine());   
                m.setNumColumna(met.getIde().getColumn());
                m.setModificador(met.getModif());
                m.setTipo(met.getTipo());
                m.setRepresenta(met.getTipo().isEmpty()?"Constructor":"Método de Clase");
                
                for (UsoId u : this.lisUsoIdMet) {
                    //se agregan referancias para mostrar en la tabla
                    if (met.getIde().getNomID().equals(u.getId())) {
                        m.addListaRef(u.getLinea(), u.getColumna(), u.getUbicacion());
                    }
                }
                
                //referencias de clase desde otra clase
                //TopGun tp
                //
                //tp.shoot                    
                for(UsoId u : usoIdClase){
                    //
                    if(met.getIde().getNomID().equals(u.getId())
                            && u.getAsoClase()!=null && this.ide.getNomID().equals(u.getAsoClase())
                            && u.isEsMetodo()){
                        m.addListaRef(u.getLinea(), u.getColumna(),u.getUbicacion());                            
                    }                    
                }                
                
                lisMostrarTabla.add(m);//agrego el metodo
                lisMostrarTabla.addAll(met.cargarTablaMetodo());//luego agrego todo la info asociada            
                //this.cantTotalId += met.getCantTotalId();//sumo la cant de id del metodo!
            }
        }

        //clase
        m = new MostrarTabla("Clase Global");//clase
        m.setRepresenta("Clase");
        m.setModificador(this.modClase);
        m.setNomId(this.ide.getNomID());
        m.setNumLinea(this.ide.getLine());
        m.setNumColumna(this.ide.getColumn());
        
        
        for (UsoId u : usoIdClase) {
            //se agregan referancias para mostrar en la tabla
            if (this.ide.getNomID().equals(u.getId())) {
                m.addListaRef(u.getLinea(), u.getColumna(), u.getUbicacion());
            }
        }
        
        
        lisMostrarTabla.add(m);
    }
    
    private boolean globalDecl(UsoId usoId) {
        
        Set<String> exclusion = new HashSet<>(Arrays.asList("equals","System","resume","sleep","suspend","println","print","out","exit"));
        
        if (this.lisClassBodyDecl == null && this.lisClassBodyDecl.isEmpty()) {
            return false;
        }
        
        if(exclusion.contains(usoId.getId())){
            return true; //palabras que lo toma como identificador por ende se debe excluir
        }        
        
        if(usoId.getAlcance().equals("clase") && usoId.getAsoClase() != null){

            for (ClassBodyDecl c : this.lisClassBodyDecl) {

                if(c.getLisDecl() != null && c.getLisDecl().containsKey(usoId.getAsoClase())){                    
                    usoId.setAsoClase(c.getLisDecl().get(usoId.getAsoClase()).getTipo());                    
                }

            }                
        }
        
        if(usoId.getAlcance().equals("clase")){
            return false;
        }       

        
        usoId.setUbicacion("Clase " + this.getIde().getNomID());
        
        for (ClassBodyDecl c : this.lisClassBodyDecl) {

            if(usoId.isEsMetodo() == false && c.getLisDecl() != null && !c.getLisDecl().isEmpty() &&

                    c.getLisDecl().containsKey(usoId.getId())) {

                this.lisUsoIdDecl.add(usoId);                
                return true;

            }

            if (usoId.isEsMetodo() == true && c.getMetodo() != null && //es un metodo
                    c.getMetodo().getIde().getNomID().equals(usoId.getId())) {

                this.lisUsoIdMet.add(usoId);                
                return true;
            }           

        }
        
        return false;

    }
    
    public ArrayList<UsoId> buscarUsoId(ArrayList<UsoId> lUsoId) {
        
        ArrayList<UsoId> filtraUso = new ArrayList<>();

        if (lUsoId != null && !lUsoId.isEmpty()) {

            for (UsoId e : lUsoId) {

                if(!globalDecl(e)){
                    //retorna solo los que no encontró
                    filtraUso.add(e);
                }
            }
        }
        
        return filtraUso;

    }
    

//    public void buscarUso(ArrayList<String> lstStr) {
//
//        if (lstStr != null && lstStr.size() > 0) {
//
//            for (String e : lstStr) {
//                searchDecl(e);
//
//            }
//        }
//
//    }
}
