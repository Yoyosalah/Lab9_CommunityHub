/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mustafa
 */
public class Group {
    private int groupId;
    private String name;
    private User primaryAdmin;
    private List<User> secondaryAdmins;
    private List<User> members;
    private List<Post> posts;
    
    //set with setters and not the builder
    private String groupPhotoPath;
    private String coverPhotoPath;
    private String description;

    
    public Group(GroupBuilder builder) {
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.primaryAdmin = builder.primaryAdmin;
        this.secondaryAdmins = builder.secondaryAdmins;
        this.members = builder.members;
        this.members.add(primaryAdmin);
        this.posts = builder.posts;
    }
    
    
    public static class GroupBuilder{
        private int groupId;
        private String name;
        private User primaryAdmin;
        private List<User> secondaryAdmins;
        private List<User> members;
        private List<Post> posts;
        private static int numOfGroups = 0;

        public GroupBuilder(int groupId, String name, User primaryAdmin, List<User> members) {
            this.groupId = getNumOfGroups();
            this.name = name;
            this.primaryAdmin = primaryAdmin;
            this.secondaryAdmins = new ArrayList<>();
            this.members = new ArrayList<>();
            this.posts = new ArrayList<>();
            increamentNumOfGroups();
        }

        private static int getNumOfGroups() {
            return numOfGroups;
        }
        
        private void increamentNumOfGroups(){
            this.numOfGroups++;
        }
        
        public Group build(){
            return new Group(this);
        }
    
    }

    
    public String getName() {
        return name;
    }

    public String getGroupPhotoPath() {
        return groupPhotoPath;
    }

    public String getCoverPhotoPath() {
        return coverPhotoPath;
    }

    public String getDescription() {
        return description;
    }

    public User getPrimaryAdmin() {
        return primaryAdmin;
    }

    public List<User> getSecondaryAdmins() {
        return secondaryAdmins;
    }

    public List<User> getMembers() {
        return members;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroupPhotoPath(String groupPhotoPath) {
        this.groupPhotoPath = groupPhotoPath;
    }

    public void setCoverPhotoPath(String coverPhotoPath) {
        this.coverPhotoPath = coverPhotoPath;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrimaryAdmin(User primaryAdmin) {
        this.primaryAdmin = primaryAdmin;
    }

    public void setSecondaryAdmins(List<User> secondaryAdmins) {
        this.secondaryAdmins = secondaryAdmins;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    

}

