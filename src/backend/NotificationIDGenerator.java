package backend;

import java.util.ArrayList;
import java.util.UUID;

public class NotificationIDGenerator {
    public static String generateUniqueId() {
        String notificationID = null;
        ArrayList<Notification> notificationList = NotificationDatabase.getInstance().getNotifications();
        boolean isDuplicate = false;
        do {
            notificationID = UUID.randomUUID().toString();// Generate a random notification ID
            isDuplicate = false;
            for (Notification notification : notificationList) {
                if (notification != null && notification.getNotificationid() != null && notification.getNotificationid().equals(notificationID)) { // Check if the content ID already exists in the contentlist
                    isDuplicate = true;
                    break;
                }
            }
        } while (isDuplicate);
        return notificationID;
    }
}
