/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.ProfileEditor;
import backend.User;
import frontend.ImgSelect;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Mustafa
 */
public class EditProfile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    private ImgSelect imgs;
    private ProfileEditor editor;
    private Profile prev;
    private User user;
    private String oldPFP; //Stores old profile photo path if the user discards the changes
    private String oldCVP; //Stores old cover photo path if the user discards the changes
    private String oldBio; //Stores old bio if the user discards the changes
    private String oldPass; //Stores old password if the user discards the changes
    
    public EditProfile(User user,Profile prev) {
        initComponents();
        this.editor = new ProfileEditor(user);
        this.user = user;
        this.prev = prev;
        this.imgs = null;
        this.setVisible(true);
        oldPFP = user.getCoverPhotoPath();
        oldCVP = user.getCoverPhotoPath();
        oldBio = user.getBio();
        oldPass = user.getPassword();
        refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        changePFP = new javax.swing.JButton();
        changeCVP = new javax.swing.JButton();
        coverPhoto = new javax.swing.JLabel();
        profilePhoto = new javax.swing.JLabel();
        bioLabel = new javax.swing.JLabel();
        changeBio = new javax.swing.JButton();
        changePassword = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        changePFP.setText("Change profile photo");
        changePFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePFPActionPerformed(evt);
            }
        });

        changeCVP.setText("Change cover photo");
        changeCVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCVPActionPerformed(evt);
            }
        });

        coverPhoto.setBackground(new java.awt.Color(153, 153, 153));

        profilePhoto.setBackground(new java.awt.Color(102, 102, 102));

        changeBio.setText("Change bio");
        changeBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBioActionPerformed(evt);
            }
        });

        changePassword.setText("Change password");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });

        doneButton.setText("Discard changes");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save changes");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coverPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(profilePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changePFP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changeBio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changeCVP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(bioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(doneButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coverPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changePFP)
                            .addComponent(changeCVP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changeBio)
                            .addComponent(changePassword))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneButton)
                    .addComponent(saveButton))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePFPActionPerformed
        editor.updateProfilePhoto();
        refresh(); //Previews the new profile photo
    }//GEN-LAST:event_changePFPActionPerformed

    private void changeBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBioActionPerformed
        String bio = JOptionPane.showInputDialog(this, "Enter bio:", "Change bio", JOptionPane.PLAIN_MESSAGE); //takes new bio
        editor.updateBio(bio); //updates bio
        refresh();
    }//GEN-LAST:event_changeBioActionPerformed

    private void changeCVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeCVPActionPerformed
        editor.updateCoverPhoto(); //updates the cover photo
        refresh(); //Previews the new cover photo
    }//GEN-LAST:event_changeCVPActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        editor.changePassword();
    }//GEN-LAST:event_changePasswordActionPerformed

    private void discardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardButtonActionPerformed
        user.setBio(oldBio); //resets bio if changed
        user.setCoverPhotoPath(oldCVP); //resets cover photo path if changed
        user.setProfilePhotoPath(oldPFP); //resets profile photo path if changed
        user.setPassword(oldPass); //resets password if changed
        prev.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_discardButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        editor.saveUserChanges(); //saves changes
        prev.refresh(); //Shows the new bio / profile photo / cover photo in the profile
        prev.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void refresh(){
        ImageIcon pfp = new ImageIcon(user.getProfilePhotoPath()); 
        ImageIcon cvp = new ImageIcon(user.getCoverPhotoPath()); 
        int pfpWidth = profilePhoto.getWidth();
        int pfpHeight = profilePhoto.getHeight();
        Image scaledPFP = pfp.getImage().getScaledInstance( //scale image to fit label in panel
                pfpWidth, pfpHeight, Image.SCALE_SMOOTH);
        profilePhoto.setIcon(new ImageIcon(scaledPFP)); //previews the new PFP
        int cvpWidth = coverPhoto.getWidth();
        int cvpHeight = coverPhoto.getHeight();
        Image scaledCVP = cvp.getImage().getScaledInstance( //scale image to fit label in panel
                cvpWidth, cvpHeight, Image.SCALE_SMOOTH);
        coverPhoto.setIcon(new ImageIcon(scaledCVP)); //previews the new cover photo
        String bio = user.getBio();
        bioLabel.setText(bio); //previews the new bio
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bioLabel;
    private javax.swing.JButton changeBio;
    private javax.swing.JButton changeCVP;
    private javax.swing.JButton changePFP;
    private javax.swing.JButton changePassword;
    private javax.swing.JLabel coverPhoto;
    private javax.swing.JButton doneButton;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel profilePhoto;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}