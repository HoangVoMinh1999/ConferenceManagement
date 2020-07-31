/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_User;

import UI_guest.*;
import dao.*;
import entities.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vomin
 */
public class JFrameStatistic extends javax.swing.JFrame {

    private User CurrentUser;
    private attendanceDAO atDAO = new attendanceDAO();
    private userDAO usDAO = new userDAO();
    private placeDAO plDAO = new placeDAO();
    private conferenceDAO cfDAO = new conferenceDAO();

    /**
     * Creates new form JFrameStatistic
     */
    public JFrameStatistic() {
        initComponents();
    }

    public JFrameStatistic(User temp) {
        initComponents();
        this.CurrentUser = temp;
        LoadData();
    }

    private void LoadData() {
        System.out.println(CurrentUser.getIdUser());
        List<Attendance> ls_at = atDAO.findAll();
        int count = ls_at.size();
        List<Attendance> temp = new ArrayList<Attendance>();
        for (int i = 0; i < ls_at.size(); i++) {
            if (ls_at.get(i).getId().getIdUser() == CurrentUser.getIdUser()) {
                temp.add(ls_at.get(i));
            }
        }
        DefaultTableModel dtm_con = new DefaultTableModel();
        dtm_con.addColumn("Tên hội nghị");
        dtm_con.addColumn("Thời gian bắt đầu");
        dtm_con.addColumn("Thời gian kết thúc");
        dtm_con.addColumn("Địa điểm");
        dtm_con.addColumn("Trạng thái");
        for (Attendance i : temp) {
            Conference cf = cfDAO.find(i.getId().getIdConference());
            Place pl = plDAO.find(cf.getPlace().getIdPlace());
            if (i.getStatusUser() == 1) {
                dtm_con.addRow(new Object[]{cf.getName(), cf.getStartedtime(), cf.getEndedtime(), pl.getName(), "Đã tham gia"});
            } else {
                dtm_con.addRow(new Object[]{cf.getName(), cf.getStartedtime(), cf.getEndedtime(), pl.getName(), "Đang đợi duyệt ..."});
            }

        }
        this.list.setModel(dtm_con);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTable();

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
        jButton5.setForeground(new java.awt.Color(0, 51, 204));
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
        statisticButton.setText("THỐNG KÊ HỘI NGHỊ");
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
                    .addComponent(showConferenceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statisticButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout playgroundLayout = new javax.swing.GroupLayout(playground);
        playground.setLayout(playgroundLayout);
        playgroundLayout.setHorizontalGroup(
            playgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
        );
        playgroundLayout.setVerticalGroup(
            playgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playground, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showConferenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showConferenceButtonActionPerformed
        // TODO add your handling code here:
        JFrameIndexUser j = new JFrameIndexUser(CurrentUser);
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showConferenceButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JFrameAccountUser j = new JFrameAccountUser(CurrentUser);
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void statisticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statisticButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        CurrentUser = null;
        JFrameIndexGuest j = new JFrameIndexGuest();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameStatistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameStatistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameStatistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameStatistic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameStatistic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel avatar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable list;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel optionSpace;
    private javax.swing.JPanel playground;
    private javax.swing.JButton showConferenceButton;
    private javax.swing.JButton statisticButton;
    // End of variables declaration//GEN-END:variables
}
