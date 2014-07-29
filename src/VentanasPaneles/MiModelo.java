package VentanasPaneles;

import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

public class MiModelo extends DefaultTableModel {

    private Set<Integer> colEditable;    
    
    public void addColumnEditable(int colNumber){
        
        if(colEditable == null){
            colEditable = new HashSet<>();
        }
        
        colEditable.add(colNumber);
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        if(colEditable!=null && !colEditable.isEmpty()){            
            if(colEditable.contains(column)){
                return true;
            }
        }        
        return false;
    }

    public boolean hasRows() {

        if (this == null) {
            return false;
        }

        if(this.getRowCount()==0){
            return false;
        }    
        
        return true;
    }
}
