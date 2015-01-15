package Listas;

/**
 *
 * @author Javier Azcurra
 */
public class Literal {
    
    private int line;
    private String text;   

    public Literal(int line, String text) {
        this.line = line;
        this.text = text;
    }

    public int getLine() {
        return line;
    }

    public String getText() {
        return text;
    }
    
}
