/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import static constants.FileNames.USERS_FILENAME;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mikel
 */

public class UserDatabase {

    private ArrayList<User> users;
    private final String filename = USERS_FILENAME;
    private static final ObjectMapper objectMapper = new ObjectMapper(); //used for for JSON serialization and deserialization

    public UserDatabase() {
        this.users = new ArrayList<User>();
        readFromFile();
    }

    private void readFromFile() {
        try {
            File file = new File(filename);
            if (file.exists()) {
                users = objectMapper.readValue(file, new TypeReference<ArrayList<User>>() {
                }); // the TypeReference gives Jackson the generic type of the list to help it in the deserialize 

            }
        } catch (IOException e) {
        }
    }

    public void saveToFile() {
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), users);
        } catch (IOException e) {
        }
    }

    public ArrayList<User> returnAllUsers() {
        return users;
    }

    public boolean containsUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void insertUser(User user) {
        if (!containsUserByEmail(user.getEmail()) && !containsUserByUsername(user.getUsername())) {
            users.add(user);
            saveToFile();
        }
    }

    public void deleteUserByEmail(String email) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(email)) {
                users.remove(i);
                saveToFile();
                return;
            }
        }
    }
}
