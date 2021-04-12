package LawEnforcementDatabase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
public class DataWriterTest {
    private AdminList Admins = AdminList.getInstance();
    private ArrayList<Admin> admins = Admins.getAdmins();

    @Test
    public void setup(){
        admins.clear();
        admins.add(new Admin("Amy", "Smith", "asmith", "IloveFrodo", "asmith.gov", 8034543344, 3, 234123));
        admins.add(new Admin("Clark", "Sith", "csith", "DarthVader33", "csith.gov", 8033333344, 3, 234339));
        DataWriter.saveAdmins();
    }
    @Test
    public void tearDown(){
        AdminList.getInstance().getAdmins().clear();
        DataWriter.saveAdmins();
    }
    @Test
    void testWritingZeroAdmins(){
        admins = DataLoader.getAdmins();
        assertEquals(0, admins.size());
    }
    @Test
    void testWritingOneUser(){
        AdminList.getInstance().getAdmins().clear();
        assertEquals(0, admins.size());
    }
    @Test
    void testWritingFiveUsers(){
        admins = DataLoader.getAdmins();
        assertEquals("jturner", admins.get(0).getUsername());
    }
}