/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import static constants.PlatformStatistics.getUsersNum;
import static constants.PlatformStatistics.incrementUsers;

/**
 *
 * @author mikel
 */
public class User {

    private int userId;
    private String email;
    private String username;
    private String password;
    private String MobileNumbe;
    private String gender;

    //set the following by setters not constructors
    private String profilePhotoPath;
    private String coverPhotoPath;
    private String bio;

    @JsonFormat(pattern = "yyyy-MM-dd") //used to specify how Jackson should serialize and deserialize the dateOfBirth
    private LocalDate dateOfBirth;
    private String status;

    public User() {
        // default constructor required for Jackson library 
    }

    public User(String email, String username, String password, LocalDate dateOfBirth, String status, String MobileNumbe, String gender) {
        this.userId = getUsersNum();
        this.email = email;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
        this.MobileNumbe = MobileNumbe;
        this.gender = gender;
        incrementUsers();
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStatus() {
        return status;
    }

    public String getMobileNumbe() {
        return MobileNumbe;
    }

    public String getGender() {
        return gender;
    }

    public String getProfilePhotoPath() {
        return profilePhotoPath;
    }

    public String getCoverPhotoPath() {
        return coverPhotoPath;
    }

    public String getBio() {
        return bio;
    }

    
    
    public void setStatus(String status) {
        this.status = status;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobileNumbe(String MobileNumbe) {
        this.MobileNumbe = MobileNumbe;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
}
