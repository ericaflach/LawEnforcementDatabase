package LawEnforcementDatabase;
/**
 * @author Ben Friend
 */



import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
public class SuspectListTest {
    private static SuspectList suspectList;
    private static ArrayList<Suspect> suspects;

    @BeforeEach
    public void setup(){
        suspects = DataLoader.getSuspects();
        suspectList = SuspectList.getInstance();
    }

    @AfterEach
    public void tearDown(){
        suspects.clear();
    }

    @Test
    public void testHasSuspect(){
        boolean hasSuspect= suspectList.haveSuspect("Jonathon", "Rogers");
        assertTrue(hasSuspect);
    }

    @Test
    public void testHasNoSuspect(){
        boolean hasSuspect= suspectList.haveSuspect("Ben", "Friend");
        assertFalse(hasSuspect);
    }

    @Test
    public void testAddNewSuspect(){
        boolean addSuspect= suspectList.addSuspect("Ben", "Friend", 20, "10/07/2000", 14, 'm', 2426, null, "1 your street", 11.0, 2, true, null, false, null, "Girlfriend's house");
        assertTrue(addSuspect);
    }

    @Test
    public void testAddOldSuspect(){
        boolean addSuspect= suspectList.addSuspect("Jonathon", "Rogers", 62, "05/10/1959", 2501, 'm', 2426, null, "578 Currier Dr, Augusta, GA", 9.5, 2, true, null, false, null, "N/A");
        assertFalse(addSuspect);
    }

}
