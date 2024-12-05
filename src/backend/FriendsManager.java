/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Youss
 */
public class FriendsManager {
    private Map<User, List<User>> friends;
    private Map<User, List<User>> sentRequests;
    private Map<User, List<User>> receivedRequests;
    private Map<User, List<User>> blockedUsers;

    public FriendsManager() {
        friends = new HashMap<>();
        sentRequests = new HashMap<>();
        receivedRequests = new HashMap<>();
        blockedUsers = new HashMap<>();
    }

    // Ensures a user is initialized in all maps
    public void initializeUser(User user) {
        friends.putIfAbsent(user, new ArrayList<>());
        sentRequests.putIfAbsent(user, new ArrayList<>());
        receivedRequests.putIfAbsent(user, new ArrayList<>());
        blockedUsers.putIfAbsent(user, new ArrayList<>());
    }

    public boolean isUserInitialized(User user) {
        return friends.containsKey(user);
    }

    //Friend suggestions method
    public List<User> friendSuggestions(User user, List<User> users) {
        initializeUser(user);

        List<User> userFriends = friends.get(user);
        List<User> userBlocked = blockedUsers.get(user);

        List<User> suggestions = new ArrayList<>();
        for (User u : users) {
            if (!userFriends.contains(u) && !userBlocked.contains(u) && !user.equals(u)) {
                suggestions.add(u);
            }
        }
        return suggestions;
    }
    //Getters
    public Map<User, List<User>> getFriends() {
        return friends;
    }

    public Map<User, List<User>> getSentRequests() {
        return sentRequests;
    }

    public Map<User, List<User>> getReceivedRequests() {
        return receivedRequests;
    }

    public Map<User, List<User>> getBlockedUsers() {
        return blockedUsers;
    }
}
