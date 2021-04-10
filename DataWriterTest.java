package LawEnforcementDatabase;

import static org.junit.jupiter.api.Assertions.*;

public class DataWriterTest {
    private User user = User.getInstance();
    private ArrayList<User> userList = user.getUser();

    @BeforeEach
    public void setup(){
        Users.getInstance().getUser()().clear();
        DataWriter.saveUser();
    }

    @AfterEach
    public void tearDown(){
        User.getInstance().getUser().clear();
        DataWriter.saveUser();
    }
    @Test
    void testWritingZeroUsers(){
        userList = DataLoader.getUser();
        assertEquals(0, userList.size());
    }
    @Test
    void testWritingOneUser(){
    User.getInstance().getUser().clear();
    assertEquals(0, userList.size());
    }
    @Test
    void testWritingFiveUsers(){
        userList = DataLoader.getUser();
        assertEquals("jturner", userList.get(0).getUserName());
    }
}