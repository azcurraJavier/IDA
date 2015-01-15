package DictionaryDB;

import ExtractID.LibPath;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Azcurra
 */
public abstract class Dictionary {
    
    
    public static boolean searchWordDic(String table, String word){
        
        boolean exists;
        
        //Connection con = ConnectionDB.AbrirConBD();
        
        exists = OperationDB.select(table, word);        
        
       // ConnectionDB.CerrarConBD();
        
        return exists;
        
    }
    
    public static ArrayList<String> likeWordDic(String table, String word){
        
        ArrayList<String> elems;
        
        //Connection con = ConnectionDB.AbrirConBD();
        
        elems = OperationDB.like(table, word);        
        
        //ConnectionDB.CerrarConBD();
        
        return elems;
        
    }
    
    public static ArrayList<String> selectAllDic(String table){
        
        ArrayList<String> elems;
        
        //Connection con = ConnectionDB.AbrirConBD();
        
        elems = OperationDB.selectAll(table);        
        
        //ConnectionDB.CerrarConBD();
        
        return elems;
        
    }   
    
    public static int selectFreq(String table, String id){
        
        int elems;
        
        //Connection con = ConnectionDB.AbrirConBD();
        
        elems = OperationDB.selectFreq(table,id);        
        
        //ConnectionDB.CerrarConBD();
        
        return elems;
        
    }
    
    private static void createTableInsertValuesBD(String csvFile, String table){
    
        BufferedReader br = null;
        String line = "";       
        
        //Se crea la tabla
        OperationDB.createTable(table);       
        
        try {
 
            br = new BufferedReader(new FileReader(new File(csvFile)));                

            while ((line = br.readLine()) != null) {
                
                //Se insertan elementos desde archivo
                String[] c = line.split(";");

                if(c.length == 1){
                    OperationDB.insert(table, line);
                }else{
                    OperationDB.multipleInsert(table, c[0], c[1]);                        
                }                       		        
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
//        if(new File(".hsqldb").exists()){
//            //en caso de que asi sea, finaliza initBd
//            return;
//        }//sino se procede a generarla:
        
        //Se crea la Bd
        ConnectionDB.CrearBD();           
        
        ConnectionDB.AbrirConBD();
      
        
        //Se crean tablas y se insertan datos:
        
        //Tabla de palabras de dicc en ingles
   	String csvFile = LibPath.getLibPath()+"Diccionarios/words.dict.txt";
	
        String table = "words_dict";
                
        createTableInsertValuesBD(csvFile, table);       

        
        //Tabla de stop list:
        csvFile = LibPath.getLibPath()+"Diccionarios/my.stop.txt";
	
        table = "stop_dict";       
        
        createTableInsertValuesBD(csvFile, table);
        
        
        //Tabla de acronimos:
        csvFile = LibPath.getLibPath()+"Diccionarios/acronym.dict.txt";
	
        table = "acro_dict";
        
        createTableInsertValuesBD(csvFile, table);
        
        
        //Tabla de Sustantivos propios
//        csvFile = "\\Diccionarios\\proper4UP.dict.txt";
//	
//        table = "";       
//        
//        
//        createTableInsertValuesBD(csvFile, table);
        
        
        //Tablas para samurai - prefijos y sufijos
        csvFile = LibPath.getLibPath()+"Diccionarios/samurai.pref.txt";
	
        table = "sam_pref";
        
        createTableInsertValuesBD(csvFile, table);       
        
        csvFile = LibPath.getLibPath()+"Diccionarios/samurai.suf.txt";
	
        table = "sam_suf";
        
        createTableInsertValuesBD(csvFile, table);   
        
        
        csvFile = LibPath.getLibPath()+"Diccionarios/samurai.freq.global.txt";
	
        table = "sam_freq_table";
        
        createTableInsertValuesBD(csvFile, table);           
        
        ConnectionDB.CerrarConBD();       
        
        /*
        CREATE TABLE words_dict (word varchar(50) NOT NULL PRIMARY KEY)

        CREATE TABLE proper_dict (word varchar(50) NOT NULL PRIMARY KEY)

        CREATE TABLE contra_dict (word varchar(50) NOT NULL PRIMARY KEY)

        CREATE TABLE stop_dict (word varchar(50) NOT NULL PRIMARY KEY)        
        */
    }
    
    public static void restartBd() {
        
        //limpia base de memoria
        ConnectionDB.AbrirConBD();
        OperationDB.clearDB();
        ConnectionDB.CerrarConBD();
        
        //limpia la base de disco
//        if(new File(".hsqldb").exists()){
//            deleteFolder(new File(".hsqldb"));
//        }
        
        //se vuelven a crear las tablas
        initBd();    
        
        JOptionPane.showMessageDialog(null, "Base de Datos Regenerada con éxito","Información", JOptionPane.INFORMATION_MESSAGE); 
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
