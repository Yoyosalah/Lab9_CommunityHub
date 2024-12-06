/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static constants.FileNames.CONTENT_FILENAME;

/**
 *
 * @author BLU-RAY
 */
public class ContentDatabase {
    private ArrayList<Content> contentlist;

    public ContentDatabase() {
        this.contentlist = new ArrayList<>();
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


    public void readFromFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CONTENT_FILENAME))) {
            long currentTime = System.currentTimeMillis();
            List<Content> filteredContent = contentlist.stream()
                    .filter(content -> !(content instanceof Story) || currentTime - content.getTimestamp().getTime() <= 24 * 60 * 60 * 1000)//only take non expired stories
                    .collect(Collectors.toList());

            oos.writeObject(filteredContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void addContent(Content content) {
        contentlist.add(content);
    }
}
