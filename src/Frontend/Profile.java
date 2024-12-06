/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.*;
import frontend.AddPost;
import java.awt.Image;
import javax.swing.ImageIcon;
import frontend.Window;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
/**
 *
 * @author Mustafa
 */
public class Profile extends javax.swing.JFrame{

    /**
     * Creates new form Profile
     */
    private ProfileContent profileContent;
    private User user;
    
    public Profile(User user) {
        initComponents();
        this.user = user;
        this.profileContent = new ProfileContent(user);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        renderPosts(jPanel3);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        coverPhoto = new javax.swing.JLabel();
        profilePhoto = new javax.swing.JLabel();
        bioLabel = new javax.swing.JLabel();
        editProfile = new javax.swing.JButton();
        friendsButton = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        coverPhoto.setBackground(new java.awt.Color(153, 153, 153));

        profilePhoto.setBackground(new java.awt.Color(102, 102, 102));

        editProfile.setText("Edit profile");
        editProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileActionPerformed(evt);
            }
        });

        friendsButton.setText("Friends");
        friendsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendsButtonActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coverPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(profilePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editProfile)
                                        .addGap(27, 27, 27)
                                        .addComponent(friendsButton)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coverPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(editProfile)
                                .addComponent(friendsButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileActionPerformed
        new EditProfile(user,this);
        this.setVisible(false);
    }//GEN-LAST:event_editProfileActionPerformed

    private void friendsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friendsButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_friendsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    protected void refresh(){
        if(user.getProfilePhotoPath() != null)
        {
            ImageIcon pfp = new ImageIcon(user.getProfilePhotoPath());
            int pfpWidth = profilePhoto.getWidth();
            int pfpHeight = profilePhoto.getHeight();
            Image scaledPFP = pfp.getImage().getScaledInstance( //scale image to fit label in panel
                    pfpWidth, pfpHeight, Image.SCALE_SMOOTH);
            profilePhoto.setIcon(new ImageIcon(scaledPFP)); //puts the pfp on the label
        } 
        
        if(user.getCoverPhotoPath() != null){
            ImageIcon cvp = new ImageIcon(user.getCoverPhotoPath()); 
            int cvpWidth = coverPhoto.getWidth();
            int cvpHeight = coverPhoto.getHeight();
            Image scaledCVP = cvp.getImage().getScaledInstance( //scale image to fit label in panel
                    cvpWidth, cvpHeight, Image.SCALE_SMOOTH);
            coverPhoto.setIcon(new ImageIcon(scaledCVP)); //puts the cover photo on the label
        }
        
        String bio = user.getBio();
        String name = user.getUsername();
        username.setText(name);
        bioLabel.setText(bio); 
    }
    
    protected void renderPosts(javax.swing.JPanel postsPanel){
        postsPanel.setLayout(new BoxLayout(postsPanel, BoxLayout.Y_AXIS));
        postsPanel.removeAll();
        if(profileContent.userPosts().isEmpty()){
            JLabel noPosts = new JLabel("No posts yet." , SwingConstants.CENTER);
            noPosts.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            postsPanel.add(noPosts, BorderLayout.CENTER);
            postsPanel.revalidate();
            postsPanel.repaint();
            return;
        }
        
        for(Content post : profileContent.userPosts()){
            if(post instanceof Post /*&& user.getUserId() == Integer.parseInt(post.getAuthorid())*/){
                //creats panel for each post
                JPanel singlePost = new JPanel();
                singlePost.setLayout(new BorderLayout());
                singlePost.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                singlePost.setBackground(Color.WHITE);
                
                //sets username 
                JLabel usernameLabel = new JLabel(user.getUsername(), SwingConstants.LEFT);
                usernameLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                singlePost.add(usernameLabel, BorderLayout.NORTH);
                
                //if theres an image for the post itll get set
                if(post.getImage() != null){
                    System.out.println("rendering image");
                    ImageIcon postImage = post.getImage();
                    Image scaledImage = postImage.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
                    JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
                    imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    singlePost.add(imageLabel, BorderLayout.CENTER);
                }
                
                //set the description
                if(post.getText() != null){
                    JLabel descriptionLabel = new JLabel(post.getText());
                    descriptionLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                    //stes position of the description depending if there's an image or not
                    if(post.getImage() == null){
                        singlePost.add(descriptionLabel, BorderLayout.CENTER);
                    }
                    else{
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
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bioLabel;
    private javax.swing.JLabel coverPhoto;
    private javax.swing.JButton editProfile;
    private javax.swing.JButton friendsButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel profilePhoto;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
