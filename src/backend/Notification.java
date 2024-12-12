package backend;

import java.util.*;

public class Notification {
    private String notificationid;
    private String text;
    private String type;
    private Date timestamp;
    private HashMap<User,Boolean> isRead;

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

    public void setIsRead(HashMap<User, Boolean> isRead) {
        this.isRead = isRead;
    }
}
