package LawEnforcementDatabase;
/**
 * @author Ben Friend
 */



import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
public class AdminListTest {
    private AdminList adminList;
    private ArrayList<Admin> admins;

    @BeforeEach
    public void setup(){
        admins=DataLoader.getAdmins();
        adminList= AdminList.getInstance();
    }

    @AfterEach
    public void tearDown(){
        admins.clear();
    }

    @Test
    public void testHasAdmin(){
        boolean hasAdmin= adminList.haveAdmin("Jbakes");
        assertTrue(hasAdmin);
    }

    @Test
    public void testHasNoAdmin(){
        boolean hasAdmin=adminList.haveAdmin("benfriend");
        assertFalse(hasAdmin);
    }

    @Test
    public void testAddNewAdmin(){
        boolean addAdmin=adminList.addAdmin("Ben", "Friend", "bfriend", "Password1!", "bfriend@email.sc.edu", (long) 6140671, 3, 14);
        assertTrue(addAdmin);
    }

    @Test
    public void testAddOldAdmin(){
        boolean addAdmin= adminList.addAdmin("Jake", "Bakes", "Jbakes", "Yak22beF!", "jbrakes@sb.gov", (long) 843221001, 3, 2426);
        assertFalse(addAdmin);
    }

}
