/**
 * @author Chris Nelson
 */

package LawEnforcementDatabase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class DataWriterTest {
    private AdminList adminList = AdminList.getInstance();
    private ArrayList<Admin> admins = adminList.getAdmins();
    private PoliceOfficerList officerList = PoliceOfficerList.getInstance();
    private ArrayList<PoliceOfficer> policeOfficers = officerList.getPoliceOfficers();

    @BeforeEach
    public void setup() {
        AdminList.getInstance().getAdmins().clear();
        admins = AdminList.getInstance().getAdmins();
        DataWriter.saveAdmins();
    }

    @AfterEach
    public void tearDown() {
        AdminList.getInstance().getAdmins().clear();
        DataWriter.saveAdmins();
    }

    @Test
    public void testWritingZeroAdmins() {
        admins = adminList.getAdmins();
        assertEquals(0, admins.size());
    }

    @Test 
    public void testWritingOneAdmin() {
        System.out.println(admins.toString());
        admins.add(new Admin("Amy", "Smith", "asmith", "password", "asmith@gmail.com", 8642234231L, 2, 1123));
        DataWriter.saveAdmins();
        assertEquals("asmith", DataLoader.getAdmins().get(0).getUsername());
    }

    
    @Test 
    public void testWritingOneUser() {
        policeOfficers.add(new PoliceOfficer("Bob", "Baker", "bbakes", "password", "bbakes@yahoo.com", 8032123339L, 2, 11242, "Long Island", new ArrayList<Integer>(), new ArrayList<Integer>()));
        DataWriter.saveAdmins();
        assertEquals("bbakes", DataLoader.getPoliceOfficers().get(0).getUsername());
    }
}