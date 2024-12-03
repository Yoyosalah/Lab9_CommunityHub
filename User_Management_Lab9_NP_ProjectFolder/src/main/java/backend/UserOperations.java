/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.time.LocalDate;

/**
 *
 * @author mikel
 */
public class UserOperations {

    private final UserDatabase databaseManager;

    public UserOperations() {
        this.databaseManager = new UserDatabase();
    }

    public boolean signUp(String email, String username, String password, String dateOfBirth) {
        if (databaseManager.containsUserByEmail(email)) {
            System.out.println("Email already exists!");
            return false;
        }

        if (databaseManager.containsUserByUsername(username)) {
            System.out.println("Username already exists!");
            return false;
        }

        if (!UserSecurity.isValidEmail(email)) {
            System.out.println("Invalid email format!");
            return false;
        }
        
        if (!UserSecurity.isValidDate(dateOfBirth)) {
            System.out.println("Invalid date of birth format!");
            return false;
        }

        String hashedPassword = UserSecurity.hashPassword(password);
        User newUser = new User(
                email,
                username,
                hashedPassword,
                LocalDate.parse(dateOfBirth),
                "offline"
        );
        databaseManager.insertUser(newUser);
        System.out.println("User signed up successfully!");
        return true;
    }

    public boolean login(String email, String password) {
        User user = databaseManager.getUserByEmail(email);
        if (user == null) {
            System.out.println("Email not found!");
            return false;
        }

        if (!UserSecurity.verifyPassword(password, user.getPassword())) {
            System.out.println("Incorrect password!");
            return false;
        }

        user.setStatus("online");
        databaseManager.saveToFile();
        System.out.println("User logged in successfully!");
        return true;
    }

    public void logout(String email) {
        User user = databaseManager.getUserByEmail(email);
        if (user != null) {
            user.setStatus("offline");
            databaseManager.saveToFile();
            System.out.println("User logged out successfully!");
        }
    }
}
