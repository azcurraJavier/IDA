/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DictionaryDB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javier
 */
public abstract class ConnectionDB {

    private static Connection conn = null;

    public static Connection CrearBD() {
        try {
            //obtenemos el driver
            Class.forName("org.hsqldb.jdbcDriver");
            //obtenemos la conexión
            conn = DriverManager.getConnection("jdbc:hsqldb:file:.hsqldb/datadb", "sa", "");
            
            if (conn != null) {                
                
                String desc = "disconnect;";
                try {                    

                    PreparedStatement pstm = conn.prepareStatement(desc);
                    pstm.execute();
                    pstm.close();

                    System.out.println("BD Creada correctamente");
                    
                } catch (SQLException ex) {
                    Logger.getLogger( ex.getLocalizedMessage());
                }
            }
        }catch (SQLException | ClassNotFoundException e) {
            Logger.getLogger(e.getMessage());
        }
        return conn;
    }

    public static Connection AbrirConBD() {
        try {
            //obtenemos el driver
            Class.forName("org.hsqldb.jdbcDriver");
            //obtenemos la conexión
            conn = DriverManager.getConnection("jdbc:hsqldb:file:.hsqldb/datadb", "sa", "");
            
            if (conn == null) {
                //JOptionPane.showMessageDialog(null,"OK base de datos listo");
                System.out.println("Ocurrio un problema al abrir la conexion");
            }
        } catch (SQLException | ClassNotFoundException e) {
            Logger.getLogger(e.getMessage());
        }
        return conn;
    }

    public static void CerrarConBD() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
