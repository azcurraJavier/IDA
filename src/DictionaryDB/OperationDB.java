/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DictionaryDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author javier
 */
public abstract class  OperationDB {
    
    public static boolean createTable(String table, Connection con) {
        
        boolean res = false;
        
        //Se arma la consulta
        String q = " CREATE TABLE IF NOT EXISTS " + table + " (word varchar(50) NOT NULL PRIMARY KEY) ";
        
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = con.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;           
            
        } catch (SQLException ex) {            
            Logger.getLogger(ex.getLocalizedMessage());
        }

        return res;
    }
    
    
    
    public static boolean insert(String table, String value, Connection con) {
        
        boolean res = false;
        
        //Se arma la consulta
        String q = " INSERT INTO " + table + " (  word  ) VALUES ( '" + value + "' )";
        
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = con.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;           
            
        } catch (SQLException ex) {            
            Logger.getLogger(ex.getLocalizedMessage());
            System.out.println(ex.getLocalizedMessage());
        }

        return res;
    }

    public static boolean select(String table,  String word, Connection con) {        
        
        //Cantidad de registros devueltos
        int registros = 0;        
        
        //Consultas SQL
        String q = "SELECT *" + " FROM " + table;
        
        //para controlar cantidad
        String q2 = "SELECT count(*) as total FROM " + table;
        
        if (word != null) {
            q += " WHERE word = " + "'"+word+"'";         
            q2 += " WHERE word = " + "'"+word+"'";
        }
        try {
            PreparedStatement pstm = con.prepareStatement(q2);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            
            if(registros == 0){
                res.close();
                //si no hay registros falso
                return false;                
            }
            
            if(registros > 1){
                System.out.println("ATENCION - La query: "+ q +"\n retorna mas de un resultado!!!");
            }      
            
            res.close();
        } catch (SQLException e) {            
            Logger.getLogger(e.getLocalizedMessage());
        }
        
        return true;
        
    }
    
    
    public static boolean dropTable(String table, Connection con) {
        
        boolean res = false;
        
        //Se arma la consulta
        String q = " DROP TABLE " + table ;
        
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = con.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;           
            
        } catch (SQLException ex) {            
            Logger.getLogger(ex.getLocalizedMessage());
        }

        return res;
    }   
   

}
