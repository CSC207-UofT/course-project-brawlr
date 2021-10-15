import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
    // ramy: should the users map be final if you're gonna be adding to it?
    private Map<String, User> users = new HashMap<>();

    /**
     * Add a user to this user list.
     *
     * @param user the user to add
     */
    public void add(User user) {
        users.put(user.getId(), user);
    }

    /**
     * Return the User with a given ID.
     * @param ID the username of the user to get.
     */
    public User getUser(String ID) {
        return users.get(ID);
    }
}