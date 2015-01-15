package VentanasPaneles;

// A private subclass of the default highlight painter
import java.awt.Color;
import javax.swing.text.DefaultHighlighter;

/**
 *
 * @author Javier Azcurra
 */
class MyHighlightPainter extends DefaultHighlighter.DefaultHighlightPainter {
    public MyHighlightPainter(Color color) {
        super(color);
    }
}