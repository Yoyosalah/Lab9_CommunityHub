/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import org.apache.commons.codec.digest.DigestUtils;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.AddressException;

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
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

    public static boolean isValidDate(String date) {
        try {
            LocalDate parsedDate = LocalDate.parse(date);
            return parsedDate.isBefore(LocalDate.now()); //to check if it's earlier than today
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean isInt(String str) {
        if (str == null || str.isEmpty()) {
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
