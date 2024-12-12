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

    public PrimaryAdminRole(Group group){
        super(group);
    }
    
    
    @Override
    public void removeMember(User user){
        group.getMembers().remove(user);
        //save changes to database here ya salah ;)
    }
    
    public void promoteUserToAdmin(User user){
        if(group.getSecondaryAdmins().contains(user)){ //user is already an admin
            JOptionPane.showMessageDialog(null,user.getUsername() + " is already an admin", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            group.getSecondaryAdmins().add(user);
            //save changes to database here ya salah ;>
            JOptionPane.showMessageDialog(null, user.getUsername() + " has been promoted.", "Promote", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void demoteAdminToUser(User user){
        if(!(group.getSecondaryAdmins().contains(user))){ //user is not an admin
            JOptionPane.showMessageDialog(null, user.getUsername() + " is already not an admin", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            group.getSecondaryAdmins().remove(user);
            //save changes to database here ya salah :]
            JOptionPane.showMessageDialog(null, user.getUsername() + " has been demoted.", "Promote", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void deleteGroup(){
        //this one is all urs salah ;0
    }
    
        
}
