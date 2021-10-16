import brawlr.User;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void addSeenUser() {
        HashMap<String, String> testMap = new HashMap<>();
        User u1 = new User("u1", testMap, testMap, "", "", "", true);
        User u2 = new User("u2", testMap, testMap, "", "", "", true);
        HashMap<String, User> testMap2 = new HashMap<>();

        u1.addSeenUser(u2);
        testMap2.put(u2.getId(), u2);
        assertEquals(u1.getSeenUsers(), testMap2);
    }

    @org.junit.jupiter.api.Test
    void addLike() {
        HashMap<String, String> testMap = new HashMap<>();
        User u1 = new User("u1", testMap, testMap, "", "", "", true);
        User u2 = new User("u2", testMap, testMap, "", "", "", true);
        ArrayList<User> testList = new ArrayList<>();

        u1.addLike(u2);
        testList.add(u2);
        assertEquals(u1.getLikes(), testList);
    }

    @org.junit.jupiter.api.Test
    void addMatch() {
        HashMap<String, String> testMap = new HashMap<>();
        User u1 = new User("u1", testMap, testMap, "", "", "", true);
        User u2 = new User("u2", testMap, testMap, "", "", "", true);
        ArrayList<User> testList = new ArrayList<>();

        u1.addMatch(u2);
        testList.add(u2);
        assertEquals(u1.getMatches(), testList);
    }
}