/**
 * @author Chris Nelson
 */

package LawEnforcementDatabase;

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
        
    }

    @Test 
    public void testWritingOneAdmin() {
        admins.add(new Admin("Amy", "Smith", "asmith", "password", "asmith@gmail.com", 8642234231L, 2, 1123));
        System.out.println(admins.toString());
    }

    
    @Test 
    public void testWritingOneUser() {
        
        policeOfficers.add(new PoliceOfficer("Bob", "Baker", "bbakes", "password", "bbakes@yahoo.com", 8032123339L, 2, 11242, "Long Island", new ArrayList<Integer>(), new ArrayList<Integer>()));
        
    }
}