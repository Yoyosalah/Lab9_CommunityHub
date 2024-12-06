/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author BLU-RAY
 */
public class ContentDatabase {
    private ArrayList<Content> contentlist;

    public ContentDatabase(ArrayList<Content> contentlist) {
        this.contentlist = new ArrayList<>();
    }

    public ArrayList<Content> getContentlist() {
        return contentlist;
    }

    public void setContentlist(ArrayList<Content> contentlist) {
        this.contentlist = contentlist;
    }

    public void writeToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(contentlist);
            System.out.println("Content written to file successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public void readFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            contentlist = (ArrayList<Content>) ois.readObject();
            System.out.println("Content read from file successfully!");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    public void addContent(Content content) {
        contentlist.add(content);
    }
}
