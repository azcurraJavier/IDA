package Listas;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class WriteXMLHandler {

    XMLOutputFactory factory = XMLOutputFactory.newInstance();

    Set<String> setIdExtract;
    Map<String, String> splitGreedy;
    Map<String, String> splitSamurai;
    Map<String, String> expGreedy;
    Map<String, String> expSamurai;

    ArrayList<String> lisFrases;

    boolean writeFile = false;

    public WriteXMLHandler(Set id, Map g, Map s, Map expG, Map expS, ArrayList<String> l) {

        factory = XMLOutputFactory.newInstance();

        this.setIdExtract = id;
        this.splitGreedy = g;
        this.splitSamurai = s;
        this.expGreedy = expG;
        this.expSamurai = expS;
        this.lisFrases = l;

        if (!splitGreedy.isEmpty() && !splitSamurai.isEmpty()
                && !expGreedy.isEmpty() && !expSamurai.isEmpty() && !lisFrases.isEmpty()) {
            writeFile = true;
        }

    }

    public void write(String file) {

        if (writeFile == false) {
            return;
        }

       BufferedOutputStream out;
        
        
        
        
        try {
            
            out = new BufferedOutputStream(new FileOutputStream(file+"salida.xml"));
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
            
            XMLStreamWriter writer = factory.createXMLStreamWriter(
                    bout);
 
            
            writer.writeStartDocument();
            writer.writeStartElement("salida");
            writer.writeStartElement("lista_analisis_ids");

            for (String s : setIdExtract) {

                writer.writeStartElement("nodo");

                writer.writeStartElement("id");
                writer.writeCharacters(s);
                writer.writeEndElement();

                String splitG = splitGreedy.get(s);

                writer.writeStartElement("div_greedy");
                writer.writeCharacters(splitG);
                writer.writeEndElement();

                String splitS = splitSamurai.get(s);
                writer.writeStartElement("div_sam");
                writer.writeCharacters(splitS);
                writer.writeEndElement();

                writer.writeStartElement("exp_greedy");
                writer.writeCharacters(expGreedy.get(splitG));
                writer.writeEndElement();

                writer.writeStartElement("exp_sam");
                writer.writeCharacters(expSamurai.get(splitS));
                writer.writeEndElement();

                writer.writeEndElement();//nodo

            }

            writer.writeEndElement();//lista_analisis_ids

            writer.writeStartElement("lista_frases");
            
            for (String f : lisFrases) {
                writer.writeStartElement("frase");
                writer.writeCharacters(f);
                writer.writeEndElement();

            }
            writer.writeEndElement();//lista_frases

            writer.writeEndElement();//salida

            writer.writeEndDocument();

            writer.flush();
            writer.close();
            
            
            // Transform XML to get new with indentation.
TransformerFactory factory = TransformerFactory.newInstance();

Transformer transformer = factory.newTransformer();
transformer.setOutputProperty(OutputKeys.INDENT, "yes");

transformer.transform(new StreamSource(new ByteArrayInputStream(bout.toByteArray())),
new StreamResult(out));
            
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
