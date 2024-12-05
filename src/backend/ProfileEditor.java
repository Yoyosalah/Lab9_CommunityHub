/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import javax.swing.JOptionPane;

/**
 *
 * @author Mustafa
 */
public class ProfileEditor extends ProfileManager{

    private UserDatabase database;
    
    public ProfileEditor(User user ,UserDatabase database) {
        super(user);
        this.database = database;
    }
    
    public void updateProfilePhoto(String filePath){ 
        
        super.user.setProfilePhotoPath(filePath);
    }
    
    public void updateCoverPhoto(String filePath){
        
        super.user.setCoverPhotoPath(filePath);
    }
    
    public void updateBio(String bio){
        super.user.setBio(bio);
    }
    
    public void changePassword(){
        String oldPassword = JOptionPane.showInputDialog(null, "Enter your password:", "Change password", JOptionPane.PLAIN_MESSAGE); //takes old password to change it
        if(UserSecurity.verifyPassword(oldPassword, user.getPassword())){ 
            String newPassword = JOptionPane.showInputDialog(null, "Enter your new password:", "Change password", JOptionPane.PLAIN_MESSAGE);
            //hash newPassword
            String hashedNewPassword = UserSecurity.hashPassword(newPassword);
            user.setPassword(hashedNewPassword);
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect password", "Change password", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void saveUserChanges(){
        database.deleteUserByEmail(user.getEmail());
        database.insertUser(user);
    }
}
