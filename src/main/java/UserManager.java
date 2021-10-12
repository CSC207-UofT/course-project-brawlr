public class UserManager {
    /**
     * this method takes 2 users; user1 and user2. First it adds user2 to user1's seenUsers map.
     * The method then checks if user1's id is in user2's likes map If user1 is not in user2's
     * likes map It then adds a like to user2 coming from user1. If user1 is
     * in user2's likes list it then calls the addMatch function with user1 and user2.
     *
     * @param user1 A user object representing the user that did the right swipe
     * @param user2 A user object representing the user that received a right swipe
     */


    public static void addLike(User user1, User user2){
        user2.addLike(user1);
        // TODO: 10/11/2021
    }
    /**
     * this method takes 2 users; user1 and user2. It then adds user1 to user2's matches map and adds
     * user2 to user1's matches map
     *
     * @param user1 A user object representing the user that did the right swipe
     * @param user2 A user object representing the user that received a right swipe
     */
    public static void addMatch(User user1, User user2){
        user2.addMatch(user1);
        user1.addMatch(user2);
        // TODO: 10/11/2021
    }
    /**
     * this method takes 2 users; user1 and user2. It then adds user2 to user1's seenUsers map
     *
     * @param user1 A user object representing the user that did the right swipe
     * @param user2 A user object representing the user that received a right swipe
     */
    public static void addSeenUser(User user1, User user2){
        user1.addSeenUser(user2);
        // TODO: 10/11/2021
    }
}
