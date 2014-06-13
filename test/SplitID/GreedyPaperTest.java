/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SplitID;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javier
 */
public class GreedyPaperTest {
    
    public GreedyPaperTest() {
    }
      

    /**
     * Test of ejecutar method, of class GreedyPaper.
     */
    @Test
    public void testEjecutar() {
        
        
        System.out.println("test init bd 00");
        DictionaryDB.Dictionary.restartBd();
        
        System.out.println("test greedy 01");
        String idHardword = "tablehomechair";
        GreedyPaper instance = new GreedyPaper();
        String expResult = "table home chair";
        String result = instance.ejecutar(idHardword);
        assertEquals(expResult, result);

        
        
        System.out.println("test greedy 02");
        
        idHardword = "ttthomechair";
        instance = new GreedyPaper();
        expResult = "ttt home chair";
        result = instance.ejecutar(idHardword);
        assertEquals(expResult, result);
        
        
        
        System.out.println("test greedy 03");
        
        idHardword = "tablehomettt";
        instance = new GreedyPaper();
        expResult = "table home ttt";
        result = instance.ejecutar(idHardword);
        assertEquals(expResult, result);
        
    }
    
}
