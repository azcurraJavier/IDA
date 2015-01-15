package ExtractID;

import static ExtractID.Principal.getStackTrace;
import java.io.File;
import java.net.URISyntaxException;

/**
 *
 * @author Javier Azcurra
 */
public class LibPath {
    
    
    private static String libPath;

    public LibPath() {
        libPath = "";        
    }
    
    
    public void setLibPath(){        
        
        String jarPath = "";
        
        try {
            jarPath = getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        } catch (URISyntaxException ex) {
            System.out.println("Error al ubicar librerias: "+getStackTrace(ex));
        }
        File f;
        
        if(!jarPath.contains("build/classes")){//detecta netbeans!!
            libPath= new File(jarPath).getParentFile().getPath()+"/lib/";
        }
        
        f = new File(libPath+".hsqldb");
        if(!f.isDirectory()) {        
            System.out.println("Base de datos HSQLDB no encontrada: "+ libPath+".hsqldb");
            System.exit(0);
        }
        
        f = new File(libPath+"Diccionarios");
        if(!f.isDirectory()) {        
            System.out.println("Diccionarios no encontrados: "+libPath+"Diccionarios/...");
            System.exit(0);
        }    
        
        f = new File(libPath+"jacobe/unix/jacobe");
        if(!f.exists()) {        
            System.out.println("Programa jacobe no encontrado: "+libPath+"jacobe/unix/jacobe");
            System.exit(0);
        }       
        
        f = new File(libPath+"jacobe/win/jacobe.exe");
        if(!f.exists()) {        
            System.out.println("Programa jacobe no encontrado: "+libPath+"jacobe/win/jacobe.exe");
            System.exit(0);
        }         
        
//        if(!libPath.isEmpty()){
//            System.out.println("librerias y programas ubicados en: "+libPath);
//        }
    }

    public static String getLibPath() {
        return libPath;
    }
    
    
}
