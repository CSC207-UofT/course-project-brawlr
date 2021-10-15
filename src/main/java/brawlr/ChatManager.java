package brawlr;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementing a (client side) control class for chatting, where
 * the client is user1.
 */
public class ChatManager {
    /**
     * A data store of all the conversations held by this user (User1).
     */
    public static Map<User, Chat> conversations = new HashMap<>();
    /**
     * The user who is the current client of this brawlr. ChatManager class.
     */
    private User user1;

    /**
     * A constructor for brawlr.ChatManager class. Instantiates a new controller
     * for chatting for user1.
     * @param user1 Client user.
     */
    public ChatManager(User user1) {
        this.user1 = user1;
    }

    /**
     * Creates a new conversation between user1 and another user
     * chatUser2, and adds it to the database of conversations.
     * @param chatUser2 Conversation partner user.
     */
    public void createChat(User chatUser2) {
        Chat newChat = new Chat(this.user1, chatUser2);
        this.conversations.put(chatUser2, newChat);
    }

    /**
     * Deletes a conversation with a given chatUser2 by removing
     * it from the conversations database.
     * @param chatUser2 Conversation partner user.
     */
    public void deleteChat(User chatUser2) {
        this.conversations.remove(chatUser2);
    }
}
