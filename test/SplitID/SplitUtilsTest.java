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
public class SplitUtilsTest {
    
    public SplitUtilsTest() {
    }   



    /**
     * Test of splitSymbol method, of class SplitUtils.
     */
    @Test
    public void testSplitSymbol() {
        System.out.println("splitSymbol");
        String c = "test$symbol_case";
        String expResult = "test symbol case";
        String result = SplitUtils.splitSymbol(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of splitCamelCase method, of class SplitUtils.
     */
    @Test
    public void testSplitCamelCase() {
        System.out.println("splitCamelCase");
        String c = "testCamelCase";
        String expResult = "test Camel Case";
        String result = SplitUtils.splitLowerToUpper(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
