package VentanasPaneles;

import Listas.Clase;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class CodigoPanel extends javax.swing.JPanel {

    private Clase claseAsociada = null;

    public CodigoPanel(Clase unaClass) {
        initComponents();
        
        jTextAreaCod.setFont(new Font("Monospaced", Font.PLAIN, 12));  

        claseAsociada = unaClass;

        try {

            FileInputStream fr = new FileInputStream(claseAsociada.getPunteroArchivo());
            InputStreamReader isr = new InputStreamReader(fr, "UTF-8");
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder buffer = new StringBuilder();

            String line;
            int num = 1;

            while ((line = reader.readLine()) != null) {

                line = line.replaceAll("\t", "    ");

                if (num < 10) {
                    buffer.append("0").append(num).append(". ").append(line);
                } else {
                    buffer.append(num).append(". ").append(line);
                }

                num++;

                buffer.append('\n');
            }

            reader.close();

            jTextAreaCod.setText(buffer.toString());

            jTextAreaCod.setCaretPosition(6);

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
        highlight(jTextAreaCod, text);

    }

    public JPanel emptyPanel(String name) {

        JPanel jPane = new JPanel();

        JLabel label = new JLabel("No existen " + name + " en el codigo...");

        label.setFont(new Font("arial", 1, 20));


        jPane.add(label, 0);



        return jPane;


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneProp = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCod = new javax.swing.JTextArea();

        setFocusable(false);

        jTabbedPaneProp.setBorder(javax.swing.BorderFactory.createTitledBorder("Propiedades"));
        jTabbedPaneProp.setFocusable(false);

        jTextAreaCod.setEditable(false);
        jTextAreaCod.setColumns(20);
        jTextAreaCod.setRows(5);
        jTextAreaCod.setFocusable(false);
        jScrollPane2.setViewportView(jTextAreaCod);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneProp, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPaneProp, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneProp;
    private javax.swing.JTextArea jTextAreaCod;
    // End of variables declaration//GEN-END:variables
}
