package Listas;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLHandler extends DefaultHandler {
    
    private ArrayList<String> idList;
    private ArrayList<String> fraseList;
    private String text="";

    public ReadXMLHandler() {
        idList = new ArrayList<>();
        fraseList = new ArrayList<>();
    }

    public ArrayList<String> getFraseList() {
        return fraseList;
    }

    public ArrayList<String> getIdList() {
        return idList;
    }

    @Override
    public void startDocument() {
        
    }

    @Override
    public void endDocument() {
        
    }

    public void startElement(String nameSpaceURI, String localName, String qName, Attributes atts) {
      
        
    }

    @Override
    public void endElement(String nameSpaceURI, String localName, String qName) {
        
        if(qName.equals("id")){
            idList.add(text);        
        }
        
        if(qName.equals("frase")){
            fraseList.add(text);        
        } 
        
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        text="";
        for ( int i = start; i<start+length; i++){
            text=text+ch[i];
        }
    }
}
