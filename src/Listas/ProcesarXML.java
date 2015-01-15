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
 * @author Javier Azcurra
 */
public class ProcesarXML {
    
    private static ArrayList<String> lisIds;
    private static ArrayList<Clase> clases; //linea comienzo y fin de cada clase y metodo    
    private static ArrayList<Comentario> lisFrase;//frase + linea
    private static ArrayList<MostrarTabla> lisMostrarTabla;//ids con clase y metodo
    

    public static ArrayList<Clase> getClases() {
        return clases;
    }

    public static ArrayList<Comentario> getLisFrase() {
        return lisFrase;
    }

    public static ArrayList<MostrarTabla> getLisMostrarTabla() {
        return lisMostrarTabla;
    }

    public static ArrayList<String> getLisIds() {
        return lisIds;
    }
    
    
    
    
    public static void leer(File fl) throws ParserConfigurationException, SAXException, IOException{
    
        
        SAXParserFactory factory = SAXParserFactory.newInstance();

        SAXParser saxParser = factory.newSAXParser();

        ReadXMLHandler m = new ReadXMLHandler();

        saxParser.parse(fl, m);
        
        
        lisFrase = m.getLisFrase();
        lisMostrarTabla = m.getLisMostrarTabla();
        
        
        //carga metodos en clase segun nro de linea
        ArrayList<ClassBodyDecl> lisClassBodyDecl = new ArrayList<>();
        
        for(Clase c : m.getClases()){
        
            for(Metodo met : m.getMetodos()){
                
                if (c.getLineaCom() <= met.getLineaCom() && met.getLineaCom() <= c.getLineaFin()) {
                
                    
                    ClassBodyDecl cbd = new ClassBodyDecl(met);
                    lisClassBodyDecl.add(cbd);
                    
                    c.setLisClassBodyDecl(lisClassBodyDecl);
                }
                
            }
            
        }
        
        clases = m.getClases(); 
        
        //lista de ids
        lisIds = new ArrayList<>();
                
        for(MostrarTabla mt : lisMostrarTabla){
        
            lisIds.add(mt.getNomId());
        
        }
    }
    
    public static void escribir(ArrayList<String[]> lisResult, String filePath) throws FileNotFoundException, XMLStreamException, TransformerException{
        
          //escribir xml de salida
        WriteXMLHandler wXml = new WriteXMLHandler(lisResult);
        wXml.write(filePath);
    
    
    }
    
}
