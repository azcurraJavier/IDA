package Listas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class ListaClase {    
    
    private static ArrayList<Clase> lisClases;  
    
    private static Set<String> lisFileNamePath;
    
    public static void init(){        
        lisClases = new ArrayList<>();
        lisFileNamePath = new HashSet<>();
    }    
    
    public static void clear(){        
        
        if(lisClases != null){
            lisClases.clear();
            lisFileNamePath.clear();
        }
    }

    public static ArrayList<Clase> getLisClases() {
        return lisClases;
    }
    
    public static void addElemLisClases(Clase unaClase) {
        
        String fileNamePath = unaClase.getFileNamePath();
        
        if(containsFileName(fileNamePath)){
            System.out.print("ListaClase.addElemLisClases: " + fileNamePath +" ya existe!");
            return;
        }
        
        lisClases.add(unaClase);
        lisFileNamePath.add(fileNamePath);
    } 
    
    public static boolean containsFileName(String fileNamePath){
        
        if(fileNamePath == null){
            System.out.print("ListaClase.containsFileName: el nombre esta null!");
            return false;
        }
    
        return lisFileNamePath.contains(fileNamePath);
    
    }
    
    //este metodo se llama de ClosableTabbedPane cuando se borra una pestaña
    public static void deleteClass(String fileNamePath){
                        
        fileNamePath = fileNamePath.trim();//porque puede venir con espacio al final
        
        if(!containsFileName(fileNamePath)){
            System.out.print("ListaClase.deleteClass: " + fileNamePath+" no existe!");
            return;
        }
        
        lisFileNamePath.remove(fileNamePath);
        
        for(int i=0;i<lisClases.size();i++){
         
            if(lisClases.get(i).getFileName().equals(fileNamePath)){
                lisClases.remove(i);            
            }            
        }
    
    
    }
    
}
