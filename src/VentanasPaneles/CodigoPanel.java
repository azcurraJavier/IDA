package VentanasPaneles;

import Listas.Clase;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class CodigoPanel extends javax.swing.JPanel {

    private TablaBuscador tablaId, tablaLit, tablaCom;

    Set<String> setReserv = new HashSet<>(Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
            "const", "continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally",
            "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
            "switch", "synchronized", "this", "throw", "throws", "transient", "true", "try", "void", "volatile", "while"));

    Set<String> setSimbol = new HashSet<>(Arrays.asList(",", "{", "}", "(", ")", ";", "+", "+=", "-", "-=", "*", "*=", "/", "/=", "%", "%=", "++", "--", ">", ">=", "<", "<=", "!", "!=",
            "&&", "||", "==", "=", "~", "?:", "|", "|=", "^", "^=", "&", "&=", ">>", ">>=", "<<", "<<=", ">>>", ">>>="));

    Map<String, String> mapReservSimbol = new HashMap<String, String>() {
        {
            //put("\"", "&quot");
            put(">", "&gt");
            put("<", "&lt");
            put("&", "&amp");
            put("'", "&#039");
            put("''", "&#034");
        }
    };

    private Clase claseAsociada = null;
    
    public CodigoPanel(Clase unaClass, Map idSplit, Map idExp) {
        initComponents();

        //jTextAreaCod.setFont(new Font("Monospaced", Font.PLAIN, 12));
        jEditorPaneCod.setFont(new Font("Monospaced", Font.PLAIN, 13));
        jEditorPaneCod.setContentType("text/html");
        
        claseAsociada = unaClass;

        String htmlCode = codeHtml(claseAsociada.getCode());
        
        //jTextAreaCod.setText(buffer.toString());
        jEditorPaneCod.setText(htmlCode);

        //jTextAreaCod.setCaretPosition(6);
        jEditorPaneCod.setCaretPosition(6);

        tablaId = new TablaBuscador(0, claseAsociada, this);

        if (tablaId.hasElem()) {
            jTabbedPaneProp.addTab("Identificadores", tablaId);
        } else {
            jTabbedPaneProp.addTab("Identificadores", emptyPanel("Identificadores"));
        }

        tablaLit = new TablaBuscador(1, claseAsociada, this);

        if (tablaLit.hasElem()) {
            jTabbedPaneProp.addTab("Literales", tablaLit);
        } else {
            jTabbedPaneProp.addTab("Literales", emptyPanel("Literales"));
        }

        tablaCom = new TablaBuscador(2, claseAsociada, this);

        if (tablaCom.hasElem()) {
            jTabbedPaneProp.addTab("Comentarios", tablaCom);
        } else {
            jTabbedPaneProp.addTab("Comentarios", emptyPanel("Comentarios"));
        }

    }

    private String codeHtml(String code) {

        String[] lines = code.split(System.getProperty("line.separator"));
        
        StringBuilder buffer = new StringBuilder();
        String line;       
        

        for(int i=0;i<lines.length;i++){
        
            line = reservWordsH(lines[i]);
            
            if (i+1 < 10) {
                buffer.append("0").append(i+1).append(". ").append(line);
            } else {
                buffer.append(i+1).append(". ").append(line);
            }
        
            buffer.append("<br>");
        
        }
        //return "<html><pre bgcolor=\"#2A2A2A\">" + "<font size=\"6\",color=\"#939393\"/>"
        
        return "<html><pre>" + "<font size=\"6\"/>"
                + buffer.toString() + "</font></pre></html>";
    }
    
    public void replaceIdsCode(Map<Integer,Map> idExp){
    
        String code = claseAsociada.getCode();
        String[] lines = code.split(System.getProperty("line.separator"));        
        
        for (Map.Entry mapEntry : idExp.entrySet()) {
            
            Map<String,String> idEntry2 = (Map) mapEntry.getValue();
            
            for (Map.Entry mapEntry2 : idEntry2.entrySet()){
                
                String regex =mapEntry2.getKey().toString();
                String replace =mapEntry2.getValue().toString();
                
                if(regex.equals(replace)){//si es igual no tiene sentido reemplazar
                    continue;
                }
                
                replace = replace.replaceAll(" ", "_");//se coloca _ para que el código sea valido                
                
                int nroLine = (int)mapEntry.getKey() - 1;
            
                lines[nroLine] = lines[nroLine].replaceAll(regex, replace);
            }          
        
        }
        
        StringBuilder buffer = new StringBuilder();
        
        for (String line1 : lines) {
            buffer.append(line1);
            buffer.append("\n");
        }        
        
        String htmlCode = codeHtml(buffer.toString());
        
        //jTextAreaCod.setText(buffer.toString());
        jEditorPaneCod.setText(htmlCode);

        //jTextAreaCod.setCaretPosition(6);
        jEditorPaneCod.setCaretPosition(6);
    }

// Creates highlights around all occurrences of pattern in textComp
    private void highlight(JTextComponent textComp, String pattern, int line, Color color) {

        Highlighter.HighlightPainter myHighlightPainter = new MyHighlightPainter(color);

        // First remove all old highlights
        removeHighlights(textComp);
        boolean unaVez = true;

        try {
            Highlighter hilite = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());
            int pos = 0;

            int posRect = 0;//guarda el valor para ubicar en el texto

            // Search for pattern
            while ((pos = text.indexOf(pattern, pos)) >= 0) {

                if (checkTextSurr(text, pos, pattern.length(), line)) {
                    // Create highlighter using private painter and apply around pattern
                    hilite.addHighlight(pos, pos + pattern.length(), myHighlightPainter);
                    posRect = pos;
                    //break;
                }//la idea es si busco id => que NO resalte idPersona 

                pos += pattern.length();

            }

            if (posRect < 0) {
                return;
            }
            try {
                Rectangle rect = textComp.modelToView(posRect);
                textComp.scrollRectToVisible(rect);
            } catch (BadLocationException e1) {
            }

        } catch (BadLocationException e) {
        }
    }

    private boolean checkTextSurr(String text, int pos, int patternLenght, int line) {

        int posMin = 0;

        if (pos > 0) {//por si es el primero!
            posMin = pos - 1;
        }

        int posMax = pos + patternLenght + 1;

        ////Este control sirve para cuando el nro de linea
        //de lo que necesito remarcar viene por parametro
        if (line != -1) {
            int lineMin = line, lineMax = line + 1;

            String strLineMin = lineMin >= 0 && lineMin <= 9 ? "0" + lineMin : "" + lineMin;
            String strLineMax = lineMax >= 0 && lineMax <= 9 ? "0" + lineMax : "" + lineMax;

            int posLineTopMin = text.indexOf(strLineMin + ".");
            int posLineTopMax = text.indexOf(strLineMax + ".");

            if (posLineTopMin != -1 && posMin < posLineTopMin) {
                return false;
            }
            if (posLineTopMax != -1 && posLineTopMax < posMax) {
                return false;
            }
        }

        ///////////////////////////////////////////
        String wordOr = text.substring(pos, pos + patternLenght);

        String wordMin = text.substring(posMin, pos + patternLenght);
        String wordMax = text.substring(pos, posMax);

        if (wordMax.matches("(" + wordOr + ")[A-Za-z0-9_]+") || wordMin.matches("[A-Za-z0-9_]+(" + wordOr + ")")) {
            return false;
        }

        return true;
    }

// Removes only our private highlights
    private void removeHighlights(JTextComponent textComp) {
        Highlighter hilite = textComp.getHighlighter();
        Highlighter.Highlight[] hilites = hilite.getHighlights();
        for (Highlighter.Highlight hilite1 : hilites) {
            if (hilite1.getPainter() instanceof MyHighlightPainter) {
                hilite.removeHighlight(hilite1);
            }
        }
    }

    public void setHighlight(String text, int line, Color color) {
        //highlight(jTextAreaCod, text);
        highlight(jEditorPaneCod, text, line, color);
    }

    public JPanel emptyPanel(String name) {

        JPanel jPane = new JPanel();

        JLabel label = new JLabel("No existen " + name + " en el codigo...");

        label.setFont(new Font("arial", 1, 20));

        jPane.add(label, 0);

        return jPane;

    }

    private boolean blockComment = false;

    private boolean blockLiteral2 = false;

    private String reservWordsH(String linea) {

        String newLin = "";

        if (linea.trim().isEmpty()) {
            return newLin;
        }

        if (linea.trim().endsWith("*/")) {
            blockComment = false;
            return "<span style=\"color: #006400;\">" + linea + "</span>";
        }

        if (blockComment || linea.trim().startsWith("/*")) {
            blockComment = true;
            return "<span style=\"color: #006400;\">" + linea + "</span>";
        }

        String subLinea1 = "", subLinea2 = "";

        if (linea.contains("//")) {

            int pos = linea.indexOf("//");

            subLinea1 = linea.substring(0, pos);
            //String subLinea2 = linea.substring(pos);             

            subLinea2 = "<span style=\"color: #006400;\">" + linea.substring(pos) + "</span>";

            linea = subLinea1;//continua el analisis con la linea no comentada                  
        }

        String words[] = linea.split(" ");

        for (String w : words) {

            w = checkCar(w);

            newLin += w + " ";
        }

        if (newLin.length() > 0) {
            newLin = newLin.substring(0, newLin.length() - 1);//retira espacio al final
        }

        return newLin + subLinea2;//se concatena el resto que puede haber sido comentado
    }

    private String checkCar(String word) {

        String newWord = "";

        char[] charArray = word.toCharArray();

        for (Character c : charArray) {
            
            if (blockLiteral2 ==false && setSimbol.contains(c.toString())) {
                
                //simbolos
                String cast = mapReservSimbol.get(c.toString());
                cast = cast != null ? cast : c.toString();//palabras reservadas de html  
                
                //simbolos
                newWord += "<b><span style=\"color: #00008B;\">" + cast + "</span></b>";
                continue;
            }            
            
            //simbolos
            String cast = mapReservSimbol.get(c.toString());
            cast = cast != null ? cast : c.toString();//palabras reservadas de html            

            if (blockLiteral2 ==false && cast.matches("[0-9]+(.[0-9]+)?")) {
                //numeros
                newWord += "<b><span style=\"color: red;\">" + cast + "</span></b>";
                continue;
            }

            if (cast.equals("\"")) {
                if (blockLiteral2 == false) {//abriendo literal
                    newWord += "<b><span style=\"color: #CE7B00;\">" + cast;

                } else {//cerrando literal
                    newWord += cast + "</span></b>";
                }

                blockLiteral2 = blockLiteral2 != true;
                continue;
            }

            newWord += cast.toString();
        }
        
        
        if (blockLiteral2 ==false) {
            
            newWord = buscarPalabraRes(newWord);
            //palabras reservadas
            //return "<b><span style=\"color: #00008B;\">" + word + "</span></b>";            
        }

        return newWord;
    }
    
    private String buscarPalabraRes(String w){
        
        
        if(setReserv.contains(w)){
            return "<b><span style=\"color: #00008B;\">" + w + "</span></b>";
        }
        
        
        for(int i=w.length();i>0;i--){
        
            if(setReserv.contains(w.substring(0,i))){
            
                 return "<b><span style=\"color: #00008B;\">" 
                         + w.substring(0,i) + "</span></b>" +
                         w.substring(i);
            }
        
        }
        
        for(int i=0;i<w.length();i++){
        
            if(setReserv.contains(w.substring(i,w.length()))){
            
                 return w.substring(0,i) +"<b><span style=\"color: #00008B;\">" 
                         + w.substring(i,w.length()) + "</span></b>";
            }
        
        }
        
        return w;
    
    }
    
    

    public TablaBuscador getTablaId() {
        return tablaId;
    }

    public TablaBuscador getTablaLit() {
        return tablaLit;
    }

    public TablaBuscador getTablaCom() {
        return tablaCom;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneProp = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPaneCod = new javax.swing.JEditorPane();

        setFocusable(false);

        jTabbedPaneProp.setBorder(javax.swing.BorderFactory.createTitledBorder("Elementos Capturados"));
        jTabbedPaneProp.setFocusable(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setRequestFocusEnabled(false);

        jEditorPaneCod.setEditable(false);
        jEditorPaneCod.setBorder(null);
        jEditorPaneCod.setFocusable(false);
        jEditorPaneCod.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jEditorPaneCod);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneProp, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneProp, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPaneCod;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneProp;
    // End of variables declaration//GEN-END:variables
}
