/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import static constants.PlatformStatistics.*;

/**
 *
 * @author mikel
 */
public class User {

    private int userId;
    private String email;
    private String username;
    private String password;
    private String mobileNumber;
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



    //applying Builder Design Pattern:
    private User(Builder builder) {
        this.userId = builder.userId;
        this.email = builder.email;
        this.username = builder.username;
        this.password = builder.password;
        this.mobileNumber = builder.mobileNumber;
        this.gender = builder.gender;
        this.dateOfBirth = builder.dateOfBirth;
        this.status = builder.status;

        this.profilePhotoPath = builder.profilePhotoPath;
        this.coverPhotoPath = builder.coverPhotoPath;
        this.bio = builder.bio;
    }

    public static class Builder {

        private int userId;
        private String email;
        private String username;
        private String password;
        private String mobileNumber;
        private String gender;
        private LocalDate dateOfBirth;
        private String status;

        private String profilePhotoPath;
        private String coverPhotoPath;
        private String bio;

        public Builder() {
            this.userId = getUsersNum(); // give unique Id
            incrementUsers(); // increase user count
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder profilePhotoPath(String profilePhotoPath) {
            this.profilePhotoPath = profilePhotoPath;
            return this;
        }

        public Builder coverPhotoPath(String coverPhotoPath) {
            this.coverPhotoPath = coverPhotoPath;
            return this;
        }

        public Builder bio(String bio) {
            this.bio = bio;
            return this;
        }

        public User build() {
            return new User(this);
        }
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

    public String getMobileNumber() {
        return mobileNumber;
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

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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