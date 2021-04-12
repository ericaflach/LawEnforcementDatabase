/**
 * @author Caleb Howard 
 */

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
        admins.add(new admins("Amy", "Smith", "asmith", "IloveFrodo", "asmith.gov", "803-454-3344", 3, 234123));
        admins.add(new admins("Clark", "Sith", "csith", "DarthVader33", "csith.gov", "803-333-3344", 3, 234339));
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