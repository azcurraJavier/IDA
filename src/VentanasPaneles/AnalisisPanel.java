package VentanasPaneles;

import DictionaryDB.ConnectionDB;
import ExpandID.ExpandBasic;
import ExtractID.Principal;
import Listas.Archivo;
import SplitID.Greedy;
import SplitID.Samurai;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 *
 * @author javier
 */
public class AnalisisPanel extends javax.swing.JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    private MiModelo modeloTablaId;
    private MiJTable tablaElemId;

    private MiModelo modeloTablaDiv;
    private MiJTable tablaElemDiv;

    private MiModelo modeloTablaExp;
    private MiJTable tablaElemExp;

    private final ArrayList<String[]> listIds;
    
    /////////////////////////////////////
    
    private final int sizeArrays;
    
    private final String[] arrayIdsGreedy;
    private final String[] arrayIdsSamurai;
    
    private final String[] arrayIdsExGreedy;
    private final String[] arrayIdsExSamurai;
    
    /////////////////////////////////////
    private final Greedy algoritmoGreedy;
    private final Samurai algoritmoSamurai;
    private final ExpandBasic algoritmoExpansion;

    public AnalisisPanel(java.awt.Frame parent, boolean modal, ArrayList<String[]> listIds, Archivo archivo) {
        super(parent, modal);
        initComponents();
        
        if(listIds == null || listIds.isEmpty()){
            jButtonDiv.setEnabled(false);
        }
        
        this.listIds = listIds;
        
        sizeArrays = listIds.size();
        
        algoritmoGreedy = new Greedy();        

        //Se inician tablas de frecuencias
        ConnectionDB.AbrirConBD();        
        
        //se preparan tablas de samurai y expansion basica
        algoritmoExpansion  = new ExpandBasic(archivo);
                
        algoritmoSamurai = new Samurai(archivo);
        ConnectionDB.CerrarConBD();
        //

        jRadioBGreedy.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioBGreedy);
        group.add(jRadioBSam);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(jRadioBdeGre);
        group2.add(jRadioBdeSam);

        ////////////////////////////
        
        arrayIdsGreedy = new String[sizeArrays];
        arrayIdsSamurai = new String[sizeArrays];
        arrayIdsExGreedy = new String[sizeArrays];
        arrayIdsExSamurai = new String[sizeArrays];

        /////////////////////////////
        
        
        modeloTablaId = new MiModelo();
        modeloTablaDiv = new MiModelo();
        modeloTablaExp = new MiModelo();

        tablaElemId = new MiJTable(modeloTablaId);
        tablaElemDiv = new MiJTable(modeloTablaDiv);
        tablaElemExp = new MiJTable(modeloTablaExp);

        jScrollId.setViewportView(tablaElemId);
        jScrollDiv.setViewportView(tablaElemDiv);
        jScrollExp.setViewportView(tablaElemExp);

        modeloTablaId.addColumn(" ");

        Object[] filaTabla = new Object[1];

            for (String[] e : listIds) {
            
                filaTabla[0] = "<html><b>" + e[0] + "</b></html>";
                modeloTablaId.addRow(filaTabla);               
            
            }
        

        for (int i = 0; i < modeloTablaId.getRowCount(); i++) {
            modeloTablaDiv.addRow(new Object[1]);
            modeloTablaExp.addRow(new Object[1]);
        }

        tablaElemId.autoAjuste();

        tablaElemId.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                int row = tablaElemId.rowAtPoint(evt.getPoint());

                if (tablaElemDiv.getRowCount() > 0) {
                    tablaElemDiv.getSelectionModel().clearSelection();
                    tablaElemDiv.setRowSelectionInterval(row, row);
                }

                if (tablaElemExp.getRowCount() > 0) {
                    tablaElemExp.getSelectionModel().clearSelection();
                    tablaElemExp.setRowSelectionInterval(row, row);
                }
            }
        });
        
        tablaElemDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                int row = tablaElemDiv.rowAtPoint(evt.getPoint());
                
                tablaElemId.getSelectionModel().clearSelection();
                tablaElemId.setRowSelectionInterval(row, row);
                

                if (tablaElemExp.getRowCount() > 0) {
                    tablaElemExp.getSelectionModel().clearSelection();
                    tablaElemExp.setRowSelectionInterval(row, row);
                }
            }
        });
        
        tablaElemExp.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                int row = tablaElemExp.rowAtPoint(evt.getPoint());
                
                tablaElemId.getSelectionModel().clearSelection();
                tablaElemId.setRowSelectionInterval(row, row);
 
                tablaElemDiv.getSelectionModel().clearSelection();
                tablaElemDiv.setRowSelectionInterval(row, row);
            }
        });          

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

    //permite sacar el html limpiando los valores
//    private String cleanHtml(String html) {
//
//        Pattern pattern = Pattern.compile("<html><b>(.*?)</b></html>");
//        Matcher matcher = pattern.matcher(html);
//
//        if (matcher.find()) {
//            return matcher.group(1);
//        }
//
//        return "";
//
//    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }
    
    ///////////////
    public String[] getArrayIdsGreedy() {
        return arrayIdsGreedy;
    }

    public String[] getArrayIdsSamurai() {
        return arrayIdsSamurai;
    }

    public String[] getArrayIdsExGreedy() {
        return arrayIdsExGreedy;
    }

    public String[] getArrayIdsExSamurai() {
        return arrayIdsExSamurai;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollId = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jRadioBGreedy = new javax.swing.JRadioButton();
        jRadioBSam = new javax.swing.JRadioButton();
        jButtonDiv = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonExp = new javax.swing.JButton();
        jRadioBdeGre = new javax.swing.JRadioButton();
        jRadioBdeSam = new javax.swing.JRadioButton();
        jScrollDiv = new javax.swing.JScrollPane();
        jScrollExp = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton2.setText("G");

        setTitle("Análisis de Identificadores");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        cancelButton.setText("Cerrar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jScrollId.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificadores Capturados"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Técnicas de División de Identificadores"));

        jRadioBGreedy.setText("Algoritmo Greedy");

        jRadioBSam.setText("Algoritmo Samurai");

        jButtonDiv.setText("¡Dividir !");
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioBGreedy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioBSam)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioBGreedy)
                    .addComponent(jButtonDiv))
                .addGap(18, 18, 18)
                .addComponent(jRadioBSam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Expandir Identificadores"));
        jPanel2.setPreferredSize(new java.awt.Dimension(191, 80));

        jButtonExp.setText("¡Expandir !");
        jButtonExp.setEnabled(false);
        jButtonExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExpActionPerformed(evt);
            }
        });

        jRadioBdeGre.setText("Desde División Greedy");
        jRadioBdeGre.setEnabled(false);

        jRadioBdeSam.setText("Desde División  Samurai");
        jRadioBdeSam.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioBdeSam)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioBdeGre)
                        .addGap(62, 62, 62)
                        .addComponent(jButtonExp)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioBdeGre)
                    .addComponent(jButtonExp))
                .addGap(18, 18, 18)
                .addComponent(jRadioBdeSam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollDiv.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado de la División"));

        jScrollExp.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado de la Expansión"));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Información Utilizada"));

        jButton1.setText("<html>Palabras<br />Capturadas</html>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Diccionarios");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollId, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollDiv, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollExp)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollDiv)
                    .addComponent(jScrollExp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1017, 494));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
       
        boolean greedy = jRadioBGreedy.isSelected();

        String splitIde;

        ConnectionDB.AbrirConBD();

        int j=0;
        for (String[] e : listIds) {
            
            String ide = e[0];            

            splitIde = greedy ? algoritmoGreedy.ejecutar(ide) : algoritmoSamurai.ejecutar(ide);

            splitIde = splitIde.replaceAll(" ", "-");//para que se destaque la separación

            if (greedy) {
                arrayIdsGreedy[j] =splitIde;
            } else {
                arrayIdsSamurai[j] = splitIde;
            }
            j++;
        }

        ConnectionDB.CerrarConBD();

        //carga tabla
        int colNum = modeloTablaDiv.getColumnCount();

        modeloTablaDiv.addColumn(greedy ? "GREEDY" : "SAMURAI");

        Object elem2;

        for(int i = 0; i < sizeArrays; i++){
            elem2 = greedy ? arrayIdsGreedy[i] : arrayIdsSamurai[i];

            modeloTablaDiv.setValueAt(elem2, i, colNum);
        }

        jScrollDiv.getVerticalScrollBar().setModel(jScrollId.getVerticalScrollBar().getModel());

        tablaElemDiv.autoAjuste();

        if (greedy) {
            jRadioBGreedy.setEnabled(false);
            jRadioBSam.setSelected(true);
            //
            jRadioBdeGre.setEnabled(true);
            jRadioBdeGre.setSelected(true);
        } else {
            jRadioBSam.setEnabled(false);
            jRadioBGreedy.setSelected(true);
            //
            jRadioBdeSam.setEnabled(true);
            jRadioBdeSam.setSelected(true);
        }

        if (!jButtonExp.isEnabled()) {
            jButtonExp.setEnabled(true);
        }

        if (!jRadioBGreedy.isEnabled() && !jRadioBSam.isEnabled()) {
            jButtonDiv.setEnabled(false);
        }
        
        tablaElemId.getSelectionModel().clearSelection();
        tablaElemDiv.getSelectionModel().clearSelection();
        tablaElemExp.getSelectionModel().clearSelection();
        

    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExpActionPerformed

        boolean deGreedy = jRadioBdeGre.isSelected();

        Object elem, elem2;
        String arrayElem[];      
        int colNum = modeloTablaExp.getColumnCount();

        modeloTablaExp.addColumn(deGreedy ? "Desde GREEDY" : "Desde SAMURAI");

        for(int i = 0; i < sizeArrays; i++){    
            
            String clase = listIds.get(i)[1];//Alg expansion
            String met = listIds.get(i)[2];  //Alg expansion          

            elem = deGreedy ? arrayIdsGreedy[i] : arrayIdsSamurai[i];
            
            arrayElem = elem.toString().split("-");

            String append = "";

            ConnectionDB.AbrirConBD();

            for (String s : arrayElem) {

                append += algoritmoExpansion.ejecutar(s,clase,met) + " ";

            }

            ConnectionDB.CerrarConBD();

            elem2 = append.trim().isEmpty() ? "" : append.substring(0, append.length() - 1);

            if (deGreedy) {
                arrayIdsExGreedy[i] =elem2.toString();
            } else {
                arrayIdsExSamurai[i] =elem2.toString();
            }           
            
            //setear letras color
            elem2 = resaltarLetras(elem.toString(), elem2.toString());
            
            modeloTablaExp.setValueAt(elem2, i, colNum);

        }

        jScrollExp.getVerticalScrollBar().setModel(jScrollId.getVerticalScrollBar().getModel());

        tablaElemExp.autoAjuste();

        if (deGreedy) {
            jRadioBdeGre.setEnabled(false);
            jRadioBdeSam.setSelected(true);
        } else {
            jRadioBdeSam.setEnabled(false);
            jRadioBdeGre.setSelected(true);
        }

        if (!jRadioBdeGre.isEnabled() && !jRadioBdeSam.isEnabled()) {
            jButtonExp.setEnabled(false);
        }
        
        tablaElemId.getSelectionModel().clearSelection();
        tablaElemDiv.getSelectionModel().clearSelection();
        tablaElemExp.getSelectionModel().clearSelection();
        
    }//GEN-LAST:event_jButtonExpActionPerformed

    private String format(Object s){
        return "<span style=\"color: #1A008E;\">"+s+"</span>";
    }
    
    private String resaltarLetras(String abrev, String expAbre){
        
        String abrev2 = abrev.replaceAll("-", "");//remuevo guion
        
        char acr[] = abrev2.toCharArray();
        char palabra[] = expAbre.toCharArray();
        
        String ret = format(acr[0]);
        
        int i=1;//arranca en 1 porque en 0 se que coinciden        
        
        for(int j=1;j<palabra.length;j++){
        
            if(i<acr.length && acr[i]==(palabra[j])){
                ret += format(palabra[j]);                
                i++;                
            }else{
                ret += palabra[j];                
            }                   
            
        }
        
        return "<html>"+ret+"</html>";

    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        InfoUtilizadaPane s = new InfoUtilizadaPane(new javax.swing.JFrame(), true,
                                algoritmoSamurai.getLocalFreqTable(), algoritmoSamurai.getGlobalFreqTable(), algoritmoExpansion.getFrasesCap());

        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Principal.getDicPanel().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonExp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioBGreedy;
    private javax.swing.JRadioButton jRadioBSam;
    private javax.swing.JRadioButton jRadioBdeGre;
    private javax.swing.JRadioButton jRadioBdeSam;
    private javax.swing.JScrollPane jScrollDiv;
    private javax.swing.JScrollPane jScrollExp;
    private javax.swing.JScrollPane jScrollId;
    // End of variables declaration//GEN-END:variables
    private int returnStatus = RET_CANCEL;
}
