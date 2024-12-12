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
public class RequestHandler {
    private FriendsManager manager;

    public RequestHandler(FriendsManager manager) {
        this.manager = manager;
    }

    public boolean sendFriendRequest(User sender, User receiver) {
        manager.initializeUser(sender);
        manager.initializeUser(receiver);

        // Check if sender is already friends with receiver or has already sent a request
        List<Integer> senderFriends = manager.getFriends().get(sender.getUserId());
        List<Integer> senderSentRequests = manager.getSentRequests().get(sender.getUserId());
        List<Integer> senderBlocked = manager.getBlockedUsers().get(sender.getUserId());

        if (senderFriends == null) senderFriends = new ArrayList<>();
        if (senderSentRequests == null) senderSentRequests = new ArrayList<>();
        if (senderBlocked == null) senderBlocked = new ArrayList<>();

        boolean ableToSendRequest = !senderFriends.contains(receiver.getUserId()) &&
                                    !senderSentRequests.contains(receiver.getUserId()) &&
                                    !senderBlocked.contains(receiver.getUserId());

        if (ableToSendRequest) {
            // Initialize receiver's sent and received requests if they are not initialized
            manager.initializeUser(receiver);
            List<Integer> receiverReceivedRequests = manager.getReceivedRequests().get(receiver.getUserId());
            if (receiverReceivedRequests == null) receiverReceivedRequests = new ArrayList<>();

            senderSentRequests.add(receiver.getUserId());
            receiverReceivedRequests.add(sender.getUserId());

            manager.saveChangesToJSON();
            return true; // Request sent successfully
        } else {
            return false; // Failed to send request
        }
    }
    

    public boolean acceptFriendRequest(User receiver, User sender) {
        manager.initializeUser(receiver);
        manager.initializeUser(sender);

        // Check if the receiver has the sender in their received requests list
        List<Integer> receivedList = manager.getReceivedRequests().get(receiver.getUserId());
        List<Integer> sentList = manager.getSentRequests().get(sender.getUserId());

        if (receivedList != null && sentList != null && receivedList.contains(sender.getUserId())) {
            // Add the sender to the receiver's friends list and vice versa
            manager.getFriends().get(receiver.getUserId()).add(sender.getUserId());
            manager.getFriends().get(sender.getUserId()).add(receiver.getUserId());

            // Remove the sender from the receiver's received requests list and vice versa
            receivedList.remove(Integer.valueOf(sender.getUserId()));
            receivedList.remove(Integer.valueOf(receiver.getUserId()));
            sentList.remove(Integer.valueOf(receiver.getUserId()));
            sentList.remove(Integer.valueOf(sender.getUserId()));

            manager.saveChangesToJSON();
            return true; // Request accepted successfully
        } else {
            return false; // Failed to accept request, might be because request is not in the list
        }
    }

    public boolean declineFriendRequest(User receiver, User sender) {
        manager.initializeUser(receiver);
        manager.initializeUser(sender);

        List<Integer> receiverReceivedRequests = manager.getReceivedRequests().get(receiver.getUserId());
        List<Integer> senderSentRequests = manager.getSentRequests().get(sender.getUserId());

        if (receiverReceivedRequests == null) receiverReceivedRequests = new ArrayList<>();
        if (senderSentRequests == null) senderSentRequests = new ArrayList<>();

        if (receiverReceivedRequests.contains(sender.getUserId())) {
            receiverReceivedRequests.remove(Integer.valueOf(sender.getUserId()));
            senderSentRequests.remove(Integer.valueOf(receiver.getUserId()));

            manager.saveChangesToJSON();
            return true; // Request declined successfully
        } else {
            return false; // Failed to decline request, request not found
        }
    }
}
