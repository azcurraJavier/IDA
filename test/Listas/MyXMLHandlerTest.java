/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Listas;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.junit.Test;

/**
 *
 * @author javier
 */
public class MyXMLHandlerTest {
    
 

    @Test
    public void parseXml() {
        try {

 

            SAXParserFactory factory = SAXParserFactory.newInstance();

            SAXParser saxParser = factory.newSAXParser();

            ReadXMLHandler m = new ReadXMLHandler();

            saxParser.parse(System.getProperty("user.home")+"/entrada.xml", m);

            m.getIdList();
            m.getFraseList();
            
            
            
            
            

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

   
    
}
