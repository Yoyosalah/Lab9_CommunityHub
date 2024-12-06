/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Youss
 */
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendsDatabase {
    private static final String FRIENDS_FILE = "friends.json";
    private static final String SENT_REQUESTS_FILE = "sentRequests.json";
    private static final String RECEIVED_REQUESTS_FILE = "receivedRequests.json";
    private static final String BLOCKED_FILE = "blocked.json";

    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    // Methods for Friends
    public static Map<User, List<User>> readFriends() {
        return readFromFile(FRIENDS_FILE, new TypeReference<Map<User, List<User>>>() {});
    }

    public static void saveFriends(Map<User, List<User>> friends) {
        saveToFile(FRIENDS_FILE, friends);
    }

    // Methods for Sent Requests
    public static Map<User, List<User>> readSentRequests() {
        return readFromFile(SENT_REQUESTS_FILE, new TypeReference<Map<User, List<User>>>() {});
    }

    public static void saveSentRequests(Map<User, List<User>> sentRequests) {
        saveToFile(SENT_REQUESTS_FILE, sentRequests);
    }

    // Methods for Received Requests
    public static Map<User, List<User>> readReceivedRequests() {
        return readFromFile(RECEIVED_REQUESTS_FILE, new TypeReference<Map<User, List<User>>>() {});
    }

    public static void saveReceivedRequests(Map<User, List<User>> receivedRequests) {
        saveToFile(RECEIVED_REQUESTS_FILE, receivedRequests);
    }

    // Methods for Blocked Users
    public static Map<User, List<User>> readBlockedUsers() {
        return readFromFile(BLOCKED_FILE, new TypeReference<Map<User, List<User>>>() {});
    }

    public static void saveBlockedUsers(Map<User, List<User>> blockedUsers) {
        saveToFile(BLOCKED_FILE, blockedUsers);
    }

    // Generic Methods for Reading and Writing
    private static <T> T readFromFile(String filename, TypeReference<T> typeReference) {
    try {
        File file = new File(filename);
        if (file.exists()) {
            return objectMapper.readValue(file, typeReference);
        } else {//added: If the file doesn't exist, create it with an empty structure
            saveToFile(filename, new HashMap<>());
            return objectMapper.readValue(file, typeReference);
        }
    } catch (IOException e) {
        System.err.println("Error reading or initializing file: " + filename);
        return null;
    }
}

    private static <T> void saveToFile(String filename, T data) {
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), data);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + filename);
        }
    }
}
