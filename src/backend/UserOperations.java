/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author mikel
 */
public class UserOperations {

    protected static final UserDatabase databaseManager = new UserDatabase();

    ;



    public static boolean signUp(String email, String username, String password, LocalDate dateOfBirth, String mobileNumber, String gender) {
        if (!UserSecurity.isValidEmail(email)) {
//            System.out.println("Invalid email format!");

            JOptionPane.showMessageDialog(
                    null, // to center the message
                    "Invalid email format!",
                    "Warning",
                    JOptionPane.ERROR_MESSAGE
            );

            return false;
        }

        if (databaseManager.containsUserByEmail(email)) {
            //System.out.println("Email already exists!");

            JOptionPane.showMessageDialog(
                    null, // to center the message
                    "Email already exists!",
                    "Warning",
                    JOptionPane.ERROR_MESSAGE
            );

            return false;
        }

        if (databaseManager.containsUserByUsername(username)) {
//            System.out.println("Username already exists!");

            JOptionPane.showMessageDialog(
                    null, // to center the message
                    "Username already exists!",
                    "Warning",
                    JOptionPane.ERROR_MESSAGE
            );

            return false;
        }

        if (!UserSecurity.isValidDate(dateOfBirth)) {
//            System.out.println("Invalid date of birth format!");
            JOptionPane.showMessageDialog(
                    null, // to center the message
                    "Invalid date of birth format!",
                    "Warning",
                    JOptionPane.ERROR_MESSAGE
            );

            return false;
        }

        if (!UserSecurity.isNum(mobileNumber)) {
//            System.out.println("Invalid number!");
            JOptionPane.showMessageDialog(
                    null, // to center the message
                    "Invalid number!",
                    "Warning",
                    JOptionPane.ERROR_MESSAGE
            );

            return false;
        }
        String hashedPassword = UserSecurity.hashPassword(password);
        User newUser = new User(
                email,
                username,
                hashedPassword,
                dateOfBirth,
                "offline",
                mobileNumber,
                gender
        );
        System.out.println(dateOfBirth);

        databaseManager.insertUser(newUser);
//        System.out.println("User signed up successfully!");
        JOptionPane.showMessageDialog(
                null, // to center the message
                "User signed up successfully!",
                "Success",
                JOptionPane.INFORMATION_MESSAGE
        );

        return true;
    }

    public static boolean login(String email, String password) {
        User user = databaseManager.getUserByEmail(email);

        if (!UserSecurity.isValidEmail(email)) {
//            System.out.println("Invalid email format!");

            JOptionPane.showMessageDialog(
                    null, // to center the message
                    "Invalid email format!",
                    "Warning",
                    JOptionPane.ERROR_MESSAGE
            );

            return false;
        }

        if (user == null) {
//            System.out.println("Email not found!");
            JOptionPane.showMessageDialog(
                    null, // to center the message
                    "Email not found!",
                    "Warning",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }

        if (!UserSecurity.verifyPassword(password, user.getPassword())) {
//            System.out.println("Incorrect password!");
            JOptionPane.showMessageDialog(
                    null, // to center the message
                    "Incorrect password!",
                    "Warning",
                    JOptionPane.ERROR_MESSAGE
            );

            return false;
        }

        user.setStatus("online");
        databaseManager.saveToFile();
//        System.out.println("User logged in successfully!");
        JOptionPane.showMessageDialog(
                null, // to center the message
                "User logged in successfully!",
                "Success",
                JOptionPane.INFORMATION_MESSAGE
        );

        return true;
    }

    public static void logout(String email) {
        User user = databaseManager.getUserByEmail(email);
        if (user != null) {
            user.setStatus("offline");
            databaseManager.saveToFile();
//            System.out.println("User logged out successfully!");
            JOptionPane.showMessageDialog(
                    null, // to center the message
                    "User logged out successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

        }
    }
}
