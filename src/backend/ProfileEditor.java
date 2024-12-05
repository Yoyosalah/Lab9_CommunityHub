/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Mustafa
 */
public class ProfileEditor extends ProfileManager{

    private static final UserDatabase database = new UserDatabase();
    public ProfileEditor(User user) {
        super(user);
    }
    
    public void updateProfilePhoto(){ 
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
            user.setProfilePhotoPath(path); //updates the profile photo
        }
        else
            JOptionPane.showInternalMessageDialog(null,"No image has been selected" , "Error", JOptionPane.ERROR_MESSAGE);

    }
    
    public void updateCoverPhoto(){
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
            user.setCoverPhotoPath(path); //updates the profile photo
        }
        else
            JOptionPane.showInternalMessageDialog(null,"No image has been selected" , "Error", JOptionPane.ERROR_MESSAGE);

    }
    
    public void updateBio(String bio){
        user.setBio(bio);
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
        database.saveToFile();
    }
}
