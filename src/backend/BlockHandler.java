/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.List;

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

        // Get user's friends and blocked lists
        List<Integer> userFriends = manager.getFriends().get(user.getUserId());
        List<Integer> userBlocked = manager.getBlockedUsers().get(user.getUserId());

        if (userFriends == null) userFriends = new ArrayList<>();
        if (userBlocked == null) userBlocked = new ArrayList<>();

        // Remove from friends if they are friends
        if(userFriends.contains(blockedUser.getUserId())){
            userFriends.remove(Integer.valueOf(blockedUser.getUserId()));
            List<Integer> blockedUserFriends = manager.getFriends().get(blockedUser.getUserId());
            if (blockedUserFriends != null) {
                blockedUserFriends.remove(Integer.valueOf(user.getUserId()));
            }
        }

        // Add to blocked list
        userBlocked.add(blockedUser.getUserId());
        manager.saveChangesToJSON();
    }

    public boolean removeFriend(User user, User friend){
        manager.initializeUser(user);
        manager.initializeUser(friend);

        // Get user's friends list
        List<Integer> userFriends = manager.getFriends().get(user.getUserId());
        List<Integer> friendFriends = manager.getFriends().get(friend.getUserId());

        if (userFriends == null) userFriends = new ArrayList<>();
        if (friendFriends == null) friendFriends = new ArrayList<>();

        if (userFriends.contains(friend.getUserId())){
            userFriends.remove(Integer.valueOf(friend.getUserId()));
            friendFriends.remove(Integer.valueOf(user.getUserId()));
            manager.saveChangesToJSON();
            return true; // Friend removed successfully
        } else {
            return false; // Failed to remove friend, not found in the list
        }
    }
}
