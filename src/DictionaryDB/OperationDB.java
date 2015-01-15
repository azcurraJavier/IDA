package DictionaryDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Javier Azcurra
 */
public abstract class OperationDB {

    public static boolean createTable(String table) {

        boolean res = false;

        //Se arma la consulta
        String q = " CREATE TABLE IF NOT EXISTS " + table + " (word varchar(50) NOT NULL PRIMARY KEY) ";
        
        if(table.equals("sam_freq_table")){
            q = " CREATE TABLE IF NOT EXISTS " + table + " (word varchar(50) NOT NULL PRIMARY KEY, freq INTEGER NOT NULL)";
        }      

        //se ejecuta la consulta
        try {
            PreparedStatement pstm = ConnectionDB.getConn().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
            System.out.println("Query: "+q);
        }

        return res;
    }

    public static boolean insert(String table, String value) {

        boolean res = false;

        //Se arma la consulta
        String q = " INSERT INTO " + table + " (  word  ) VALUES ( '" + value + "' )";

        //se ejecuta la consulta
        try {
            PreparedStatement pstm = ConnectionDB.getConn().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;

        } catch (SQLException ex) {             
            System.out.println(ex.getLocalizedMessage());
            System.out.println("Query: "+q);
        }

        return res;
    }
    
    public static boolean multipleInsert(String table, String value1, String value2) {

        boolean res = false;

        //Se arma la consulta
        String q = " INSERT INTO " + table + " VALUES ( '" + value1 + "','" + value2 + "' )";

        //se ejecuta la consulta
        try {
            PreparedStatement pstm = ConnectionDB.getConn().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;

        } catch (SQLException ex) {            
            System.out.println(ex.getLocalizedMessage());
            System.out.println("Query: "+q);
        }

        return res;
    }

    public static boolean select(String table, String word) {

        //Cantidad de registros devueltos
        int registros = 0;

        //Consultas SQL
        String q = "SELECT *" + " FROM " + table;

        //para controlar cantidad
        String q2 = "SELECT count(*) as total FROM " + table;

        if (word != null) {
            q += " WHERE word = " + "'" + word + "'";
            q2 += " WHERE word = " + "'" + word + "'";
        }
        try {
            PreparedStatement pstm = ConnectionDB.getConn().prepareStatement(q2);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");

            if (registros == 0) {
                res.close();
                //si no hay registros falso
                return false;
            }

            if (registros > 1) {
                System.out.println("ATENCION - La query: " + q + "\n retorna mas de un resultado!!!");
            }

            res.close();
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("Query: "+q2);
        }

        return true;

    }
    
    public static ArrayList<String> selectAll(String table) {
    
        //Cantidad de registros devueltos
        int registros = 0;
        
        ArrayList<String> array = new ArrayList();

        //Consultas SQL
        String q = "SELECT *" + " FROM " + table;    

        try {
            PreparedStatement pstm = ConnectionDB.getConn().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            
                while(res.next()){
                    
                    array.add(res.getString( "word" ));
                    
                    registros++;
                }

            res.close();
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("Query: "+q);
        }  

        return array;
    
    }
    
    public static int selectFreq(String table, String id) {
    
        int freq = 0;//si no encuentra el id se devuelve 0
        
        //Consultas SQL
        String q = "SELECT *" + " FROM " + table +" WHERE word = '"+ id +"'";    

        try {
            PreparedStatement pstm = ConnectionDB.getConn().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            
                if(res.next()){
                    
                   freq = res.getInt("freq" );                    
                    
                }

            res.close();
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("Query: "+q);
        }  

        return freq;
    
    }

    public static ArrayList<String> like(String table, String word) {

        if (word == null || word.isEmpty()) {
            return null;
        }
        
        ArrayList<String> array = new ArrayList();

        //Consultas SQL
        String q= "SELECT * FROM " + table + " WHERE word like ";        

        String like1;

        like1 = "'"+word+"%'";//con esta query se buscan abreviaturas: horiz -> horizontal
        
        try {
            PreparedStatement pstm = ConnectionDB.getConn().prepareStatement(q + like1);
            ResultSet res = pstm.executeQuery();
            
                while(res.next()){
                    
                    array.add(res.getString( "word" ));
                    
                }
            
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("Query: "+q);
        }

        return array;

    }
    
    public static ArrayList<String> like2(String table, String word) {
        
        if (word == null || word.isEmpty()) {
            return null;
        } 
        
        ArrayList<String> array = new ArrayList();

        //Consultas SQL
        String q= "SELECT * FROM " + table + " WHERE word like "; 
        
        String like2;        
        
        like2 = "'"+convertLike(word)+"'";//con esta: trg -> triangule
        
        try {
            PreparedStatement pstm = ConnectionDB.getConn().prepareStatement(q + like2);
            ResultSet res = pstm.executeQuery();
            
                while(res.next()){
                    
                    array.add(res.getString( "word" ));                    
                   
                }
            
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("Query: "+q);
        }
        
        return array;
    
    }

    public static boolean dropTable(String table) {

        boolean res = false;      

        //se ejecuta la consulta
        try {
            //borra elementos
            PreparedStatement pstm = ConnectionDB.getConn().prepareStatement(" TRUNCATE TABLE " + table);
            pstm.execute();
            pstm.close();            
            
            //borra tabla
            pstm = ConnectionDB.getConn().prepareStatement(" DROP TABLE " + table);
            pstm.execute();
            pstm.close();
            res = true;
            

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
            System.out.println("Query: "+" TRUNCATE TABLE " + table);
        }

        return res;
    }
    
    public static boolean clearDB() {

        boolean res = false;      

        //se ejecuta la consulta
        try {
            //borra elementos
            PreparedStatement pstm = ConnectionDB.getConn().prepareStatement("DROP SCHEMA PUBLIC CASCADE");
            pstm.execute();
            pstm.close(); 

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
            System.out.println("Query: "+"DROP SCHEMA PUBLIC CASCADE");
        }

        return res;
    }
    
    
    private static String convertLike(String w){
        
        String[] ary = w.split("");       
        
        w = "";
        
        for(String s : ary){
            
          w += s + "%";
        
        }
        
        return w.substring(1);//le saca el 1er %        
    
    }

}
