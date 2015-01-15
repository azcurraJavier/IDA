package Listas;

import java.util.ArrayList;

/**
 *
 * @author Javier Azcurra
 */
public class Clase {
    
    private String modClase; //Modificador de la Clase  
    private Id ide;          //Nombre de la Clase
    
    //Lista de declaraciones/metodos de la clase:
    private ArrayList<ClassBodyDecl> lisClassBodyDecl;

    //Para mostrar los id por la tabla
    private ArrayList<MostrarTabla> lisMostrarTabla;
        
    private boolean varSinDeclarar = false;
      
    private int lineaCom;//linea comienza el método (alg. expansión)
    private int lineaFin;//linea fin el método (alg. expansión)

    public Clase() {
        this.modClase = new String();
        lisMostrarTabla = new ArrayList<>();

        this.lineaCom = -1;
        this.lineaFin = -1;
    }   
    
    
    public Clase(ArrayList<ClassBodyDecl> lcbd) {
        this();
        this.lisClassBodyDecl = lcbd;        
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


    public ArrayList<MostrarTabla> getIdTablaClase() {
        return this.lisMostrarTabla;
    }


    
    public void cargarTablaClase() {

        MostrarTabla m;

        for (ClassBodyDecl c : lisClassBodyDecl) {

            String ambiente = this.getIde().getNomID();

            m = new MostrarTabla(ambiente,"");//seteo ambiente(nombre de la clase)
            

            if (c.getListaDecl() != null) {
                //for (Iterator<Entry<String, Declaracion>> it = c.getLisDecl().entrySet().iterator(); it.hasNext();) {
                for(Declaracion d : c.getListaDecl()){     
                    //Declaracion d = it.next().getValue();
                    m.setRepresenta("Variable de Clase");
                    m.setNomId(d.getIdent().getNomID());
                    m.setNumLinea(d.getIdent().getLine());   
                    m.setNumColumna(d.getIdent().getColumn());
                    m.setModificador(d.getModificador());
                    m.setTipo(d.getTipo());
                    m.setStrAsignado(d.getIdent().getStrContenido());
                    
                   
                    lisMostrarTabla.add(m);
                    
                    m = new MostrarTabla(ambiente,"");//seteo ambiente(nombre de la clase)                   

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
                
           
                
                lisMostrarTabla.add(m);//agrego el metodo
                lisMostrarTabla.addAll(met.cargarTablaMetodo(ide.getNomID()));//luego agrego todo la info asociada            
                //this.cantTotalId += met.getCantTotalId();//sumo la cant de id del metodo!
            }
        }

        //clase
        m = new MostrarTabla(this.getIde().getNomID(),"");//clase
        m.setRepresenta("Clase");
        m.setModificador(this.modClase);
        m.setNomId(this.ide.getNomID());
        m.setNumLinea(this.ide.getLine());
        m.setNumColumna(this.ide.getColumn());
        
          
        
        lisMostrarTabla.add(m);
    }
    

}
