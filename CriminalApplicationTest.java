/**
 * @author Chris Nelson
 */
package LawEnforcementDatabase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CriminalApplicationTest {
    private CriminalApplication criminalApplication = new CriminalApplication();

    @BeforeEach
    public void setup () {
        PoliceOfficerList.getInstance().getPoliceOfficers().clear();
        DataWriter.savePoliceOfficers();
    }

    @AfterEach
    public void tearDown() {
        PoliceOfficerList.getInstance().getPoliceOfficers().clear();
        DataWriter.savePoliceOfficers();
    }

    @Test
    public void testLogin() {
        criminalApplication.createPoliceOfficer("Bob", "Baker", "bbakes", "bbakes@yahoo.com", 8032123339L, "password", 2, "Long Island", 1623);
        criminalApplication.login("bbakes", "password");
        assertEquals("bbakes", criminalApplication.getUser().getUsername());
    }

    @Test
    public void testSearchByName() {
        criminalApplication.createCriminal("Bob", "Baker", 19, "10/22/00", 01234, 'M', 12935, new ArrayList<Integer>(), "123 Lane", 9.5, 2, true, new ArrayList<String>(), true, new ArrayList<String>());
        ArrayList<Criminal> criminal = criminalApplication.searchByName("Bob", "Baker");
        assertEquals(12935, criminal.get(0).getID());
        
    }
}
