/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import frontend.Window;
import java.awt.Image;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Mustafa
 */
public class GroupManagement extends Window {

    /**
     * Creates new form GroupManagement
     */
    
    private Group group;
    private User user;
    private Window prev;
    private HashMap<User,String> membersComboMap;
    private HashMap<User,String> requestComboMap;
    private SecondaryAdminRole Admin;
    
    public void setPrevWindow(Window prev){
        this.prev = prev;
    }
    
    public GroupManagement(Group group,User user) {
        initComponents();
        this.group = group;
        this.user = user;
        this.requestComboMap = new HashMap<>();
        this.membersComboMap = new HashMap<>();
        
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        
        if(group.getPrimaryAdmin() == user.getUserId()){ //only primary admin can promote and demote
            jButton1.setVisible(true);
            jButton2.setVisible(true);
            jButton3.setVisible(true);
            jButton6.setVisible(true);
            jButton7.setVisible(true);
            Admin = new PrimaryAdminRole(group);
        }
        else{
            Admin = new SecondaryAdminRole(group);
        }
        
        prepare("Group management");
        refresh();
        updateMemberComboBox();
        updateRequestComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupNameLabel = new javax.swing.JLabel();
        groupDescLabel = new javax.swing.JLabel();
        addPostBTN = new javax.swing.JButton();
        editPostBTN = new javax.swing.JButton();
        manageGroupBTN = new javax.swing.JButton();
        groupCoverLabel = new javax.swing.JLabel();
        deleteGroupBTN = new javax.swing.JButton();
        groupPhotoLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        groupNameLabel1 = new javax.swing.JLabel();
        groupDescLabel1 = new javax.swing.JLabel();
        groupCoverLabel1 = new javax.swing.JLabel();
        groupPhotoLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        groupNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        groupNameLabel.setText("group name");

        groupDescLabel.setText("description");

        addPostBTN.setText("Add post");
        addPostBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPostBTNActionPerformed(evt);
            }
        });

        editPostBTN.setText("Edit post");
        editPostBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPostBTNActionPerformed(evt);
            }
        });

        manageGroupBTN.setText("Manage group");
        manageGroupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageGroupBTNActionPerformed(evt);
            }
        });

        groupCoverLabel.setText("cover photo");

        deleteGroupBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteGroupBTN.setForeground(new java.awt.Color(255, 0, 0));
        deleteGroupBTN.setText("Delete group");

        groupPhotoLabel.setText("group photo");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        groupNameLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        groupNameLabel1.setText("group name");

        groupDescLabel1.setText("description");

        groupCoverLabel1.setText("cover photo");

        groupPhotoLabel1.setText("group photo");

        jButton1.setText("Change cover photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Change group photo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Change description");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Join requests :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton4.setText("Decline");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Approve");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Members :");

        jButton6.setText("Demote");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Promote");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Remove");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Done");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupCoverLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(groupPhotoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(groupDescLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(groupNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(179, 179, 179))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(groupCoverLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(groupNameLabel1)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(groupDescLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(groupPhotoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPostBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPostBTNActionPerformed
        // TODO add your handling code here:
        new GroupAddPost(group, user);
    }//GEN-LAST:event_addPostBTNActionPerformed

    private void editPostBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPostBTNActionPerformed
        // TODO add your handling code here:
        new GroupEditPost(group);
    }//GEN-LAST:event_editPostBTNActionPerformed

    private void manageGroupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageGroupBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageGroupBTNActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File file) { // choose imgs only mn el files
                String fileName = file.getName().toLowerCase();
                return file.isDirectory() || fileName.endsWith(".png") || fileName.endsWith(".jpg") || fileName.endsWith(".jpeg");
            }

            @Override
            public String getDescription() {
                return "Image Files (*.png, *.jpg, *.jpeg)";
            }
        });
        
        fileChooser.showDialog(null,"Select");
        String path = fileChooser.getSelectedFile().getAbsolutePath();
        if(path != null){   
            group.setGroupPhotoPath(path); //updates the profile photo
            refresh();
        }
        else
            JOptionPane.showInternalMessageDialog(null,"No image has been selected" , "Error", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        User u = getSelectedMember();
        if(u == null){
            JOptionPane.showMessageDialog(null, "no user selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            ((PrimaryAdminRole) Admin).promoteUserToAdmin(user);
            updateMemberComboBox();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        User u = getSelectedRequester();
        if(u == null){
            JOptionPane.showMessageDialog(null, "no user selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Admin.declineMembershipRequest(u);
            updateMemberComboBox();
            updateRequestComboBox();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File file) { // choose imgs only mn el files
                String fileName = file.getName().toLowerCase();
                return file.isDirectory() || fileName.endsWith(".png") || fileName.endsWith(".jpg") || fileName.endsWith(".jpeg");
            }

            @Override
            public String getDescription() {
                return "Image Files (*.png, *.jpg, *.jpeg)";
            }
        });
        
        fileChooser.showDialog(null,"Select");
        String path = fileChooser.getSelectedFile().getAbsolutePath();
        if(path != null){   
            group.setCoverPhotoPath(path); //updates the profile photo
            refresh();
        }
        else
            JOptionPane.showInternalMessageDialog(null,"No image has been selected" , "Error", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        User u = getSelectedMember();
        if(u == null){
            JOptionPane.showMessageDialog(null, "no user selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            ((PrimaryAdminRole) Admin).demoteAdminToUser(user);
            updateMemberComboBox();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        User u = getSelectedRequester();
        if(u == null){
            JOptionPane.showMessageDialog(null, "no user selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Admin.approveMembershipRequest(u);
            updateMemberComboBox();
            updateRequestComboBox();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        User u = getSelectedMember();
        if(u == null){
            JOptionPane.showMessageDialog(null, "no user selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Admin.removeMember(u);
            updateMemberComboBox();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String desc = JOptionPane.showInputDialog(null, "Description:", "Change description", JOptionPane.PLAIN_MESSAGE);
        group.setDescription(desc);
        refresh();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        this.setVisible(false);
        prev.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private User getSelectedRequester(){ 
        String selectedUsername = (String) jComboBox1.getSelectedItem();
        for (Map.Entry<User, String> entry : requestComboMap.entrySet()) {
            if (entry.getValue().equals(selectedUsername)) {
                return entry.getKey();
            }
        }
        return null; // No match found
    }
    
    private void updateRequestComboBox(){
        requestComboMap.clear();
        jComboBox1.removeAllItems();
        for(User u : group.idsToUsers(group.getRequests())){ 
            requestComboMap.put(u, u.getUsername());
            jComboBox1.addItem(u.getUsername());
        }
    }
    
    private User getSelectedMember(){
        String selectedUsername = (String) jComboBox2.getSelectedItem();
        for (Map.Entry<User, String> entry : membersComboMap.entrySet()) {
            if (entry.getValue().equals(selectedUsername)) {
                return entry.getKey();
            }
        }
        return null; // No match found
    }
    
    private void updateMemberComboBox(){
        membersComboMap.clear();
        jComboBox2.removeAllItems();
        for(User u : group.idsToUsers(group.getMembers())){
            membersComboMap.put(u, u.getUsername());
            jComboBox2.addItem(u.getUsername());
        }
    }
    
    protected void refresh(){
        groupPhotoLabel1.setText("");
        if (group.getGroupPhotoPath() != null) {
            ImageIcon groupPhoto = new ImageIcon(group.getGroupPhotoPath());
            int photoWidth = groupPhotoLabel1.getWidth();
            int photoHeight = groupPhotoLabel1.getHeight();
            Image scaledPFP = groupPhoto.getImage().getScaledInstance( //scale image to fit label in panel
                    photoWidth, photoHeight, Image.SCALE_SMOOTH);
            groupPhotoLabel1.setIcon(new ImageIcon(scaledPFP)); //puts the pfp on the label
        }
        
        groupCoverLabel1.setText("");
        if (group.getCoverPhotoPath() != null) {
            ImageIcon groupcover = new ImageIcon(group.getCoverPhotoPath());
            int coverWidth = groupCoverLabel1.getWidth();
            int coverHeight = groupCoverLabel1.getHeight();
            Image scaledCVP = groupcover.getImage().getScaledInstance( //scale image to fit label in panel
                    coverWidth, coverHeight, Image.SCALE_SMOOTH);
            groupCoverLabel1.setIcon(new ImageIcon(scaledCVP)); //puts the cover photo on the label
        }

        String description = group.getDescription();
        String name = group.getName();
        groupNameLabel1.setText(name);
        groupDescLabel1.setText(description);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPostBTN;
    private javax.swing.JButton deleteGroupBTN;
    private javax.swing.JButton editPostBTN;
    private javax.swing.JLabel groupCoverLabel;
    private javax.swing.JLabel groupCoverLabel1;
    private javax.swing.JLabel groupDescLabel;
    private javax.swing.JLabel groupDescLabel1;
    private javax.swing.JLabel groupNameLabel;
    private javax.swing.JLabel groupNameLabel1;
    private javax.swing.JLabel groupPhotoLabel;
    private javax.swing.JLabel groupPhotoLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton manageGroupBTN;
    // End of variables declaration//GEN-END:variables
}
