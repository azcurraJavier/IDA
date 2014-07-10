/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasPaneles;

import DictionaryDB.ConnectionDB;
import DictionaryDB.Dictionary;
import DictionaryDB.OperationDB;
import Listas.Clase;
import Listas.Comentario;
import Listas.ListaClase;
import Listas.Literal;
import Listas.PalabraHash;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author javier
 */
public final class DiccionaryPanel extends javax.swing.JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    private MiModelo modeloTabla;
    private MiJTable tablaElem;
    private TableRowSorter<TableModel> tableSort1;
    private TableRowSorter<TableModel> tableSort2;
    private PalabraHash palTag;
    private static TagCloudPanel tcp;

    private static Set<String> stopList;

    private static ArrayList<String> frasesCap;
    private static ArrayList<String> palabrasCap;

    /**
     * Creates new form ExpandPanel
     */
    public DiccionaryPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        stopList = new HashSet<>();

        palTag = new PalabraHash();

        frasesCap = new ArrayList<>();
        palabrasCap = new ArrayList<>();

        modeloTabla = new MiModelo();
        tablaElem = new MiJTable(modeloTabla);
        jScrollDiccIn.setViewportView(tablaElem);

        modeloTabla.addColumn(" ");

        Object[] filaTabla = new Object[1];

        ConnectionDB.AbrirConBD();
        ArrayList<String> listDic = Dictionary.likeWordDic("words_dict", "ab");
        ConnectionDB.CerrarConBD();

        for (String str : listDic) {

            filaTabla[0] = str.trim();
            modeloTabla.addRow(filaTabla);
        }

        tablaElem.autoAjuste();
        
        rebuildPhraseList();

        ///////////////////////////
//        modeloTabla = new MiModelo();
//        tablaElem = new MiJTable(modeloTabla);
//        jScrollFraCap.setViewportView(tablaElem);
//
//        modeloTabla.addColumn(" ");
//        
//        filaTabla = new Object[1];
//        
//        for(String linea:listPhrases){            
//            
//            linea = linea.replaceAll("\"", "").trim();
//            //excluir simbolos
//            linea=linea.replaceAll("[^\\dA-Za-z ]", "");           
//            
//            
//            
//            filaTabla[0]= linea;
//            addLineaCom(linea);//para tagcloud
//            modeloTabla.addRow(filaTabla);            
//        }
//        
//        tablaElem.autoAjuste();
        ///////////////////////////
        modeloTabla = new MiModelo();
        tablaElem = new MiJTable(modeloTabla);         
        tableSort2 = new TableRowSorter<TableModel>(modeloTabla);
        tablaElem.setRowSorter(tableSort2);  
        jScrollPalRes.setViewportView(tablaElem);

        modeloTabla.addColumn(" ");

        filaTabla = new Object[1];

        ConnectionDB.AbrirConBD();
        ArrayList<String> stopL = Dictionary.selectAllDic("stop_dict");
        ConnectionDB.CerrarConBD();

        for (String word : stopL) {
            stopList.add(word.trim());
            filaTabla[0] = "<html><b>" + word.trim() + "</b></html>";//<html>Math,<br>Class1</html>
            modeloTabla.addRow(filaTabla);
        }

        tablaElem.autoAjuste();

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public static int getReturnStatus() {
        return returnStatus;
    }

    public static ArrayList<String> getFrasesCap() {
        return frasesCap;
    }

    public static ArrayList<String> getPalabrasCap() {
        return palabrasCap;
    }    

    public void rebuildPhraseList() {

        modeloTabla = new MiModelo();
        tablaElem = new MiJTable(modeloTabla);
        tableSort1 = new TableRowSorter<TableModel>(modeloTabla);

        tablaElem.setRowSorter(tableSort1);   
        
        jScrollFraCap.setViewportView(tablaElem);

        modeloTabla.addColumn(" ");

        Set<String> comCap = new HashSet<>();
        
        
        for (Clase c : ListaClase.getLisClases()) {
            for (Comentario com : c.getLisComentario()) {
                comCap.add(com.getCom());
            }
            //lisCom.add("===================");
            for (Literal l : c.getLisLiterales()) {
                comCap.add(l.getText());
            }
        }

        //se limpia todo
        frasesCap.clear();
        palabrasCap.clear();
        palTag.clear();
        
        Object fl[] = new Object[1];
        
        ConnectionDB.AbrirConBD();       
        
        for (String linea : comCap) {

            //limpieza
            linea = linea.replaceAll("\"", "").trim();
            //excluir simbolos
            linea = linea.replaceAll("[^\\dA-Za-z ]", "");
            
            if(linea.isEmpty()){
                continue;
            }

            //filtrar palabras irrelevantes
            String arrayCom[] = linea.split(" ");

            String frase = "";

            for (String pal : arrayCom) {
                
                if(pal == null || pal.isEmpty()){
                    continue;
                }

                //para evitar problemas todo con minuscula
                pal = pal.toLowerCase();

                if (!OperationDB.select("stop_dict", pal)) {
                    //si no es una palabra irrelevante la agrego
                    palabrasCap.add(pal);
                    frase += pal + " ";
                    
                    palTag.addPalabra(pal);//para tagcloud
                }

            }

            if (!frase.isEmpty()) {
                frase = frase.substring(0, frase.length() - 1);
                frasesCap.add(frase);
            }
            
            fl[0] = frase;
            
            modeloTabla.addRow(fl);//mostrar tabla

        }
        ConnectionDB.CerrarConBD();
        tablaElem.autoAjuste();

    }

    //doClose(RET_CANCEL);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollDiccIn = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldDicIng = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollFraCap = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTextFBuscFra = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPalRes = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jTextFBusExc = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setTitle("Diccionarios");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Diccionario en Inglés"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Palabra"));

        jTextFieldDicIng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDicIngKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldDicIng, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldDicIng, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollDiccIn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollDiccIn, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Frases Capturadas de Comentarios y Literales"));

        jButton1.setText("Ver Tagcloud");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Palabra"));

        jTextFBuscFra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFBuscFraKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFBuscFra, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFBuscFra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollFraCap, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollFraCap, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Palabras Excluidas"));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Palabra"));

        jTextFBusExc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFBusExcKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFBusExc, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFBusExc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPalRes, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPalRes, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(913, 475));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (tcp == null) {
            tcp = new TagCloudPanel(new javax.swing.JFrame(), true, palTag.getArray());
        }
        tcp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldDicIngKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDicIngKeyReleased

        String wordSearch = jTextFieldDicIng.getText();

        if (wordSearch.length() <= 1) {
            tablaElem.removeAll();
            return;
        }

        modeloTabla = new MiModelo();
        tablaElem = new MiJTable(modeloTabla);
        jScrollDiccIn.setViewportView(tablaElem);

        modeloTabla.addColumn(" ");

        Object[] filaTabla = new Object[1];

        ConnectionDB.AbrirConBD();
        ArrayList<String> listDic = Dictionary.likeWordDic("words_dict", wordSearch);
        ConnectionDB.CerrarConBD();

        for (String word : listDic) {

            filaTabla[0] = word.trim();
            modeloTabla.addRow(filaTabla);
        }

        tablaElem.autoAjuste();

    }//GEN-LAST:event_jTextFieldDicIngKeyReleased

    private void jTextFBuscFraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFBuscFraKeyReleased
        
        tableSort1.setRowFilter(RowFilter.regexFilter(jTextFBuscFra.getText(), 0));
        
    }//GEN-LAST:event_jTextFBuscFraKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        doClose(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFBusExcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFBusExcKeyReleased
        tableSort2.setRowFilter(RowFilter.regexFilter(jTextFBusExc.getText(), 0));
    }//GEN-LAST:event_jTextFBusExcKeyReleased

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollDiccIn;
    private javax.swing.JScrollPane jScrollFraCap;
    private javax.swing.JScrollPane jScrollPalRes;
    private javax.swing.JTextField jTextFBusExc;
    private javax.swing.JTextField jTextFBuscFra;
    private javax.swing.JTextField jTextFieldDicIng;
    // End of variables declaration//GEN-END:variables

    private static int returnStatus = RET_CANCEL;
}
