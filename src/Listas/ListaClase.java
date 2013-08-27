package Listas;

import java.util.ArrayList;

public abstract class ListaClase {    
    
    private static ArrayList<Clase> lisClases;   
    
    
    public static void clean(){        
        lisClases = new ArrayList<Clase>();    
    }

    public static ArrayList<Clase> getLisClases() {
        return lisClases;
    }
    
    public static void addElemLisClases(Clase unaClase) {
        lisClases.add(unaClase);
    } 
    
}
