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
    private Map<Integer, List<Integer>> friends;
    private Map<Integer, List<Integer>> sentRequests;
    private Map<Integer, List<Integer>> receivedRequests;
    private Map<Integer, List<Integer>> blockedUsers;
    private final UserDatabase userDatabase;

    public FriendsManager() {
        userDatabase = UserDatabase.getInstance();

        friends = FriendsDatabase.readFriends();
        if (friends == null) friends = new HashMap<>();

        sentRequests = FriendsDatabase.readSentRequests();
        if (sentRequests == null) sentRequests = new HashMap<>();

        receivedRequests = FriendsDatabase.readReceivedRequests();
        if (receivedRequests == null) receivedRequests = new HashMap<>();

        blockedUsers = FriendsDatabase.readBlockedUsers();
        if (blockedUsers == null) blockedUsers = new HashMap<>();
    }

    public void initializeUser(User user) {
        int userId = user.getUserId();
        friends.putIfAbsent(userId, new ArrayList<>());
        sentRequests.putIfAbsent(userId, new ArrayList<>());
        receivedRequests.putIfAbsent(userId, new ArrayList<>());
        blockedUsers.putIfAbsent(userId, new ArrayList<>());
    }

    public boolean isUserInitialized(User user) {
        return friends.containsKey(user.getUserId());
    }

    public void saveChangesToJSON() {
        FriendsDatabase.saveFriends(friends);
        FriendsDatabase.saveReceivedRequests(receivedRequests);
        FriendsDatabase.saveSentRequests(sentRequests);
        FriendsDatabase.saveBlockedUsers(blockedUsers);
    }

    public List<User> friendSuggestions(User user, List<User> users) {
        initializeUser(user);
        int userId = user.getUserId();
        List<Integer> userFriends = friends.get(userId);
        List<Integer> userBlocked = blockedUsers.get(userId);
        List<Integer> userSentRequests = sentRequests.get(userId);

        List<User> suggestions = new ArrayList<>();
        for (User u : users) {
            int uId = u.getUserId();
            if (!userFriends.contains(uId) && !userBlocked.contains(uId) && !userSentRequests.contains(uId) && userId != uId) {
                suggestions.add(u);
            }
        }
        return suggestions;
    }

    public Map<Integer, List<Integer>> getFriends() {
        return friends;
    }

    public Map<Integer, List<Integer>> getSentRequests() {
        return sentRequests;
    }

    public Map<Integer, List<Integer>> getReceivedRequests() {
        return receivedRequests;
    }

    public Map<Integer, List<Integer>> getBlockedUsers() {
        return blockedUsers;
    }

    public UserDatabase getUserDatabase() {
        return userDatabase;
    }
    
    // Converted from Integer to User
    
    public Map<User, List<User>> getFriendsConverted() {
        return convertMapToUsers(friends);
    }

    public Map<User, List<User>> getSentRequestsConverted() {
        return convertMapToUsers(sentRequests);
    }

    public Map<User, List<User>> getReceivedRequestsConverted() {
        return convertMapToUsers(receivedRequests);
    }

    public Map<User, List<User>> getBlockedUsersConverted() {
        return convertMapToUsers(blockedUsers);
    }
    
    private Map<User, List<User>> convertMapToUsers(Map<Integer, List<Integer>> map) {
    Map<User, List<User>> convertedMap = new HashMap<>();
    for (Integer uId : map.keySet()) {
        List<User> userList = new ArrayList<>();
        for (Integer u : map.get(uId)) {
            userList.add(userDatabase.getUserById(u));
        }
        convertedMap.put(userDatabase.getUserById(uId), userList);
    }
    
    return convertedMap;
}
//    private Map<User, List<User>> convertMapToUsers(Map<Integer, List<Integer>> map) {
//        Map<User, List<User>> userMap = new HashMap<>();
//        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
//            User user = userDatabase.getUserById(entry.getKey());
//            if (user != null) {
//                List<User> userList = new ArrayList<>();
//                for (Integer id : entry.getValue()) {
//                    User u = userDatabase.getUserById(id);
//                    if (u != null) userList.add(u);
//                }
//                userMap.put(user, userList);
//            }
//        }
//        return userMap;
//    }
}
