package VentanasPaneles;

import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier Azcurra
 */
public class MiModelo extends DefaultTableModel {

    private Set<Integer> colEditable;

    public void addColumnEditable(int colNumber) {

        if (colEditable == null) {
            colEditable = new HashSet<>();
        }

        colEditable.add(colNumber);
    }

    public void removeColumnEditable(int colNumber) {

        if (colEditable == null) {
            colEditable = new HashSet<>();
        }

        colEditable.remove(colNumber);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if (colEditable != null && !colEditable.isEmpty()) {
            if (colEditable.contains(column)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasRows() {

        if (this == null) {
            return false;
        }

        if (this.getRowCount() == 0) {
            return false;
        }

        return true;
    }

    @Override
    public Class getColumnClass(int column) {

        switch (column) {
            case 1:
                return this.getColumnName(1).equals("Línea") ? Integer.class : String.class;
            case 6:
                return this.getColumnName(6).equals("Nro Ref") ? Integer.class : String.class;
            default:
                return String.class;
        }
    }
}
