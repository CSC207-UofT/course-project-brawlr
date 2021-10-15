package brawlr;

import Views.*;

public class ViewManager {
    /*
     * Controller class that manages all the View classes
     * */
    public static void displayHome(){
        /*
        * Calls the HomeView class to display the home screen via HomeView class
        * */
        HomeView.displayHome();
    }
    public static void displayChat(User user1, User user2){
        /*
         * Calls the ChatView class to display the brawlr.Chat screen
         * */
        ChatView.displayChat(user1, user2);
    }
    public static void displayCard(String userID){
        /*
         * Calls the UserCardView class to display the brawlr.User Card, where the user can see other
         * users' ProfileView displays
         * */
        InputManager.displayCard();
    }
    public static void displayCardExtended(){
        /*
         * Calls the UserCardView class to display the extendedCard view of the UserCardView
         * */
        UserCardView.displayExtendedCard();
    }
    public static String displayLogin(){
        /*
         * Calls the LoginView class to display the login screen, where the existing user is prompted to
         * input their login information
         * */
        String loggedInID = InputManager.sendLoginInput();
        if (loggedInID == null){
            System.out.println("there was a problem loggin you in please try again");
        }
        return loggedInID;
    }
    public static void displayProfile(){
        /*
         * Calls the ProfileView class to display the brawlr.User's profile with the personal information
         * (pictures, biography, personal stats (height, weight, etc.), and controversial opinions)
         * */
        ProfileView.displayProfile();
    }
    public static String displayUserCreation(){
        /*
         * Calls the UserCreationView class to display the UserCreation screen for new Users
         * */
        return InputManager.sendUserCreationInput();
    }
}
