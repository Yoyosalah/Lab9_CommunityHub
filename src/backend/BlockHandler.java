/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Youss
 */
public class BlockHandler {
    private FriendsManager manager;

    public BlockHandler(FriendsManager manager){
        this.manager = manager;
    }

    public void blockUser(User user, User blockedUser){
        manager.initializeUser(user);
        manager.initializeUser(blockedUser);

        // Remove from friends if they are friends
        if(manager.getFriends().get(user).contains(blockedUser)){
            manager.getFriends().get(user).remove(blockedUser);
            manager.getFriends().get(blockedUser).remove(user);
        }

        // Add to blocked list
        manager.getBlockedUsers().get(user).add(blockedUser);
        manager.saveChangesToJSON();
    }

    public boolean removeFriend(User user, User friend){
        manager.initializeUser(user);
        manager.initializeUser(friend);

        if (manager.getFriends().get(user).contains(friend)){
            manager.getFriends().get(user).remove(friend);
            manager.getFriends().get(friend).remove(user);
            manager.saveChangesToJSON();
            return true; // Friend removed successfully
        }else{
            return false; // Failed to remove friend
        }
    }
}
