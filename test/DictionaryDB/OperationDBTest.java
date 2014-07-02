///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package DictionaryDB;
//
//import java.sql.Connection;
//import java.util.ArrayList;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author javier
// */
//public class OperationDBTest {
//    
//    public OperationDBTest() {        
//        
//    }
//    
//    /**
//     * Test of createTable method, of class OperationDB.
//     */
//    @Test
//    public void testCreateTable() {        
//        
//        System.out.println("test create table");
//        
//        String table = "tabla_prueba";
//        
//        Connection con = ConnectionDB.AbrirConBD();
//        assertNotNull(con);
//        
//        boolean expResult = true;       
//        boolean result = OperationDB.createTable(table, con);
//        
//        assertEquals(expResult, result);
//        
//    
//        
//        System.out.println("test insert");
//        
//        table = "tabla_prueba";
//        
//        con = ConnectionDB.AbrirConBD();
//        assertNotNull(con);
//        
//        String value = "prueba_prueba";
//        
//        expResult = true;
//        result = OperationDB.insert(table, value, con);
//        assertEquals(expResult, result);
//
// 
//        
//        System.out.println("test select");
//        
//        table = "tabla_prueba";
//        
//        con = ConnectionDB.AbrirConBD();
//        assertNotNull(con);        
//
//        String word = "prueba_prueba";
//
//        expResult = true;
//        result = OperationDB.select(table, word, con);
//        assertEquals(expResult, result);
//        
// 
//        System.out.println("test like 1");
//        
//        table = "tabla_prueba";
//        
//        con = ConnectionDB.AbrirConBD();
//        assertNotNull(con);        
//
//        word = "prue";        
//        
////        Object likeRes[] = OperationDB.like(table, word, con);
////        
////        assertEquals("prueba_prueba", likeRes[0]);
////        
////        
////        System.out.println("test like 2");
////        
////        table = "tabla_prueba";
////        
////        con = ConnectionDB.AbrirConBD();
////        assertNotNull(con);        
////
////        word = "peba";        
////        
////        likeRes = OperationDB.like(table, word, con);
////        
////        assertEquals("prueba_prueba", likeRes[0]);
//        
//        //////////
//        System.out.println("test like 3");
//        
//        table = "tabla_prueba";
//        
//        con = ConnectionDB.AbrirConBD();
//        assertNotNull(con);        
//
//        word = "jdyndkc";//este valor no existe debe devolver vacio        
//        
//        ArrayList<String> likeRes = OperationDB.like(table, word, con);
//        
//        assertEquals(0, likeRes.size());
//
//        //////
//        
//        System.out.println("test drop table");
//
//        table = "tabla_prueba";
//        
//        con = ConnectionDB.AbrirConBD();
//        assertNotNull(con);   
//                
//        expResult = true;
//        
//        result = OperationDB.dropTable(table, con);
//        assertEquals(expResult, result);
//
//        ConnectionDB.CerrarConBD();
//    }
//   
//    
//}
