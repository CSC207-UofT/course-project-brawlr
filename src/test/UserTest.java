import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void addSeenUser() {
        HashMap<String, String> testMap = new HashMap<>();
        User u1 = new User("u1", testMap, testMap, "", "", "");
        User u2 = new User("u2", testMap, testMap, "", "", "");
        ArrayList<User> testList = new ArrayList<>();

        u1.addSeenUser(u2);
        testList.add(u2);
        assertEquals(u1.getSeenUsers(), testList);
    }

    @org.junit.jupiter.api.Test
    void addLike() {
        HashMap<String, String> testMap = new HashMap<>();
        User u1 = new User("u1", testMap, testMap, "", "", "");
        User u2 = new User("u2", testMap, testMap, "", "", "");
        ArrayList<User> testList = new ArrayList<>();

        u1.addLike(u2);
        testList.add(u2);
        assertEquals(u1.getLikes(), testList);
    }

    @org.junit.jupiter.api.Test
    void addMatch() {
        HashMap<String, String> testMap = new HashMap<>();
        User u1 = new User("u1", testMap, testMap, "", "", "");
        User u2 = new User("u2", testMap, testMap, "", "", "");
        ArrayList<User> testList = new ArrayList<>();

        u1.addMatch(u2);
        testList.add(u2);
        assertEquals(u1.getMatches(), testList);
    }
}