/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import javax.swing.JOptionPane;

/**
 *
 * @author Mustafa
 */
public class SecondaryAdminRole {
    protected Group group;
    private GroupDatabase database = GroupDatabase.getinstance();
    
    public SecondaryAdminRole(Group group){
        this.group = group;
    }
    
    public void removeMember(User user){
        if(group.getSecondaryAdmins().contains(user) || group.getPrimaryAdmin().getUserId == user.getUserId){  //a secondary admin cant remove another secondary or the primary admin
            JOptionPane.showMessageDialog(null, "You can't remove an admin", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            group.getMembers().remove(user);
            //save changes to database here ya salah ;)
        }
    }
    
    public void addPost(Post post){
        
    }
    
    public void editPost(Post post){
        
    }
    
    public void deletePost(Post post){
        
    }
    
    public void approveMembershipRequest(){
        //this one is urs ;/
    }
    
    public void declineMembershipRequest(){
        //this one too ;0<--8---D
    }
}
