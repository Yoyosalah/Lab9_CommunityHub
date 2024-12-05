/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

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
    
}
