/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mustafa
 */
public class SecondaryAdminRole {
    protected Group group;
    private GroupDatabase groupDatabase = GroupDatabase.getInstance();
    public SecondaryAdminRole(Group group){
        this.group = group;
    }
    
    public void removeMember(User user){
        if(group.getSecondaryAdmins().contains(user.getUserId()) || group.getPrimaryAdmin() == user.getUserId()){  //a secondary admin cant remove another secondary or the primary admin
            JOptionPane.showMessageDialog(null, "You can't remove an admin", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            group.getMembers().remove(user.getUserId());
            groupDatabase.saveToFile();
        }
    }
    
    public void addPost(Post post){
        List<Integer> allPostIds = new ArrayList<>();
        allPostIds.addAll(group.getPosts());
        allPostIds.add(Integer.parseInt(post.getContentid()));
        group.setPosts(allPostIds);
        groupDatabase.saveToFile();
    }
    
    public void editPost(Post post){
        if(!(group.getPosts().contains(Integer.parseInt(post.getContentid())))){
            JOptionPane.showMessageDialog(null, "This Post Doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deletePost(Post post){
        if(group.getPosts().contains(Integer.parseInt(post.getContentid()))){
            List<Integer> allPostIds = new ArrayList<>();
            allPostIds.addAll(group.getPosts());
            allPostIds.remove(Integer.parseInt(post.getContentid()));
            group.setPosts(allPostIds);
            groupDatabase.saveToFile();
        }else{
            JOptionPane.showMessageDialog(null, "This Post Doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void approveMembershipRequest(User user){
        if(group.getRequests().contains(user.getUserId()) && group.getMembers().contains(user.getUserId())){
            List<Integer> allRequestIds = new ArrayList<>();
            List<Integer> allMemberIds = new ArrayList<>();
            allRequestIds.addAll(allRequestIds);
            allMemberIds.addAll(allMemberIds);
            allRequestIds.remove(user.getUserId());
            allMemberIds.add(user.getUserId());
            group.setRequests(allRequestIds);
            group.setMembers(allMemberIds);
            groupDatabase.saveToFile();
        }
    }
    
    public void declineMembershipRequest(User user){
        if(group.getRequests().contains(user.getUserId()) && group.getMembers().contains(user.getUserId())){
            List<Integer> allRequestIds = new ArrayList<>();
            allRequestIds.addAll(allRequestIds);
            allRequestIds.remove(user.getUserId());
            group.setRequests(allRequestIds);
            groupDatabase.saveToFile();
        }
    }
}
