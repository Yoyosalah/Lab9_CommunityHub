/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9;

<<<<<<< Updated upstream
import frontend.LandingPage;
import frontend.Newsfeed;

=======
import java.time.LocalDate;
import backend.*;
import frontend.*;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======

        //Newsfeed n = new Newsfeed();
        LocalDate date = LocalDate.now();
        User user = new User("","","",date,"","","");
        //Profile p = new Profile(user);

>>>>>>> Stashed changes
        LandingPage lp = new LandingPage();
    }
    
}
