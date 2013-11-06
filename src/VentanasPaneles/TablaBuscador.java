package VentanasPaneles;

import Listas.Clase;
import Listas.Comentario;
import Listas.MostrarTabla;
import Listas.PalabraHash;
import java.util.Iterator;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TablaBuscador extends javax.swing.JPanel {

    private String getBuscar;
    private MiModelo modeloTabla;
    private MiJTable tablaElem;
    private TableRowSorter<TableModel> tableSort;
    private int buscarColumna = 1;
    private Clase unaClase;
    private PalabraHash p;
    private CodigoPanel codigoPanel;
    private int tipoSel;
    
//    private JScrollPane jScrollpane;   
    
    
    private boolean hasElemets = true;//controla si tiene elementos

    public TablaBuscador(int tipoTabla, Clase unaCla, CodigoPanel codigoPanel) {

        initComponents();
        
//        jScrollpane = new JScrollPane();
//        jScrollpane.setVisible(true);
//        jScrollpane.setFocusable(false);
        
        tipoSel = tipoTabla;

        this.codigoPanel = codigoPanel;

        p = new PalabraHash();

        unaClase = unaCla;

        jButtonTagCloud.setVisible(false);

        modeloTabla = new MiModelo();
        
        modeloTabla.addColumn("Ambiente");   //ordenar por ambiente(default)   

        Object[] fila;

        switch (tipoTabla) {

            case 0://Identificadores                
                modeloTabla.addColumn("IDENTIFICADOR");
                modeloTabla.addColumn("Tipo - T.Retorno");
                modeloTabla.addColumn("Modificador");
                modeloTabla.addColumn("N° Apariciones");

                fila = new Object[5];

                for (MostrarTabla m : unaClase.getIdTablaClase()) {

                    if (!"String".equals(m.getTipo())) {
                        fila[0] = m.getAmbiente();
                        fila[1] = m.getNomId();
                        fila[2] = m.getTipo();
                        fila[3] = m.getModificador();
                        fila[4] = m.getNumApa();
                        modeloTabla.addRow(fila);
                    }
                }

                break;

            case 1://Strings
                modeloTabla.addColumn("IDENTIFICADOR");
                modeloTabla.addColumn("String Asignado");


                fila = new Object[3];

                for (MostrarTabla m : unaClase.getIdTablaClase()) {

                    if ("String".equals(m.getTipo()) && !m.getStrAsignado().isEmpty()) {
                        fila[0] = m.getAmbiente();
                        fila[1] = m.getNomId();
                        fila[2] = m.getStrAsignado();
                        modeloTabla.addRow(fila);
                    }
                }

                for (String s : unaClase.getLisLiterales()) {

                    if (validString(s)) {
                        fila[0] = "CONSTANTE";
                        fila[1] = "CONSTANTE";
                        fila[2] = s;
                        modeloTabla.addRow(fila);
                    }
                }

                break;

            case 2://Comentarios

                jButtonTagCloud.setVisible(true);
                buscarColumna = 2;
                modeloTabla.addColumn("Nro Linea");
                modeloTabla.addColumn("Comentario");

                fila = new Object[3];
                for (Iterator<Comentario> it2 = unaClase.getLisComentario().iterator(); it2.hasNext();) {
                    Comentario com = it2.next();
                    fila[0] = com.getAmbiente();
                    fila[1] = com.getLinea();
                    fila[2] = com.getCom();
                    modeloTabla.addRow(fila);

                    addLineaCom(com.getCom());

                }

                break;

            default:
                break;
        }
        
        if (modeloTabla.hasRows()) {//si tiene filas

            tablaElem = new MiJTable(modeloTabla);

            

                        
            
            tablaElem.autoAjuste();
            
            
            tableSort = new TableRowSorter<TableModel>(modeloTabla);

            tablaElem.setRowSorter(tableSort);
            
            jScrollpane.setViewportView(tablaElem);       
            
            
//                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
//        this.setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
//            .addComponent(jScrollpane, javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE , tablaElem.getAnchoTotaltabla())
//        );
//       layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
//            .addComponent(jScrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, tablaElem.getRowHeight(), Short.MAX_VALUE)
//        );
    
            
            tablaElem.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    tablaElemMousePressed(evt);
                }
            });

        }else{
            hasElemets = false;        
        }

    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTextFieldBusc = new javax.swing.JTextField();
        jButtonTagCloud = new javax.swing.JButton();
        jScrollpane = new javax.swing.JScrollPane();

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar..."));

        jTextFieldBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextFieldBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButtonTagCloud.setText("Ver TagCloud");
        jButtonTagCloud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTagCloudActionPerformed(evt);
            }
        });

        jScrollpane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollpane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonTagCloud, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)))
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonTagCloud)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscKeyReleased
        getBuscar = jTextFieldBusc.getText();
        tableSort.setRowFilter(RowFilter.regexFilter(getBuscar, buscarColumna));
    }//GEN-LAST:event_jTextFieldBuscKeyReleased

    private void jButtonTagCloudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTagCloudActionPerformed
        TagCloudPanel tcp;
        tcp = new TagCloudPanel(new javax.swing.JFrame(), true, p.getArray());

        tcp.setVisible(true);

    }//GEN-LAST:event_jButtonTagCloudActionPerformed

    private void addLineaCom(String linea) {

        String pals[] = linea.split(" ");

        for (String s : pals) {
            p.addPalabra(s);
        }

    }

    private void tablaElemMousePressed(java.awt.event.MouseEvent evt) {


        int row = tablaElem.getSelectedRow();
        int column = -1;

        switch (tipoSel) {

            case 0:
            
                column = 1;
                break;
                
            case 1:
            case 2:
                column = 2;
                break;

        }

        String text = modeloTabla.getValueAt(row, column).toString();
        
        text = text.trim().replaceAll("\n", "");
        
        text = text.replaceAll("\t", "");

        codigoPanel.setHighlight(text);        
        


    }

    private boolean validString(String s) {

        if (s != null) {

            String esp = s.replace("\"", "");

            if ((esp.isEmpty() || esp.trim().length() == 0)) {
                return false;
            }
            
            if (modeloTabla.getRowCount() > 0) {

                for (int i = 0; i < modeloTabla.getRowCount(); i++) {

                    String p = modeloTabla.getValueAt(i, 2).toString();

                    if (p.equals(s)) {
                        return false;
                    }

                }

            }

        } else {
            return false;
        }


        return true;

    }
    
   public boolean hasElem(){
       return this.hasElemets;
   }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTagCloud;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollpane;
    private javax.swing.JTextField jTextFieldBusc;
    // End of variables declaration//GEN-END:variables
}
