package SplitID;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Javier Azcurra
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
        DictionaryDB.Dictionary.initBd();
        
        System.out.println("test greedy 01");
        String idHardword = "tablehomechair";
        Greedy instance = new Greedy();
        String expResult = "table home chair";
        String result = instance.ejecutar(idHardword);
        assertEquals(expResult, result);

        
        
        System.out.println("test greedy 02");
        
        idHardword = "ttthomechair";
        instance = new Greedy();
        expResult = "ttt home chair";
        result = instance.ejecutar(idHardword);
        assertEquals(expResult, result);
        
        
        
        System.out.println("test greedy 03");
        
        idHardword = "tablehomettt";
        instance = new Greedy();
        expResult = "table home ttt";
        result = instance.ejecutar(idHardword);
        assertEquals(expResult, result);
        
    }
    
}
