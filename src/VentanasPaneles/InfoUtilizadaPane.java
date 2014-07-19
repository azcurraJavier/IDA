/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasPaneles;

import ExpandID.ExpandBasic;
import Listas.PalabraHash;
import SplitID.SamuraiPaper;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author javier
 */
public class InfoUtilizadaPane extends javax.swing.JDialog {

    private MiModelo modeloTabla;
    private MiJTable tablaElem;
    private TableRowSorter<TableModel> tableSort;
    
    private Map<String,Integer> localFreqTable;
    private Map<String,Integer> globalFreqTable;
    private static TagCloudPanel tcp;
    private PalabraHash palTag;

    /**
     * Creates new form SamuraiFreqTable
     */
    public InfoUtilizadaPane(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         
        localFreqTable = SamuraiPaper.getLocalFreqTable();
        globalFreqTable = SamuraiPaper.getGlobalFreqTable();
        
        
        modeloTabla = new MiModelo();
        tablaElem = new MiJTable(modeloTabla);
        jScrollPane1.setViewportView(tablaElem);

        modeloTabla.addColumn("<html>Token<br />Capturado</html>");
        modeloTabla.addColumn("<html>Frecuencia<br />Local</html>");
        modeloTabla.addColumn("<html>Frecuencia<br />Global</html>");

        Object[] filaTabla = new Object[3];

        for (Map.Entry mapEntry : localFreqTable.entrySet()) {

            filaTabla[0] = mapEntry.getKey().toString().trim();
            filaTabla[1] = mapEntry.getValue();
            filaTabla[2] = globalFreqTable.get(mapEntry.getKey().toString());
            modeloTabla.addRow(filaTabla);
        }
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tablaElem.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        tablaElem.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        
        
        tablaElem.autoAjuste();
        
        
        modeloTabla = new MiModelo();
        tablaElem = new MiJTable(modeloTabla);
        tableSort = new TableRowSorter<TableModel>(modeloTabla);

        tablaElem.setRowSorter(tableSort);   
        
        jScrollFraCap.setViewportView(tablaElem);

        modeloTabla.addColumn(" ");
        
        filaTabla = new Object[1];
        
        for(String f :ExpandBasic.getFrasesCap()){
            
            filaTabla[0] = f;
            modeloTabla.addRow(filaTabla);
        }        
        
        //tag cloud
        palTag = new PalabraHash();
        
        
        for(String s:ExpandBasic.getPalabrasCap()){
            palTag.addPalabra(s);
        }
        ///
        
    }
    
    private void doClose() {        
        setVisible(false);
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTextFBuscFra = new javax.swing.JTextField();
        jScrollFraCap = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información Utilizada");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablas de Frecuencias - Algoritmo Samurai"));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Frases Capturadas - Algoritmo de Expansión"));

        jButton2.setText("Ver Tagcloud");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)
                        .addContainerGap(138, Short.MAX_VALUE))
                    .addComponent(jScrollFraCap, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollFraCap, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        doClose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFBuscFraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFBuscFraKeyReleased

        tableSort.setRowFilter(RowFilter.regexFilter(jTextFBuscFra.getText(), 0));
    }//GEN-LAST:event_jTextFBuscFraKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (tcp == null) {
            tcp = new TagCloudPanel(new javax.swing.JFrame(), true, palTag.getArray());
        }
        tcp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollFraCap;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFBuscFra;
    // End of variables declaration//GEN-END:variables
}