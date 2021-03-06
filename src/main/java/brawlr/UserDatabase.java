package brawlr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserDatabase {
    // ramy: should the users map be final if you're gonna be adding to it?
    private static Map<String, User> users = new HashMap<>();

    /**
     * Finds all the unseen users based on who the User has already seen.
     * @param seenUsers the Map of seen User objects from the User object
     * @return the Map of unseen User objects from the User object
     */
    public static Map<String, User> getUnseenUsers(Map<String, User> seenUsers){
        Map<String, User> unseenUsers = new HashMap<>();
        Set<String> keys = users.keySet();
        for (String key : keys){
            if (!seenUsers.containsKey(key)){
                unseenUsers.put(key, getUser(key));
            }
        }
        return unseenUsers;
    }

    /**
     * Add a user to this user list.
     *
     * @param user the user to add
     */
    public static void add(User user) {
        users.put(user.getId(), user);
    }

    /**
     * Return the brawlr.User with a given ID.
     * @param ID the username of the user to get.
     */
    public static User getUser(String ID) {
        return users.get(ID);
    }
}