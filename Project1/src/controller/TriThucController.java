/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.TriThuc;
import service.PatientServiceImpl;
import service.TriThucService;
import service.TriThucServiceImpl;
import utility.ClassTableModel;
import utility.ClassTableModel2;

/**
 *
 * @author hqd16
 */
public class TriThucController {

    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;

    private ClassTableModel2 classTableModel = null;

    private final String[] COLUMNS = {"STT", "Dry cough", "Snivel",
        "Fever", "Sneeze", "Purple lips ", "Sore throat", "Chest pain ", "SOB",
        "Anorexia", "Productive cough", "Hemoptisi", "Conclusion"};

    private TriThucService trithucService = null;

    private TableRowSorter<TableModel> rowSorter = null;

    public TriThucController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;

        this.classTableModel = new ClassTableModel2();

        this.trithucService = new TriThucServiceImpl();
    }

    public void setDataToTable() {
        List<TriThuc> listItem = trithucService.getList();
        DefaultTableModel model = classTableModel.setTableHocVien(listItem, COLUMNS);
        JTable table = new JTable(model);

        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);

        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        for (int i = 0; i < 12; i++) {
            table.getColumnModel().getColumn(i).setMaxWidth(85);
            table.getColumnModel().getColumn(i).setMinWidth(85);
            table.getColumnModel().getColumn(i).setPreferredWidth(85);
        }
         table.getColumnModel().getColumn(0).setMaxWidth(45);
            table.getColumnModel().getColumn(0).setMinWidth(45);
            table.getColumnModel().getColumn(0).setPreferredWidth(45);
             table.getColumnModel().getColumn(8).setMaxWidth(40);
            table.getColumnModel().getColumn(8).setMinWidth(40);
            table.getColumnModel().getColumn(8).setPreferredWidth(40);
             table.getColumnModel().getColumn(2).setMaxWidth(60);
            table.getColumnModel().getColumn(2).setMinWidth(60);
            table.getColumnModel().getColumn(2).setPreferredWidth(60);
              table.getColumnModel().getColumn(3).setMaxWidth(60);
            table.getColumnModel().getColumn(3).setMinWidth(60);
            table.getColumnModel().getColumn(3).setPreferredWidth(60);
              table.getColumnModel().getColumn(4).setMaxWidth(60);
            table.getColumnModel().getColumn(4).setMinWidth(60);
            table.getColumnModel().getColumn(4).setPreferredWidth(60);
              table.getColumnModel().getColumn(10).setMaxWidth(100);
            table.getColumnModel().getColumn(10).setMinWidth(100);
            table.getColumnModel().getColumn(10).setPreferredWidth(100);
          table.getColumnModel().getColumn(12).setMaxWidth(170);
            table.getColumnModel().getColumn(12).setMinWidth(170);
            table.getColumnModel().getColumn(12).setPreferredWidth(170);
        

        // design
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();

        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jpnView.removeAll();
        jpnView.setLayout(new CardLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
    }

}
