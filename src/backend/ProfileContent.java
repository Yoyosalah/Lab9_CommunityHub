/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mustafa
 */
public class ProfileContent extends ProfileManager{

    ContentDatabase contentDatabase = new ContentDatabase();

    public ProfileContent(User user) {
        super(user);
    }
    
    public ArrayList<Content> userPosts(){
        return contentDatabase.getContentlist();
    }
}
