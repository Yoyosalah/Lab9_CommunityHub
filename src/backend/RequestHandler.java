/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Youss
 */
public class RequestHandler {
    private FriendsManager manager;

    public RequestHandler(FriendsManager manager) {
        this.manager = manager;
    }

    public boolean sendFriendRequest(User sender, User receiver){
        manager.initializeUser(sender);
        manager.initializeUser(receiver);

        boolean ableToSendRequest = !(manager.getFriends().get(sender).contains(receiver)) &&
                                   !(manager.getSentRequests().get(sender).contains(receiver)) &&
                                  !(manager.getBlockedUsers().get(sender).contains(receiver));

        if (ableToSendRequest){
            manager.getSentRequests().get(sender).add(receiver);
            manager.getReceivedRequests().get(receiver).add(sender);
            return true; // Request sent successfully
        }else{
            return false; // Failed to send request
        }
    }
    

    public boolean acceptFriendRequest(User receiver, User sender){
        manager.initializeUser(receiver);
        manager.initializeUser(sender);

        if (manager.getReceivedRequests().get(receiver).contains(sender)){
            manager.getFriends().get(receiver).add(sender);
            manager.getFriends().get(sender).add(receiver);
            manager.getSentRequests().get(sender).remove(receiver);
            manager.getReceivedRequests().get(receiver).remove(sender);
            return true; // Request accepted successfully
        }else{
            return false; // Failed to accept request
        }
    }

    public boolean declineFriendRequest(User receiver, User sender) {
        manager.initializeUser(receiver);
        manager.initializeUser(sender);

        if (manager.getReceivedRequests().get(receiver).contains(sender)) {
            manager.getSentRequests().get(sender).remove(receiver);
            manager.getReceivedRequests().get(receiver).remove(sender);
            return true; // Request declined successfully
        } else {
            return false; // Failed to decline request
        }
    }
}
