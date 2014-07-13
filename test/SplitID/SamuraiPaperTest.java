///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package SplitID;
//
//import Listas.Clase;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author javier
// */
//public class SamuraiPaperTest {
//    
//    public SamuraiPaperTest() {
//    }
//    
//    @Test
//    public void testAddTokenLocalFreqTable() {
//        System.out.println("addTokenLocalFreqTable");
//        String id = "idPrueba1";
//        int cantOcc = 3;
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        instance.addTokenLocalFreqTable(id, cantOcc);
//        
//    }
//
//    @Test
//    public void testFrecuenciaLocal() {
//        System.out.println("frecuenciaLocal");
//        String id = "idPrueba2";
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        int expResult = 1;
//        int result = instance.frecuenciaLocal(id);
//        assertEquals(expResult, result);
//        
//    }
//
//    @Test
//    public void testFrecuenciaGlobal() {
//        System.out.println("frecuenciaGlobal");
//        String id = "horiz";
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        int expResult = 65;
//        int result = instance.frecuenciaGlobal(id);
//        assertEquals(expResult, result);
//        
//    }
//
//    @Test
//    public void testTodasFreqStr() {
//        System.out.println("todasFreqStr");
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        int expResult = 15;
//        instance.addTokenLocalFreqTable("freq1", 3);
//        instance.addTokenLocalFreqTable("freq2", 5);
//        instance.addTokenLocalFreqTable("freq3", 7);
//        int result = instance.todasFreqStr();
//        assertEquals(expResult, result);
//        
//    }
//
//    @Test
//    public void testScore() {
//        System.out.println("score");
//        String id = "freq";
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        int expResult = 66;
//        instance.addTokenLocalFreqTable("freq", 3);
//        instance.addTokenLocalFreqTable("pepe", 5);
//        instance.addTokenLocalFreqTable("toto", 7);
//        int result = (int)instance.score(id);
//        assertEquals(expResult, result);
//        
//    }
//
//    @Test
//    public void testSplitOnLowercaseToUppercase() {
//        System.out.println("splitOnLowercaseToUppercase");
//        String token = "splitLowerUpper";
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        String expResult = "split Lower Upper";
//        String result = instance.splitOnLowercaseToUppercase(token);
//        assertEquals(expResult, result);
//        
//    }
//
//    @Test
//    public void testExistUpperToLower() {
//        System.out.println("existUpperToLower");
//        String s = "TESTExist";
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        int expResult = 4;
//        int result = instance.existUpperToLower(s);
//        assertEquals(expResult, result);
//        
//    }
//
//    @Test
//    public void testSubStr() {
//        System.out.println("subStr");
//        String s = "estestringsedebecortar";
//        int x = 4;
//        int y = 10;
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        String expResult = "string";
//        String result = instance.subStr(s, x, y);
//        assertEquals(expResult, result);
//        
//    }
//
//    @Test
//    public void testIsPrefix() {
//        System.out.println("isPrefix");
//        String s = "post";
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        boolean expResult = true;
//        boolean result = instance.isPrefix(s);
//        assertEquals(expResult, result);
//        
//    }
//
//    @Test
//    public void testIsSuffix() {
//        System.out.println("isSuffix");
//        String s = "ista";
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        boolean expResult = true;
//        boolean result = instance.isSuffix(s);
//        assertEquals(expResult, result);
//        
//    }
//    
//    @Test
//    public void testMixedCaseSplit() {
//        System.out.println("mixedCaseSplit");
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        instance.addTokenLocalFreqTable("freq", 3);
//        instance.addTokenLocalFreqTable("split", 5);
//        instance.addTokenLocalFreqTable("exam", 3);
//        String token = "this_freqsplitexam";
//        String expResult = "this freq split exam";
//        String result = instance.mixedCaseSplit(token);
//        assertEquals(expResult, result);
//        
//    }
//
//    @Test
//    public void testSameCaseSplit() {
//        System.out.println("sameCaseSplit");
//        String s = "freqsplitexam";
//        double score = 1.0;//le asigno este score porque viene de mixedcase
//        SamuraiPaper instance = new SamuraiPaper(new Clase(null),"");
//        instance.addTokenLocalFreqTable("freq", 3);
//        instance.addTokenLocalFreqTable("split", 5);
//        instance.addTokenLocalFreqTable("exam", 7);
//        String expResult = "freq split exam";
//        String result = instance.sameCaseSplit(s, score);
//        assertEquals(expResult, result);
//        
//    }    
//    
//}
