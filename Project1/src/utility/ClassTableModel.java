/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Patient;

/**
 *
 * @author hqd16
 */
public class ClassTableModel {
     public DefaultTableModel setTableHocVien(List<Patient> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 7 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        Patient patient = null;
        for (int i = 0; i < num; i++) {
            patient = listItem.get(i);
            obj = new Object[columns];
            obj[0] = (i + 1);
            obj[1] = patient.getID();
            obj[2] = patient.getName();
            obj[3] = patient.getGender();
            obj[4] = patient.getAge();
            obj[5] = patient.getAddress();
            obj[6] = patient.getPhone();
            dtm.addRow(obj);
        }
        return dtm;
    }
    
}
