/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExpandID;

import Listas.Clase;
import Listas.ClassBodyDecl;
import Listas.Comentario;
import Listas.ListaClase;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javier
 */
public class ExpandBasicTest {
    
    public ExpandBasicTest() {
    }

    @Test
    public void testEjecutar() {
        
        System.out.println("expandirAbrev");
        
        ArrayList<Comentario> lisComentario = new ArrayList<>();
        
        lisComentario.add(new Comentario(0, "This is a great test to proof something"));
        
        //palabras que se excluyen: this is a great to something
        //frase: test proof
        
        Clase c = new Clase(new ArrayList<ClassBodyDecl>());
        
        c.setLisComentario(lisComentario);      
        
        ListaClase.clean();
        
        ListaClase.addElemLisClases(c);
        
        
        //expande la abreviatura comun pro a proof
        String w = "pro";
        ExpandBasic instance = new ExpandBasic();
        String expResult = "proof";
        String result = instance.ejecutar(w);
        assertEquals(expResult, result);
        
        //espande el acronimo tp a test proof
        w = "tp";        
        instance = new ExpandBasic();
        expResult = "test proof";
        result = instance.ejecutar(w);
        assertEquals(expResult, result);
        
        //no tiene exito se espera null
        w = "xp";      
        instance = new ExpandBasic();
        result = instance.ejecutar(w);
        assertNull(result);       
 
    }
    
}
