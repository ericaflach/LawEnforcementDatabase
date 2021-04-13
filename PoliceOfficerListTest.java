/**
 * @author Ben Friend
 */



import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
public class PoliceOfficerListTest {
    private static PoliceOfficerList officerList;
    private static ArrayList<PoliceOfficer> policeOfficers;

    @BeforeEach
    public void setup(){
        policeOfficers = DataLoader.getPoliceOfficers();
        officerList = new PoliceOfficerList();
    }

    @AfterEach
    public void tearDown(){
        policeOfficers.clear();
    }

    @Test
    public void testHasOfficer(){
        boolean hasOfficer=PoliceOfficerList.havePoliceOfficer("youPick");
        assertTrue(hasOfficer);
    }

    @Test
    public void testHasNoOfficer(){
        boolean hasOfficer=PoliceOfficerList.havePoliceOfficer("bfriend");
        assertFalse(hasOfficer);
    }

    @Test
    public void testAddNewOfficer(){
        boolean addOfficer=PoliceOfficerList.addUser("Ben", "Friend", "bfriend", "Password1!", "bfriend@email.sc.edu", (long) 6140671, 1, 14, "Bucks County", null, null);
        assertTrue(addOfficer);
    }

    @Test
    public void testAddOldOfficer(){
        boolean addOfficer=PoliceOfficerList.addUser("You", "Pick", "youPick", "password", "ypick@sb.gov", (long) 803444555, 2, 1740, "You Pick Police Department", null, null);
        assertFalse(addOfficer);
    }

}
