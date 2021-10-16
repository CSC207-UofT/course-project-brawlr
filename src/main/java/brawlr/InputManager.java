package brawlr;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
public class InputManager {
    /**
     * Allows the new user to input answers to questionnaire so that their profile/User
     * account can be created. Instantiates a User object using the information
     * inputted.
     */
    public static String sendUserCreationInput(){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your username:");
        String userId = in.nextLine();

        System.out.println("Please enter your password:");
        String pass = in.nextLine();

        HashMap<String, String> loginInfo = new HashMap<>();
        loginInfo.put(userId, pass);

        System.out.println("Please attach any pictures for your profile:");
        String pictures = in.nextLine();

        System.out.println("Please enter a biography:");
        String bio = in.nextLine();

        System.out.println("Please enter your preferred fighting style:");
        String fs = in.nextLine();

        System.out.println("Please enter your height:");
        String height = in.nextLine();

        System.out.println("Please enter your weight:");
        String weight = in.nextLine();

        System.out.println("Please enter your gender:");
        String gender = in.nextLine();

        HashMap<String, String> personalStats = new HashMap<>();
        personalStats.put("height", height);
        personalStats.put("weight", weight);
        personalStats.put("gender", gender);

        System.out.println("Please enter a controversial opinion:");
        String opinion = in.nextLine();
        User newUser = new User(userId, loginInfo, personalStats, fs, bio, opinion, true);
        newUser.addSeenUser(newUser);
        UserDatabase.add(newUser);
        return userId;
    }
    /**
     * Allows the existing user to log in with their username and password,
     * and checks if the login info is inputted corrected
     */
    public static String sendLoginInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String userId = in.nextLine();
        System.out.println("Please enter your password:");
        String pass = in.nextLine();
        boolean success = UserManager.login(userId, pass);
        if (!success){
            System.out.println("Successfuly logged in");
            return userId;
        }
        return null;
    }

    /**
     * Displays all the user information from each of the unseen users that
     * are found from the unseen users in the HashMap
     * from the User object associated with the userID parameter.
     * Does this in "rounds" after each swipe, which adds the user to seen
     * and adds the user to Client user's likes if swiped right.
     * @param userID inputted unique username/userID
     */
    public static void displayCard(String userID){
        System.out.println("input manager");
        Scanner in = new Scanner(System.in);
        User mainUser = UserDatabase.getUser(userID);
        Map<String, User> seenUsers = mainUser.getSeenUsers();
        Map<String, User> unseenUsers = UserDatabase.getUnseenUsers(seenUsers);
        for (User user : unseenUsers.values()){
            user.print();
            System.out.println("Do you want to fight them? press 1 if yes press 0 if no");
            String swipe = in.nextLine();
            if (Objects.equals(swipe, "1")){
                UserManager.addLike(mainUser, user);
                System.out.println("you successfully asked to fight them");
            }
            else {
                UserManager.addSeenUser(mainUser, user);
                System.out.println("you successfully avoided fighting them");
            }
        }
        System.out.println("you have swipe through all users.");
    }
}
