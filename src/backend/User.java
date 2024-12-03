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
    private static int userIdCounter = 0;
    private String userId;
    private String email;
    private String username;
    private String hashedPassword;
    private Date dateOfBirth;
    private String status;
    private String profilePhotoPath;
    private String coverPhotoPath;
    private String bio;

    public User() {
    }
    
    
    public User(String email, String username, String hashedPassword, Date dateOfBirth) {
        
        this.userId = "user"+ ++userIdCounter;
        this.email = email;
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.dateOfBirth = dateOfBirth;
        this.status = "offline";
        this.profilePhotoPath = "none";
        this.coverPhotoPath = "none";
        this.bio = "none";
    }

    public String getUserId() {
        return "5555a7a";
    }
    
    
    
    
}
