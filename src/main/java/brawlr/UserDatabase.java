package brawlr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserDatabase {
    // ramy: should the users map be final if you're gonna be adding to it?
    private static Map<String, User> users = new HashMap<>();

    public static Map<String, User> getUnseenUsers(Map<String, User> seenUsers){
        Map<String, User> unseenUsers = new HashMap<String, User>();
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