/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.Symptom;
import repository.JDBCConnection;

/**
 *
 * @author hqd16
 */
public class ChuandoanJPanel extends javax.swing.JPanel {

    public ArrayList<Symptom> listSymptomSelect = new ArrayList<>();

    
    
    public ChuandoanJPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jHokhan = new javax.swing.JCheckBox();
        jHathoi = new javax.swing.JCheckBox();
        jHocodam = new javax.swing.JCheckBox();
        jHoramau = new javax.swing.JCheckBox();
        jSot = new javax.swing.JCheckBox();
        jDaunguc = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSomui = new javax.swing.JCheckBox();
        jMoitim = new javax.swing.JCheckBox();
        jKhotho = new javax.swing.JCheckBox();
        jChanan = new javax.swing.JCheckBox();
        jDauhong = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jpnResult = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextcam = new javax.swing.JTextField();
        jTextviem = new javax.swing.JTextField();
        jTextcamKL = new javax.swing.JTextField();
        jTextviemKL = new javax.swing.JTextField();
        jTextsuy = new javax.swing.JTextField();
        jTextSuyKL = new javax.swing.JTextField();
        jTextung = new javax.swing.JTextField();
        jTextungKL = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        dry = new javax.swing.JComboBox<>();
        pro = new javax.swing.JComboBox<>();
        hem = new javax.swing.JComboBox<>();
        fev = new javax.swing.JComboBox<>();
        che = new javax.swing.JComboBox<>();
        sni = new javax.swing.JComboBox<>();
        sne = new javax.swing.JComboBox<>();
        sor = new javax.swing.JComboBox<>();
        pur = new javax.swing.JComboBox<>();
        ano = new javax.swing.JComboBox<>();
        sho = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("SELECT ACQUIRED SYMPTOMS");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Diagnosis to the patient ");

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Đặng Văn Huy", "Nguyễn Văn Anh", "Vũ Trung Kiên", "Lê Thị Trang", "Nguyễn Thị Thảo" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("SYMPTOM");

        jHokhan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jHokhan.setText("Dry cough");

        jHathoi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jHathoi.setText("Sneeze ");
        jHathoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHathoiActionPerformed(evt);
            }
        });

        jHocodam.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jHocodam.setText("Productive cough");
        jHocodam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHocodamActionPerformed(evt);
            }
        });

        jHoramau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jHoramau.setText("Hemoptisi ");

        jSot.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jSot.setText("Fever");

        jDaunguc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jDaunguc.setText("Chest pain ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("SYMPTOM");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("DEGREE");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("DEGREE");

        jSomui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jSomui.setText("Snivel");
        jSomui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSomuiActionPerformed(evt);
            }
        });

        jMoitim.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMoitim.setText("Purple lips ");

        jKhotho.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jKhotho.setText("Shortness of breath  ");
        jKhotho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKhothoActionPerformed(evt);
            }
        });

        jChanan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jChanan.setText("Anorexia");

        jDauhong.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jDauhong.setText("Sore throat");

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Diagnostic");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setPreferredSize(new java.awt.Dimension(70, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("NAME OF DISEASE ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("DEGREE");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("CONCLUTION");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Flu");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Pneumonia");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Respiratory failure");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Lung cancer ");

        jTextcam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcamActionPerformed(evt);
            }
        });

        jTextviem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextviem.setText(" ");
        jTextviem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextviemActionPerformed(evt);
            }
        });

        jTextcamKL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextviemKL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextsuy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextSuyKL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextung.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextungKL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpnResultLayout = new javax.swing.GroupLayout(jpnResult);
        jpnResult.setLayout(jpnResultLayout);
        jpnResultLayout.setHorizontalGroup(
            jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnResultLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextung)
                        .addComponent(jTextviem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(jTextsuy, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jpnResultLayout.createSequentialGroup()
                        .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextcam, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnResultLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel8))
                            .addGroup(jpnResultLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextcamKL, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(jTextviemKL)
                                    .addComponent(jTextSuyKL)
                                    .addComponent(jTextungKL))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnResultLayout.setVerticalGroup(
            jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnResultLayout.createSequentialGroup()
                .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnResultLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextcam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextcamKL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnResultLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnResultLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextviem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(jpnResultLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTextviemKL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextsuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextSuyKL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnResultLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jpnResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnResultLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12))
                            .addComponent(jTextung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnResultLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextungKL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        dry.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negative ", "Low", "Medium", "Severity " }));

        pro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negative ", "Low", "Medium", "Severity " }));

        hem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        hem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negative ", "Low", "Medium", "Severity " }));

        fev.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fev.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negative ", "Low", "Medium", "Severity " }));

        che.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        che.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negative ", "Low", "Medium", "Severity " }));

        sni.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negative ", "Low", "Medium", "Severity " }));

        sne.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negative ", "Low", "Medium", "Severity " }));

        sor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negative ", "Low", "Medium", "Severity " }));

        pur.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negative ", "Low", "Medium", "Severity " }));

        ano.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negative ", "Low", "Medium", "Severity " }));

        sho.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negative ", "Low", "Medium", "Severity " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jHathoi, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jDaunguc, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSot, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jHoramau, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jHocodam))
                                            .addGap(2, 2, 2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(sne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(pro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(che, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jHokhan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23)
                                    .addComponent(dry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(128, 128, 128)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSomui, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jMoitim, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jKhotho)
                                .addComponent(jChanan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDauhong, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(103, 103, 103))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(374, 374, 374)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 438, Short.MAX_VALUE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpnResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jHokhan)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jSomui, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jHathoi)
                                    .addComponent(sne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jMoitim, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(sni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jHocodam)
                            .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jKhotho)
                            .addComponent(sho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jHoramau)
                            .addComponent(jChanan)
                            .addComponent(hem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSot, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDauhong, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDaunguc)
                            .addComponent(che, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(360, 360, 360))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jpnResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextviemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextviemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextviemActionPerformed

//    public static void main(String[] args) {
//         Symptom s1 = new Symptom("Ho khan", 0.5);
//        Symptom s2 = new Symptom("Hắt hơi", 0.7);
//        Symptom s3 = new Symptom("Chán ăn", 0.6);
//        ArrayList<Symptom> l1 = new ArrayList<>();
//        l1.add(s1);
//        l1.add(s2);
//        l1.add(s3);
//        ArrayList<Double> list = new ArrayList<>();
//        list=new JDBCConnection().getL(l1);
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//    }
    private void jTextcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcamActionPerformed
    public static double conv(String s){
        double d=0;
        if(s.equals("Low")){
            d=0.25;
        }
        else if(s.equals("Medium")){
            d=0.5;
        }
        else{
            d=0.75;
        }
        
        return d;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Symptom sym = new Symptom();
        Symptom sym1 = new Symptom();
        Symptom sym2 = new Symptom();
        Symptom sym3 = new Symptom();
        Symptom sym4 = new Symptom();
        Symptom sym5 = new Symptom();
        Symptom sym6 = new Symptom();
        Symptom sym7 = new Symptom();
        Symptom sym8 = new Symptom();
        Symptom sym9 = new Symptom();
        Symptom sym0 = new Symptom();
        if (jHokhan.isSelected()) {
            String s1=String.valueOf(dry.getSelectedItem());
            sym.setDegree(conv(s1));
            sym.setSymptomName("Ho khan");
            listSymptomSelect.add(sym);
        }
        if (jSomui.isSelected()) {
            String s2=String.valueOf(sni.getSelectedItem());
            sym1.setDegree(conv(s2));
            sym1.setSymptomName("Sổ mũi");
            listSymptomSelect.add(sym1);
        }
        if (jSot.isSelected()) {
            String s3=String.valueOf(fev.getSelectedItem());
            sym2.setDegree(conv(s3));
            sym2.setSymptomName("Sốt");
            listSymptomSelect.add(sym2);
        }
        if (jHathoi.isSelected()) {
            String s4=String.valueOf(sne.getSelectedItem());
            sym3.setDegree(conv(s4));
            sym3.setSymptomName("Hắt hơi");
            listSymptomSelect.add(sym3);
        }
        if (jMoitim.isSelected()) {
            String s5=String.valueOf(pur.getSelectedItem());
            sym4.setDegree(conv(s5));
            sym4.setSymptomName("Môi tím tái");
            listSymptomSelect.add(sym4);
        }
        if (jDauhong.isSelected()) {
            String s6=String.valueOf(sor.getSelectedItem());
            sym5.setDegree(conv(s6));
            sym5.setSymptomName("Đau họng");
            listSymptomSelect.add(sym5);
        }
        if (jDaunguc.isSelected()) {
            String s7=String.valueOf(che.getSelectedItem());
            sym6.setDegree(conv(s7));
            sym6.setSymptomName("Đau ngực");
            listSymptomSelect.add(sym6);
        }

        if (jKhotho.isSelected()) {
          String s8=String.valueOf(sho.getSelectedItem());
            sym7.setDegree(conv(s8));
            sym7.setSymptomName("Khó thở");
            listSymptomSelect.add(sym7);
        }
        if (jChanan.isSelected()) {
             String s9=String.valueOf(ano.getSelectedItem());
            sym8.setDegree(conv(s9));
            sym8.setSymptomName("Chán ăn");
            listSymptomSelect.add(sym8);
        }
        if (jHocodam.isSelected()) {
           String s10=String.valueOf(pro.getSelectedItem());
            sym9.setDegree(conv(s10));
            sym9.setSymptomName("Ho đàm");
            listSymptomSelect.add(sym9);
        }
        if (jHoramau.isSelected()) {
           String s0=String.valueOf(hem.getSelectedItem());
            sym0.setDegree(conv(s0));
            sym0.setSymptomName("Ho ra máu");
            listSymptomSelect.add(sym0);
        }
        double maxp;
        double l1, l2, l3, l4;
        maxp = maxs(listSymptomSelect);
        ArrayList<Double> r1 = new ArrayList<>();
        r1=new JDBCConnection().getL(listSymptomSelect);

        //        l1 = new JDBCConnection().camCum(listSymptomSelect);
        //        l2 = new JDBCConnection().viemPhoi(listSymptomSelect);
        //        l3 = new JDBCConnection().suyHo(listSymptomSelect);
        //        l4 = new JDBCConnection().ungThu(listSymptomSelect);

        jTextcam.setText(String.valueOf((r1.get(0)*maxp)));
        jTextviem.setText(String.valueOf(r1.get(1)*maxp));
        jTextsuy.setText(String.valueOf(r1.get(2)*maxp));
        jTextung.setText(String.valueOf(r1.get(3)*maxp));
        jTextcamKL.setText(ketqua(r1.get(0)*maxp));
        jTextviemKL.setText(ketqua(r1.get(1)*maxp));
        jTextSuyKL.setText(ketqua(r1.get(2)*maxp));
        jTextungKL.setText(ketqua(r1.get(3)*maxp));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jKhothoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKhothoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jKhothoActionPerformed

    private void jSomuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSomuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSomuiActionPerformed

    private void jHocodamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHocodamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHocodamActionPerformed

    private void jHathoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHathoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHathoiActionPerformed
    public static double maxs(ArrayList<Symptom> l) {
        double max = l.get(0).getDegree();
        for (int i = 1; i < l.size(); i++) {
            if (max < l.get(i).getDegree()) {
                max = l.get(i).getDegree();
            }
        }
        return max;
    }
//    public static String cut(String s){
//        String rs="";
//        if(s=="0.0"){
//            rs="0.0";
//        }
//        else{
//            rs=s.substring(0,8);
//        }
//        return rs;
//    }

    public static String ketqua(double r1) {
        String rs = "";
        if (r1 == 0) {
            rs = "Definitely exclude this disease ";
        }
        if (r1 > 0 && r1 < 0.25) {
            rs = "Possibility of eliminating this disease ";
        } else if (r1 >= 0.25 && r1 <= 0.6) {
            rs = "There is a possibility of disease ";
        } else if(r1>0.6) {
            rs = "Definitely get this disease ";
        }
        return rs;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ano;
    private javax.swing.JComboBox<String> che;
    private javax.swing.JComboBox<String> dry;
    private javax.swing.JComboBox<String> fev;
    private javax.swing.JComboBox<String> hem;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jChanan;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JCheckBox jDauhong;
    private javax.swing.JCheckBox jDaunguc;
    private javax.swing.JCheckBox jHathoi;
    private javax.swing.JCheckBox jHocodam;
    private javax.swing.JCheckBox jHokhan;
    private javax.swing.JCheckBox jHoramau;
    private javax.swing.JCheckBox jKhotho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox jMoitim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JCheckBox jSomui;
    private javax.swing.JCheckBox jSot;
    private javax.swing.JTextField jTextSuyKL;
    private javax.swing.JTextField jTextcam;
    private javax.swing.JTextField jTextcamKL;
    private javax.swing.JTextField jTextsuy;
    private javax.swing.JTextField jTextung;
    private javax.swing.JTextField jTextungKL;
    private javax.swing.JTextField jTextviem;
    private javax.swing.JTextField jTextviemKL;
    private javax.swing.JPanel jpnResult;
    private javax.swing.JComboBox<String> pro;
    private javax.swing.JComboBox<String> pur;
    private javax.swing.JComboBox<String> sho;
    private javax.swing.JComboBox<String> sne;
    private javax.swing.JComboBox<String> sni;
    private javax.swing.JComboBox<String> sor;
    // End of variables declaration//GEN-END:variables
}
