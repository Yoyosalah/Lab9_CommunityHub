/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9;

/**
 *
 * @author Youss
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Newsfeed n = new Newsfeed();
        LocalDate date = LocalDate.now();
        User user = new User("","","",date,"","","");
        Profile p = new Profile(user);

        LandingPage lp = new LandingPage();

    }
    
}
