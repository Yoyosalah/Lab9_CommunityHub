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
public class PrimaryAdminRole extends SecondaryAdminRole{
    private GroupDatabase groupDatabase = GroupDatabase.getInstance();
    public PrimaryAdminRole(Group group){
        super(group);
    }
    
    
    @Override
    public void removeMember(User user){
        if(group.getSecondaryAdmins().contains(user.getUserId())){
            group.getSecondaryAdmins().remove(user.getUserId());
            groupDatabase.saveToFile();
        }else{
            super.removeMember(user);
        }
    }
    
    public void promoteUserToAdmin(User user){
        if(group.getSecondaryAdmins().contains(user.getUserId())){ //user is already an admin
            JOptionPane.showMessageDialog(null,user.getUsername() + " is already an admin", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            group.getSecondaryAdmins().add(user.getUserId());
            group.getMembers().remove(user.getUserId());
            groupDatabase.saveToFile();
            JOptionPane.showMessageDialog(null, user.getUsername() + " has been promoted.", "Promote", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void demoteAdminToUser(User user){
        if(!(group.getSecondaryAdmins().contains(user.getUserId()))){ //user is not an admin
            JOptionPane.showMessageDialog(null, user.getUsername() + " is already not an admin", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            group.getSecondaryAdmins().remove(user.getUserId());
            group.getMembers().add(user.getUserId());
            groupDatabase.saveToFile();
            JOptionPane.showMessageDialog(null, user.getUsername() + " has been demoted.", "Promote", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void deleteGroup(){
       groupDatabase.deleteGroup(group);
    }
    
        
}
