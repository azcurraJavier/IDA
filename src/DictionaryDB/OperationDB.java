/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DictionaryDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author javier
 */
public abstract class OperationDB {

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
            System.out.println(ex.getLocalizedMessage());
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
            System.out.println(ex.getLocalizedMessage());
        }

        return res;
    }

    public static boolean select(String table, String word, Connection con) {

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
            PreparedStatement pstm = con.prepareStatement(q2);
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
        }

        return true;

    }

    public static ArrayList<String> like(String table, String word, Connection con) {

        if (word == null || word.isEmpty()) {
            return null;
        }

        //Cantidad de registros devueltos
        int registros = 0;
        
        ArrayList<String> array = new ArrayList();

        //Consultas SQL
        String q= "SELECT * FROM " + table + " WHERE word like ";        

        String like1, like2;

        like1 = "'"+word+"%'";//con esta query se buscan abreviaturas: horiz -> horizontal
        
        like2 = "'"+convertLike(word)+"'";//con esta: trg -> triangule
        
        try {
            PreparedStatement pstm = con.prepareStatement(q + like1);
            ResultSet res = pstm.executeQuery();
            
                while(res.next()){
                    
                    array.add(res.getString( "word" ));
                    
                    registros++;
                }
            
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }

        return array;

    }

    public static boolean dropTable(String table, Connection con) {

        boolean res = false;      

        //se ejecuta la consulta
        try {
            //borra elementos
            PreparedStatement pstm = con.prepareStatement(" TRUNCATE TABLE " + table);
            pstm.execute();
            pstm.close();            
            
            //borra tabla
            pstm = con.prepareStatement(" DROP TABLE " + table);
            pstm.execute();
            pstm.close();
            res = true;
            

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
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
