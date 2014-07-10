
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BasicForm extends JFrame {

    //Basic Form data 
    
    public BasicForm(String nmFr) {
        super("Form " + nmFr);

        getContentPane().setLayout(new FlowLayout());

        JLabel label = new JLabel("Name "+nmFr);
        JTextField textfield = new JTextField("Name", 20);
        
        getContentPane().add(label);
        getContentPane().add(textfield);
        
        label = new JLabel("Document");
        textfield = new JTextField("Document", 20); 
        
        getContentPane().add(label);
        getContentPane().add(textfield);
        
        label = new JLabel("Address");
        textfield = new JTextField("Address", 20); 
        
        getContentPane().add(label);
        getContentPane().add(textfield);
        
        label = new JLabel("Age");
        textfield = new JTextField("Age", 20); 
        
        getContentPane().add(label);
        getContentPane().add(textfield);  
        
        
        JButton boton = new JButton("Send");        
        getContentPane().add(boton);

        setSize(400, 300);
        setVisible(true);
    }
    
    @Override
    public Container getContentPane() {
        return this.getContentPane();
    }
    
    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }
    
    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height);
    }    

}
