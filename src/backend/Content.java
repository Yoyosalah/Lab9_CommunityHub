/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.*;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author BLU-RAY
 */
public abstract class Content {
    protected String content;
    protected String contentid;
    protected String authorid;
    protected Date timestamp;
    protected ImageIcon image;
    
    public abstract void storeContent();
    
    
}
