package VentanasPaneles;

import ExtractID.Main;
import Listas.Clase;
import Listas.Comentario;
import Listas.Literal;
import Listas.MostrarListaRef;
import Listas.MostrarTabla;
import Listas.PalabraHash;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
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
       
    ArrayList<String> listTableInfo;//aca se van a almacenar los ids comentarios y lit para ser devueltos al main
    
    AnalisisPanel splitPanel;
    
    Set<String> setIdExtract;

    public ArrayList<String> getListTableInfo() {
        return listTableInfo;
    }   

    //me srive para agregar columnas
    public MiModelo getModeloTabla() {
        return modeloTabla;
    }

    //me srive para agregar columnas
    public MiJTable getTablaElem() {
        return tablaElem;
    }
    
    public TablaBuscador(int tipoTabla, Clase unaCla, CodigoPanel codigoPanel) {

        initComponents();
        
        listTableInfo = new ArrayList<>();

        jScrollPaneRef.setVisible(false);
        
//        jScrollpane = new JScrollPane();
//        jScrollpane.setVisible(true);
//        jScrollpane.setFocusable(false);
        
        tipoSel = tipoTabla;

        this.codigoPanel = codigoPanel;

        p = new PalabraHash();

        unaClase = unaCla;

        jButtonTagCloud.setVisible(false);
        jPanelAnalisis.setVisible(false);

        modeloTabla = new MiModelo();
        
        modeloTabla.addColumn("-");   //ordenar por ambiente(default)   

        Object[] fila;
        
        
        setIdExtract = new HashSet<>();//ids que son capturados para analisis
        
        String titleBorder="";

        switch (tipoTabla) {

            case 0://Identificadores         
                
                jPanelAnalisis.setVisible(true);
                
                modeloTabla.addColumn("Línea");
                modeloTabla.addColumn("Nombre ID");
                modeloTabla.addColumn("Representa");
                modeloTabla.addColumn("Tipo");
                modeloTabla.addColumn("Modificador");
                modeloTabla.addColumn("Nro Ref");                

                fila = new Object[8];

                for (MostrarTabla m : unaClase.getIdTablaClase()) {

                    
                        fila[0] = "-";//m.getAmbiente();
                        fila[1] = m.getNumLinea();
                        fila[2] = "<html><b>"+m.getNomId()+"</b></html>";
                        fila[3] = m.getRepresenta();
                        fila[4] = m.getTipo();
                        fila[5] = m.getModificador();                        
                        fila[6] = m.getListaRef().size();     
                        
                        //se agrega a la tabla
                        modeloTabla.addRow(fila);
                   
                        //se guarda para ser procesado por los algoritmos de ids
                        listTableInfo.add(m.getNomId());
                       
                      //asgnacion de literales a ids  
                      if ("String".equals(m.getTipo())) {
                          lineaLit.put(m.getNumLinea(), m.getNomId());
                          //carga referencias
                          for(MostrarListaRef f : m.getListaRef()){
                              lineaLit.put(Integer.parseInt(f.getLinea()), m.getNomId());
                          }
                      }
                }
                titleBorder="Declaraciones";

                break;

            case 1://Strings
                
                modeloTabla.addColumn("Línea");
                modeloTabla.addColumn("Literal");
                modeloTabla.addColumn("ID Asociado");               

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
                
                titleBorder="Literales";

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
                
                titleBorder="Comentarios";

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
      
            jScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(titleBorder));
                    
                    
            tablaElem.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    tablaElemMousePressed(evt);
                }
            });
            
            if(tipoSel==0){
                jScrollPaneRef.setVisible(true);
            }
            

        }else{
            hasElemets = false;        
        }        
    }
    
    private void cargarTablaRef(String nbre, int linea) {

        if (nbre == null) {
            return;
        }
        
        modeloTablaRef = new MiModelo();        

        modeloTablaRef.addColumn("Línea");
        modeloTablaRef.addColumn("Nombre ID");
        modeloTablaRef.addColumn("Usado En");       

        
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

        tablaElemRef  = new MiJTable(modeloTablaRef);

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
    
    
    public void updateTableId(String nameCol, Map idMap, String exp){
        
        if(idMap.isEmpty()){//no hay elementos
            return;
        }
        
        int colNum = modeloTabla.getColumnCount();
        
        for(int j=0;j<colNum;j++){//veo si la columna ya existe
            if(modeloTabla.getColumnName(j).equals(nameCol)){
                return;
            }
        }
        
        int colGetInfo=2;//id sin dividir
        
        if(exp != null){
            for (int j = 0; j < colNum; j++) {//veo si la columna ya existe
                if (modeloTabla.getColumnName(j).equals(exp)) {
                    colGetInfo=j;//id dividido
                }
            }        
        }
        
        
        modeloTabla.addColumn(nameCol);
    
        Object elem,elem2;
        //recorre filas
        for(int i=0;i<modeloTabla.getRowCount();i++){
        
            elem = modeloTabla.getValueAt(i, colGetInfo);
            
            elem2 = idMap.get(cleanHtml(elem.toString()).trim());           
            
            modeloTabla.setValueAt(elem2, i, colNum);
            
        }       
         
        tablaElem.autoAjuste();         
    }
    
    
    public void updateTableId(String nameCol, Map idMap){
        updateTableId(nameCol, idMap,null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTextFieldBusc = new javax.swing.JTextField();
        jButtonTagCloud = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jScrollPaneRef = new javax.swing.JScrollPane();
        jPanelAnalisis = new javax.swing.JPanel();
        jButtonAnId = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        jButtonTagCloud.setEnabled(false);
        jButtonTagCloud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTagCloudActionPerformed(evt);
            }
        });

        jScrollPaneRef.setBorder(javax.swing.BorderFactory.createTitledBorder("Referencias"));

        jPanelAnalisis.setBorder(javax.swing.BorderFactory.createTitledBorder("Análisis de Identificadores"));

        jButtonAnId.setText("Ejecutar Analisis");
        jButtonAnId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnIdActionPerformed(evt);
            }
        });

        jButton1.setText("Diccionarios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAnalisisLayout = new javax.swing.GroupLayout(jPanelAnalisis);
        jPanelAnalisis.setLayout(jPanelAnalisisLayout);
        jPanelAnalisisLayout.setHorizontalGroup(
            jPanelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnalisisLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButtonAnId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanelAnalisisLayout.setVerticalGroup(
            jPanelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonAnId)
                .addComponent(jButton1))
        );

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jButtonTagCloud))
                    .addComponent(jPanelAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneRef, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jScrollPane))
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

    private void jButtonAnIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnIdActionPerformed
                
        
        if(this.setIdExtract.isEmpty()){
            for(String id: codigoPanel.getTablaId().getListTableInfo()){        

                //los ids encontrados los procesamos con conjunto para sacar repetidos
                this.setIdExtract.add(id);

            }
        }
        
        if(splitPanel == null){
            
            splitPanel = new AnalisisPanel(new javax.swing.JFrame(), true, setIdExtract);            
        }
        
        splitPanel.setVisible(true);
        
        codigoPanel.getTablaId().updateTableId("Div Greedy", splitPanel.getMapIdsGreedy()); 
        codigoPanel.getTablaId().updateTableId("Div Samurai", splitPanel.getMapIdsSamurai()); 
        codigoPanel.getTablaId().updateTableId("Expansión de Greedy", splitPanel.getMapIdsExpand(),"Div Greedy"); 
        codigoPanel.getTablaId().updateTableId("Expansión de Greedy", splitPanel.getMapIdsExpand(),"Div Samurai"); 
    }//GEN-LAST:event_jButtonAnIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DiccionaryPanel dicPanel = Main.getDicPanel();

        if(dicPanel==null){
               dicPanel = new DiccionaryPanel(new javax.swing.JFrame(), true);
        }
        
        dicPanel.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addLineaCom(String linea) {

        String pals[] = linea.split(" ");

        for (String s : pals) {
            p.addPalabra(s);
        }

    }

    private void tablaElemMousePressed(java.awt.event.MouseEvent evt) {
        
        int row = tablaElem.getSelectedRow();
        
        int modelRow = tablaElem.convertRowIndexToModel(row);

        String text = modeloTabla.getValueAt(modelRow, 2).toString();
        
        text = text.trim().replaceAll("\n", "");   
        
        if(tipoSel == 0){
            text = cleanHtml(text);
        }
        
        if(!text.isEmpty()){
            codigoPanel.setHighlight(text,(int)modeloTabla.getValueAt(modelRow, 1), Color.cyan);                           
        }       
        
        //cargar tablas extras
        if(tipoSel == 0){
            
            Object linea = modeloTabla.getValueAt(modelRow, 1);
             
            int nroRef = (int)modeloTabla.getValueAt(modelRow, 6);
            
            jScrollPaneRef.setViewportView(new MiJTable());
            if(tablaElemRef!=null){tablaElemRef.removeAll();}
            
            if(nroRef>0){//debe tener referencias!!              
                
               cargarTablaRef(text,(int)linea); 
            }
        }        

    }
    
    private void tablaElemMousePressed2(java.awt.event.MouseEvent evt) {
        
        int row = tablaElem.getSelectedRow();
        
        int modelRow = tablaElem.convertRowIndexToModel(row);

        String text = modeloTabla.getValueAt(modelRow, 2).toString();
        
        text = text.trim().replaceAll("\n", "");
        
        text = cleanHtml(text);
        
        if(text.isEmpty()){
            return;
        }
        
        row = tablaElemRef.getSelectedRow();
        
        modelRow = tablaElemRef.convertRowIndexToModel(row);
        
        codigoPanel.setHighlight(text,Integer.parseInt(modeloTablaRef.getValueAt(modelRow, 0).toString()),Color.orange); 
    }
    
    //permite sacar el html limpiando los valores
    private String cleanHtml(String html){
        
        if(html == null || html.isEmpty()){
            return "";
        }
        
        Pattern pattern = Pattern.compile("<html><b>(.*?)</b></html>");
        Matcher matcher = pattern.matcher(html);
        
        if(matcher.find()){
            return matcher.group(1);
        }
        
        return html;
    
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAnId;
    private javax.swing.JButton jButtonTagCloud;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAnalisis;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPaneRef;
    private javax.swing.JTextField jTextFieldBusc;
    // End of variables declaration//GEN-END:variables
}
