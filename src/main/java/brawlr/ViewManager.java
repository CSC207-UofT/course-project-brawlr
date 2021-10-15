package brawlr;

import Views.*;
/**
 * Controller class that manages all the View classes
 * */
public class ViewManager {
    /**
     * Calls the HomeView class to display the home screen via HomeView class
     * */
    public static void displayHome(){
        HomeView.displayHome();
    }
    /**
     * Calls the ChatView class to display the brawlr.Chat screen
     * */
    public static void displayChat(User user1, User user2){

        ChatView.displayChat(user1, user2);
    }
    /**
     * Calls the UserCardView class to display the brawlr.User Card, where the user can see other
     * users' ProfileView displays
     * */
    public static void displayCard(String userID){

        System.out.println("card display");
        InputManager.displayCard(userID);
    }
    /**
     * Calls the UserCardView class to display the extendedCard view of the UserCardView
     * */
    public static void displayCardExtended(){

        UserCardView.displayExtendedCard();
    }
    /**
     * Calls the LoginView class to display the login screen, where the existing user is prompted to
     * input their login information
     * */
    public static String displayLogin(){

        String loggedInID = InputManager.sendLoginInput();
        if (loggedInID == null){
            System.out.println("there was a problem loggin you in please try again");
        }
        return loggedInID;
    }
    /**
     * Calls the ProfileView class to display the brawlr.User's profile with the personal information
     * (pictures, biography, personal stats (height, weight, etc.), and controversial opinions)
     * */
    public static void displayProfile(){

        ProfileView.displayProfile();
    }
    /**
     * Calls the UserCreationView class to display the UserCreation screen for new Users
     * */
    public static String displayUserCreation(){

        return InputManager.sendUserCreationInput();
    }
}
