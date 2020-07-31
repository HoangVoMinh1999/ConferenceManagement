/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_admin;

import UI_guest.JFrameIndexGuest;
import entities.*;
import dao.*;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author vomin
 */
public class JFrameNewConference extends javax.swing.JFrame {

    private conferenceDAO cfDAO = new conferenceDAO();
    private placeDAO plDAO = new placeDAO();
    SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    private User CurrentUser;
    /**
     * Creates new form JFrameNewConference
     */
    public JFrameNewConference() {
        initComponents();
        LoadData();
    }
    public JFrameNewConference(User CurrentUser) {
        initComponents();
        LoadData();
        this.CurrentUser = CurrentUser;
    }
    public void LoadData() {
        List<Place> ls_place = plDAO.findAll();
        String[] data = new String[ls_place.size()];
        for (int i = 0; i < ls_place.size(); i++) {
            data[i] = ls_place.get(i).getName();
        }
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(data);
        this.placeComboBox.setModel(cbm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionSpace = new javax.swing.JPanel();
        showConferenceButton = new javax.swing.JButton();
        avatar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        statisticButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        playground = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameConferenceTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        generalInfoTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        startedTimeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        endedTimeTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        placeComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        detailTextArea = new javax.swing.JScrollPane();
        detailTextField = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        visitorsTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        optionSpace.setBackground(new java.awt.Color(0, 0, 153));

        showConferenceButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showConferenceButton.setText("DANH SÁCH HỘI NGHỊ");
        showConferenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showConferenceButtonActionPerformed(evt);
            }
        });

        avatar.setPreferredSize(new java.awt.Dimension(246, 246));

        jLabel1.setText("AVATAR");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(10);
        jLabel1.setInheritsPopupMenu(false);
        jLabel1.setPreferredSize(new java.awt.Dimension(30, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 153));
        jButton5.setText("Xem, chỉnh sửa thông tin cá nhân");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout avatarLayout = new javax.swing.GroupLayout(avatar);
        avatar.setLayout(avatarLayout);
        avatarLayout.setHorizontalGroup(
            avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avatarLayout.createSequentialGroup()
                .addGroup(avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(avatarLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(avatarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        avatarLayout.setVerticalGroup(
            avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avatarLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton5)
                .addGap(27, 27, 27))
        );

        statisticButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        statisticButton.setText("DANH SÁCH NGƯỜI DÙNG");
        statisticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logoutButton.setText("ĐĂNG XUẤT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionSpaceLayout = new javax.swing.GroupLayout(optionSpace);
        optionSpace.setLayout(optionSpaceLayout);
        optionSpaceLayout.setHorizontalGroup(
            optionSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionSpaceLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(optionSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statisticButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showConferenceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        optionSpaceLayout.setVerticalGroup(
            optionSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionSpaceLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(showConferenceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(statisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        playground.setPreferredSize(new java.awt.Dimension(1006, 800));
        playground.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thêm hội nghị", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 18))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên hội nghị");

        nameConferenceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameConferenceTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Thông tin chung:");

        generalInfoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalInfoTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Thời gian bắt đầu:");

        startedTimeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startedTimeTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Thời gian kết thúc");

        endedTimeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endedTimeTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nơi tổ chức:");

        placeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Chi tiết:");

        detailTextField.setColumns(20);
        detailTextField.setRows(5);
        detailTextArea.setViewportView(detailTextField);

        saveButton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(0, 102, 255));
        saveButton.setText("Lưu ");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        visitorsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorsTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Số lượng khách tham gia:");

        cancelButton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 0, 0));
        cancelButton.setText("Hủy bỏ");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(153, 255, 0));
        jLabel9.setForeground(new java.awt.Color(51, 255, 51));
        jLabel9.setText("jLabel9");
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image of conference", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(nameConferenceTextField)
                            .addComponent(jLabel3)
                            .addComponent(generalInfoTextField)
                            .addComponent(jLabel4)
                            .addComponent(startedTimeTextField)
                            .addComponent(jLabel5)
                            .addComponent(endedTimeTextField)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(detailTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                            .addComponent(visitorsTextField)
                            .addComponent(jLabel8)
                            .addComponent(placeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(207, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameConferenceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generalInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startedTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endedTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visitorsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addGap(53, 53, 53))
        );

        playground.add(jPanel2, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playground, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playground, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showConferenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showConferenceButtonActionPerformed
        // TODO add your handling code here:
        JFrameIndexAdmin j = new JFrameIndexAdmin(CurrentUser);
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showConferenceButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void statisticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticButtonActionPerformed
        // TODO add your handling code here:
        JFrameListUser j = new JFrameListUser(CurrentUser);
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_statisticButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        JFrameIndexGuest j = new JFrameIndexGuest();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void nameConferenceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameConferenceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameConferenceTextFieldActionPerformed

    private void generalInfoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalInfoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generalInfoTextFieldActionPerformed

    private void startedTimeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startedTimeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startedTimeTextFieldActionPerformed

    private void endedTimeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endedTimeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endedTimeTextFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        Place chosen = plDAO.find(placeComboBox.getSelectedIndex() + 1);
        if(checkAddConference(chosen,this.startedTimeTextField.getText(),this.endedTimeTextField.getText()) == false){
            JOptionPane.showMessageDialog(null, "Thêm không thành công!!!Có hội nghị đã được đặt chỗ");
            return;
        }
        if(Integer.parseInt(this.visitorsTextField.getText())>chosen.getCapacity()){
            JOptionPane.showMessageDialog(null, "Nơi tổ chức không đủ sức chứa !!!");
            return;
        }
        
        
        Conference cf = new Conference();
        cf.setName(nameConferenceTextField.getText());
        cf.setGeneralInfo(generalInfoTextField.getText());
        try {
            cf.setStartedtime(newDateFormat.parse(startedTimeTextField.getText()));
            cf.setEndedtime(newDateFormat.parse(endedTimeTextField.getText()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        cf.setPlace(chosen);
        cf.setVisitors(Integer.parseInt(visitorsTextField.getText()));
        cf.setDetail(detailTextField.getText());
        cf.setStatus(1);
        if (cfDAO.save(cf)) {
            JOptionPane.showMessageDialog(null, "Thêm hội nghị thành công !!!");
            try {
                JFrameIndexAdmin j = new JFrameIndexAdmin();
                j.setVisible(true);
                this.dispose();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Thêm hội không thành công!!!");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void visitorsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitorsTextFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        JFrameIndexAdmin j = new JFrameIndexAdmin(CurrentUser);
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameNewConference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameNewConference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameNewConference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameNewConference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameNewConference().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel avatar;
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane detailTextArea;
    private javax.swing.JTextArea detailTextField;
    private javax.swing.JTextField endedTimeTextField;
    private javax.swing.JTextField generalInfoTextField;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField nameConferenceTextField;
    private javax.swing.JPanel optionSpace;
    private javax.swing.JComboBox<String> placeComboBox;
    private javax.swing.JPanel playground;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton showConferenceButton;
    private javax.swing.JTextField startedTimeTextField;
    private javax.swing.JButton statisticButton;
    private javax.swing.JTextField visitorsTextField;
    // End of variables declaration//GEN-END:variables
    private boolean checkAddConference(Place pl, String temp1, String temp2) {
        List<Conference> ls_cf = cfDAO.findByPlace(pl);
        Date newStartedDay = null;
        Date newEndedDay = null;
        try {
            newStartedDay = newDateFormat.parse(temp1);
            newEndedDay = newDateFormat.parse(temp2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (newStartedDay.compareTo(newEndedDay) >= 0) {
            return false;
        }
        for (Conference i : ls_cf) {
            if (i.getStatus() == 1) {
                if (((newStartedDay.compareTo(i.getStartedtime()))>=0 &&(newStartedDay.compareTo(i.getEndedtime()))<=0) || ((newEndedDay.compareTo(i.getStartedtime()))>=0 &&(newEndedDay.compareTo(i.getEndedtime()))<=0) )  {
                    return false;
                }
            }
        }
        return true;
    }

}
