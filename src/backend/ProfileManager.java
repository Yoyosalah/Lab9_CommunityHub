/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.List;

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
        
    }
    
    public void updateCoverPhoto(String filePath){
        
    }
    
    public void updateBio(String bio){
        
    }
    
    public void changePassword(String hashedPassword){
        
    }
    
    public ArrayList<Content> userPosts(){
        return new ArrayList<>();
    }
    
    public ArrayList<User> friends(){
        
    }
    
    public void saveUserDetails(){
        
    }
}
