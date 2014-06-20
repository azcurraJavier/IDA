package DictionaryDB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author javier
 */
public abstract class Dictionary {
    
    
    public static boolean searchWordDic(String table, String word){
        
        boolean exists;
        
        Connection con = ConnectionDB.AbrirConBD();
        
        exists = OperationDB.select(table, word, con);        
        
        ConnectionDB.CerrarConBD();
        
        return exists;
        
    }
    
    public static ArrayList<String> likeWordDic(String table, String word){
        
        ArrayList<String> elems;
        
        Connection con = ConnectionDB.AbrirConBD();
        
        elems = OperationDB.like(table, word, con);        
        
        ConnectionDB.CerrarConBD();
        
        return elems;
        
    }
    
    private static void createTableInsertValuesBD(String csvFile, String table, Connection con){
    
        BufferedReader br = null;
        String line = "";    
        
        
        //Se crea la tabla
        OperationDB.createTable(table, con);       
        
        try {
 
		br = new BufferedReader(new FileReader(new File(csvFile)));                
                
		while ((line = br.readLine()) != null) {
                        //Se insertan elementos desde archivo
		        OperationDB.insert(table, line, con); 
		}
 
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	  
    
    }
    

    public static void initBd() { 
        
        //se verifica que la base y la tabla existen
        if(new File(".hsqldb").exists()){
            //en caso de que asi sea, finaliza initBd
            return;
        }//sino se procede a generarla:
        
        //Se crea la Bd
        ConnectionDB.CrearBD();           
        
        Connection con = ConnectionDB.AbrirConBD();
      
        
        //Se crean tablas y se insertan datos:
        
        //Tabla de palabras de dicc en ingles
   	String csvFile = "Diccionarios/words.dict.txt";
	
        String table = "words_dict";
                
        createTableInsertValuesBD(csvFile, table, con);       

        
        //Tabla de stop list:
        csvFile = "Diccionarios/my.stop.txt";
	
        table = "stop_dict";       
        
        createTableInsertValuesBD(csvFile, table, con);
        
        
        //Tabla de acronimos:
        csvFile = "Diccionarios/acronym.dict.txt";
	
        table = "acro_dict";
        
        createTableInsertValuesBD(csvFile, table, con);
        
        
        //Tabla de Sustantivos propios
//        csvFile = "\\Diccionarios\\proper4UP.dict.txt";
//	
//        table = "";       
//        
//        
//        createTableInsertValuesBD(csvFile, table);
        
        
        //Tablas para samurai - prefijos y sufijos
        csvFile = "Diccionarios/samurai.pref.txt";
	
        table = "sam_pref";
        
        createTableInsertValuesBD(csvFile, table, con);       
        
        csvFile = "Diccionarios/samurai.suf.txt";
	
        table = "sam_suf";
        
        createTableInsertValuesBD(csvFile, table, con);        
        
        ConnectionDB.CerrarConBD();         
        
    }
    
    public static void restartBd() {
        
        //se verifica que la base exista
        if(new File(".hsqldb").exists()){
            deleteFolder(new File(".hsqldb"));
        } 
        
        //se vuelven a crear las tablas
        initBd();
    
    }
    
    
    private static void deleteFolder(File folder) {
        
        File[] files = folder.listFiles();
        if(files!=null) { //some JVMs return null for empty dirs
            for(File f: files) {
                if(f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }   
    
}
