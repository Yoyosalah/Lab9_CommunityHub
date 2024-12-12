/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.*;
import java.time.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static constants.FileNames.CONTENT_FILENAME;

/**
 * @author BLU-RAY
 */
public class ContentDatabase {
    private ArrayList<Content> contentlist;

    public ContentDatabase() {
        this.contentlist = new ArrayList<>();
        readFromFile();
    }

    public ArrayList<Content> getContentlist() {
        return contentlist;
    }

    public void setContentlist(ArrayList<Content> contentlist) {
        this.contentlist = contentlist;
    }

    public void writeToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CONTENT_FILENAME))) {
            long currentTime = System.currentTimeMillis();
            List<Content> filteredContent = contentlist.stream()
                    .filter(content -> !(content instanceof Story) || currentTime - content.getTimestamp().getTime() <= 24 * 60 * 60 * 1000) // only add stories that are not expired
                    .collect(Collectors.toList());
            oos.writeObject(filteredContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void filterOldStories() {
        long ONE_DAY_MILLIS = TimeUnit.HOURS.toMillis(24);
        long currentTime = System.currentTimeMillis();
        contentlist = (ArrayList<Content>) contentlist.stream()
                .filter(content -> !(content instanceof Story) || currentTime - content.getTimestamp().getTime() <= ONE_DAY_MILLIS)
                .collect(Collectors.toList());
    }

    public void readFromFile() {
        String filePath = CONTENT_FILENAME;
        File file = new File(filePath);
        if (!file.exists()||file.length()==0) {
            return;
        } else {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CONTENT_FILENAME))) {
                Object object = ois.readObject();
                if (object instanceof List) {
                    contentlist = (ArrayList<Content>) object;
                    filterOldStories();
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    

    public void addContent(Content content) {
        contentlist.add(content);
    }
    
    public Content getContentById(int contentId) {
        for (Content c : contentlist) {
            if (c.getContentid().equals(String.valueOf(contentId))) {
                return c;
            }
        }
        return null;
    }
}
