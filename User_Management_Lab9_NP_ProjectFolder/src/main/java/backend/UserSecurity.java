/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.time.LocalDate;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author mikel
 */
public class UserSecurity {

    public static String hashPassword(String password) {
        return DigestUtils.sha256Hex(password);   // Uses SHA-256
    }

    public static boolean verifyPassword(String password, String hashedPassword) {
        String hashedInput = hashPassword(password);
        return hashedInput.equals(hashedPassword);
    }

    public static boolean isValidEmail(String email) {
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);
    }

    public static boolean isValidDate(LocalDate date) {
        return date.isBefore(LocalDate.now()); //to check if it's earlier than today
    }

    public static boolean isNum(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.length() != 11) {
            return false;
        }

        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
