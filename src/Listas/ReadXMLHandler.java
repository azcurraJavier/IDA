package Listas;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Javier Azcurra
 */
public class ReadXMLHandler extends DefaultHandler {

    private String text = "";

    private ArrayList<Clase> clases; //linea comienzo y fin de cada clase
    private ArrayList<Metodo> metodos; //linea comienzo y fin de cada metodo
    private ArrayList<Comentario> lisFrase;//frase + linea
    private ArrayList<MostrarTabla> lisMostrarTabla;//ids con clase y metodo

    private Clase clase;
    private Metodo metodo;
    private Comentario com;
    private MostrarTabla mt;
    
    private boolean entrada;

    public ReadXMLHandler() {

        clases = new ArrayList<>();
        metodos = new ArrayList<>();
        lisFrase = new ArrayList<>();
        lisMostrarTabla = new ArrayList<>();
        entrada = true;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public ArrayList<Comentario> getLisFrase() {
        return lisFrase;
    }

    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }

    public ArrayList<MostrarTabla> getLisMostrarTabla() {
        return lisMostrarTabla;
    }    
    

    @Override
    public void startDocument() {

    }

    @Override
    public void endDocument() {

    }

    public void startElement(String nameSpaceURI, String localName, String qName, Attributes atts) {
        
        if (entrada) {

            if (qName.equals("entrada")) {
                entrada = false;
            }else{
                System.exit(0);
            }
        }

        switch (qName) {

            case "clase":

                clase = new Clase();

                break;

            case "metodo":

                metodo = new Metodo();

                break;

            case "frase":

                com = new Comentario(-1, "");

                break;

            case "id":

                mt = new MostrarTabla("", "");

                break;

        }

    }

    @Override
    public void endElement(String nameSpaceURI, String localName, String qName) {

        switch (qName) {

            case "clase":

                clases.add(clase);
                clase = null;
                break;

            case "metodo":

                metodos.add(metodo);
                metodo = null;

                break;

            case "frase":

                lisFrase.add(com);
                com = null;

                break;

            case "id":

                lisMostrarTabla.add(mt);
                mt = null;

                break;

            case "linea":
                if (com != null) {
                    com.setLinea(text);
                } else if (mt != null) {
                    mt.setNumLinea(text);
                }
                break;

            case "texto":

                com.setCom(text);
                break;

            case "nombre":
                if (mt != null) {

                    mt.setNomId(text);
                } else if (clase != null) {

                    clase.setIde(new Id(text, -1, -1));
                } else if (metodo != null) {
                    metodo.setIde(new Id(text, -1, -1));
                }
                break;

            case "linea_inicio":
                if (clase != null) {
                    clase.setLineaCom(text);
                } else if (metodo != null) {
                    metodo.setLineaCom(text);
                }
                break;

            case "linea_fin":
                if (clase != null) {
                    clase.setLineaFin(text);
                } else if (metodo != null) {
                    metodo.setLineaFin(text);
                }
                break;
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) {
        text = "";
        for (int i = start; i < start + length; i++) {
            text = text + ch[i];
        }
    }
}
