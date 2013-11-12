package VentanasPaneles;

import Listas.Clase;
import SplitID.SamuraiPaper;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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

    Set<String> setReserv = new HashSet<String>(Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", 
                                                   "const", "continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally",
                                                   "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                                                   "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
                                                   "switch", "synchronized", "this", "throw", "throws", "transient", "true", "try", "void", "volatile", "while"));
    
    Set<String> setSimbol = new HashSet<String>(Arrays.asList(",","{","}","(",")",";","+","+=","-","-=","*","*=","/","/=","%","%=","++","--",">",">=","<","<=","!","!=",
                                                                "&&","||","==","=","~","?:","|","|=","^","^=","&","&=",">>",">>=","<<","<<=",">>>",">>>="));
    
    Map<String,String> mapReservSimbol = new HashMap<String,String>(){{
        put("\"","&quot");
        put(">","&lt");
        put("<","&gt");
        put("&","&amp");
        put("'","&#039");
        put("''","&#034");
    }};
    
    
    private Clase claseAsociada = null;

    public CodigoPanel(Clase unaClass) {
        initComponents();
        
        //jTextAreaCod.setFont(new Font("Monospaced", Font.PLAIN, 12));
        jEditorPaneCod.setFont(new Font("Monospaced", Font.PLAIN, 13));
        jEditorPaneCod.setContentType("text/html"); 

        claseAsociada = unaClass;
        
        try {

            FileInputStream fr = new FileInputStream(claseAsociada.getPunteroArchivo());
            InputStreamReader isr = new InputStreamReader(fr);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder buffer = new StringBuilder();

            String line;
            int num = 1;

            while ((line = reader.readLine()) != null) {
                
                
                line = reservWordsH(line);
          
                if (num < 10) {
                    buffer.append("0").append(num).append(". ").append(line);
                } else {
                    buffer.append(num).append(". ").append(line);
                }

                num++;

                buffer.append("<br>");
            }

            reader.close();

            //jTextAreaCod.setText(buffer.toString());
            jEditorPaneCod.setText("<html><pre>"+buffer.toString()+"</pre></html>");

            //jTextAreaCod.setCaretPosition(6);
            jEditorPaneCod.setCaretPosition(6);

            TablaBuscador tBi = new TablaBuscador(0, claseAsociada, this);

            if (tBi.hasElem()) {
                jTabbedPaneProp.addTab("Identificadores", tBi);
            } else {
                jTabbedPaneProp.addTab("Identificadores", emptyPanel("Identificadores"));
            }

            TablaBuscador tBl = new TablaBuscador(1, claseAsociada, this);

            if (tBl.hasElem()) {
                jTabbedPaneProp.addTab("Literales", tBl);
            } else {
                jTabbedPaneProp.addTab("Literales", emptyPanel("Literales"));
            }

            TablaBuscador tBc = new TablaBuscador(2, claseAsociada, this);

            if (tBc.hasElem()) {
                jTabbedPaneProp.addTab("Comentarios", tBc);
            } else {
                jTabbedPaneProp.addTab("Comentarios", emptyPanel("Comentarios"));
            }

        } catch (IOException e) {
            System.out.print(e.toString());
        }

    }
// An instance of the private subclass of the default highlight painter
    Highlighter.HighlightPainter myHighlightPainter = new MyHighlightPainter(Color.cyan);

// Creates highlights around all occurrences of pattern in textComp
    private void highlight(JTextComponent textComp, String pattern) {
        // First remove all old highlights
        removeHighlights(textComp);
        boolean unaVez = true;
        try {
            Highlighter hilite = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());
            int pos = 0;

            // Search for pattern
            while ((pos = text.indexOf(pattern, pos)) >= 0) {

                if (checkTextSurr(text, pos, pattern.length())) {
                    // Create highlighter using private painter and apply around pattern
                    hilite.addHighlight(pos, pos + pattern.length(), myHighlightPainter);
                }//la idea es si busco id => que NO resalte idPersona 

                pos += pattern.length();

                if (unaVez) {

                    int index = text.indexOf(pattern);
                    if (index < 0) {
                        return;
                    }
                    try {
                        Rectangle rect = textComp.modelToView(index);
                        textComp.scrollRectToVisible(rect);
                    } catch (BadLocationException e1) {
                    }
                    unaVez = false;
                }

            }
        } catch (BadLocationException e) {
        }
    }

    private boolean checkTextSurr(String text, int pos, int patternLenght) {

        int posMin = 0;

        if (pos > 0) {//por si es el primero!
            posMin = pos - 1;
        }

        int posMax = pos + patternLenght + 1;

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

        for (int i = 0; i < hilites.length; i++) {
            if (hilites[i].getPainter() instanceof MyHighlightPainter) {
                hilite.removeHighlight(hilites[i]);
            }
        }
    }

    public void setHighlight(String text) {
        //highlight(jTextAreaCod, text);
        highlight(jEditorPaneCod,text);
    }

    public JPanel emptyPanel(String name) {

        JPanel jPane = new JPanel();

        JLabel label = new JLabel("No existen " + name + " en el codigo...");

        label.setFont(new Font("arial", 1, 20));


        jPane.add(label, 0);

        return jPane;

    }
    
    private String reservWordsH(String linea){
        
        String newLin="";
        
        if(linea.trim().isEmpty()){
            return newLin;
        }
        
        String words []=linea.split(" ");
        
        if(linea.startsWith("//")){
            return "<span style=\"color: #006400;\">"+linea+"</span>";
        }
        
        for(String w:words){
           
            if(setReserv.contains(w)){
                //Palabras reservadas
                w="<b><span style=\"color: #00008B;\">"+w+"</span></b>";
                
            }else{           
        
                w = checkCar(w);
            }
        
            newLin +=w+ " ";
        }

        newLin = newLin.substring(0, newLin.length()-1);//retira espacio al final
        
        return newLin;
    }
    
    private String checkCar(String word){
        
        String newWord = "";
        
         char[] charArray = word.toCharArray();
         
         for(Character c:charArray){

            if(setSimbol.contains(c.toString())){
                //simbolos
                String cast = mapReservSimbol.get(c.toString());
                cast = cast!=null?cast:c.toString();
                newWord +="<b><span style=\"color: #00008B;\">"+cast+"</span></b>";
                continue;
            }
            
            if(c.toString().matches("[0-9]+(.[0-9]+)?")){
                //numeros
                newWord +="<span style=\"color: red;\">"+c+"</span>";                
                continue;
            }
         
            newWord += c.toString();
         }        
         
         return newWord;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneProp = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPaneCod = new javax.swing.JEditorPane();

        setFocusable(false);

        jTabbedPaneProp.setBorder(javax.swing.BorderFactory.createTitledBorder("Propiedades"));
        jTabbedPaneProp.setFocusable(false);

        jEditorPaneCod.setEditable(false);
        jScrollPane1.setViewportView(jEditorPaneCod);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneProp)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
