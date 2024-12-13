/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.ContentDatabase;
import backend.Group;
import backend.GroupDatabase;
import backend.User;
import backend.UserDatabase;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Youss
 */
public class GroupsSearch extends Window {

    /**
     * Creates new form FriendManager
     */
    private Window prevPage;

    public void setPrevPage(Window prevPage) {
        this.prevPage = prevPage;
    }

    public void setEmail(String email) {
        this.exitEmail = email;
    }

    private UserDatabase userDatabase = UserDatabase.getInstance();

    private ContentDatabase contentDatabase = new ContentDatabase();

    // private List<User> allUsers;
    private User user;
    Group selectedGroup = null;

    public GroupsSearch(User user, List<User> allUsers) {
        setEmail(user.getEmail());
        initComponents();
        prepare("Search Groups");
        this.user = user;
        this.JoinButton.setVisible(false);
        this.LeaveButton.setVisible(true);

        this.searchBar.setVisible(false);
        this.jScrollPane1.setVisible(false);

        this.SelectedUserTxt.setVisible(false);
        this.infoPanel.setVisible(false);
        this.ViewGroupbtn.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        profilePic = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        JoinButton = new javax.swing.JButton();
        LeaveButton = new javax.swing.JButton();
        RefreshBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchOutput = new javax.swing.JList<>();
        Back = new javax.swing.JButton();
        SelectedUserTxt = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        dateOfBirth = new javax.swing.JLabel();
        bio = new javax.swing.JLabel();
        statusInfo = new javax.swing.JLabel();
        ViewGroupbtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        JoinButton.setText("Join");
        JoinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinButtonActionPerformed(evt);
            }
        });

        LeaveButton.setText("Leave");
        LeaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveButtonActionPerformed(evt);
            }
        });

        RefreshBTN.setText("Refresh");
        RefreshBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBTNActionPerformed(evt);
            }
        });

        SearchOutput.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        SearchOutput.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SearchOutputValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(SearchOutput);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        SelectedUserTxt.setText("Selected User: ");

        infoPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Info:");

        email.setText("Email: ");

        mobile.setText("Mobile:");

        Gender.setText("Gender:");

        dateOfBirth.setText("Birthday:");

        bio.setText("Bio:");

        statusInfo.setText("Status:");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email)
                            .addComponent(mobile)
                            .addComponent(Gender)
                            .addComponent(dateOfBirth)
                            .addComponent(bio)
                            .addComponent(statusInfo)))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateOfBirth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ViewGroupbtn.setText("View Group");
        ViewGroupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewGroupbtnActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SelectedUserTxt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ViewGroupbtn))
                                    .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(RefreshBTN)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(JoinButton, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(LeaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15)))
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JoinButton, LeaveButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JoinButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LeaveButton)))
                        .addGap(271, 271, 271)
                        .addComponent(Back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectedUserTxt)
                            .addComponent(ViewGroupbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(RefreshBTN)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JoinButton, LeaveButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewGroupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewGroupbtnActionPerformed
        // TODO add your handling code here:
//        Profile p = new Profile(selectedGroup, contentDatabase);
//        p.setPrevPage(this);
//        this.setVisible(false);
    }//GEN-LAST:event_ViewGroupbtnActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        prevPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void SearchOutputValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SearchOutputValueChanged
        // TODO add your handling code here:
        String selectedUsername = SearchOutput.getSelectedValue();

        if (selectedUsername != null && !selectedUsername.isEmpty()) {
            // set the search bar text
            searchBar.setText(selectedUsername);

            ArrayList<User> allUsers = userDatabase.returnAllUsers();
            selectedGroup = null;

            for (User user : allUsers) {
                if (user.getUsername().equals(selectedUsername)) {
                    selectedGroup = user;
                    break;
                }
            }
            SelectedUserTxt.setText("Selected User: " + selectedGroup.getUsername());
            email.setText("Email: " + selectedGroup.getEmail());
            mobile.setText("Mobile: " + selectedGroup.getMobileNumber());
            Gender.setText("Gender: " + selectedGroup.getGender());
            dateOfBirth.setText("Birthday: " + selectedGroup.getDateOfBirth());
            statusInfo.setText("Status: " + selectedGroup.getStatus());

            if (selectedGroup.getBio() != null) {
                bio.setText("Bio: " + selectedGroup.getBio());
                bio.setVisible(true);
            } else {
                bio.setVisible(false);
            }

            //profille pic
            String profilePhotoPath = selectedGroup.getProfilePhotoPath();
            ImageIcon originalIcon = new ImageIcon(profilePhotoPath);
            Image scaledImage = originalIcon.getImage().getScaledInstance(profilePic.getWidth(), profilePic.getHeight(), Image.SCALE_SMOOTH);
            profilePic.setIcon(new ImageIcon(scaledImage));

            this.infoPanel.setVisible(true);

            // Check if the selected user is a friend
            if (selectedGroup != null && !friendsManager.areFriends(user.getUserId(), selectedGroup.getUserId())) {
                this.JoinButton.setVisible(true);
                this.LeaveButton.setVisible(false);

            } else {
                this.JoinButton.setVisible(false);
                this.LeaveButton.setVisible(true);
            }
        }
    }//GEN-LAST:event_SearchOutputValueChanged

    private void RefreshBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBTNActionPerformed
        // TODO add your handling code here:

        this.jScrollPane1.setVisible(true);
        this.SelectedUserTxt.setVisible(true);
        this.ViewGroupbtn.setVisible(true);
        this.infoPanel.setVisible(false);
        this.searchBar.setVisible(true);
        this.SearchOutput.setVisible(true);
        this.SearchOutput.setListData(new String[0]);
        this.searchBar.setText("");

        this.LeaveButton.setVisible(false);
    }//GEN-LAST:event_RefreshBTNActionPerformed

    private void LeaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaveButtonActionPerformed
//        if (SearchOutput.getModel().getSize() > 0) {
//
//            if (selectedGroup != null) {
//                blockHandler.removeFriend(user, selectedGroup);
//                JOptionPane.showMessageDialog(this, "You are no longer friends with " + selectedGroup.getUsername(), "Success", JOptionPane.INFORMATION_MESSAGE);
//
//            } else {
//                JOptionPane.showMessageDialog(this, "Please select a user first.", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "No Users in List", "Error", JOptionPane.ERROR_MESSAGE);
//        }

    }//GEN-LAST:event_LeaveButtonActionPerformed

    private void JoinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinButtonActionPerformed
//        if (SearchOutput.getModel().getSize() > 0) {
//
//            if (selectedGroup != null) {
//                boolean success = requestHandler.sendFriendRequest(user, selectedGroup);
//                if (success) {
//                    JOptionPane.showMessageDialog(this, "Friend request sent to " + selectedGroup.getUsername(), "Success", JOptionPane.INFORMATION_MESSAGE);
//
//                } else {
//                    JOptionPane.showMessageDialog(this, "Failed to send friend request. Maybe you're already friends or the request is pending.", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Please select a user first.", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "No users in the list.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_JoinButtonActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        // TODO add your handling code here:

        String searchKey = searchBar.getText().trim();
        if (searchKey.isEmpty()) {
            this.SearchOutput.setListData(new String[0]);
            this.JoinButton.setVisible(false);
            this.LeaveButton.setVisible(false);

            return;
        }
        // get all users to be filtered based on the search key
        GroupDatabase groupDatabase = GroupDatabase.getInstance();
        ArrayList<Group> allGroups = groupDatabase.getGroupsList();
        ArrayList<String> filteredGroups = new ArrayList<>();

        // filteration
        for (Group group : allGroups) {
            if (group.getName().toLowerCase().contains(searchKey.toLowerCase())) {
                filteredGroups.add(group.getName());
            }
        }

        //add filtred users
        this.SearchOutput.setListData(filteredGroups.toArray(new String[0]));

        // if there is one result, you can automatically select it
        if (filteredGroups.size() == 1) {
            searchBar.setText(filteredGroups.get(0));
            selectGroupByName(filteredGroups.get(0), allGroups);

//            for (User user : allUsers) {
//                if (user.getUsername().equals(filteredGroups.get(0))) {
//                    selectedGroup = user;
//                    break;
//                }
//            }
//            SelectedUserTxt.setText("Selected User: " + selectedGroup.getUsername());
//            email.setText("Email: " + selectedGroup.getEmail());
//            mobile.setText("Mobile: " + selectedGroup.getMobileNumber());
//            Gender.setText("Gender: " + selectedGroup.getGender());
//            dateOfBirth.setText("Birthday: " + selectedGroup.getDateOfBirth());
//            statusInfo.setText("Status: " + selectedGroup.getStatus());
//
//            if (selectedGroup.getBio() != null) {
//                bio.setText("Bio: " + selectedGroup.getBio());
//                bio.setVisible(true);
//
//            } else {
//                bio.setVisible(false);
//            }

//            //profile pic
//            String profilePhotoPath = selectedGroup.getProfilePhotoPath();
//            ImageIcon originalIcon = new ImageIcon(profilePhotoPath);
//            Image scaledImage = originalIcon.getImage().getScaledInstance(profilePic.getWidth(), profilePic.getHeight(), Image.SCALE_SMOOTH);
//            profilePic.setIcon(new ImageIcon(scaledImage));
//
//            this.infoPanel.setVisible(true);

            // Show buttons based on membership status
            if (!selectedGroup.getMembers().contains(user.getUserId())) {
                this.JoinButton.setVisible(true);
                this.LeaveButton.setVisible(false);
            } else {
                this.JoinButton.setVisible(false);
                this.LeaveButton.setVisible(true);
            }

        }
    }//GEN-LAST:event_searchBarKeyReleased
    private void selectGroupByName(String groupName, ArrayList<Group> allGroups) {
        for (Group group : allGroups) {
            if (group.getName().equals(groupName)) {
                // Simulate selection
                SearchOutput.setSelectedValue(groupName, true);
                break;
            }
        }
    }



    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Gender;
    private javax.swing.JButton JoinButton;
    private javax.swing.JButton LeaveButton;
    private javax.swing.JButton RefreshBTN;
    private javax.swing.JList<String> SearchOutput;
    private javax.swing.JLabel SelectedUserTxt;
    private javax.swing.JButton ViewGroupbtn;
    private javax.swing.JLabel bio;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JLabel email;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel profilePic;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel statusInfo;
    // End of variables declaration//GEN-END:variables
}
