/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constants;

/**
 *
 * @author Youss
 */
public class GroupStatistics {

    private static int GroupsNum = 0;

    public static int getGroupsNum() {
        return GroupsNum;
    }

    public static void incrementGroups() {
        GroupsNum++;
    }

    public static void decrementGroups() {
        if (GroupsNum > 0) {
            GroupsNum--;
        }
    }

    public static void setGroupsNum(int GroupsNum) {
        GroupStatistics.GroupsNum = GroupsNum;
    }
   
}
