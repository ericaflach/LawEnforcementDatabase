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
public class CriminalListTest {
    private static CriminalList criminalList; 
    private static ArrayList<Criminal> criminals;

    @BeforeEach
    public void setup(){
        criminals = DataLoader.getCriminals();
        criminalList = new CriminalList();
    }

    @AfterEach
    public void tearDown(){
        criminals.clear();
    }

    @Test
    public void testHasCriminal(){
        boolean hasCriminal=CriminalList.haveCriminal("Megan", "Watson");
        assertTrue(hasCriminal);
    }

    @Test
    public void testHasNoCriminal(){
        boolean hasCriminal=CriminalList.haveCriminal("Ben", "Friend");
        assertFalse(hasCriminal);
    }

    @Test
    public void testAddNewCriminal(){
        boolean addCriminal=CriminalList.addCriminal("Ben", "Friend", 20, "10/07/2000", 14, 'm', 2426, null, "1 nowhere lane", 10.5, 1, true, null, false, null);
        assertTrue(addCriminal);
    }

    @Test
    public void testAddOldCriminal(){
        boolean addCriminal=CriminalList.addCriminal("Megan", "Watson", 44, "05/03/1977", 8675, 'f', 2965, null, "13 Cali Dr.", 9.5, 2, true, null, false, null);
        assertFalse(addCriminal);
    }

}
