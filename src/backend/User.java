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
    private final String userId;
    private final String email;
    private final String username;
    private String hashedPassword;
    private final Date dateOfBirth;
    private String status;
    private String profilePhotoPath;
    private String coverPhotoPath;
    private String bio;

    // Constructor ... ADD: could add later builder design pattern
    public User(String email, String username, String hashedPassword, Date dateOfBirth) {
        this.userId = "user" + ++userIdCounter;
        this.email = email;
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.dateOfBirth = dateOfBirth;
        this.status = "offline";
        this.profilePhotoPath = "none";
        this.coverPhotoPath = "none";
        this.bio = "none";
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getStatus() {
        return status;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // Setters
    public void setStatus(String status) {
        this.status = status;
    }

    public void setProfilePhotoPath(String profilePhotoPath) {
        this.profilePhotoPath = profilePhotoPath;
    }

    public void setCoverPhotoPath(String coverPhotoPath) {
        this.coverPhotoPath = coverPhotoPath;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}

