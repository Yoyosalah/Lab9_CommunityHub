/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import static constants.FileNames.USERS_FILENAME;
import static constants.PlatformStatistics.setUsersNum;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author mikel
 */
public class UserDatabase {

    private ArrayList<User> users;
    private final String filename = USERS_FILENAME;
    //private static final ObjectMapper objectMapper = new ObjectMapper(); //used for for JSON serialization and deserialization
    private static final ObjectMapper objectMapper;

    static { // static block is used to initialize the static variable without errors 

        objectMapper = new ObjectMapper();
        //trying to configure the date format
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    }

    // using Singleton Design Pattern
    private static UserDatabase instance = null;

    private UserDatabase() {
        // to defeat instantiation
        this.users = new ArrayList<User>();
        readFromFile();
        setUsersNum(users.size());
    }

    public static UserDatabase getInstance() {
        if (instance == null) {//1st time to be called
            instance = new UserDatabase();
        }
        //already created before
        return instance;
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

    public User getUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
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
