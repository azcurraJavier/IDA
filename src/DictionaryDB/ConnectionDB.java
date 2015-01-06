/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DictionaryDB;

import ExtractID.LibPath;
import ExtractID.Principal;
import static ExtractID.Principal.getStackTrace;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javier
 */
public abstract class ConnectionDB {

    private static Connection conn = null;

    public static void CrearBD() {
        try {
            //obtenemos el driver
            Class.forName("org.hsqldb.jdbcDriver");
            //obtenemos la conexión
            conn = DriverManager.getConnection("jdbc:hsqldb:file:"+LibPath.getLibPath()+".hsqldb/datadb", "sa", "");
            
            if (conn != null) {                
                
                String desc = "disconnect;";
                try {                    

                    PreparedStatement pstm = conn.prepareStatement(desc);
                    pstm.execute();
                    pstm.close();

                    System.out.println("BD Creada correctamente");
                    
                } catch (SQLException ex) {
                    System.out.println(getStackTrace(ex));
                    //Logger.getLogger( ex.getLocalizedMessage());
                }
            }
        }catch (SQLException | ClassNotFoundException e) {
            System.out.println(getStackTrace(e));
            //Logger.getLogger(e.getMessage());
        }        
    }

    public static void AbrirConBD() {
        try {
            //obtenemos el driver
            Class.forName("org.hsqldb.jdbcDriver");
            //obtenemos la conexión
            conn = DriverManager.getConnection("jdbc:hsqldb:file:"+LibPath.getLibPath()+".hsqldb/datadb", "sa", "");
            
            if (conn == null) {
                //JOptionPane.showMessageDialog(null,"OK base de datos listo");
                System.out.println("Ocurrio un problema al abrir la conexion");
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(getStackTrace(e));
            //Logger.getLogger(e.getMessage());
        }        
    }

    public static void CerrarConBD() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConn() {
        return conn;
    }   

}
