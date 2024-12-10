/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.BlockHandler;
import backend.FriendsManager;
import backend.RequestHandler;
import backend.User;
import java.awt.Image;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Youss
 */
public class FriendManagerGUI extends javax.swing.JFrame {

    /**
     * Creates new form FriendManager
     */
    private FriendsManager friendsManager = new FriendsManager();
    private RequestHandler requestHandler = new RequestHandler(friendsManager);
    private BlockHandler blockHandler = new BlockHandler(friendsManager);
    private List<User> allUsers;
    private User user;
    private HashMap<User,String> comboBoxMap;
    
    public FriendManagerGUI(User user , List<User> allUsers) {
        this.setVisible(true);
        this.comboBoxMap = new HashMap<>();
        initComponents();
        this.user = user;
        this.allUsers = allUsers;
        updateComboBox(friendsManager.getFriendsConverted().get(user));
        this.addButton.setVisible(false);
        this.acceptButton.setVisible(false);
        this.declineButton.setVisible(false);
        this.unFriendButton.setVisible(true);
        this.blockButton.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        friendsButton = new javax.swing.JButton();
        suggestionsButton = new javax.swing.JButton();
        profilePic = new javax.swing.JLabel();
        requestsButton = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        blockButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        acceptButton = new javax.swing.JButton();
        declineButton = new javax.swing.JButton();
        unFriendButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        friendsButton.setText("Friends");
        friendsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendsButtonActionPerformed(evt);
            }
        });

        suggestionsButton.setText("Suggestions");
        suggestionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suggestionsButtonActionPerformed(evt);
            }
        });

        profilePic.setText("profilePic");

        requestsButton.setText("Requests");
        requestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestsButtonActionPerformed(evt);
            }
        });

        status.setText("status");

        jLabel3.setText("Select User");

        blockButton.setText("Block");
        blockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        acceptButton.setText("Accept");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        declineButton.setText("Decline");
        declineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineButtonActionPerformed(evt);
            }
        });

        unFriendButton.setText("UnFriend");
        unFriendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unFriendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(friendsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suggestionsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(requestsButton))
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profilePic, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(acceptButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addComponent(declineButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unFriendButton))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(friendsButton)
                            .addComponent(suggestionsButton)
                            .addComponent(requestsButton))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acceptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(declineButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unFriendButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blockButton)
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void friendsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friendsButtonActionPerformed
       List<User> friends =  friendsManager.getFriendsConverted().get(user);
        updateComboBox(friends);
        this.addButton.setVisible(false);
        this.acceptButton.setVisible(false);
        this.declineButton.setVisible(false);
        this.unFriendButton.setVisible(true);
        this.blockButton.setVisible(true);
    }//GEN-LAST:event_friendsButtonActionPerformed

    private void requestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestsButtonActionPerformed
        List<User> requests = friendsManager.getReceivedRequestsConverted().get(user);
        System.out.println(requests);
        updateComboBox(requests);
        this.addButton.setVisible(false);
        this.acceptButton.setVisible(true);
        this.declineButton.setVisible(true);
        this.unFriendButton.setVisible(false);
        this.blockButton.setVisible(true);
    }//GEN-LAST:event_requestsButtonActionPerformed

    private void blockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockButtonActionPerformed
        if (jComboBox1.getItemCount() != 0){
            blockHandler.blockUser(user,getSelectedUser());
        }else {
            JOptionPane.showMessageDialog(this, "No Users in List","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_blockButtonActionPerformed

    private void suggestionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suggestionsButtonActionPerformed
        List<User> suggestions = friendsManager.friendSuggestions(user, allUsers);
        updateComboBox(suggestions);
        this.addButton.setVisible(true);
        this.acceptButton.setVisible(true);
        this.declineButton.setVisible(true);
        this.unFriendButton.setVisible(false);
        this.blockButton.setVisible(true);
    }//GEN-LAST:event_suggestionsButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        User selectedUser = getSelectedUser();
        if (selectedUser != null) {
            String profilePhotoPath = selectedUser.getProfilePhotoPath();
            ImageIcon originalIcon = new ImageIcon(profilePhotoPath);
            Image scaledImage = originalIcon.getImage().getScaledInstance(profilePic.getWidth(), profilePic.getHeight(), Image.SCALE_SMOOTH);
            profilePic.setIcon(new ImageIcon(scaledImage));
            status.setText(selectedUser.getStatus());
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (jComboBox1.getItemCount() > 0) {
            User selectedUser = getSelectedUser();
            if (selectedUser != null) {
                boolean success = requestHandler.sendFriendRequest(user, selectedUser);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Friend request sent to " + selectedUser.getUsername(), "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to send friend request. Maybe you're already friends or the request is pending.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a user first.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No users in the list.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        if (jComboBox1.getItemCount() > 0) {
            User selectedUser = getSelectedUser();
            if (selectedUser != null) {
                boolean success = requestHandler.acceptFriendRequest(user, selectedUser);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Friend request from " + selectedUser.getUsername()+ " accepted.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to accept the friend request. It might not exist anymore.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a user first.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No friend requests to accept.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void declineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineButtonActionPerformed
        if (jComboBox1.getItemCount() > 0) {
            User selectedUser = getSelectedUser();
            if (selectedUser != null) {
                boolean success = requestHandler.declineFriendRequest(user, selectedUser);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Friend request from " + selectedUser.getUsername()+ " declined.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to decline the friend request. It might not exist anymore.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a user first.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No friend requests to decline.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_declineButtonActionPerformed

    private void unFriendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unFriendButtonActionPerformed
        if (jComboBox1.getItemCount() != 0) {
            User selectedUser = getSelectedUser();
            if (selectedUser != null) {
                blockHandler.removeFriend(user, selectedUser);
                JOptionPane.showMessageDialog(this, "You are no longer friends with " + selectedUser.getUsername(), "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a user first.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No Users in List", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_unFriendButtonActionPerformed
    
    private User getSelectedUser(){
        String selectedUsername = (String) jComboBox1.getSelectedItem();
        for (Map.Entry<User, String> entry : comboBoxMap.entrySet()) {
            if (entry.getValue().equals(selectedUsername)) {
                return entry.getKey();
            }
        }
        return null; // No match found
    }
    
    private void updateComboBox(List<User> users) {
        comboBoxMap.clear();
        jComboBox1.removeAllItems();
        for (User user : users) {
            comboBoxMap.put(user, user.getUsername());
            jComboBox1.addItem(user.getUsername());
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FriendManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FriendManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FriendManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FriendManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FriendManagerGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton blockButton;
    private javax.swing.JButton declineButton;
    private javax.swing.JButton friendsButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel profilePic;
    private javax.swing.JButton requestsButton;
    private javax.swing.JLabel status;
    private javax.swing.JButton suggestionsButton;
    private javax.swing.JButton unFriendButton;
    // End of variables declaration//GEN-END:variables
}
