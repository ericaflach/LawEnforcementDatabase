package LawEnforcementDatabase;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
public class DataWriterTest {
    private AdminList Admin = AdminList.getInstance();
    private ArrayList<Admin> adminList= Admin.getAdmins();

    @Test
    public void setup(){
        Admin.getInstance().getUser()().clear();
        DataWriter.saveUser();
    }

    @Test
    public void tearDown(){
        Admin.getInstance().getUser().clear();
        DataWriter.saveAdmins();
    }
    @Test
    void testWritingZeroAdmins(){
        adminList = DataLoader.getAdmins();
        assertEquals(0, adminList.size());
    }
    @Test
    void testWritingOneUser(){
        Admin.getInstance().getAdmins().clear();
        assertEquals(0, aminList.size());
    }
    @Test
    void testWritingFiveUsers(){
        adminList = DataLoader.getAdmins();
        assertEquals("jturner", adminList.get(0).getUserName());
    }
}