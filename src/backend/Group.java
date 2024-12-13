/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

/**
 *
 * @author Mustafa
 */
public class Group {
    private int groupId;
    private String name;
    private Integer primaryAdmin;
    private List<Integer> secondaryAdmins;
    private List<Integer> members;
    private List<Integer> posts;
    private List<Integer> requests;
    
    //databases to help conversions from ids to posts and users
    @JsonIgnore
    private static UserDatabase userDatabase = UserDatabase.getInstance();
    @JsonIgnore
    private static ContentDatabase contentDatabase = new ContentDatabase();
    @JsonIgnore
    private static GroupDatabase groupDatabase = GroupDatabase.getInstance();
//    @JsonIgnore
//    private static int gpNumber=groupDatabase.getnum();
    //set with setters and not the builder
    private String groupPhotoPath;
    private String coverPhotoPath;
    private String description;
    //for jackson library
    public Group(){
        
    }
    public Group(String name, Integer primaryAdmin) {
        this.groupId = groupDatabase.getnum();
        groupDatabase.incrementNum();
        this.name = name;
        this.primaryAdmin = primaryAdmin;
        this.secondaryAdmins = new ArrayList<>();
        this.members = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.requests = new ArrayList<>();
        this.groupPhotoPath = "";
        this.coverPhotoPath = "";
        this.description = "";
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrimaryAdmin() {
        return primaryAdmin;
    }

    public void setPrimaryAdmin(Integer primaryAdmin) {
        this.primaryAdmin = primaryAdmin;
    }

    public List<Integer> getSecondaryAdmins() {
        return secondaryAdmins;
    }

    public void setSecondaryAdmins(List<Integer> secondaryAdmins) {
        this.secondaryAdmins = secondaryAdmins;
    }

    public List<Integer> getMembers() {
        return members;
    }

    public void setMembers(List<Integer> members) {
        this.members = members;
    }

    public List<Integer> getPosts() {
        return posts;
    }

    public void setPosts(List<Integer> posts) {
        this.posts = posts;
    }

    public String getGroupPhotoPath() {
        return groupPhotoPath;
    }

    public void setGroupPhotoPath(String groupPhotoPath) {
        this.groupPhotoPath = groupPhotoPath;
    }

    public String getCoverPhotoPath() {
        return coverPhotoPath;
    }

    public void setCoverPhotoPath(String coverPhotoPath) {
        this.coverPhotoPath = coverPhotoPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getRequests() {
        return requests;
    }

    public void setRequests(List<Integer> requests) {
        this.requests = requests;
    }
    
    
    
    @JsonIgnore
    public List<User> idsToUsers(List<Integer> ids){
        List<User> users = new ArrayList<>();
        for(Integer id:ids){
            users.add(userDatabase.getUserById(id));
        }
        return users;
    }
    @JsonIgnore
    public List<Integer> usersToIds(List<User> users){
        List<Integer> ids = new ArrayList<>();
        for(User user: users){
            ids.add(user.getUserId());
        }
        return ids;
    }
    @JsonIgnore
    public List<Post> idsToPosts(List<Integer> ids){
        List<Post> postsList = new ArrayList<>();
        for(Integer id:ids){
            postsList.add((Post) contentDatabase.getContentById(id));
        }
        return postsList;
    }
    @JsonIgnore
    public static List<Integer> postsToIds(List<Post> posts){
        List<Integer> ids = new ArrayList<>();
        for(Post post: posts){
            ids.add(Integer.valueOf(post.getContentid()));
        }
        return ids;
    }
    
    public static void main(String[] args) {
        Group g = new Group("gp",1);
        GroupDatabase gpdb = GroupDatabase.getInstance();
        gpdb.addGroup(g);
        Group g2 = new Group("gp2",2);
        gpdb.addGroup(g2);
        gpdb.saveToFile();
        User user1 = new User("user1@example.com", "user1", "password123", LocalDate.of(1990, 5, 10), "Active", "123-456-7890", "Male");
        User user2 = new User("user2@example.com", "user2", "password456", LocalDate.of(1985, 3, 25), "Inactive", "987-654-3210", "Female");
        User user3 = new User("user3@example.com", "user3", "password789", LocalDate.of(2000, 7, 15), "Active", "456-123-7890", "Male");
        User user4 = new User("user4@example.com", "user4", "password321", LocalDate.of(1995, 11, 5), "Pending", "321-654-0987", "Non-binary");
        User user5 = new User("user5@example.com", "user5", "password654", LocalDate.of(1988, 8, 30), "Active", "654-789-1230", "Female");
        User user6 = new User("user6@example.com", "user6", "password987", LocalDate.of(1992, 2, 20), "Inactive", "789-123-4560", "Male");

        List<Integer> myList = new ArrayList<>(List.of(user1.getUserId(),user2.getUserId()));
        g2.setMembers(myList);
        System.out.println(g2.getMembers());
        gpdb.saveToFile();
        PrimaryAdminRole pa = new PrimaryAdminRole(g2);
        SecondaryAdminRole sa = new SecondaryAdminRole(g2);
        pa.promoteUserToAdmin(user1);
        List<Integer> anotherList = new ArrayList<>(List.of(user3.getUserId(),user4.getUserId()));
        g2.setRequests(anotherList);
        sa.approveMembershipRequest(user3);
        pa.declineMembershipRequest(user4);
        pa.demoteAdminToUser(user1);
        pa.demoteAdminToUser(user3);
    }
}

