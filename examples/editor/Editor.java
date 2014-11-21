
// java text editor
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Editor extends JFrame implements ActionListener {

    //Menu Bar
    JMenuBar jMenBar = new JMenuBar();
    JMenu menBarFile = new JMenu("File");
    JMenuItem menItNew = new JMenuItem("New");
    JMenuItem menItOpen = new JMenuItem("Open");
    JMenuItem menItExit = new JMenuItem("Exit");
    JMenuItem menItSave = new JMenuItem("Save");
    JMenuItem menItPrint = new JMenuItem("Print");
    
    JMenu menBarEdit = new JMenu("Edit");
    JMenuItem menItCut = new JMenuItem("Cut");
    JMenuItem menItCopy = new JMenuItem("Copy");
    JMenuItem menItPaste = new JMenuItem("Paste");
    JMenuItem menItSearch = new JMenuItem("Search");
    JMenuItem menItReplace = new JMenuItem("Replace");
    JMenuItem menItSelectAll = new JMenuItem("Select All");
    
    //Tool bar
    JToolBar jTlBar = new JToolBar();
    JButton jBtNew = new JButton();
    JButton jBtOpen = new JButton();
    JButton jBtCopy = new JButton();
    JButton jBtCut = new JButton();
    JButton jBtPaste = new JButton();
    JButton jBtSave = new JButton();

    //Pop Up Menu
    JPopupMenu popUpMenu = new JPopupMenu();
    JMenuItem popUpItCut = new JMenuItem("Cut");
    JMenuItem popUpItCopy = new JMenuItem("Copy");
    JMenuItem popUpItPaste = new JMenuItem("Paste");
    JMenuItem popUpItSelAll = new JMenuItem("Select All");

    //Images icon
    ImageIcon imIcNew = new ImageIcon("new"+".gif");
    ImageIcon imIcOpen = new ImageIcon("open"+".gif");
    ImageIcon imIcCopy = new ImageIcon("copy"+".gif");
    ImageIcon imIcCut = new ImageIcon("cut"+".gif");
    ImageIcon imIcPaste = new ImageIcon("paste"+".gif");
    ImageIcon imIcSave = new ImageIcon("save"+".gif");
    ImageIcon imIcPrint = new ImageIcon("print"+".gif");
    ImageIcon imIcSearch = new ImageIcon("search"+".gif");
    ImageIcon imIcExit = new ImageIcon("exit"+".gif");

    String PRGname = " "; //program name

    //color palette
    JButton textCol = new JButton("    ");
    JLabel jLabelColTex = new JLabel("Text: ");
    JButton bckCol = new JButton("    ");
    JLabel jLabelColBck = new JLabel("Background: ");
    JColorChooser colorChooser = new JColorChooser();

    //text areas
    JTextArea TEXTarea = new JTextArea();

    JTextArea textAREAerrors = new JTextArea(6, 1);

    String copy = "";

    public Editor() {

        //Menu
        menBarFile.add(menItNew);
        menItNew.setIcon(imIcNew);
        menItNew.addActionListener(this);
        menBarFile.add(menItOpen);
        menItOpen.setIcon(imIcOpen);
        menItOpen.addActionListener(this);
        menBarFile.add(menItExit);
        menItExit.addActionListener(this);
        menBarFile.add(menItSave);
        menItSave.setIcon(imIcSave);
        menItSave.addActionListener(this);
        menBarFile.add(menItPrint);
        menItPrint.setIcon(imIcPrint);
        menItPrint.addActionListener(this);
        menBarFile.addSeparator();
        menBarFile.add(menItExit);
        menItExit.setIcon(imIcExit);
        menItExit.addActionListener(this);
        menBarEdit.add(menItCut);
        menItCut.setIcon(imIcCut);
        menItCut.addActionListener(this);
        menBarEdit.add(menItCopy);
        menItCopy.setIcon(imIcCopy);
        menItCopy.addActionListener(this);
        menBarEdit.add(menItPaste);
        menItPaste.setIcon(imIcPaste);

        menBarEdit.addSeparator();
        menBarEdit.add(menItSearch);
        menItSearch.setIcon(imIcSearch);
        menItSearch.addActionListener(this);
        menItPaste.addActionListener(this);
        menBarEdit.add(menItReplace);
        menItReplace.addActionListener(this);
        menBarEdit.addSeparator();
        menBarEdit.add(menItSelectAll);
        menItSelectAll.addActionListener(this);
        jMenBar.add(menBarFile);
        jMenBar.add(menBarEdit);
        setJMenuBar(jMenBar);

        //Tool Bar
        jTlBar.add(jBtNew);
        jBtNew.addActionListener(this);
        jBtNew.setIcon(imIcNew);
        jTlBar.add(jBtOpen);
        jBtOpen.addActionListener(this);
        jBtOpen.setIcon(imIcOpen);
        jTlBar.add(jBtSave);
        jBtSave.setIcon(imIcSave);
        jBtSave.addActionListener(this);
        jTlBar.addSeparator();
        jTlBar.add(jBtCopy);
        jBtCopy.setIcon(imIcCopy);
        jBtCopy.addActionListener(this);
        jTlBar.add(jBtCut);
        jBtCut.setIcon(imIcCut);
        jBtCut.addActionListener(this);
        jTlBar.add(jBtPaste);
        jBtPaste.setIcon(imIcPaste);
        jBtPaste.addActionListener(this);
        jBtSave.setToolTipText("Save");
        jBtNew.setToolTipText("New");
        jBtOpen.setToolTipText("Open");
        jBtCopy.setToolTipText("Copy");
        jBtCut.setToolTipText("Cut");
        jBtPaste.setToolTipText("Paste");

        //background and text color
        jTlBar.addSeparator();
        jTlBar.add(jLabelColTex);
        jTlBar.add(textCol);
        textCol.addActionListener(this);
        textCol.setBackground(Color.WHITE);

        jTlBar.addSeparator();
        jTlBar.add(jLabelColBck);
        jTlBar.add(bckCol);
        bckCol.addActionListener(this);
        bckCol.setBackground(Color.WHITE);

        add(jTlBar, "North");
        TEXTarea.requestFocus();
        jTlBar.setFloatable(false);

        //Pop Up Menu
        popUpItCut.addActionListener(this);
        popUpMenu.add(popUpItCut);
        popUpItCopy.addActionListener(this);
        popUpMenu.add(popUpItCopy);
        popUpItPaste.addActionListener(this);
        popUpMenu.add(popUpItPaste);

        popUpItCut.setIcon(imIcCut);
        popUpItCopy.setIcon(imIcCopy);
        popUpItPaste.setIcon(imIcPaste);
        TEXTarea.setComponentPopupMenu(popUpMenu);

        //Add scrollbar to main text area
        JScrollPane jScrPANtxtAr = new JScrollPane(TEXTarea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(jScrPANtxtAr);
        
        //Add scrollbar to main text area errors
        JScrollPane jScrPANerr = new JScrollPane(textAREAerrors, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(jScrPANerr, "South");

        //Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setTitle("Text Editor");
        setSize(800, 600);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == menItPrint) {
            print();
        }

        if (ae.getSource() == menItExit) {
            dispose();
        }

        if (ae.getSource() == menItNew || ae.getSource() == jBtNew) {
            TEXTarea.setText("");
        }

        if (ae.getSource() == menItCopy || ae.getSource() == popUpItCopy || ae.getSource() == jBtCopy) {
            TEXTarea.copy();
        }

        if (ae.getSource() == menItPaste || ae.getSource() == popUpItPaste || ae.getSource() == jBtPaste) {
            TEXTarea.paste();
        }

        if (ae.getSource() == menItCut || ae.getSource() == popUpItCut || ae.getSource() == jBtCut) {
            TEXTarea.cut();
        }

        if (ae.getSource() == menItSelectAll) {
            TEXTarea.requestFocus();
            TEXTarea.selectAll();
        }

        if (ae.getSource() == jBtOpen) {
            open();
        }

        if (ae.getSource() == jBtSave) {
            save();
        }

        if (ae.getSource() == menItOpen) {
            open();
        }

        if (ae.getSource() == menItSave) {
            save();
        }

        if (ae.getSource() == menItSearch) {
            Find fin = new Find(this, "Find...", true);
        }
        if (ae.getSource() == menItReplace) {
            FindReplace fp = new FindReplace(this, "Find and Replace", true);
        }

        if (ae.getSource() == bckCol) {
            ChooseColor selCl = new ChooseColor(this, "Choose color...", true, "background");
        }

        if (ae.getSource() == textCol) {
            ChooseColor selCl = new ChooseColor(this, "Choose color...", true, "text");
        }
    }

    void open() {
        String text = "";
        try {
            JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
            fc.showOpenDialog(this);
            File open = fc.getSelectedFile(); //return the file

            if (open != null) {
                PRGname = fc.getSelectedFile().getName();
            }

            if (open != null) {
                TEXTarea.setText("");
                FileReader flreader = new FileReader(open);
                BufferedReader read = new BufferedReader(flreader);
                while ((text = read.readLine()) != null) {
                    TEXTarea.append(text + "\n"); 
                }

                read.close();
            }

        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    void save() {
        
        try {
            JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
            fc.showSaveDialog(this);
            File save = fc.getSelectedFile();
            if (save != null) {
                PRGname = fc.getSelectedFile().getName();
                FileWriter fileSave = new FileWriter(save);
                fileSave.write(TEXTarea.getText());
                fileSave.close();
            }

        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    void print() {
        String printText = TEXTarea.getText();
        PrintJob ptjob = getToolkit().getPrintJob(this, "Print sheet", null);
        //print graphics
        Graphics pg = ptjob.getGraphics();
        pg.setFont(new Font("SansSerif", Font.PLAIN, 10));
        pg.drawString("Printing:", 100, 100);
        int init = 0;
        int linNum = 1;
        for (int i = 0; i < printText.length(); i++) {
            if ((int) printText.charAt(i) == 10) {
                pg.drawString(printText.substring(init, i - 1), 100, 100 + (15 * linNum));
                init = i + 1;
                linNum++;
            }
        }
        pg.drawString(printText.substring(init, printText.length()), 100, 100 + (15 * linNum));
        pg.dispose(); //finish sheet
        ptjob.end(); //end print
    }

    public static void main(String[] args) {
        new Editor();
    }
}

class FindReplace extends JDialog implements ActionListener {
    
    JLabel jLbFind = new JLabel("Find                 ", JLabel.LEFT);
    JLabel jLbRep = new JLabel("Replace by:", JLabel.LEFT);
    JTextField jTxFind = new JTextField(15);
    JTextField jTRep = new JTextField(15);

    JButton jBtFind = new JButton("Find");
    JButton jBtRepAll = new JButton("Replace All");
    JButton jBtRep = new JButton("Replace");

    Editor ed;
    int pos = 0;

    FindReplace(JFrame jFrFindRep, String s, boolean b) {
        super(jFrFindRep);

        ed = (Editor) jFrFindRep;
        setLayout(new FlowLayout());
        add(jLbFind);
        add(jTxFind);
        add(jLbRep);
        add(jTRep);
        JPanel jPanBut = new JPanel();
        jPanBut.add(jBtFind);
        jBtFind.addActionListener(this);
        jPanBut.add(jBtRep);
        jBtRep.addActionListener(this);
        jPanBut.add(jBtRepAll);
        jBtRepAll.addActionListener(this);
        add(jPanBut, "South");

        setTitle("Find and replace");
        setSize(350, 130);
        setResizable(false);
        setLocation(200, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jBtFind) {
            FindMe();
        }
        if (ae.getSource() == jBtRepAll) {
            ed.TEXTarea.requestFocus();
            String text = "";
            text = ed.TEXTarea.getText();
            String s = text.replaceAll(jTxFind.getText(), jTRep.getText()); //Replace all
            ed.TEXTarea.setText(s);
        }
        if (ae.getSource() == jBtRep) {
            ed.TEXTarea.requestFocus();
            String text = "";
            text = ed.TEXTarea.getText();
            String s = text.replaceFirst(jTxFind.getText(), jTRep.getText()); //Replace all
            ed.TEXTarea.setText(s);
        }

    }

    void FindMe() {
        ed.TEXTarea.requestFocus();
        String word = "";
        String findText = "";
        word = jTxFind.getText();
        findText = ed.TEXTarea.getText();
        //find
        pos = findText.indexOf(word, pos + 1);
        if (pos != -1) {
            ed.TEXTarea.select(pos, pos + word.length()); //replace 
        } else {
            JOptionPane.showMessageDialog(this, "No results found: " + word);
        }
    }
}

class Find extends JDialog implements ActionListener {

    JLabel jLbFind = new JLabel("Find:");
    JTextField jTxWord = new JTextField(10);
    JButton jBtFind = new JButton("Find Next");
    //position
    int pos;

    Editor ed;

    Find(JFrame jFrFind, String s, boolean b) {
        super(jFrFind);
        ed = (Editor) jFrFind;

        jBtFind.addActionListener(this);
        setLayout(new GridLayout(1, 3));
        setLayout(new FlowLayout());
        add(jLbFind);
        add(jTxWord);
        add(jBtFind);

        setTitle("Find...");
        setSize(325, 75);
        setResizable(false);
        setLocation(100, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jBtFind) {
            ed.TEXTarea.requestFocus();
            String word = "";
            String findText = "";
            word = jTxWord.getText();
            findText = ed.TEXTarea.getText();
            pos = findText.indexOf(word, pos);
            if (pos != -1) {
                ed.TEXTarea.select(pos, pos + word.length());
            } else {
                JOptionPane.showMessageDialog(this, "No results for: " + word);
            }
            pos++;

        }
    }
}

class ChooseColor extends JDialog implements ActionListener {

    JColorChooser jChoColor = new JColorChooser();
    JButton btAcept = new JButton("OK");
    Editor ed;
    String type;

    ChooseColor(JFrame color, String s, boolean b, String typ) {
        super(color);

        ed = (Editor) color;
        setLayout(new FlowLayout());
        add(jChoColor);
        add(btAcept);
        btAcept.addActionListener(this);
        setTitle("Choose color...");
        setSize(400, 440);
        setResizable(false);
        setLocation(200, 250);
        setVisible(true);
        type = typ;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btAcept) {
            if (type.equals("background")) {
                ed.TEXTarea.setBackground(jChoColor.getColor());
                ed.textAREAerrors.setBackground(jChoColor.getColor());
                ed.bckCol.setBackground(jChoColor.getColor());
            }
            if (type.equals("text")) {
                ed.TEXTarea.setForeground(jChoColor.getColor());
                ed.textAREAerrors.setForeground(jChoColor.getColor());
                ed.textCol.setBackground(jChoColor.getColor());
            }
        }
        dispose();
    }
}
