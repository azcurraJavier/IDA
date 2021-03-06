package VentanasPaneles;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Javier Azcurra
 */
public class MiJTable extends JTable {

    public MiJTable() {
        super();
    }

    public MiJTable(MiModelo m) {
        super(m);
        setFocusable(false);
    }

    public void autoAjuste() {

        this.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int c = 0; c < this.getColumnCount(); c++) {
            packColumn(c, 2);
        }
    }

    private void packColumn(int vColIndex, int margin) {

        DefaultTableColumnModel colModel = (DefaultTableColumnModel) this.
                getColumnModel();
        TableColumn col = colModel.getColumn(vColIndex);

        int width;

        TableCellRenderer renderer = col.getHeaderRenderer();
        if (renderer == null) {
            renderer = this.getTableHeader().getDefaultRenderer();
        }

        Component comp = renderer.getTableCellRendererComponent(
                this, col.getHeaderValue(), false, false, 0, 0);
        width = comp.getPreferredSize().width;

        for (int r = 0; r < this.getRowCount(); r++) {
            renderer = this.getCellRenderer(r, vColIndex);
            comp = renderer.getTableCellRendererComponent(
                    this, this.getValueAt(r, vColIndex), false, false, r,
                    vColIndex);
            width = Math.max(width, comp.getPreferredSize().width);
        }

        width += 2 * margin;            // Configura a largura
        col.setPreferredWidth(width);        
    }
}
