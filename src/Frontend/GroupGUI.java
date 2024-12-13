/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import frontend.Window;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Mustafa
 */
public class GroupGUI extends Window {

    /**
     * Creates new form GroupGUI
     */
    
    private Window prevWindow;
    private Group group;
    private User user;
    private UserDatabase userDatabase= UserDatabase.getInstance();
    private PrimaryAdminRole admin;
    
    public void setPrevWindow(Window prev){
        this.prevWindow = prev;
    }
    
    public GroupGUI(/*Group group,User user*/) {
        initComponents();
        prepare("Group");
        this.group = null;
        this.user = null;
        
        //hides buttons for members only
        deleteGroupBTN.setVisible(false);
        editPostBTN.setVisible(false);
        addPostBTN.setVisible(false);
        manageGroupBTN.setVisible(false);
        
        if(user.getUserId() == group.getPrimaryAdmin()){ //shows the primary admin operation buttons
            deleteGroupBTN.setVisible(true);
            editPostBTN.setVisible(true);
            addPostBTN.setVisible(true);
            manageGroupBTN.setVisible(true);
            admin = new PrimaryAdminRole(group);
        }
        else
            admin = null;
        
        
        for(User admin : group.idsToUsers(group.getSecondaryAdmins())){ //goes through the secondary admins
            if(admin.getUserId() == user.getUserId()){ //shows the secondary admin operation buttons
                editPostBTN.setVisible(true);
                addPostBTN.setVisible(true);
                manageGroupBTN.setVisible(true);
            }
        }
        refresh();
        this.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        groupPhotoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        postsPanel = new javax.swing.JPanel();
        groupNameLabel = new javax.swing.JLabel();
        groupDescLabel = new javax.swing.JLabel();
        addPostBTN = new javax.swing.JButton();
        editPostBTN = new javax.swing.JButton();
        manageGroupBTN = new javax.swing.JButton();
        groupCoverLabel = new javax.swing.JLabel();
        deleteGroupBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        groupPhotoLabel.setText("group photo");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout postsPanelLayout = new javax.swing.GroupLayout(postsPanel);
        postsPanel.setLayout(postsPanelLayout);
        postsPanelLayout.setHorizontalGroup(
            postsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        postsPanelLayout.setVerticalGroup(
            postsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(postsPanel);

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
        deleteGroupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGroupBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(groupPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteGroupBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageGroupBTN))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addPostBTN)
                        .addGap(18, 18, 18)
                        .addComponent(editPostBTN)
                        .addGap(123, 123, 123))))
            .addComponent(groupCoverLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(groupCoverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPostBTN)
                            .addComponent(editPostBTN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageGroupBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteGroupBTN))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(groupNameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(groupDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(groupPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editPostBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPostBTNActionPerformed
        // TODO add your handling code here:
        GroupEditPost ge = new GroupEditPost(group);
        ge.setPrevWindow(this);
        this.setVisible(false);
    }//GEN-LAST:event_editPostBTNActionPerformed

    private void manageGroupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageGroupBTNActionPerformed
        // TODO add your handling code here:
        GroupManagement gm = new GroupManagement(group, user);
        gm.setPrevWindow(this);
        this.setVisible(false);
    }//GEN-LAST:event_manageGroupBTNActionPerformed

    private void addPostBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPostBTNActionPerformed
        // TODO add your handling code here:
        new GroupAddPost(group, user);
    }//GEN-LAST:event_addPostBTNActionPerformed

    private void deleteGroupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGroupBTNActionPerformed
        // TODO add your handling code here:
        admin.deleteGroup();
        this.setVisible(false);
    }//GEN-LAST:event_deleteGroupBTNActionPerformed

    /**
     * @param //args the command line arguments
     */
    
    protected void refresh(){
        groupPhotoLabel.setText("");
        if (group.getGroupPhotoPath() != null) {
            ImageIcon groupPhoto = new ImageIcon(group.getGroupPhotoPath());
            int photoWidth = groupPhotoLabel.getWidth();
            int photoHeight = groupPhotoLabel.getHeight();
            Image scaledPFP = groupPhoto.getImage().getScaledInstance( //scale image to fit label in panel
                    photoWidth, photoHeight, Image.SCALE_SMOOTH);
            groupPhotoLabel.setIcon(new ImageIcon(scaledPFP)); //puts the pfp on the label
        }
        
        groupCoverLabel.setText("");
        if (group.getCoverPhotoPath() != null) {
            ImageIcon groupcover = new ImageIcon(group.getCoverPhotoPath());
            int coverWidth = groupCoverLabel.getWidth();
            int coverHeight = groupCoverLabel.getHeight();
            Image scaledCVP = groupcover.getImage().getScaledInstance( //scale image to fit label in panel
                    coverWidth, coverHeight, Image.SCALE_SMOOTH);
            groupCoverLabel.setIcon(new ImageIcon(scaledCVP)); //puts the cover photo on the label
        }

        String description = group.getDescription();
        String name = group.getName();
        groupNameLabel.setText(name);
        groupDescLabel.setText(description);
        renderPosts();
    }
    
    private void renderPosts(){
        postsPanel.setLayout(new BoxLayout(postsPanel, BoxLayout.Y_AXIS));
        postsPanel.removeAll();
        if (group.getPosts().isEmpty()) {
            JLabel noPosts = new JLabel("No posts in group yet.", SwingConstants.CENTER);
            noPosts.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            postsPanel.add(noPosts, BorderLayout.CENTER);
            postsPanel.revalidate();
            postsPanel.repaint();
            return;
        }

        for (Content post : group.idsToPosts(group.getPosts())) {
            if (post instanceof Post ) {
                //creats panel for each post
                JPanel singlePost = new JPanel();
                singlePost.setLayout(new BorderLayout());
                singlePost.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                singlePost.setBackground(Color.WHITE);

                //sets username 
                User poster = userDatabase.getUserById(Integer.parseInt(post.getAuthorid()));
                JLabel usernameLabel = new JLabel(poster.getUsername(), SwingConstants.LEFT);
                usernameLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                singlePost.add(usernameLabel, BorderLayout.NORTH);

                //if theres an image for the post itll get set
                if (post.getImage() != null) {
                    System.out.println("rendering image");
                    ImageIcon postImage = post.getImage();
                    Image scaledImage = postImage.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
                    JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
                    imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    singlePost.add(imageLabel, BorderLayout.CENTER);
                }

                //set the description
                if (post.getText() != null) {
                    JLabel descriptionLabel = new JLabel(post.getText());
                    descriptionLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                    //stes position of the description depending if there's an image or not
                    if (post.getImage() == null) {
                        singlePost.add(descriptionLabel, BorderLayout.CENTER);
                    } else {
                        singlePost.add(descriptionLabel, BorderLayout.SOUTH);
                    }
                }
                //adds the single post to the main panel
                postsPanel.add(singlePost);

            }
        }
        postsPanel.revalidate();
        postsPanel.repaint();
    }
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
                    java.util.logging.Logger.getLogger(GroupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(GroupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(GroupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(GroupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new GroupGUI().setVisible(true);
                    }
                });
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPostBTN;
    private javax.swing.JButton deleteGroupBTN;
    private javax.swing.JButton editPostBTN;
    private javax.swing.JLabel groupCoverLabel;
    private javax.swing.JLabel groupDescLabel;
    private javax.swing.JLabel groupNameLabel;
    private javax.swing.JLabel groupPhotoLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageGroupBTN;
    private javax.swing.JPanel postsPanel;
    // End of variables declaration//GEN-END:variables
}