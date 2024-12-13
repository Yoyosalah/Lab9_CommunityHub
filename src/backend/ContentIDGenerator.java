/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author BLU-RAY
 */
public class ContentIDGenerator {

    public static String generateUniqueId(ArrayList<Content> contentlist) {
        String contentid = null;
        boolean isDuplicate = false;
        do {
            contentid = UUID.randomUUID().toString();// Generate a random content ID
            isDuplicate = false;
            for (Content content : contentlist) {
                if (content != null && content.getContentid() != null && content.getContentid().equals(contentid)) { // Check if the content ID already exists in the contentlist
                    isDuplicate = true;
                    break;
                }
            }
        } while (isDuplicate);
        return contentid;
    }
}
