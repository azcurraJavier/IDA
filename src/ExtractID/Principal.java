package ExtractID;

import Listas.Clase;
import Listas.Comentario;
import Listas.ListaClase;
import VentanasPaneles.AcercaDe;
import VentanasPaneles.ClosableTabbedPane;
import VentanasPaneles.CodigoPanel;
import VentanasPaneles.DiccionaryPanel;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.jdesktop.swingx.util.OS;

/**
 *
 * @author javier
 */
public class Principal extends javax.swing.JFrame {

    private CodigoPanel codigoPanel;

    private static File[] archivosAnalisisId = null;

    private final ClosableTabbedPane jTabbedEsp;

    private Map<String, String> mapIdsSplited;
    private Map<String, String> mapIdsExp;

    private JFileChooser fileChooser;
    private File currentDir;

    private static DiccionaryPanel dicPanel;

    public Principal() {
        initComponents();

        ListaClase.init();

        mapIdsSplited = new HashMap<>();
        mapIdsExp = new HashMap<>();

        fileChooser = new JFileChooser();

        jTabbedEsp = new ClosableTabbedPane();

        jTabbedEsp.setFocusable(false);

        jTabbedEsp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        //jframe maximizado
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        jTabbedEsp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedEspStateChanged(evt);
            }
        });

    }

    private void jTabbedEspStateChanged(javax.swing.event.ChangeEvent evt) {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(layout);

        if (jTabbedEsp.getTabCount() == 0) {
 
            jMenuItemCerrTodo.setEnabled(false);
            jTabbedEsp.setVisible(false);                        
 
            
            if (dicPanel != null) {
                dicPanel.removeAll();
                dicPanel = null;
            }

            //remueve el tab panne del desktop pane
            layout.removeLayoutComponent(jTabbedEsp);            


        } else {//>0
            
            jTabbedEsp.setVisible(true);                        
            jMenuItemCerrTodo.setEnabled(true);            

            ///Agrega tab pane al desktoppane
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedEsp)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedEsp)
            );
            ////            

        }

    }

    public static DiccionaryPanel getDicPanel() {

        if (dicPanel == null) {
            dicPanel = new DiccionaryPanel(new javax.swing.JFrame(), true);
        }

        return dicPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuAbrir = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemCerrTodo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        jMenuVerDic = new javax.swing.JMenuItem();
        jMenuRestBD = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Identifier Analyzer");

        fileMenu.setMnemonic('f');
        fileMenu.setText("Archivo");

        jMenuAbrir.setMnemonic('o');
        jMenuAbrir.setText("Abrir archivo(s) JAVA...");
        jMenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbrirActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuAbrir);

        jMenuItem1.setText("Abrir XML(s)...");
        fileMenu.add(jMenuItem1);

        jMenuItemCerrTodo.setMnemonic('s');
        jMenuItemCerrTodo.setText("Cerrar Todo");
        jMenuItemCerrTodo.setEnabled(false);
        jMenuItemCerrTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrTodoActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItemCerrTodo);
        fileMenu.add(jSeparator1);

        jMenuItem3.setMnemonic('x');
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem3);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Diccionarios");

        jMenuVerDic.setMnemonic('t');
        jMenuVerDic.setText("Ver Diccionarios...");
        jMenuVerDic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVerDicActionPerformed(evt);
            }
        });
        editMenu.add(jMenuVerDic);

        jMenuRestBD.setMnemonic('y');
        jMenuRestBD.setText("Restablecer B.D.");
        editMenu.add(jMenuRestBD);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");

        jMenu4.setMnemonic('a');
        jMenu4.setText("Acerca de...");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenu4);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(410, 330));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbrirActionPerformed
        if (fileChooser.getCurrentDirectory() == null) {
            //si no esta seteado ponemos la carpeta del usuario
            currentDir = new File(System.getProperty("user.home"));
        }

        fileChooser.setCurrentDirectory(currentDir);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("java", "java");
        fileChooser.setFileFilter(filter);

        fileChooser.setMultiSelectionEnabled(true);

        int seleccion = fileChooser.showOpenDialog(fileChooser);
        boolean noErrorSintactico = true;

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            //guardamos el ultimo acceso
            currentDir = fileChooser.getCurrentDirectory();

            archivosAnalisisId = fileChooser.getSelectedFiles();

            for (File fileAnalisis : archivosAnalisisId) {

                if (ListaClase.containsFileName(fileAnalisis.getName())) {
                    JOptionPane.showMessageDialog(new JFrame(),
                            "Un archivo con el nombre: " + fileAnalisis.getName()
                            + " ya se encuentra abierto!", "Atención", JOptionPane.WARNING_MESSAGE);
                    continue;
                }

                //jacobe para dar formato al codigo leido desde el archivo
                String prettyCode = prettyCode(fileAnalisis.getAbsolutePath());

                if (prettyCode.isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(),
                            "El archivo: " + fileAnalisis.getName()
                            + " esta vacío o posee errores sintácticos,"
                            + "\nrevíselo e intente de nuevo.", "Atención", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                ///////////////

                JavaLexer lex = new JavaLexer(new ANTLRStringStream(prettyCode));
                CommonTokenStream tokens = new CommonTokenStream(lex);
                JavaParser g = new JavaParser(tokens);

                try {
                    g.compilationUnit();
                    noErrorSintactico = g.ocurrioError();

                } catch (Exception e) {

                    System.out.println(getStackTrace(e));
                    noErrorSintactico = false;
                }

                Clase unaClase = g.getClaseAnalisis();

                //control de carga de datos del parser
                if (!noErrorSintactico || unaClase == null) {
                    JOptionPane.showMessageDialog(new JFrame(),
                            "Error fatal al analizar archivo: " + fileAnalisis.getName(), "ERROR", JOptionPane.ERROR_MESSAGE);
                    continue;
                }

                //control de referencias sin declarar
                if (unaClase.getVarSinDeclB()) {
                    JOptionPane.showMessageDialog(new JFrame(),
                            "Error al analizar archivo: " + fileAnalisis.getName()
                            + "\n" + unaClase.getVarSinDecl(), "ERROR", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                ////////

                unaClase.setFileName(fileAnalisis.getName());//nombre archivo java
                unaClase.setCode(prettyCode);//codigo leido de archivo
                /////comentarios/////
                ArrayList<Comentario> lisCom = lex.getLisCom(); //comentarios del lexer 
                unaClase.setLisComentario(lisCom);
                unaClase.setearAmbienteCometario();//seteo ambientes de comentarios
                unaClase.cargarTablaClase();//cargo elementos para las tablas
                unaClase.setLisLiterales(g.getLisLiterales());
                /////////////////////
                ListaClase.addElemLisClases(unaClase);

                //Interfaz
                codigoPanel = new CodigoPanel(unaClase, mapIdsSplited, mapIdsExp);
                //jTabbedPaneCodigo.add(claseAnalisis.getPunteroArchivo().getName(), codigoPanel);
                jTabbedEsp.addTab(unaClase.getFileName(), codigoPanel);

            }

            //jTabbedPaneAnalisis.add("Identificadores", new TablaBuscador(0));
            //jTabbedPaneAnalisis.add("Literales", new TablaBuscador(1));
            //jTabbedPaneAnalisis.add("Comentarios", new TablaBuscador(2));
            //jTabbedPaneCodigo.setVisible(true);

            //jMenuItem4.setEnabled(true);
        }
    }//GEN-LAST:event_jMenuAbrirActionPerformed

    private void jMenuVerDicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVerDicActionPerformed
        getDicPanel().setVisible(true);
    }//GEN-LAST:event_jMenuVerDicActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

        AcercaDe a = new AcercaDe(new JFrame(), true);
        
        a.setVisible(true);
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItemCerrTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrTodoActionPerformed

        ListaClase.clear();
        jTabbedEsp.removeAll();
        jMenuItemCerrTodo.setEnabled(false);        
        
    }//GEN-LAST:event_jMenuItemCerrTodoActionPerformed

    public static String getStackTrace(final Throwable throwable) {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw, true);
        throwable.printStackTrace(pw);
        return sw.getBuffer().toString();
    }

    private String prettyCode(String path) {

        String output = "";

        try {

            BufferedReader reader = null;

            String dir;

            if (isLinux()) {
                dir = "jacobe//unix//jacobe";
            } else if (isWindows()) {
                dir = "/jacobe/win/jacobe";
            } else {
                System.out.println("jacobe: No se reconoce el SO");
                return "";
            }

            Process p = Runtime.getRuntime().exec(new String[]{dir, "-cfg=sun.cfg", path, "-stdout"});

            reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

            p.waitFor();
            String line = "";

            while ((line = reader.readLine()) != null) {
                output += line + "\n";
            }

        } catch (IOException | InterruptedException ex) {
            System.out.println(getStackTrace(ex));
        }

        return output;

    }

    public static boolean isWindows() {

        return (OS.isWindows());
    }

    public static boolean isLinux() {

        return (OS.isLinux());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenu4;
    private javax.swing.JMenuItem jMenuAbrir;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemCerrTodo;
    private javax.swing.JMenuItem jMenuRestBD;
    private javax.swing.JMenuItem jMenuVerDic;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
