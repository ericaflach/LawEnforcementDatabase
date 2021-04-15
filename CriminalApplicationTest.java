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
        CriminalList.getInstance().getCriminals().clear();
        System.out.println(CriminalList.getInstance().getCriminals().toString());
        DataWriter.savePoliceOfficers();
        DataWriter.saveCriminals();
    }

    @AfterEach
    public void tearDown() {
        PoliceOfficerList.getInstance().getPoliceOfficers().clear();
        CriminalList.getInstance().getCriminals().clear();
        DataWriter.savePoliceOfficers();
        DataWriter.saveCriminals();
    }

    @Test
    public void testLogin() {
        criminalApplication.createPoliceOfficer("Bob", "Baker", "bade", "bbakes@yahoo.com", 8032123339L, "password", 2, "Long Island", 1623);
        criminalApplication.login("bade", "password");
        assertEquals("bade", criminalApplication.getUser().getUsername());
    }

    @Test
    public void testSearchByName() {
        criminalApplication.createCriminal("firstName", "lastName", 19, "10232", 101, 'M', 1123, new ArrayList<Integer>(), "101 ABC", 9, 2, true, new ArrayList<String>(), true, new ArrayList<String>());
        ArrayList<Criminal> criminal = criminalApplication.searchByName("firstName", "lastName");
        System.out.println(criminal.get(0).getID());
        assertEquals(101, criminal.get(0).getID());
        
    }

    @Test
    public void testSearchByAge() {
        criminalApplication.createCriminal("firstName", "lastName", 19, "10232", 101, 'M', 1123, new ArrayList<Integer>(), "101 ABC", 9, 2, true, new ArrayList<String>(), true, new ArrayList<String>());
        ArrayList<Criminal> criminal = criminalApplication.searchByName("firstName", "lastName");
        System.out.println(criminal.get(0).getID());
        assertEquals(19, criminal.get(0).getAge());
    }

    @Test
    public void testSearchByLocation() {
        setup();
        criminalApplication.createCriminal("firstName", "lastName", 19, "10232", 101, 'M', 1123, new ArrayList<Integer>(), "101 ABC Lane, Greenville, South Carolina", 9, 2, true, new ArrayList<String>(), true, new ArrayList<String>());
        ArrayList<Criminal> criminal = criminalApplication.searchByLocation("Greenville", "South Carolina");
        System.out.println(criminal.get(0).getID());
        assertEquals(101, criminal.get(0).getID());
    }
}
