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

    @Test()
    public void testCreateChat() {
        HashMap<String, String> testMap = new HashMap<>();
        User u1 = new User("u1", testMap, testMap, "", "", "", true);
        User u2 = new User("u2", testMap, testMap, "", "", "", true);
        ChatManager cm1 = new ChatManager(u1);
        cm1.createChat(u2);
        Chat newChat = new Chat(u1, u2);
        assertEquals(cm1.conversations.get(u1), newChat);
    }

    @Test()
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
