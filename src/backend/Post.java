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
    private static final long serialVersionUID = 1L;

    public Post(String text, String contentid, String authorid, Date timestamp, ImageIcon image) {
        this.text = text;
        this.contentid = contentid;
        this.authorid = authorid;
        this.timestamp = timestamp;
        this.image = image;
    }

    public Post(String text, String contentid, String authorid, Date timestamp) { //two constructors one for w img and other wo img
        this.text = text;
        this.contentid = contentid;
        this.authorid = authorid;
        this.timestamp = timestamp;
        this.image = null; //if no img selected 
    }
    
    
    @Override
    public void storeContent(){
        
    }
    
}
