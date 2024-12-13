/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GroupDatabase {

    private ArrayList<Group> groups;
    private final String filename = "Groups.json";
    private static final ObjectMapper objectMapper;
    private int numGps;

    // Singleton instance
    private static GroupDatabase instance = null;

    static {
        objectMapper = new ObjectMapper();
    }

    private GroupDatabase() {
        this.groups = new ArrayList<>();
        readFromFile(); // Load the data when the object is created
        numGps = groups.size();
        System.out.println(groups.size());
    }
 
    public static GroupDatabase getInstance() {
        if (instance == null) {
            instance = new GroupDatabase();
        }
        return instance;
    }
    public int getnum(){
        return numGps;
    }
    public void incrementNum(){
        numGps++;
    }
    public void decrementNum(){
        numGps--;
    }
    //saving to json file
    public void saveToFile() {
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), groups);
        } catch (IOException e) {
            System.err.println("Error saving groups to file: " + e.getMessage());
        }
    }
    // Read the groups from the file (deserialization)
    private void readFromFile() {
        try {
            File file = new File(filename);
            if (file.exists()) {
                groups = objectMapper.readValue(file, new TypeReference<ArrayList<Group>>() {});
            } else {
                // If the file doesn't exist, create an empty file with an empty array
                file.createNewFile();
                groups = new ArrayList<>(); // Initialize the groups list as empty
            }
        } catch (IOException e) {
            System.err.println("Error loading groups from file: " + e.getMessage());
        }
    }

    // Get all groups
    public ArrayList<Group> getGroupsList() {
        return groups;
    }
    
    public void addGroup(Group group){
        groups.add(group);
    }
    public void deleteGroup(Group group){
        groups.remove(group);
        decrementNum();
    }
    
    public Group getGroupById(int id) {
        for (Group group : groups) {
            if (group.getGroupId()== id) {
                return group;
            }
        }
        return null;
    }
}
