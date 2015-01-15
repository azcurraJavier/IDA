/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExpandID;

import DictionaryDB.ConnectionDB;
import Listas.Clase;
import Listas.ClassBodyDecl;
import Listas.Comentario;
import Listas.ListaArchivo;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javier
 */
public class ExpandBasicTest {
//    
//    public ExpandBasicTest() {
//    }
//
//    
//    private String ejec(String s) {
//
//        String r = ExpandBasic.ejecutar(s);
//        return r;
//    }
//    
//    
//    @Test
//    public void testEjecutar() {
//        
//        System.out.println("expandirAbrev");
//        
//        ArrayList<Comentario> lisComentario = new ArrayList<>();
//        
//        lisComentario.add(new Comentario(0, "This is a great test to proof something"));
//        
//        //palabras que se excluyen: this is a great to something
//        //frase: test proof
//        
//        Clase c = new Clase(new ArrayList<ClassBodyDecl>());
//        
//        c.setLisComentario(lisComentario); 
//        c.setFileNamePath("/home");
//        
//        ListaArchivo.init();
//        
//        ListaArchivo.addElemLisArchivos(c);
//        
//        //Se inician tablas de frecuencias
//        ConnectionDB.AbrirConBD();
//        ExpandBasic.procesarFrases(c);
//        
//        assertEquals(ejec("pro"), "proof");
//        assertEquals(ejec("tp"), "test proof");
//        assertEquals(ejec("xp"), "xp");     
//        assertEquals(ejec("Mines"), "xp");     
//        
//        
//        assertNotSame(ejec("mssg"), "mssg"); 
//        
//        ConnectionDB.CerrarConBD(); 
//    }
    
}
