import brawlr.Chat;
import brawlr.ChatManager;
import brawlr.User;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ChatManagerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    public void testCreateChat() {
        HashMap<String, String> testMap = new HashMap<>();
        User u1 = new User("u1", testMap, testMap, "", "", "", true);
        User u2 = new User("u2", testMap, testMap, "", "", "", true);
        ChatManager cm1 = new ChatManager(u1);
        cm1.createChat(u2);
        User user2 = cm1.conversations.get(u2).User2;
        assertEquals(user2, u2);
    }

    @org.junit.jupiter.api.Test
    public void testDeleteChat() {
        HashMap<String, String> testMap = new HashMap<>();
        User u1 = new User("u1", testMap, testMap, "", "", "", true);
        User u2 = new User("u2", testMap, testMap, "", "", "", true);
        ChatManager cm1 = new ChatManager(u1);
        cm1.createChat(u2);
        cm1.deleteChat(u2);
        assertFalse(cm1.conversations.containsKey(u2));
    }
}
