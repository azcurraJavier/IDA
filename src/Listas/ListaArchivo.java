package Listas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class ListaArchivo {    
    
    private static ArrayList<Archivo> lisArchivo;  
    
    private static Set<String> lisFileNamePath;
    
    public static void init(){        
        lisArchivo = new ArrayList<>();
        lisFileNamePath = new HashSet<>();
    }    
    
    public static void clear(){        
        
        if(lisArchivo != null){
            lisArchivo.clear();
            lisFileNamePath.clear();
        }
    }

    public static ArrayList<Archivo> getLisArchivos() {
        return lisArchivo;
    }
    
    public static void addElemLisArchivos(Archivo unArchivo) {
        
        String fileNamePath = unArchivo.getFileNamePath();
        
        if(containsFileName(fileNamePath)){
            System.out.print("ListaClase.addElemLisArchivos: " + fileNamePath +" ya existe!");
            return;
        }
        
        lisArchivo.add(unArchivo);
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
    public static void deleteArchivo(String fileNamePath){
                        
        fileNamePath = fileNamePath.trim();//porque puede venir con espacio al final
        
        if(!containsFileName(fileNamePath)){
            System.out.print("ListaClase.deleteClass: " + fileNamePath+" no existe!");
            return;
        }
        
        lisFileNamePath.remove(fileNamePath);
        
        for(int i=0;i<lisArchivo.size();i++){
         
            if(lisArchivo.get(i).getFileNamePath().equals(fileNamePath)){
                lisArchivo.remove(i);            
            }            
        }
    
    
    }
    
}
