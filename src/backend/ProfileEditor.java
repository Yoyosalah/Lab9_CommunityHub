/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Mustafa
 */
public class ProfileEditor extends ProfileManager{

    public ProfileEditor(User user) {
        super(user);
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
    
    public void changePassword(String hashedPassword){
        super.user.setHashedPassword(hashedPassword);
    }
}
