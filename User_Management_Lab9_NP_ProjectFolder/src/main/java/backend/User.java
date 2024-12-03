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

    @JsonFormat(pattern = "yyyy-MM-dd") //used to specify how Jackson should serialize and deserialize the dateOfBirth
    private LocalDate dateOfBirth;
    private String status;

    public User() {
        // default constructor required for Jackson library 
    }

    public User(String email, String username, String password, LocalDate dateOfBirth, String status) {
        this.userId = getUsersNum();
        this.email = email;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
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

    public void setStatus(String status) {
        this.status = status;
    }
}
    