package brawlr;

import java.util.HashMap;
import java.util.ArrayList;

public class User {
    private final String id;
    private HashMap<String, String> loginInfo;
    private HashMap<String, String> personalStats;
    private String fightingStyle;
    private String biography;
    private String controversialOpinions;
    private ArrayList<User> seenUsers;
    private ArrayList<User> likes;
    private ArrayList<User> matches;
    private boolean isLoggedIn;
    private ChatManager userCM;

    public User(String id, HashMap<String, String> loginInfo, HashMap<String, String> personalStats,
                String fightingStyle, String biography, String controversialOpinions, boolean isLoggedIn){
        this.id = id;
        this.loginInfo = loginInfo;
        this.personalStats = personalStats;
        this.fightingStyle = fightingStyle;
        this.biography = biography;
        this.controversialOpinions = controversialOpinions;
        this.seenUsers = new ArrayList<>();
        this.likes = new ArrayList<>();
        this.matches = new ArrayList<>();
        this.isLoggedIn = false;
        this.userCM = new ChatManager(this);
    }

    /**
     * getters and setters for brawlr.User attributes
     *
     */

    public String getId(){
        return this.id;
    }

    public ChatManager getuserCM(){
        return this.userCM;
    }

    public HashMap<String, String> getLoginInfo(){
        return this.loginInfo;
    }

    public HashMap<String, String> getPersonalStats(){
        return this.personalStats;
    }

    public String getFightingStyle(){
        return this.fightingStyle;
    }

    public String getBiography(){
        return this.biography;
    }

    public String getControversialOpinions(){
        return this.controversialOpinions;
    }

    public ArrayList<User> getSeenUsers(){
        return this.seenUsers;
    }

    public ArrayList<User> getLikes(){
        return this.likes;
    }

    public ArrayList<User> getMatches(){
        return this.matches;
    }

    public void setLoginInfo(HashMap<String, String> loginInfo){
        this.loginInfo = loginInfo;
    }

    public void setPersonalStats(HashMap<String, String> personalStats){
        this.personalStats = personalStats;
    }

    public void setFightingStyle(String fightingStyle){
        this.fightingStyle = fightingStyle;
    }

    public void setBiography(String biography){
        this.biography = biography;
    }

    public void setControversialOpinions(String controversialOpinions){
        this.controversialOpinions = controversialOpinions;
    }

    /**
     *Takes a different instance of User, and to the seen users of this instance of User
     * @param user the user to add
     */

    public void addSeenUser(User user){
        this.seenUsers.add(user);
    }

    /**
     *akes a different instance of User, and to the likes of this instance of User
     * @param user the user to add
     */

    public void addLike(User user){
        this.likes.add(user);
    }

    /**
     * Takes a different instance of User, and to the matches of this instance of User
     * @param user the user to add
     */

    public void addMatch(User user){
        this.matches.add(user);
    }

    /**
     * Logs the user in
     */
    public void logIn(){
        this.isLoggedIn = true;
    }

    /**
     * Logs the user out
     */
    public void logOut(){
        this.isLoggedIn = false;
    }

    public boolean loggedIn(){
        return this.isLoggedIn;
    }
}
