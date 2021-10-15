import brawlr.Chat;
import brawlr.User;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChatTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    public void testSendMessage() {
        HashMap<String, String> testMap = new HashMap<>();
        User u1 = new User("u1", testMap, testMap, "", "", "", true);
        User u2 = new User("u2", testMap, testMap, "", "", "", true);
        Chat c1 = new Chat(u1, u2);
        c1.SendMessage(u1, u2, "Hello, I'm here.", true);
        c1.SendMessage(u1, u2, "Hi, I'm here as well.", true);
        assertEquals(c1.DisplayLog().size(), 2);
    }

    @Test()
    public void testDisplayLog() {
        HashMap<String, String> testMap = new HashMap<>();
        User u1 = new User("u1", testMap, testMap, "", "", "", true);
        User u2 = new User("u2", testMap, testMap, "", "", "", true);
        Chat c1 = new Chat(u1, u2);
        List<String> chatLog = c1.DisplayLog();
        assertEquals(chatLog, c1.DisplayLog());
    }
}