/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constants;

/**
 *
 * @author mikel
 */
public class PlatformStatistics {

    private  static int UsersNum = 0;

    public static int getUsersNum() {
        return UsersNum;
    }

    public static  void incrementUsers() {
        UsersNum++;
    }

    public static  void decrementUsers() {
        if (UsersNum > 0) { // Prevents the number of users from going below zero
            UsersNum--;
        }
    }
}