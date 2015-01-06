package Listas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 *
 * @author javier
 */
public class ProcesarXML {
    
    private static ArrayList<String> idList;
    private static ArrayList<String> fraseList;

    public static ArrayList<String> getFraseList() {
        return fraseList;
    }

    public static ArrayList<String> getIdList() {
        return idList;
    }
    
    
    public static void leer(File fl) throws ParserConfigurationException, SAXException, IOException{
    
        
        SAXParserFactory factory = SAXParserFactory.newInstance();

        SAXParser saxParser = factory.newSAXParser();

        ReadXMLHandler m = new ReadXMLHandler();

        saxParser.parse(fl, m);
        
        idList = m.getIdList();

        fraseList = m.getFraseList();

    }
    
    public static void escribir(ArrayList<String[]> lisResult, String filePath) throws FileNotFoundException, XMLStreamException, TransformerException{
        
          //escribir xml de salida
        WriteXMLHandler wXml = new WriteXMLHandler(lisResult);
        wXml.write(filePath);
    
    
    }
    
}
