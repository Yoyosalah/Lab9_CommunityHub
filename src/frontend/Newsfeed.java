/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BLU-RAY
 */
public class Newsfeed extends Window {

    //for logout 
    //String email;
    
    public void setEmail(String email) {
       // this.email = email;
        this.exitEmail = email;
    }

    private User user;
    private FriendsManager friendManager;
    private RequestHandler requestHandler;
    private ProfileContent profile;
    private ContentDatabase contentDatabase;
    private ArrayList<Content> contentList;
    private int currentIndex;
    private HashMap<User, String> comboBoxMap;

    public Newsfeed(User user,ContentDatabase contentDatabase) {
        this.user = user;
        this.friendManager = new FriendsManager();
        this.requestHandler = new RequestHandler(friendManager);
        this.profile = new ProfileContent(user, contentDatabase);
        this.comboBoxMap = new HashMap<>();
        this.contentDatabase = contentDatabase;
        this.contentList = contentDatabase.getContentlist();
        this.currentIndex = 0;

        initComponents();

        //setTitle("Newsfeed");
        prepare("Newsfeed");
        displayProfilePicture(); //user's profile pic
        updateComboBox(); //Friends suggestion 
        loadContent(); //loading posts and stories
        displayContent(this.currentIndex);
        fillJTable(); // Fills table with user's friends and their status

        if (!contentList.isEmpty()) {
            displayContent(0); //Display the first content
        }

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Logoutbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AuthorArea = new javax.swing.JLabel();
        dateArea = new javax.swing.JLabel();
        contentTypeArea = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        profilePic = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        photoArea = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JLabel();
        addFriendButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Friends:");

        jButton1.setText("Add Post");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Logoutbtn.setText("Logout");
        Logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutbtnActionPerformed(evt);
            }
        });

        jButton2.setText("Add Story");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Friends", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        AuthorArea.setText("Author");

        dateArea.setText("Date");

        contentTypeArea.setText("type");

        refreshButton.setText("refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        profileButton.setText("Profile");
        profileButton.setBorder(null);
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        profilePic.setText("pic");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Friend Suggestions");

        nextButton.setText("next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        prevButton.setText("prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(textArea);

        addFriendButton.setText("Add Friend");
        addFriendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(prevButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton))
                    .addComponent(photoArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AuthorArea, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(dateArea, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contentTypeArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(refreshButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addFriendButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Logoutbtn))
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(addFriendButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(249, 249, 249))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(contentTypeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(refreshButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(photoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AuthorArea)
                                    .addComponent(dateArea))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prevButton)
                            .addComponent(nextButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Logoutbtn)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String authorid = String.valueOf(user.getUserId());
        AddPost ap = new AddPost(contentList, authorid);
        ap.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String authorid = String.valueOf(user.getUserId());
        AddStory as = new AddStory(contentList, authorid);
        as.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        if (currentIndex > 0) {
            currentIndex--;
            displayContent(currentIndex);
        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (currentIndex < contentList.size() - 1) {
            currentIndex++;
            displayContent(currentIndex);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        this.friendManager = new FriendsManager();
        this.requestHandler = new RequestHandler(friendManager);
        this.profile = new ProfileContent(user, contentDatabase);
        loadContent();
        fillJTable();
        if (!contentList.isEmpty()) {
            currentIndex = 0;
            displayContent(currentIndex);//display first content
        } else //System.out.println("empty list");
        {
            updateComboBox();
        }
        displayProfilePicture();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        // TODO add your handling code here:
        Profile p = new Profile(user, contentDatabase);
        p.setPrevPage(this);
        this.setVisible(false);
    }//GEN-LAST:event_profileButtonActionPerformed

    private void addFriendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriendButtonActionPerformed
        if (jComboBox1.getItemCount() > 0) {
            User selectedUser = getSelectedUser();
            if (selectedUser != null) {
                boolean success = requestHandler.sendFriendRequest(user, selectedUser);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Friend request sent to " + selectedUser.getUsername(), "Success", JOptionPane.INFORMATION_MESSAGE);
                    updateComboBox();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to send friend request. Maybe you're already friends or the request is pending.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a user first.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No users in the list.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addFriendButtonActionPerformed

    private void LogoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutbtnActionPerformed
        // TODO add your handling code here:
        contentDatabase.writeToFile();
        UserOperations.logout(exitEmail);
        //send to the next page
        LandingPage nextPage = new LandingPage();

        this.dispose();


    }//GEN-LAST:event_LogoutbtnActionPerformed

    private void displayContent(int index) {
        textArea.setText(""); // Clear text area
        AuthorArea.setText(""); // Clear author area
        dateArea.setText(""); // Clear date area
        photoArea.setIcon(null); // Clear image in photo area
        contentTypeArea.setText(""); // Clear content type area
        if (index >= 0 && index < contentList.size()) {
            Content content = contentList.get(index);
            textArea.setText(content.getText());
            AuthorArea.setText("Author: " + content.getAuthorid());
            dateArea.setText("Date: " + content.getTimestamp().toString());

            if (content.getImage() != null) {
                ImageIcon originalImage = content.getImage();
                Image image = originalImage.getImage();
                Image scaledImage = image.getScaledInstance(photoArea.getWidth(), photoArea.getHeight(), Image.SCALE_SMOOTH); // Scale image
                ImageIcon scaledIcon = new ImageIcon(scaledImage);//rescaling the image according to the jlabel size
                photoArea.setIcon(scaledIcon);
            } else {
                photoArea.setIcon(null);//if it doesn't exist
            }
            if (content instanceof Story) { // check if content story or post
                contentTypeArea.setText("Story");
            } else if (content instanceof Post) {
                contentTypeArea.setText("Post");
            }
        }
    }

    private void loadContent() {
        ArrayList<Content> allContent = contentDatabase.getContentlist();
        ArrayList<Content> filteredContent = new ArrayList<>();
        ArrayList<User> friends = (ArrayList<User>) friendManager.getFriendsConverted().get(user);

//        if (contentList != null) {
//            contentList.clear();
//        } else {
//            contentList = new ArrayList<>();
//        }
        for (Content c : allContent) {
            for (User f : friends) {
                if (String.valueOf(f.getUserId()).equals(c.getAuthorid())) {
                    filteredContent.add(c);
                }
            }
        }
        contentList.addAll(filteredContent);
        currentIndex = 0;
    }

    private void displayProfilePicture() {//display users profile picture and resizing it to fit the jlabel
        profilePic.setIcon(null);
        
        String profilePicPath = user.getProfilePhotoPath();

        if (profilePicPath != null && !profilePicPath.isEmpty()) {
            ImageIcon originalIcon = new ImageIcon(profilePicPath);
            Image originalImage = originalIcon.getImage();

            Image resizedImage = originalImage.getScaledInstance(profilePic.getWidth(), profilePic.getHeight(), Image.SCALE_SMOOTH);
            profilePic.setIcon(new ImageIcon(resizedImage));
        } else {
            profilePic.setIcon(null);
        }
    }

    private void updateComboBox() {
        List<User> suggestions = friendManager.friendSuggestions(user, UserDatabase.getInstance().returnAllUsers());
        comboBoxMap.clear();
        jComboBox1.removeAllItems();

        for (User suggestion : suggestions) {
            comboBoxMap.put(suggestion, suggestion.getUsername());
            jComboBox1.addItem(suggestion.getUsername());
        }
    }

    private void fillJTable() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setRowCount(0);//empty table first
        tableModel.addColumn("Username");
        tableModel.addColumn("Status");

        List<User> friends = friendManager.getFriendsConverted().get(user);

        for (User friend : friends) {
            tableModel.addRow(new Object[]{friend.getUsername(), friend.getStatus()});
        }
        jTable1.setModel(tableModel);
    }

    private User getSelectedUser() {
        String selectedUsername = (String) jComboBox1.getSelectedItem();
        for (Map.Entry<User, String> entry : comboBoxMap.entrySet()) {
            if (entry.getValue().equals(selectedUsername)) {
                return entry.getKey();
            }
        }
        return null; // No match found
    }

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
            java.util.logging.Logger.getLogger(Newsfeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Newsfeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Newsfeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Newsfeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Newsfeed(new User(),new ContentDatabase()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorArea;
    private javax.swing.JButton Logoutbtn;
    private javax.swing.JButton addFriendButton;
    private javax.swing.JLabel contentTypeArea;
    private javax.swing.JLabel dateArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel photoArea;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton profileButton;
    private javax.swing.JLabel profilePic;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel textArea;
    // End of variables declaration//GEN-END:variables
}
