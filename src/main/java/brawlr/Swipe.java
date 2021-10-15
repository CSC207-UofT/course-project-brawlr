package brawlr;

public class Swipe {
    /**
     * Method takes 2 users, and adds the user that swipes to the likes of the other user.
     * @param user1 the user doing the swipe
     * @param user2 the user receiving the swipe
     */
    public static void swipeRight(User user1, User user2){
        UserManager.addLike(user1, user2);
    }

    /**
     * Method takes 2 users, and calls the UserManager addSeenUser method to add user 2 to user1's seen users.
     * @param user1 the user doing the swipe
     * @param user2 the user receiving the swipe
     */
    public static void swipeLeft(User user1, User user2){
        UserManager.addSeenUser(user1, user2);
    }
}
