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
    private static final long serialVersionUID = 1L;

    public Story(String content, String contentid, String authorid, Date timestamp, ImageIcon image) {
        this.text = content;
        this.contentid = contentid;
        this.authorid = authorid;
        this.timestamp = timestamp;
        this.image = image;
    }


}
