/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.Date;

/**
 *
 * @author Youss
 */
public class User {
    static int userIdCounter = 0;
    String userId;
    String email;
    String username;
    String hashedPassword;
    Date dateOfBirth;
    String status;
    String profilePhotoPath;
    String coverPhotoPath;
    String bio;
    
    
    public User(String email, String username, String hashedPassword, Date dateOfBirth, String status, String profilePhotoPath, String coverPhotoPath, String bio) {
        
        this.userId = userId;
        this.email = email;
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
        this.profilePhotoPath = profilePhotoPath;
        this.coverPhotoPath = coverPhotoPath;
        this.bio = bio;
    }
    
    
    
}
