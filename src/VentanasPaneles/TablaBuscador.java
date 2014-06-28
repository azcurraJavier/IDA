package VentanasPaneles;

import Listas.Clase;
import Listas.Comentario;
import Listas.Literal;
import Listas.MostrarListaRef;
import Listas.MostrarTabla;
import Listas.PalabraHash;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TablaBuscador extends javax.swing.JPanel {

    private String getBuscar;
    private MiModelo modeloTabla;    
    private MiModelo modeloTablaRef;
    private MiJTable tablaElem;    
    private MiJTable tablaElemRef;
    private TableRowSorter<TableModel> tableSort;
    private int buscarColumna = 2;
    private Clase unaClase;
    private PalabraHash p;
    private CodigoPanel codigoPanel;
    private int tipoSel;
    
//    private JScrollPane jScrollpane;   
    private static final Map<Integer,String> lineaLit = new HashMap<>();
    
    private boolean hasElemets = true;//controla si tiene elementos

    public MiModelo getModeloTabla() {
        return modeloTabla;
    }    

    int filaAdd=0;
    boolean isSplit = false,isExp = false;
    
    public TablaBuscador(int tipoTabla, Clase unaCla, CodigoPanel codigoPanel, Map idSplit, Map idExp) {

        initComponents();
        

        jScrollPaneRef.setVisible(false);
        
//        jScrollpane = new JScrollPane();
//        jScrollpane.setVisible(true);
//        jScrollpane.setFocusable(false);
        
        tipoSel = tipoTabla;

        this.codigoPanel = codigoPanel;

        p = new PalabraHash();

        unaClase = unaCla;

        jButtonTagCloud.setVisible(false);

        modeloTabla = new MiModelo();
        
        modeloTabla.addColumn("-");   //ordenar por ambiente(default)   

        Object[] fila;
        
        if(idSplit != null && !idSplit.isEmpty()){
            isSplit = true;
            filaAdd++;
        }
        
        if(idExp != null || !idExp.isEmpty()){
            isExp = true;
            filaAdd++;
        }

        switch (tipoTabla) {

            case 0://Identificadores                
                modeloTabla.addColumn("Línea");
                modeloTabla.addColumn("Nombre ID");
                modeloTabla.addColumn("Representa");
                modeloTabla.addColumn("Tipo");
                modeloTabla.addColumn("Modificador");
                modeloTabla.addColumn("Nro Ref");                

                fila = new Object[8+filaAdd];

                for (MostrarTabla m : unaClase.getIdTablaClase()) {

                    //if (!"String".equals(m.getTipo())) {
                        fila[0] = "-";//m.getAmbiente();
                        fila[1] = m.getNumLinea();
                        fila[2] = "<html><b>"+m.getNomId()+"</b></html>";
                        fila[3] = m.getRepresenta();
                        fila[4] = m.getTipo();
                        fila[5] = m.getModificador();                        
                        fila[6] = m.getListaRef().size();
                        if(isSplit){
                            fila[7] = idSplit.get(fila[2]);
                        }
                        if(isExp){
                            fila[8] = idExp.get(fila[2]);
                        }
                        
                        modeloTabla.addRow(fila);
                   // }
                        
                      if ("String".equals(m.getTipo())) {
                          lineaLit.put(m.getNumLinea(), m.getNomId());
                          //carga referencias
                          for(MostrarListaRef f : m.getListaRef()){
                              lineaLit.put(Integer.parseInt(f.getLinea()), m.getNomId());
                          }
                      }
                }

                break;

            case 1://Strings
                
                modeloTabla.addColumn("Línea");
                modeloTabla.addColumn("Literal");
                modeloTabla.addColumn("ID Asignado");               

                fila = new Object[4];

//                for (MostrarTabla m : unaClase.getIdTablaClase()) {
//
//                    if ("String".equals(m.getTipo()) && !m.getStrAsignado().isEmpty()) {
//                        fila[0] = m.getAmbiente();
//                        fila[1] = m.getNomId();
//                        fila[2] = m.getNumLinea();
//                        fila[3] = m.getStrAsignado().trim();
//                        modeloTabla.addRow(fila);
//                    }
//                }

                for (Literal s : unaClase.getLisLiterales()) {

                    String id = lineaLit.get(s.getLine());
                    
                    
                    fila[0] = "-";//"@"+unaClase.getIde().getNomID();
                    fila[1] = s.getLine();                        
                    fila[2] = s.getText();
                    fila[3] = id==null?"-":id;
                    modeloTabla.addRow(fila);
                    
                }
                //una vez que la variable estatica se usa hay que limpiarla
                lineaLit.clear();

                break;

            case 2://Comentarios

                jButtonTagCloud.setVisible(true);
                
                modeloTabla.addColumn("Línea");
                modeloTabla.addColumn("Comentario");

                fila = new Object[3];
                
                for (Comentario com : unaClase.getLisComentario()) {
                    fila[0] =  "-";//com.getAmbiente();
                    fila[1] = com.getLinea();
                    fila[2] = com.getCom().trim();
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
            
            jScrollPane.setViewportView(tablaElem);
      
            
            tablaElem.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    tablaElemMousePressed(evt);
                }
            });
            

        }else{
            hasElemets = false;        
        }        

        if(tipoTabla==0){
            initTablasExtras();

        }

    }
    
    private void initTablasExtras() {

        //tablas extras declaracion referencias

        jScrollPaneRef.setVisible(true);

        modeloTablaRef = new MiModelo();        

        modeloTablaRef.addColumn("Línea");
        modeloTablaRef.addColumn("Nombre ID");
        modeloTablaRef.addColumn("Usado En");       
  

    }  
    
    private void cargarTablaRef(String nbre, int linea) {

        if (nbre == null) {
            return;
        }
        
        MostrarTabla mSelected = null;

        for (MostrarTabla m : unaClase.getIdTablaClase()) {

            if (m.getNomId().equals(nbre)
                    && m.getNumLinea() == linea){
                
                mSelected = m;
                break;
            }
        }    
        
        if(mSelected == null){
            return;
        }
        
        Object[] fila = new Object[3];

        for (MostrarListaRef r : mSelected.getListaRef()) {
            fila[0] = r.getLinea();
            fila[1] = "<html><b>"+nbre+"</b></html>";
            fila[2] = r.getUbicacion();
            modeloTablaRef.addRow(fila);
        }

        tablaElemRef = new MiJTable(modeloTablaRef);

        tablaElemRef.autoAjuste();

        //tableSort = new TableRowSorter<TableModel>(modeloTablaRef);
        //tablaElemRef.setRowSorter(tableSort);
        jScrollPaneRef.setViewportView(tablaElemRef);
        
        tablaElemRef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaElemMousePressed2(evt);
            }
        }); 

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTextFieldBusc = new javax.swing.JTextField();
        jButtonTagCloud = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jScrollPaneRef = new javax.swing.JScrollPane();

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
            .addComponent(jTextFieldBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldBusc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButtonTagCloud.setText("Ver TagCloud");
        jButtonTagCloud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTagCloudActionPerformed(evt);
            }
        });

        jScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Declaraciones"));

        jScrollPaneRef.setBorder(javax.swing.BorderFactory.createTitledBorder("Referencias"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTagCloud, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPaneRef, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButtonTagCloud)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneRef, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        String text = modeloTabla.getValueAt(row, 2).toString();
        
        text = text.trim().replaceAll("\n", "");   
        
        Pattern pattern = Pattern.compile("<html><b>(.*?)</b></html>");
        Matcher matcher = pattern.matcher(text);
        
        if(matcher.find()){        
            text = matcher.group(1);
        }
        
        codigoPanel.setHighlight(text,(int)modeloTabla.getValueAt(row, 1), Color.cyan);                           
        
        //cargar tablas extras
        if(tipoSel == 0){
            
             Object linea = modeloTabla.getValueAt(row, 1);           
             
             initTablasExtras();
            
             cargarTablaRef(text,(int)linea); 
            
        }        

    }
    
    private void tablaElemMousePressed2(java.awt.event.MouseEvent evt) {
        
        int row = tablaElem.getSelectedRow();

        String text = modeloTabla.getValueAt(row, 2).toString();
        
        text = text.trim().replaceAll("\n", "");   
        
        Pattern pattern = Pattern.compile("<html><b>(.*?)</b></html>");
        Matcher matcher = pattern.matcher(text);
        
        if(!matcher.find()){
            return;
        }
        
        row = tablaElemRef.getSelectedRow();
        
        codigoPanel.setHighlight(matcher.group(1),Integer.parseInt(modeloTablaRef.getValueAt(row, 0).toString()),Color.orange); 
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
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPaneRef;
    private javax.swing.JTextField jTextFieldBusc;
    // End of variables declaration//GEN-END:variables
}
