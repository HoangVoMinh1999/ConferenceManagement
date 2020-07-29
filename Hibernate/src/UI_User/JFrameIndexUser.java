/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_User;

import entities.*;
import dao.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vomin
 */
public class JFrameIndexUser extends javax.swing.JFrame {

    private String username;
    conferenceDAO cfDAO = new conferenceDAO();
    userDAO usDAO = new userDAO();
    placeDAO plDAO = new placeDAO();
    attendanceDAO atDAO = new attendanceDAO();
    private User CurrentUser;

    public void setCurrentUser(User CurrentUser) {
        this.CurrentUser = CurrentUser;
    }

    public User getCurrentUser() {
        return CurrentUser;
    }

    /**
     * Creates new form JFrameIndex
     */

    public JFrameIndexUser() {
        initComponents();
        LoadData();
    }

    public void LoadData() {
        //---Data of conference
        DefaultTableModel dtm_con = new DefaultTableModel();
        dtm_con.addColumn("ID");
        dtm_con.addColumn("Tên");
        dtm_con.addColumn("Thông tin chung");
        dtm_con.addColumn("Thời gian bắt đầu");
        dtm_con.addColumn("Thời gian kết thúc");
        dtm_con.addColumn("Địa điểm");
        dtm_con.addColumn("Số lượng khách mời");
        dtm_con.addColumn("Chi tiết");
        List<Conference> ls_cf = cfDAO.findAll();
        for (Conference temp : ls_cf) {
            Place pl = plDAO.find(temp.getPlace().getIdPlace());
            dtm_con.addRow(new Object[]{temp.getIdConference(), temp.getName(), temp.getGeneralInfo(), temp.getStartedtime(), temp.getEndedtime(), pl.getName(), temp.getVisitors(), temp.getDetail()});
        }
        this.listConference.setModel(dtm_con);

        DefaultTableModel dtm_visitors = new DefaultTableModel();
        dtm_visitors.addColumn("Tên hội nghị");
        dtm_visitors.addColumn("Tên khách mời");
        dtm_visitors.addColumn("status");
        this.listVisitors.setModel(dtm_visitors);
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listConference = new javax.swing.JTable();
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
        placeTextField = new javax.swing.JTextField();
        visitorsTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        detailTextArea = new javax.swing.JScrollPane();
        detailTextField = new javax.swing.JTextArea();
        joinButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listVisitors = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        optionSpace.setBackground(new java.awt.Color(66, 65, 65));

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
            .addGroup(optionSpaceLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(optionSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showConferenceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionSpaceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        optionSpaceLayout.setVerticalGroup(
            optionSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionSpaceLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(showConferenceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(statisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        playground.setPreferredSize(new java.awt.Dimension(1006, 800));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        listConference.setModel(new javax.swing.table.DefaultTableModel(
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
        listConference.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listConferenceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listConference);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Infomation of conference", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 18))); // NOI18N
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

        placeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeTextFieldActionPerformed(evt);
            }
        });

        visitorsTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorsTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Số lượng khách tham gia:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Chi tiết:");

        detailTextField.setColumns(20);
        detailTextField.setRows(5);
        detailTextArea.setViewportView(detailTextField);

        joinButton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        joinButton.setForeground(new java.awt.Color(255, 0, 0));
        joinButton.setText("Tham gia sự kiện");
        joinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(placeTextField)
                        .addComponent(jLabel7)
                        .addComponent(detailTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(visitorsTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(joinButton)
                        .addGap(101, 101, 101)))
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(placeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visitorsTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(joinButton)
                .addGap(0, 58, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List of visitors", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 18))); // NOI18N

        listVisitors.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(listVisitors);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("IMAGE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout playgroundLayout = new javax.swing.GroupLayout(playground);
        playground.setLayout(playgroundLayout);
        playgroundLayout.setHorizontalGroup(
            playgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(playgroundLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        playgroundLayout.setVerticalGroup(
            playgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(playgroundLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(optionSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playground, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playground, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 773, Short.MAX_VALUE)
                    .addComponent(optionSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        CurrentUser = null;
        JFrameLogin j = new JFrameLogin();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void showConferenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showConferenceButtonActionPerformed
        // TODO add your handling code here:
        JFrameIndexUser j = new JFrameIndexUser();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showConferenceButtonActionPerformed

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

    private void placeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeTextFieldActionPerformed

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButtonActionPerformed
        // TODO add your handling code here:
        int idConference = Integer.parseInt(this.listConference.getValueAt(this.listConference.getSelectedRow(), 0).toString());
        Conference cf = cfDAO.find(idConference);
        AttendanceId ID = new AttendanceId(idConference, CurrentUser.getIdUser());
        Attendance a = new Attendance(ID, cf, CurrentUser, 0);
        if (atDAO.save(a)) {
            JOptionPane.showMessageDialog(null, "Tham gia thành công !!!");
        } else {
            JOptionPane.showMessageDialog(null, "Tham gia không thành công !!!");
        }
    }//GEN-LAST:event_joinButtonActionPerformed

    private void visitorsTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorsTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitorsTextField1ActionPerformed

    private void listConferenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listConferenceMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(this.listConference.getValueAt(this.listConference.getSelectedRow(), 0).toString());
        System.out.println(id);
        Conference cf = cfDAO.find(id);
        Place pl = plDAO.find(cf.getPlace().getIdPlace());
        this.nameConferenceTextField.setText(cf.getName());
        this.generalInfoTextField.setText(cf.getGeneralInfo());
        this.startedTimeTextField.setText(cf.getStartedtime().toString());
        this.endedTimeTextField.setText(cf.getEndedtime().toString());
        this.placeTextField.setText(pl.getName());
        this.visitorsTextField1.setText(String.valueOf(cf.getVisitors()));
        this.detailTextField.setText(cf.getDetail());

        DefaultTableModel dtm_visitors = new DefaultTableModel();
        dtm_visitors.addColumn("Tên hội nghị");
        dtm_visitors.addColumn("Tên khách mời");
        dtm_visitors.addColumn("status");
        
        AttendanceId ID = new AttendanceId(id,CurrentUser.getIdUser()); 
        List<Attendance> ls_at = atDAO.findByUser(ID);
        System.out.println(ls_at);
        for (Attendance temp : ls_at) {
            String status;
            if (temp.getStatusUser() == 1) {
                status = "Joined";
            } else {
                status = "Pending . . .";
            }
            Conference t1 = cfDAO.find(id);
            dtm_visitors.addRow(new Object[]{t1.getName(),CurrentUser.getName(),status});
        }
        System.out.println("Hello 2");
        this.listVisitors.setModel(dtm_visitors);
    }//GEN-LAST:event_listConferenceMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameIndexUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameIndexUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameIndexUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameIndexUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameIndexUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel avatar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton joinButton;
    private javax.swing.JTable listConference;
    private javax.swing.JTable listVisitors;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField nameConferenceTextField;
    private javax.swing.JPanel optionSpace;
    private javax.swing.JTextField placeTextField;
    private javax.swing.JPanel playground;
    private javax.swing.JButton showConferenceButton;
    private javax.swing.JTextField startedTimeTextField;
    private javax.swing.JButton statisticButton;
    private javax.swing.JTextField visitorsTextField1;
    // End of variables declaration//GEN-END:variables
}
