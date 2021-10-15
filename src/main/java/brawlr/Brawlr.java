package brawlr;

import brawlr.ViewManager;

import java.util.*;
public class Brawlr {

    public static void main(String[] args){
        //Starts app and displays using ViewManager based on log in or register
        //Scanner asks the user to log in, and overload main so you have two main methods.
        //Based on swiperight and swipeleft command inputs, activate the UserManager's swiperight and swipeleft methods.

        Scanner in = new Scanner(System.in);
        boolean loop = true;
        int count = 0;
        String currentUserID = "";
        while (loop) {
            count += 1;
            System.out.println("Do you have an account with us? (Type 1 for yes, 0 for no)");
            String response = in.nextLine();
            if (response.equals("1")) {
                currentUserID = ViewManager.displayLogin();
                loop = false;
            } else if (response.equals("0")) {
                currentUserID = ViewManager.displayUserCreation();
                loop = false;
            } else {
                System.out.println("Invalid response");
            }
            if (count >= 5){
                System.out.println("Are you a monkey banging on a keyboard? (Type 1 to verify humanity)");
                String monkey_response = in.nextLine();
                if (!(monkey_response.equals("1"))){
                    System.out.println("Monkeys have a higher strength to body-weight ratio than humans, " +
                            "giving them an unfair advantage in combat.");
                    break;
                }
            }
        }
        System.out.println("Would you like to start swiping (press 1) or would you prefer to " +
                "chat with people you have matched with (press 0)");
        String response1 = in.nextLine();
        if (Objects.equals(response1, "1")){
            System.out.println("works");
            ViewManager.displayCard(currentUserID);
        }
        else if (Objects.equals(response1, "0")){
            // add chat functionality
        }

        //calls brawlr.InputManager for swipes
        //calls LocationManager for nearest gym location
    }
}
