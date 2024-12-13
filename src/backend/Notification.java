package backend;

import java.util.*;

public class Notification {
    private String notificationid;
    private String text;
    private String type;
    private Date timestamp;
    private ArrayList<User> receivers;
    private HashMap<User,Boolean> isRead;

    public Notification(Date timestamp, String type, String notificationid, String text) {
        this.timestamp = timestamp;
        this.type = type;
        this.notificationid = notificationid;
        this.text = text;
        this.receivers = new ArrayList<>();
        this.isRead = new HashMap<>();
    }

    public String getNotificationid() {
        return notificationid;
    }

    public void setNotificationid(String notificationid) {
        this.notificationid = notificationid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public HashMap<User, Boolean> getIsRead() {
        return isRead;
    }

    public ArrayList<User> getReceivers() {
        return receivers;
    }

    public void setReceivers(ArrayList<User> receivers) {
        this.receivers = receivers;
    }

    public void setIsRead(HashMap<User, Boolean> isRead) {
        this.isRead = isRead;
    }

    public void MarkAsRead(User user){
        isRead.put(user, true);
    }
}
