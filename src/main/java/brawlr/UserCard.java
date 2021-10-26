package brawlr;

import java.util.HashMap;

public class UserCard extends User{
    private boolean extended;

    /**
     * Creates a User object based on the inputted information for the User
     * attributes.
     *
     * @param id                    unique username created by new users
     * @param loginInfo             username and password stored in Hashmap
     * @param personalStats         user's inputted answers to weight, height, gender, etc.
     * @param fightingStyle         user's indicated preferred fighting/sparring style
     * @param biography             user's inputted biography
     * @param controversialOpinions user's inputted controversial opinions
     * @param isLoggedIn            boolean regarding whether the client user is logged in or not
     */
    public UserCard(String id, HashMap<String, String> loginInfo, HashMap<String, String> personalStats,
                    String fightingStyle, String biography, String controversialOpinions, boolean isLoggedIn) {
       super(id, loginInfo, personalStats, fightingStyle, biography, controversialOpinions, isLoggedIn);
       this.extended = false;
        // Contains all user attributes, but will not display all unless extend is called
    }


    public void displayCard(){
        if (extended){
            ViewManager.displayCardExtended(this.getId());
        }
        else {
            ViewManager.displayCard(this.getId());
        }
    }

    public void extend() {
        this.extended = true;
    }

    public void contract() {
        this.extended = false;
    }
}
