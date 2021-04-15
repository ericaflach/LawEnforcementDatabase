/**
 * @author Chris Nelson
 */

package LawEnforcementDatabase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class DataWriterTest {
    private AdminList adminList = AdminList.getInstance();
    private ArrayList<Admin> admins = AdminList.getInstance().getAdmins();
    private PoliceOfficerList officerList = PoliceOfficerList.getInstance();
    private ArrayList<PoliceOfficer> policeOfficers = officerList.getPoliceOfficers();

    @BeforeEach
	public void setup() {
		AdminList.getInstance().getAdmins().clear();
        PoliceOfficerList.getInstance().getPoliceOfficers().clear();
        DataWriter.savePoliceOfficers();
        DataWriter.saveAdmins();
        System.out.println("Before");
	}

    @AfterEach
    public void tearDown() {
        AdminList.clear();
        PoliceOfficerList.getInstance().getPoliceOfficers().clear();
        DataWriter.saveAdmins();
        DataWriter.savePoliceOfficers();
    }

    @Test
    public void testWritingZeroAdmins() {
        setup();
        admins = adminList.getAdmins();
        assertEquals(0, admins.size());
        tearDown();
    }

    @Test
    public void testWritingOneAdmin() {
        adminList.addAdmin("Amy", "Smith", "asmith", "password", "asmith@gmail.com", 8642234231L, 2, 1123);
        DataWriter.saveAdmins();
        assertEquals("asmith", DataLoader.getAdmins().get(0).getUsername());
    }
    
    @Test
    public void testWritingFiveAdmin() {
        setup();
        adminList.addAdmin("Amy", "Smith", "sdfsdf", "password", "ghhew@gmail.com", 8642234231L, 2, 1123);
        adminList.addAdmin("Amy", "Smith", "rgwfe", "password", "wefe@gmail.com", 8642234231L, 2, 1123);
        adminList.addAdmin("Amy", "Smith", "dshbrwg", "password", "wecbr@gmail.com", 8642234231L, 2, 1123);
        adminList.addAdmin("Amy", "Smith", "fewefwe", "password", "ggee@gmail.com", 8642234231L, 2, 1123);
        adminList.addAdmin("Amy", "Smith", "asmith", "password", "asmith@gmail.com", 8642234231L, 2, 1123);
        DataWriter.saveAdmins();
        assertEquals("asmith", DataLoader.getAdmins().get(4).getUsername());
        tearDown();
    }
    
    @Test 
    public void testWritingOnePoliceOfficer() {
        setup();
        policeOfficers.add(new PoliceOfficer("Bob", "Baker", "bsedfk", "password", "bbakes@yahoo.com", 8032123339L, 2, 11242, "Long Island", new ArrayList<Integer>(), new ArrayList<Integer>()));
        DataWriter.savePoliceOfficers();
        assertEquals("bsedfk", DataLoader.getPoliceOfficers().get(0).getUsername());
        tearDown();
    }
    @Test
    public void testWritingFivePoliceOfficer() {
        setup();
        policeOfficers.add(new PoliceOfficer("Bob", "Bake", "sdfsd", "password", "bbakes@yahoo.com", 8032123339L, 2, 11242, "Long Island", new ArrayList<Integer>(), new ArrayList<Integer>()));
        policeOfficers.add(new PoliceOfficer("Bob", "Try", "sfdsd", "password", "bbakes@yahoo.com", 8032123339L, 2, 11242, "Long Island", new ArrayList<Integer>(), new ArrayList<Integer>()));
        policeOfficers.add(new PoliceOfficer("Bob", "There", "erwer", "password", "bbakes@yahoo.com", 8032123339L, 2, 11242, "Long Island", new ArrayList<Integer>(), new ArrayList<Integer>()));
        policeOfficers.add(new PoliceOfficer("Bob", "Where", "wegwe", "password", "bbakes@yahoo.com", 8032123339L, 2, 11242, "Long Island", new ArrayList<Integer>(), new ArrayList<Integer>()));
        policeOfficers.add(new PoliceOfficer("Bob", "Hi", "bbakes", "password", "bbakes@yahoo.com", 8032123339L, 2, 11242, "Long Island", new ArrayList<Integer>(), new ArrayList<Integer>()));
        DataWriter.savePoliceOfficers();
        assertEquals("bbakes", DataLoader.getPoliceOfficers().get(4).getUsername());
        tearDown();
    }
}