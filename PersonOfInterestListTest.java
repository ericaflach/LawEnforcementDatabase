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
public class PersonOfInterestListTest {
    private static PersonOfInterestList personsOfInterestList;
    private static ArrayList<PersonOfInterest> personsOfInterest;

    @BeforeEach

    public void setup(){
        personsOfInterest = DataLoader.getPeopleOfInterest();
        personsOfInterestList = new PersonOfInterestList();
    }

    @AfterEach

    public void tearDown(){
        personsOfInterest.clear();
    }

    @Test

    public void testHasPOI(){
        boolean hasPOI=PersonOfInterestList.havePersonOfInterest("Carl", "Jenkins");
        assertTrue(hasPOI);
    }

    @Test

    public void testHasNoAdmin(){
        boolean hasPOI=PersonOfInterestList.havePersonOfInterest("Ben", "Friend");
        assertFalse(hasPOI);
    }

    @Test

    public void testAddNewCriminal(){
        boolean addPOI=PersonOfInterestList.addPersonOfInterest("Ben", "Friend", 20, "10/07/2000", 14, 'm', null, "2676140671");
        assertTrue(addPOI);
    }

    @Test

    public void testAddOldAdmin(){
        boolean addPOI=PersonOfInterestList.addPersonOfInterest("Carl", "Jenkins", 65, "05/10/195", 8941, 'm', "Older man", "N/A");
        assertFalse(addPOI);
    }

}
