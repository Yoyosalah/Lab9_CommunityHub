package backend;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static constants.FileNames.NOTIFICATION_FILENAME;
import static constants.FileNames.USERS_FILENAME;

public class NotificationDatabase {
    private ArrayList<Notification> notifications;
    private final String filename = NOTIFICATION_FILENAME;
    private static final ObjectMapper objectMapper;

    static { // static block is used to initialize the static variable without errors

        objectMapper = new ObjectMapper();
        //trying to configure the date format
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    }

    public NotificationDatabase() {
        notifications = new ArrayList<>();
        readFromFile();
    }

    public void addNotification(Notification notification){
        notifications.add(notification);
    }

    private void readFromFile() {
        try {
            File file = new File(filename);
            if (file.exists()) {
                notifications = objectMapper.readValue(file, new TypeReference<ArrayList<Notification>>() {
                });

            }
        } catch (IOException e) {
        }
    }

    public void saveToFile() {
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), notifications);
        } catch (IOException e) {
        }
    }

    public ArrayList<Notification> getNotifications() {
        return notifications;
    }

    
}
