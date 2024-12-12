/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mustafa
 */
public class Group {
    private static int numOfGroups= 0;
    private int groupId;
    private String name;
    private Integer primaryAdmin;
    private List<Integer> secondaryAdmins;
    private List<Integer> members;
    private List<Integer> posts;
    
    //databases to help conversions from ids to posts and users
    private UserDatabase userDatabase = UserDatabase.getInstance();
    private ContentDatabase contentDatabase = new ContentDatabase();
    
    //set with setters and not the builder
    private String groupPhotoPath;
    private String coverPhotoPath;
    private String description;
    //for jackson library
    public Group(){
        
    }
    public Group(String name, User primaryAdmin) {
        this.groupId = getNumOfGroups();
        increamentNumOfGroups();
        this.name = name;
        this.primaryAdmin = primaryAdmin.getUserId();
        this.secondaryAdmins = new ArrayList<>();
        this.members = new ArrayList<>();
        this.posts = new ArrayList<>();
    }
    
    
//    public static class GroupBuilder{ //Builder class for groups
//        private int groupId;
//        private String name;
//        private Integer primaryAdmin;
//        private List<Integer> secondaryAdmins;
//        private List<Integer> members;
//        private List<Integer> posts;
//        private static int numOfGroups = 0;
//        
//        public GroupBuilder(String name, User primaryAdmin) {
//            this.groupId = getNumOfGroups();
//            this.name = name;
//            this.primaryAdmin = primaryAdmin.getUserId();
//            this.secondaryAdmins = new ArrayList<>();
//            this.members = new ArrayList<>();
//            this.posts = new ArrayList<>();
//            increamentNumOfGroups();
//        }

        private static int getNumOfGroups() {
            return numOfGroups;
        }
        
        private void increamentNumOfGroups(){
            numOfGroups++;
        }
        
        public static void decreamentNumberOfGroups(){
            numOfGroups--;
        }
        
//        public Group build(){
//            return new Group(this);
//        }
//    
//    }

    
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
        return userDatabase.getUserById(primaryAdmin);
    }

    public List<User> getSecondaryAdmins() {
        return idsToUsers(secondaryAdmins);
    }

    public List<User> getMembers() {
        return idsToUsers(members);
    }

    public List<Post> getPosts() {
        return idsToPosts(posts);
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
        this.primaryAdmin = primaryAdmin.getUserId();
    }

    public void setSecondaryAdmins(List<User> secondaryAdmins) {
        this.secondaryAdmins = usersToIds(secondaryAdmins);
    }

    public void setMembers(List<User> members) {
        this.members = usersToIds(members);
    }

    public void setPosts(List<Post> posts) {
        this.posts = postsToIds(posts);
    }
    
    private List<User> idsToUsers(List<Integer> ids){
        List<User> users = new ArrayList<>();
        for(Integer id:ids){
            users.add(userDatabase.getUserById(id));
        }
        return users;
    }
    
    private List<Integer> usersToIds(List<User> users){
        List<Integer> ids = new ArrayList<>();
        for(User user: users){
            ids.add(user.getUserId());
        }
        return ids;
    }
    
    private List<Post> idsToPosts(List<Integer> ids){
        List<Post> postsList = new ArrayList<>();
        for(Integer id:ids){
            postsList.add((Post) contentDatabase.getContentById(id));
        }
        return postsList;
    }
    
    private List<Integer> postsToIds(List<Post> posts){
        List<Integer> ids = new ArrayList<>();
        for(Post post: posts){
            ids.add(Integer.valueOf(post.getContentid()));
        }
        return ids;
    }
    
    public static void main(String[] args) {
        
        User user1 = new User(
                "user1@example.com", 
                "user1", 
                "password123", 
                LocalDate.of(1990, 5, 10), 
                "Active", 
                "123-456-7890", 
                "Male"
        );

        User user2 = new User(
                "user2@example.com", 
                "user2", 
                "password456", 
                LocalDate.of(1985, 3, 20), 
                "Inactive", 
                "987-654-3210", 
                "Female"
        );

        User user3 = new User(
                "user3@example.com", 
                "user3", 
                "password789", 
                LocalDate.of(2000, 8, 15), 
                "Active", 
                "555-123-4567", 
                "Non-binary"
        );
        
        Group g = new Group("Group A", user1);
        
        // Add secondaryAdmins and members using their userIds
        g.setSecondaryAdmins(List.of(user2));  // Pass userId
        g.setMembers(List.of(user2,user3));  // Pass userIds
        GroupDatabase db = GroupDatabase.getInstance();
        db.addGroup(g);
        db.saveToFile();
        
    }
}

