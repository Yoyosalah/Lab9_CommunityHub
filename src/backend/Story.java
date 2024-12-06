/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.image.BufferedImage;
import java.util.*;
import java.time.*;
import javax.swing.ImageIcon;

/**
 *
 * @author BLU-RAY
 */
public class Story extends Content {

    public Story(String content, String contentid, String authorid, Date timestamp, ImageIcon image) {
        this.content = content;
        this.contentid = contentid;
        this.authorid = authorid;
        this.timestamp = timestamp;
        this.image = image;
    }

    public Story(String content, String contentid, String authorid, Date timestamp) { //two constructors one for w/ img and other w/o img
        this.content = content;
        this.contentid = contentid;
        this.authorid = authorid;
        this.timestamp = timestamp;
        this.image = null; //if no img selected 
    }

    public String getContent() {
        return this.content;
    }

    public String getContentid() {
        return contentid;
    }

    public String getAuthorid() {
        return authorid;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public ImageIcon getImage() {
        return image;
    }

    @Override
    public void storeContent() {
        LocalDate today = LocalDate.now();
        LocalDate time = this.timestamp.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); // convert to localdate bec duration doesnt work with date
        Duration duration = Duration.between(time, today);
        if(duration.toHours()>= 24)
            return ;
        else{
        
        }
    }
}
