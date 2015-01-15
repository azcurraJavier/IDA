package Listas;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author Javier Azcurra
 */
public class WriteXMLHandler {

    XMLOutputFactory factory = XMLOutputFactory.newInstance();

    ArrayList<String[]> lisResult;

    boolean writeFile = false;

    public WriteXMLHandler(ArrayList<String[]> lisResult) {

        factory = XMLOutputFactory.newInstance();

        this.lisResult = lisResult;

        if (lisResult != null && !lisResult.isEmpty()) {
            writeFile = true;
        }

    }

    public void write(String file) throws FileNotFoundException, XMLStreamException, TransformerConfigurationException, TransformerException {

        if (writeFile == false) {
            return;
        }

        BufferedOutputStream out;

        out = new BufferedOutputStream(new FileOutputStream(file));
        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        XMLStreamWriter writer = factory.createXMLStreamWriter(
                bout);

        writer.writeStartDocument();
        writer.writeStartElement("salida");
        writer.writeStartElement("lista_analisis_ids");

        for (String[] s : lisResult) {

            writer.writeStartElement("id");

            writer.writeStartElement("nombre");
            writer.writeCharacters(s[0]);
            writer.writeEndElement();

            String splitG = s[1];

            writer.writeStartElement("div_greedy");
            writer.writeCharacters(splitG);
            writer.writeEndElement();

            String splitS = s[2];
            writer.writeStartElement("div_samurai");
            writer.writeCharacters(splitS);
            writer.writeEndElement();

            writer.writeStartElement("exp_greedy");
            writer.writeCharacters(s[3]);
            writer.writeEndElement();

            writer.writeStartElement("exp_samurai");
            writer.writeCharacters(s[4]);
            writer.writeEndElement();

            writer.writeEndElement();//id

        }

        writer.writeEndElement();//lista_analisis_ids

        writer.writeEndElement();//salida

        writer.writeEndDocument();

        writer.flush();
        writer.close();

        // Transform XML to get new with indentation.
        TransformerFactory factory = TransformerFactory.newInstance();

        Transformer transformer = factory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        transformer.transform(new StreamSource(new ByteArrayInputStream(bout.toByteArray())),
                new StreamResult(out));

    }

}
