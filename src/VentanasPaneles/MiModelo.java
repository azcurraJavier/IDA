package VentanasPaneles;

import javax.swing.table.DefaultTableModel;


public class MiModelo extends DefaultTableModel{
 
 
    @Override
 public boolean isCellEditable (int row, int column)
   {
       return false;
   }
    
    public boolean hasRows() {
    
        if(this == null){
            return false;
        }
        
        if(this.getRowCount()==0){
            return false;
        }
        
        return true;
    }
    } 
