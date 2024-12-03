/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.List;
import javax.swing.JFileChooser;

/**
 *
 * @author Mustafa
 */
public class ProfileManager {
    private User user;
    
    public ProfileManager(User user){
        this.user = user;
    }
    
    public void updateProfilePhoto(String filePath){ 
        
        user.setProfilePhotoPath(filePath);
    }
    
    public void updateCoverPhoto(String filePath){
        
        user.setCoverPhotoPath(filePath);
    }
    
    public void updateBio(String bio){
        user.setBio(bio);
    }
    
    public void changePassword(String hashedPassword){
        user.setHashedPassword(hashedPassword);
    }
    
 /*   public List<Post> userPosts(){
        
    }
    
    public List<User> friends(){
        
    }*/
    
    public void saveUserDetails(){
        
    }
}
