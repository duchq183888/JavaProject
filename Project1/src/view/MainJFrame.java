/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.DanhMucBean;
import controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hqd16
 */
public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
         List<DanhMucBean> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMucBean("TrangChinh", jpnTrangchu, jlbTrangchu));
        listDanhMuc.add(new DanhMucBean("Patient", jpnPatient, jlbPatient));
        listDanhMuc.add(new DanhMucBean("Trithuc", jPnTrithuc, jlbTrithuc));
        listDanhMuc.add(new DanhMucBean("Chuandoan", jpnChuandoan, jlbChuandoan));

        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setView(jpnTrangchu, jlbTrangchu);
        controller.setEvent(listDanhMuc);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlb4 = new javax.swing.JLabel();
        jpnPatient = new javax.swing.JPanel();
        jlbPatient = new javax.swing.JLabel();
        jPnTrithuc = new javax.swing.JPanel();
        jlbTrithuc = new javax.swing.JLabel();
        jpnChuandoan = new javax.swing.JPanel();
        jlbChuandoan = new javax.swing.JLabel();
        jpnTrangchu = new javax.swing.JPanel();
        jlbTrangchu = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setPreferredSize(new java.awt.Dimension(1098, 782));

        jpnMenu.setBackground(new java.awt.Color(82, 83, 81));

        jPanel4.setBackground(new java.awt.Color(232, 64, 60));

        jlb4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlb4.setForeground(new java.awt.Color(255, 255, 255));
        jlb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/baseline_local_hospital_white_24dp.png"))); // NOI18N
        jlb4.setText("EXPERT SYSTEM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlb4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlb4)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jpnPatient.setBackground(new java.awt.Color(76, 175, 80));
        jpnPatient.setForeground(new java.awt.Color(255, 255, 255));
        jpnPatient.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jpnPatient.setPreferredSize(new java.awt.Dimension(241, 66));

        jlbPatient.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbPatient.setForeground(new java.awt.Color(255, 255, 255));
        jlbPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/baseline_assignment_white_24dp.png"))); // NOI18N
        jlbPatient.setText("Patient List ");

        javax.swing.GroupLayout jpnPatientLayout = new javax.swing.GroupLayout(jpnPatient);
        jpnPatient.setLayout(jpnPatientLayout);
        jpnPatientLayout.setHorizontalGroup(
            jpnPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPatientLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jpnPatientLayout.setVerticalGroup(
            jpnPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPatient)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnTrithuc.setBackground(new java.awt.Color(76, 175, 80));
        jPnTrithuc.setPreferredSize(new java.awt.Dimension(236, 66));

        jlbTrithuc.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbTrithuc.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrithuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/baseline_settings_input_component_white_24dp.png"))); // NOI18N
        jlbTrithuc.setText("Knowledge Base ");

        javax.swing.GroupLayout jPnTrithucLayout = new javax.swing.GroupLayout(jPnTrithuc);
        jPnTrithuc.setLayout(jPnTrithucLayout);
        jPnTrithucLayout.setHorizontalGroup(
            jPnTrithucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnTrithucLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbTrithuc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnTrithucLayout.setVerticalGroup(
            jPnTrithucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnTrithucLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTrithuc)
                .addContainerGap())
        );

        jpnChuandoan.setBackground(new java.awt.Color(76, 175, 80));
        jpnChuandoan.setPreferredSize(new java.awt.Dimension(222, 66));

        jlbChuandoan.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbChuandoan.setForeground(new java.awt.Color(255, 255, 255));
        jlbChuandoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/baseline_account_circle_white_24dp.png"))); // NOI18N
        jlbChuandoan.setText("Diagnose ");

        javax.swing.GroupLayout jpnChuandoanLayout = new javax.swing.GroupLayout(jpnChuandoan);
        jpnChuandoan.setLayout(jpnChuandoanLayout);
        jpnChuandoanLayout.setHorizontalGroup(
            jpnChuandoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnChuandoanLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbChuandoan, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnChuandoanLayout.setVerticalGroup(
            jpnChuandoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnChuandoanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbChuandoan)
                .addContainerGap())
        );

        jpnTrangchu.setBackground(new java.awt.Color(76, 175, 80));

        jlbTrangchu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbTrangchu.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/baseline_important_devices_white_18dp.png"))); // NOI18N
        jlbTrangchu.setText("Main Screen ");

        javax.swing.GroupLayout jpnTrangchuLayout = new javax.swing.GroupLayout(jpnTrangchu);
        jpnTrangchu.setLayout(jpnTrangchuLayout);
        jpnTrangchuLayout.setHorizontalGroup(
            jpnTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangchuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlbTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jpnTrangchuLayout.setVerticalGroup(
            jpnTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangchuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbTrangchu)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jPnTrithuc, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jpnChuandoan, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jpnTrangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jpnTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jpnPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPnTrithuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jpnChuandoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPnTrithuc;
    private javax.swing.JLabel jlb4;
    private javax.swing.JLabel jlbChuandoan;
    private javax.swing.JLabel jlbPatient;
    private javax.swing.JLabel jlbTrangchu;
    private javax.swing.JLabel jlbTrithuc;
    private javax.swing.JPanel jpnChuandoan;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnPatient;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnTrangchu;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
