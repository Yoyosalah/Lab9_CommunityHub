/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.image.BufferedImage;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author BLU-RAY
 */
public class Post extends Content{

    public Post(String content, String contentid, String authorid, Date timestamp, ImageIcon image) {
        this.content = content;
        this.contentid = contentid;
        this.authorid = authorid;
        this.timestamp = timestamp;
        this.image = image;
    }

    public Post(String content, String contentid, String authorid, Date timestamp) { //two constructors one for w img and other wo img
        this.content = content;
        this.contentid = contentid;
        this.authorid = authorid;
        this.timestamp = timestamp;
        this.image = null; //if no img selected 
    }

    public String getContent() {
        return content;
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
    public void storeContent(){
        
    }
    
}
