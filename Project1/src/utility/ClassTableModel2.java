/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.TriThuc;

/**
 *
 * @author hqd16
 */
public class ClassTableModel2 {

    public DefaultTableModel setTableHocVien(List<TriThuc> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 13 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        TriThuc trithuc = null;
        for (int i = 0; i < num; i++) {
            trithuc = listItem.get(i);
            obj = new Object[columns];
            obj[0] = trithuc.getSTT();
            obj[1] = trithuc.getHokhan();
            obj[2] = trithuc.getSomui();
            obj[3] = trithuc.getSot();
            obj[4] = trithuc.getHathoi();
            obj[5] = trithuc.getMoitim();
            obj[6] = trithuc.getDauhong();
            obj[7] = trithuc.getDaunguc();
            obj[8] = trithuc.getKhotho();
            obj[9] = trithuc.getChanan();
            obj[10] = trithuc.getHodam();
            obj[11] = trithuc.getHomau();
            obj[12] = trithuc.getConclusion();
            dtm.addRow(obj);
        }
        return dtm;
    }
}
