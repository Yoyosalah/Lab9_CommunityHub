/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import javax.swing.ImageIcon;

/**
 *
 * @author BLU-RAY
 */
public class ContentFactory {

    public static Content createContent(String type, ArrayList<Content> contentlist, String data, String authorid, ImageIcon image) {
        String contentid = ContentIDGenerator.generateUniqueId(contentlist);
        Date timestamp = new Date();
        if ("Post".equalsIgnoreCase(type)) { //to create post or story
            Post p = new Post(data, contentid, authorid, timestamp, image);
            contentlist.add(p);
            return p;
        } else if ("Story".equalsIgnoreCase(type)) {
            Story s = new Story(data, contentid, authorid, timestamp, image);
            contentlist.add(s);
            return s;
        } else {
            System.out.println("Error in argument pls fix");
            return null;
        }
    }
}
