package Listas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class ListaClase {    
    
    private static ArrayList<Clase> lisClases;  
    
    private static Set<String> lisFileName;
    
    public static void init(){        
        lisClases = new ArrayList<>();
        lisFileName = new HashSet<>();
    }    
    
    public static void clear(){        
        
        if(lisClases != null){
            lisClases.clear();
            lisFileName.clear();
        }
    }

    public static ArrayList<Clase> getLisClases() {
        return lisClases;
    }
    
    public static void addElemLisClases(Clase unaClase) {
        
        String fileName = unaClase.getFileName();
        
        if(containsFileName(fileName)){
            System.out.print("ListaClase.addElemLisClases: la clase " + fileName+" ya existe!");
            return;
        }
        
        lisClases.add(unaClase);
        lisFileName.add(fileName);
    } 
    
    public static boolean containsFileName(String fileName){
        
        if(fileName == null){
            System.out.print("ListaClase.containsFileName: el nombre esta null!");
            return false;
        }
    
        return lisFileName.contains(fileName);
    
    }
    
    //este metodo se llama de ClosableTabbedPane cuando se borra una pestaña
    public static void deleteClass(String fileName){
                        
        fileName = fileName.trim();//porque puede venir con espacio al final
        
        if(!containsFileName(fileName)){
            System.out.print("ListaClase.deleteClass: la clase " + fileName+" no existe!");
            return;
        }
        
        lisFileName.remove(fileName);
        
        for(int i=0;i<lisClases.size();i++){
         
            if(lisClases.get(i).getFileName().equals(fileName)){
                lisClases.remove(i);            
            }            
        }
    
    
    }
    
}
