package LawEnforcementDatabase;
import static org.junit.jupiter.api.Assertions.*;

import jdk.jfr.Timestamp;

public class UserTestTemplate {
    private User user = User.getInstance();
    private ArrayList<User> userList = user.getUser();

    @BeforeEach
    public void setup(){
    userList.clear();
    userList.add(new User("jturner", "Jackson", "Turner", 21, "803-666-7777"));
    userList.add(new User("Cconner", "Conner", "Conner", 24, "803-444-5555"));
    DataWriter.saveUsers();
    }

    @AfterEach
    public void tearDown(){
        User.getInstance().getUser().clear();
        DataWriter.saveUser();
    }
    @Test
    void testGetUserSize(){
        userList = DataLoader.getUser();
        assertEquals(2, userList.size());
    }
    @Test
    void testGetUserSizeZero(){
    User.getInstance().getUser().clear();
    assertEquals(0, userList.size());
    }
    @Test
    void testGetUserFirstUserName(){
        userList = DataLoader.getUser();
        assertEquals("jturner", userList.get(0).getUserName());
    }
}
