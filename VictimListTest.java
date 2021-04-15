/**
 * @author Ben Friend
 */
package LawEnforcementDatabase;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
public class VictimListTest {
    private static VictimList victimList;
    private static ArrayList<Victim> victims;

    @BeforeEach
    public void setup(){
        victims = DataLoader.getVictims();
        victimList = VictimList.getInstance();
    }

    @AfterEach
    public void tearDown(){
        victims.clear();
    }

    @Test
    public void testHasVictim(){
        boolean hasVictim= victimList.haveVictim("Mary", "Banks");
        assertTrue(hasVictim);
    }

    @Test
    public void testHasNoVictim(){
        boolean hasVictim= victimList.haveVictim("Ben", "Friend");
        assertFalse(hasVictim);
    }

    @Test
    public void testAddNewVictim(){
        boolean addVictim= victimList.addVictim("Ben", "Friend", 20, "10/07/2000", 14, 'm', null, "2676140671");
        assertTrue(addVictim);
    }

    @Test
    public void testAddOldVictim(){
        boolean addVictim= victimList.addVictim("Mary", "Banks", 23, "05/10/1998", 9875, 'f', "Victim was sexually assualted at Pawleys Night club at 22:34.", "(864)-331-4455");
        assertFalse(addVictim);
    }

}
