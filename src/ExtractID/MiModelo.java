package ExtractID;

import javax.swing.table.DefaultTableModel;


public class MiModelo extends DefaultTableModel{
    @Override
 public boolean isCellEditable (int row, int column)
   {
       return false;
   }
}
