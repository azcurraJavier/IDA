package VentanasPaneles;

import ExtractID.Principal;
import Listas.Archivo;
import Listas.Comentario;
import Listas.Literal;
import Listas.MostrarTabla;
import Listas.PalabraHash;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.RowFilter;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
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
    private Archivo archivoAnalisis;
    private PalabraHash p;
    private CodigoPanel codigoPanel;
    private int tipoSel;

    private Map hiddenColumns;

//    private JScrollPane jScrollpane;   
    private static final Map<Integer, String> lineaLit = new HashMap<>();

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

    public TablaBuscador(int tipoTabla, Archivo unaArchivo, CodigoPanel codigoPanel) {

        initComponents();

        hiddenColumns = new HashMap();

        listTableInfo = new ArrayList<>();

//        jScrollPaneRef.setVisible(false);

//        jScrollpane = new JScrollPane();
//        jScrollpane.setVisible(true);
//        jScrollpane.setFocusable(false);
        tipoSel = tipoTabla;

        this.codigoPanel = codigoPanel;

        p = new PalabraHash();

        archivoAnalisis = unaArchivo;

        jPanelHideCol.setVisible(false);
        jPanelAnalisis.setVisible(false);
        jPanelExpId.setVisible(false);
//        jPanelArSalida.setVisible(false);

        modeloTabla = new MiModelo();

        modeloTabla.addColumn("-");   //ordenar por ambiente(default)   

        Object[] fila;

        setIdExtract = new HashSet<>();//ids que son capturados para analisis

        String titleBorder = "";

        switch (tipoTabla) {

            case 0://Identificadores         

                jPanelHideCol.setVisible(true);
                jPanelAnalisis.setVisible(true);
                jPanelExpId.setVisible(true);
//                jPanelArSalida.setVisible(true);

                modeloTabla.addColumn("Línea");
                modeloTabla.addColumn("Nombre ID");
                modeloTabla.addColumn("Representa");
                modeloTabla.addColumn("Tipo");
                modeloTabla.addColumn("Modificador");
                //modeloTabla.addColumn("Nro Ref");

                fila = new Object[8];

                for (MostrarTabla m : archivoAnalisis.getLisMostrarTabla()) {

                    //se excluye constructor para mantener consistencia con la clase
                    if (m.getRepresenta().equals("Constructor")) {
                        continue;
                    }

                    fila[0] = "-";//m.getAmbiente();
                    fila[1] = m.getNumLinea();
                    fila[2] = format(m.getNomId());
                    fila[3] = m.getRepresenta();
                    fila[4] = m.getTipo().isEmpty()?"-":m.getTipo();
                    fila[5] = m.getModificador().isEmpty()?"-":m.getModificador();
                    //fila[6] = m.getListaRef().size();

                    //se agrega a la tabla
                    modeloTabla.addRow(fila);

                    //se guarda para ser procesado por los algoritmos de ids
                    listTableInfo.add(m.getNomId());

                    //asgnacion de literales a ids  
//                    if ("String".equals(m.getTipo())) {
//                        lineaLit.put(m.getNumLinea(), m.getNomId());
//                        //carga referencias
//                        for (MostrarListaRef f : m.getListaRef()) {
//                            lineaLit.put(Integer.parseInt(f.getLinea()), m.getNomId());
//                        }
//                    }
                }
                titleBorder = "Declaraciones";

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
                for (Literal s : archivoAnalisis.getLisLiterales()) {

                    String id = lineaLit.get(s.getLine());

                    fila[0] = "-";//"@"+unaClase.getIde().getNomID();
                    fila[1] = s.getLine();
                    fila[2] = s.getText();
                    fila[3] = id == null ? "-" : id;
                    modeloTabla.addRow(fila);

                }
                //una vez que la variable estatica se usa hay que limpiarla
                lineaLit.clear();

                titleBorder = "Literales";

                break;

            case 2://Comentarios

                modeloTabla.addColumn("Línea");
                modeloTabla.addColumn("Comentario");

                fila = new Object[3];

                for (Comentario com : archivoAnalisis.getLisComentario()) {
                    fila[0] = "-";//com.getAmbiente();
                    fila[1] = com.getLinea();
                    fila[2] = com.getCom().trim();
                    modeloTabla.addRow(fila);

                    addLineaCom(com.getCom());
                }

                titleBorder = "Comentarios";

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

            String tittleSearch = titleBorder.equals("Declaraciones") ? "Id" : titleBorder;

            jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar " + tittleSearch));

            tablaElem.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    tablaElemMousePressed();
                }
            });

            if (tipoSel == 0) {
//                jScrollPaneRef.setVisible(true);
            }

        } else {
            hasElemets = false;
        }
    }

    private void cargarTablaRef(MostrarTabla mSelected, String text) {

        modeloTablaRef = new MiModelo();

        modeloTablaRef.addColumn("Línea");
        modeloTablaRef.addColumn("Nombre ID");
        modeloTablaRef.addColumn("Ambiente");

        Object[] fila = new Object[3];

//        for (MostrarListaRef r : mSelected.getListaRef()) {
//            fila[0] = r.getLinea();
//            fila[1] = "<html><b>" + text + "</b></html>";
//            fila[2] = r.getUbicacion();
//            modeloTablaRef.addRow(fila);
//        }

        tablaElemRef = new MiJTable(modeloTablaRef);

        tablaElemRef.autoAjuste();

        //tableSort = new TableRowSorter<TableModel>(modeloTablaRef);
        //tablaElemRef.setRowSorter(tableSort);
//        jScrollPaneRef.setViewportView(tablaElemRef);

        tablaElemRef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaElemMousePressed2(evt);
            }
        });

    }

    public void updateTableId(String nameCol, Map<String,String> idMap, String exp) {

        if (idMap.isEmpty()) {//no hay elementos
            return;
        }

        int colNum = modeloTabla.getColumnCount();

        for (int j = 0; j < colNum; j++) {//veo si la columna ya existe
            if (modeloTabla.getColumnName(j).equals(nameCol)) {
                return;
            }
        }

        int colGetInfo = 2;//id sin dividir

        if (exp != null) {
            for (int j = 0; j < colNum; j++) {//veo si la columna ya existe
                if (modeloTabla.getColumnName(j).equals(exp)) {
                    colGetInfo = j;//id dividido
                }
            }
        }

        modeloTabla.addColumn(nameCol);

        Object elem;
        String elem2;
        //recorre filas
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {

            elem = modeloTabla.getValueAt(i, colGetInfo);

            elem2 = idMap.get(cleanHtml(elem.toString()).trim());
                        
            if (exp != null) {
                //al ser expansion reemplazo los espacios por guion bajo
                elem2 = elem2.replaceAll(" ", "_");
                
                //representa clase la 1era con mayuscula
                if(modeloTabla.getValueAt(i, 3).toString().equals("Clase")){
                    elem2 = firstCharUp(elem2);
                }
            }            

            modeloTabla.setValueAt(elem2, i, colNum);

        }

        tablaElem.autoAjuste();
    }

    public void updateTableId(String nameCol, Map idMap) {
        updateTableId(nameCol, idMap, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTextFieldBusc = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        jPanelHideCol = new javax.swing.JPanel();
        jButtonRed = new javax.swing.JButton();
        jButtonAmp = new javax.swing.JButton();
        jPanelAnalisis = new javax.swing.JPanel();
        jButtonAnId1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanelExpId = new javax.swing.JPanel();
        jButtonAbrirHtml = new javax.swing.JButton();

        jPanel4.setBorder(null);

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

        jPanelHideCol.setBorder(javax.swing.BorderFactory.createTitledBorder("Ocultar Columnas"));

        jButtonRed.setText("<-Reducir");
        jButtonRed.setEnabled(false);
        jButtonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedActionPerformed(evt);
            }
        });

        jButtonAmp.setText("Ampliar->");
        jButtonAmp.setEnabled(false);
        jButtonAmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHideColLayout = new javax.swing.GroupLayout(jPanelHideCol);
        jPanelHideCol.setLayout(jPanelHideColLayout);
        jPanelHideColLayout.setHorizontalGroup(
            jPanelHideColLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHideColLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonRed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAmp)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelHideColLayout.setVerticalGroup(
            jPanelHideColLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHideColLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonRed)
                .addComponent(jButtonAmp))
        );

        jPanelAnalisis.setBorder(javax.swing.BorderFactory.createTitledBorder("Análisis de Identificadores"));

        jButtonAnId1.setText("Ejecutar Analisis");
        jButtonAnId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnId1ActionPerformed(evt);
            }
        });

        jButton2.setText("Diccionarios");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAnalisisLayout = new javax.swing.GroupLayout(jPanelAnalisis);
        jPanelAnalisis.setLayout(jPanelAnalisisLayout);
        jPanelAnalisisLayout.setHorizontalGroup(
            jPanelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnalisisLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButtonAnId1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanelAnalisisLayout.setVerticalGroup(
            jPanelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonAnId1)
                .addComponent(jButton2))
        );

        jPanelExpId.setBorder(javax.swing.BorderFactory.createTitledBorder("Ver Tabla en Navegador"));

        jButtonAbrirHtml.setText("Abrir");
        jButtonAbrirHtml.setEnabled(false);
        jButtonAbrirHtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirHtmlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelExpIdLayout = new javax.swing.GroupLayout(jPanelExpId);
        jPanelExpId.setLayout(jPanelExpIdLayout);
        jPanelExpIdLayout.setHorizontalGroup(
            jPanelExpIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExpIdLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonAbrirHtml, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanelExpIdLayout.setVerticalGroup(
            jPanelExpIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExpIdLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonAbrirHtml))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanelAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelHideCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelExpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelAnalisis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelHideCol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelExpId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscKeyReleased
        getBuscar = jTextFieldBusc.getText();
        tableSort.setRowFilter(RowFilter.regexFilter("(?i)" + getBuscar, buscarColumna));
    }//GEN-LAST:event_jTextFieldBuscKeyReleased

    boolean firstOpen = false;

    private void jButtonAnId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnId1ActionPerformed

        if (this.setIdExtract.isEmpty()) {
            for (String id : codigoPanel.getTablaId().getListTableInfo()) {

                //los ids encontrados los procesamos con conjunto para sacar repetidos
                this.setIdExtract.add(id);

            }
        }

        if (splitPanel == null) {

            splitPanel = new AnalisisPanel(new javax.swing.JFrame(), true, setIdExtract, archivoAnalisis);

            firstOpen = true;
        }

        splitPanel.setVisible(true);

        updateTableId("Div Greedy", splitPanel.getMapIdsGreedy());
        updateTableId("Div Samurai", splitPanel.getMapIdsSamurai());
        updateTableId("Expansión de Greedy", splitPanel.getMapIdsExGreMap(), "Div Greedy");
        updateTableId("Expansión de Samurai", splitPanel.getMapIdsExSamurai(), "Div Samurai");

        boolean add = !splitPanel.getMapIdsExGreMap().isEmpty() && !splitPanel.getMapIdsExSamurai().isEmpty();

        if (firstOpen && add) {
            jButtonRed.setEnabled(true);
            //addCheckBox();
            firstOpen = false;
            jButtonAbrirHtml.setEnabled(true);
        }

        //escribir xml de salida
//        WriteXMLHandler wXml = new WriteXMLHandler(setIdExtract, splitPanel.getMapIdsGreedy(), splitPanel.getMapIdsSamurai(), 
//                splitPanel.getMapIdsExGreMap(), splitPanel.getMapIdsExSamurai(), ExpandBasic.getFrasesCap());
//        wXml.write("prueba");

    }//GEN-LAST:event_jButtonAnId1ActionPerformed

    private void addCheckBox() {
        
        Map<String, String> mapCon = new HashMap<>();

        int colNum = modeloTabla.getColumnCount();

        int colSamurai = 0;

        for (int j = 0; j < colNum; j++) {//veo si la columna ya existe
            if (modeloTabla.getColumnName(j).equals("Expansión de Samurai")) {
                colSamurai = j;
                break;
            }
        }

        modeloTabla.addColumnEditable(colNum);

        modeloTabla.addColumn("¿Expansión?");

        String a[] = {"Ninguna", "Greedy", "Samurai"};

        final JComboBox jcb = new JComboBox(a);
        TableColumn tc = tablaElem.getColumnModel().getColumn(colNum);
        TableCellEditor tce = new DefaultCellEditor(jcb);

        tc.setCellEditor(tce);

        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            //agrega valor por defecto 
            modeloTabla.setValueAt("Samurai", i, colNum);

            //limpia resaltado de ids
            String id = modeloTabla.getValueAt(i, 2).toString();
            modeloTabla.setValueAt(cleanHtml(id), i, 2);

            //resalta expansion samurai
            String idSam = modeloTabla.getValueAt(i, colSamurai).toString();
            modeloTabla.setValueAt(format(idSam), i, colSamurai);

            //guarda en mostrartabla la exp samurai por defecto            
            int lin = (int) modeloTabla.getValueAt(i, 1);
            String repr = modeloTabla.getValueAt(i, 3).toString();

            
            for (MostrarTabla m : archivoAnalisis.getLisMostrarTabla()) {

                if (m.getNomId().equals(cleanHtml(id)) && m.getNumLinea() == lin
                        && m.getRepresenta().equals(repr)) {

                    m.setIdExpandido(idSam);

                    if (m.getRepresenta().equals("Clase")) {
                        mapCon.put(m.getNomId(), idSam);
                    }

                    break;
                }
            }
            //actualiza constructores con respecto a la clase
            for (MostrarTabla m : archivoAnalisis.getLisMostrarTabla()) {

                if (m.getRepresenta().equals("Constructor")) {

                    m.setIdExpandido(mapCon.get(m.getNomId()));
                }
            }

        }

        jcb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

                int state = e.getStateChange();

                if (state == ItemEvent.SELECTED) {

                    tablaElemMousePressed3(e.getItem().toString());
                    tablaElem.autoAjuste();
                }

            }
        });

        tablaElem.autoAjuste();
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Principal.getDicPanel().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedActionPerformed

        hideColumn("Representa", tablaElem);
        hideColumn("Tipo", tablaElem);
        hideColumn("Modificador", tablaElem);
        hideColumn("Nro Ref", tablaElem);
        hideColumn("Div Greedy", tablaElem);
        hideColumn("Div Samurai", tablaElem);

        jButtonRed.setEnabled(false);
        jButtonAmp.setEnabled(true);
//        jButtonExp.setEnabled(true);

    }//GEN-LAST:event_jButtonRedActionPerformed

    private void jButtonAmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmpActionPerformed

        showColumn("Div Samurai", tablaElem);
        showColumn("Div Greedy", tablaElem);
        showColumn("Nro Ref", tablaElem);
        showColumn("Modificador", tablaElem);
        showColumn("Tipo", tablaElem);
        showColumn("Representa", tablaElem);

        jButtonRed.setEnabled(true);
        jButtonAmp.setEnabled(false);
//        jButtonExp.setEnabled(false);

    }//GEN-LAST:event_jButtonAmpActionPerformed

    private void jButtonAbrirHtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirHtmlActionPerformed

        Set<String> setCol = new HashSet<>(Arrays.asList("Nombre ID", "Div Greedy", "Div Samurai", "Expansión de Greedy", "Expansión de Samurai"));
        
        String tablaCont = "";
            
        for(int i =0;i<modeloTabla.getRowCount();i++ ){       
         
            tablaCont += "<tr>";
            
            for(int j =0;j<modeloTabla.getColumnCount();j++ ){
                
                if (!setCol.contains(modeloTabla.getColumnName(j).toString())) {
                    continue;
                }
            
                tablaCont += "<td>"+cleanHtml(modeloTabla.getValueAt(i, j).toString())+"</td>";
            
            
            }
            tablaCont += "</tr>";
        }
        
        
        FileWriter wri = null;
        
        File html = new File("newhtml.html");
        try {
            
            String s = "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Identifier Analizer</title>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "<h1>Identifier Analizer</h1>\n" +
                "<h2>Analisis de Identificadores: fileInput</h2>\n" +
                "\n" +
                "<table border=\"1\">\n" +
                "    <tr>      \n" +
                "      <td><b>Nombre</td>\n" +
                "      <td><b>Divisi&oacuten<br/>Greedy</td>\n" +
                "      <td><b>Divisi&oacuten<br/>Samurai</td>    \n" +
                "      <td><b>Expansi&oacuten<br/>Greedy</td>\n" +
                "      <td><b>Expansi&oacuten<br/>Samurai</td>\n" +
                "    </tr>\n" +
                "tablacont\n" +
                "</table>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
            
            
            String replaceFirst = s.replaceFirst("fileInput", archivoAnalisis.getFileName());
            replaceFirst = replaceFirst.replaceFirst("tablacont", tablaCont);
            
            
            wri = new FileWriter(html);

            wri.write(replaceFirst);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TablaBuscador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TablaBuscador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(wri!=null){wri.close();};
            } catch (IOException ex) {
                Logger.getLogger(TablaBuscador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
        try {        
            
            Desktop.getDesktop().browse(html.toURI());            
        } catch (IOException ex) {
            Logger.getLogger(TablaBuscador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonAbrirHtmlActionPerformed

    private void addLineaCom(String linea) {

        String pals[] = linea.split(" ");

        for (String s : pals) {
            p.addPalabra(s);
        }

    }

    private void tablaElemMousePressed() {

        int row = tablaElem.getSelectedRow();

        int modelRow = tablaElem.convertRowIndexToModel(row);

        int linea = (int) modeloTabla.getValueAt(modelRow, 1);
        String text = modeloTabla.getValueAt(modelRow, 2).toString();
        text = cleanHtml(text);
        MostrarTabla mSelected = null;

        //cargar tablas extras
        if (tipoSel == 0) {

            String repr = modeloTabla.getValueAt(modelRow, 3).toString();

            for (MostrarTabla m : archivoAnalisis.getLisMostrarTabla()) {

                if (m.getNomId().equals(text)
                        && m.getNumLinea() == linea
                        && m.getRepresenta().equals(repr)) {

                    mSelected = m;
                    break;
                }
            }

            if (mSelected == null) {
                return;
            }

//            if (jButtonDesExp.isEnabled()) {//si esta expandido
//                text = mSelected.getIdExpandido();                
//            } else {//sino el id comun
//                text = mSelected.getNomId();
//            }

        }

        //para el caso comentarios y literales
        text = text.trim().replaceAll("\n", "");

        if (!text.isEmpty()) {
            codigoPanel.setHighlight(text, linea, Color.cyan);
        }

        //cargar tablas extras
        if (tipoSel == 0) {

//            jScrollPaneRef.setViewportView(new MiJTable());

            if (tablaElemRef != null) {
                tablaElemRef.removeAll();
            }

//            if (mSelected != null && mSelected.getListaRef().size() > 0) {//debe tener referencias!!              
//
//                cargarTablaRef(mSelected, text);
//            }
        }

    }

    private void tablaElemMousePressed2(java.awt.event.MouseEvent evt) {

        int row = tablaElemRef.getSelectedRow();

        int modelRow = tablaElemRef.convertRowIndexToModel(row);

        String linea = modeloTablaRef.getValueAt(modelRow, 0).toString();
        String text = modeloTablaRef.getValueAt(modelRow, 1).toString();

        text = cleanHtml(text);

        codigoPanel.setHighlight(text, Integer.parseInt(linea), Color.orange);
    }

    private void tablaElemMousePressed3(String selIndex) {

        int selColNum = modeloTabla.getColumnCount() - 1;

        if (!modeloTabla.getColumnName(selColNum).equals("¿Expansión?")) {
            return;
        }

        int row = tablaElem.getSelectedRow();

        if (row < 0) {
            return;
        }

        int selRow = tablaElem.convertRowIndexToModel(row);

        String idCha1 = "";
        String idCha2 = "";

        switch (selIndex) {

            case "Ninguna"://Ninguna
                if (modeloTabla.getValueAt(selRow, selColNum - 2).toString().contains("<html>")) {
                    idCha1 = modeloTabla.getValueAt(selRow, selColNum - 2).toString();
                    modeloTabla.setValueAt(cleanHtml(idCha1), selRow, selColNum - 2);
                }

                if (modeloTabla.getValueAt(selRow, selColNum - 1).toString().contains("<html>")) {
                    idCha2 = modeloTabla.getValueAt(selRow, selColNum - 1).toString();
                    modeloTabla.setValueAt(cleanHtml(idCha2), selRow, selColNum - 1);
                }

                //resalta id original
                if (!modeloTabla.getValueAt(selRow, 2).toString().contains("<html>")) {
                    String id = modeloTabla.getValueAt(selRow, 2).toString();
                    modeloTabla.setValueAt(format(id), selRow, 2);
                }

                break;

            case "Greedy"://Greedy

                if (modeloTabla.getValueAt(selRow, selColNum - 1).toString().contains("<html>")) {

                    idCha2 = modeloTabla.getValueAt(selRow, selColNum - 1).toString();
                    modeloTabla.setValueAt(cleanHtml(idCha2), selRow, selColNum - 1);
                }

                if (!modeloTabla.getValueAt(selRow, selColNum - 2).toString().contains("<html>")) {
                    idCha1 = modeloTabla.getValueAt(selRow, selColNum - 2).toString();
                    modeloTabla.setValueAt(format(idCha1), selRow, selColNum - 2);
                }

                //limpia resaltado id original
                if (modeloTabla.getValueAt(selRow, 2).toString().contains("<html>")) {
                    String id = modeloTabla.getValueAt(selRow, 2).toString();
                    modeloTabla.setValueAt(cleanHtml(id), selRow, 2);
                }

                break;

            case "Samurai"://Samurai

                if (!modeloTabla.getValueAt(selRow, selColNum - 1).toString().contains("<html>")) {
                    idCha1 = modeloTabla.getValueAt(selRow, selColNum - 1).toString();
                    modeloTabla.setValueAt(format(idCha1), selRow, selColNum - 1);
                }

                if (modeloTabla.getValueAt(selRow, selColNum - 2).toString().contains("<html>")) {
                    idCha2 = modeloTabla.getValueAt(selRow, selColNum - 2).toString();
                    modeloTabla.setValueAt(cleanHtml(idCha2), selRow, selColNum - 2);
                }

                //limpia resaltado id original
                if (modeloTabla.getValueAt(selRow, 2).toString().contains("<html>")) {
                    String id = modeloTabla.getValueAt(selRow, 2).toString();
                    modeloTabla.setValueAt(cleanHtml(id), selRow, 2);
                }

                break;

        }

        ///Actualiza valor de mostrar tabla en caso que cambie
        String idExp = "";
        String idClean = modeloTabla.getValueAt(selRow, 2).toString();

        idClean = cleanHtml(idClean);

        int lin = (int) modeloTabla.getValueAt(selRow, 1);
        String repr = modeloTabla.getValueAt(selRow, 3).toString();

        switch (selIndex) {
            case "Ninguna":
                idExp = idClean;
                break;
            case "Greedy":
                idExp = modeloTabla.getValueAt(selRow, selColNum - 2).toString();
                break;
            case "Samurai":
                idExp = modeloTabla.getValueAt(selRow, selColNum - 1).toString();
                break;
        }

        idExp = cleanHtml(idExp);

        MostrarTabla mConstructor = null;

        for (MostrarTabla m : archivoAnalisis.getLisMostrarTabla()) {

            if (m.getNomId().equals(idClean) && m.getNumLinea() == lin
                    && m.getRepresenta().equals(repr)) {

                m.setIdExpandido(idExp);
                mConstructor = m;
                break;
            }

        }

        //actualizar los valores de los constructores que no se muestran!!!    
        if (mConstructor != null
                && mConstructor.getRepresenta().equals("Clase")) {

            for (MostrarTabla m : archivoAnalisis.getLisMostrarTabla()) {

                if (m.getNomId().equals(idClean)
                        && m.getRepresenta().equals("Constructor")) {

                    m.setIdExpandido(idExp);
                }

            }

        }

    }

    //permite sacar el html limpiando los valores
    private String cleanHtml(String html) {

        if (html == null || html.isEmpty()) {
            return "";
        }

        if (!html.contains("<html>")) {
            return html;
        }

        String pat = "<html><b>(.*?)</b></html>";

        if (html.contains("style=\"color:")) {
            pat = "<html><b><span style=\"color: #1A008E;\">(.*?)</b></span></html>";
        }

        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(html);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return html;

    }

    private String format(Object s) {
        return "<html><b><span style=\"color: #1A008E;\">" + s + "</b></span></html>";
    }

    private String firstCharUp(String s){

        if(s== null || s.length()<2){
            return s;
        }
        
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    
    
    private void hideColumn(String columnName, MiJTable table) {

        TableColumnModel tcm = table.getColumnModel();

        int index = tcm.getColumnIndex(columnName);
        TableColumn column = tcm.getColumn(index);
        hiddenColumns.put(columnName, column);
        hiddenColumns.put(":" + columnName, new Integer(index));
        tcm.removeColumn(column);
    }

    private void showColumn(String columnName, MiJTable table) {

        TableColumnModel tcm = table.getColumnModel();

        Object o = hiddenColumns.remove(columnName);
        if (o == null) {
            return;
        }
        tcm.addColumn((TableColumn) o);
        o = hiddenColumns.remove(":" + columnName);
        if (o == null) {
            return;
        }
        int column = ((Integer) o).intValue();
        int lastColumn = tcm.getColumnCount() - 1;
        if (column < lastColumn) {
            tcm.moveColumn(lastColumn, column);
        }
    }

    public boolean hasElem() {
        return this.hasElemets;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAbrirHtml;
    private javax.swing.JButton jButtonAmp;
    private javax.swing.JButton jButtonAnId1;
    private javax.swing.JButton jButtonRed;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAnalisis;
    private javax.swing.JPanel jPanelExpId;
    private javax.swing.JPanel jPanelHideCol;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField jTextFieldBusc;
    // End of variables declaration//GEN-END:variables
}
