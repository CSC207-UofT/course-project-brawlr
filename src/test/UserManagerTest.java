import brawlr.User;
import brawlr.UserManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void addLike() {
        HashMap<String, String> testMap = new HashMap<>();
        User user1 = new User("u1", testMap, testMap, "", "", "", true);
        User user2 = new User("u2", testMap, testMap, "", "", "", true);
        UserManager.addLike(user1, user2);
        assertTrue(user2.getLikes().contains(user1));
        UserManager.addLike(user2, user1);
        assertTrue(user1.getLikes().contains(user2));
    }

    @Test
    public void addMatch() {
    }

    @Test
    public void addSeenUser() {
    }
}