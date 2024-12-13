/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import static constants.GroupStatistics.incrementGroups;
import static constants.GroupStatistics.getGroupsNum;

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
    @JsonIgnore
    private static int gpNumber=groupDatabase.getnum();
    //set with setters and not the builder
    private String groupPhotoPath;
    private String coverPhotoPath;
    private String description;
    //for jackson library
    public Group(){
        this.secondaryAdmins = new ArrayList<>();
        this.members = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.requests = new ArrayList<>();
    }
    public Group(String name, Integer primaryAdmin) {
        this.groupId = gpNumber;
        this.name = name;
        this.primaryAdmin = primaryAdmin;
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
    private List<Integer> usersToIds(List<User> users){
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
}

