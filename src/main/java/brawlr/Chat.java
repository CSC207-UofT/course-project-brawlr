package brawlr;

import java.util.ArrayList;
import java.util.List;

/**
 * Normally this should be a client-side-only class but because
 * we're going for a pretty abstract implementation at the moment,
 * this class will allow both user1 (client) and some user2 to enter messages
 * into a chat log.
 */
public class Chat {
    /**
     * Instantiates a new database of the message history
     * for the current chat.
     */
    ArrayList<String> history = new ArrayList<>();
    public User User1;
    public User User2;

    /**
     * Constructor to instantiate a new conversation between
     * User1 and User2.
     * @param User1 One of two users in the chat.
     * @param User2 One of two users in the chat.
     */
    public Chat(User User1, User User2) {
        this.User1 = User1;
        this.User2 = User2;
    }

    /**
     * A method to send a new message and add it to the history
     * ArrayList. Will change the sender depending on whether
     * it's user1 currently sending or user2.
     *
     * Also, how the boolean IsUser1 will be changed is
     * something we won't deal with for now. All of this will
     * later be replaced by server and socket implementations.
     *
     * @param User1 One of two users in the chat.
     * @param User2 One of two users in the chat.
     * @param Message the string of the message written by a user.
     * @param IsUser1 a boolean to check which user is the sender.
     */
    public void SendMessage(User User1, User User2, String Message, boolean IsUser1){
        String u1name = User1.getId();
        String u2name = User2.getId();
        if (IsUser1) {
            history.add(u1name + ": " + Message);
        } else {
            history.add(u2name + ":" + Message);
        }
    }

    /**
     * Returns the complete chat log.
     * @return returns the chat log list.
     */
    public List<String> DisplayLog() {
        return history;
    }

}