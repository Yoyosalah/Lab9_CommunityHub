/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Youss
 */
public class FriendsManager {
    private Map<User,List<User>> friends;
    private Map<User,List<User>> sentRequests;
    private Map<User,List<User>> recievedRequests;
    private Map<User,List<User>> blockedUsers;

    public FriendsManager(Map<User, List<User>> friends, Map<User, List<User>> sentRequests, Map<User, List<User>> recievedRequests, Map<User, List<User>> blockedUsers) {
        this.friends = friends;
        this.sentRequests = sentRequests;
        this.recievedRequests = recievedRequests;
        this.blockedUsers = blockedUsers;
    }
    
    
    public boolean sendFriendRequest(User sender,User reciever){
        boolean ableToSendRequest = !(friends.get(sender).contains(reciever))
                && !(sentRequests.get(sender).contains(reciever))
                && !(blockedUsers.get(sender).contains(reciever));
        if(ableToSendRequest){
            sentRequests.get(sender).add(reciever);
            recievedRequests.get(reciever).add(sender);
            return true; //successful
        }
        else
            return false; //failed
    }
    public boolean acceptFriendRequest(User reciever , User sender){
        if(recievedRequests.get(reciever).contains(sender)){
            friends.get(reciever).add(sender);
            friends.get(sender).add(reciever);
            sentRequests.get(sender).remove(reciever);
            recievedRequests.get(reciever).remove(sender);
            return true; //successful
        }else
            return false; //failed
    }
    public boolean declineFriendRequest(User reciever, User sender){
        if(recievedRequests.get(reciever).contains(sender)){
            sentRequests.get(sender).remove(reciever);
            recievedRequests.get(reciever).remove(sender);
            return true; //successful
        }else
            return false; //failed
    }
    public List<User> friendSuggestions(User user, List<User> users){
        List<User> suggesstions = new ArrayList<>();
        for(User u:users){
            if(!(friends.get(user).contains(u))
            &&!blockedUsers.get(user).contains(u)
            &!user.equals(u)){
                suggesstions.add(u);
            }
        }
        return suggesstions;
    }
    public void blockUser(User user,User blockedUser){
        if(friends.get(user).contains(blockedUser)){
            friends.get(user).remove(blockedUser);
            friends.get(blockedUser).remove(user);
        }
        blockedUsers.get(user).add(blockedUser);
        blockedUsers.get(blockedUser).add(user);
    }
    public boolean removeFriend(User user, User friend){
        if(friends.get(user).contains(friend)){
            friends.get(user).remove(friend);
            friends.get(friend).remove(user);
            return true; //successful
        }else
            return false; //failed
    }
        
}
