package LawEnforcementDatabase;
/**
 * @author Ben Friend
 */


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
public class WitnessListTest {
    private static WitnessList witnessList;
    private static ArrayList<Witness> witnesses;

    @BeforeEach
    public void setup(){
        witnesses = DataLoader.getWitnesses();
        witnessList = WitnessList.getInstance();
    }

    @AfterEach
    public void tearDown(){
        witnesses.clear();
    }

    @Test
    public void testHasWitness(){
        boolean hasWitness= witnessList.haveWitness("Allison", "Carter");
        assertTrue(hasWitness);
    }

    @Test
    public void testHasNoWitness(){
        boolean hasWitness= witnessList.haveWitness("Ben", "Friend");
        assertFalse(hasWitness);
    }

    @Test
    public void testAddNewWitness(){
        boolean addWitness= witnessList.addWitness("Ben", "Friend", 20, "10/07/2000", 14, 'm', null, "2676140671");
        assertTrue(addWitness);
    }

    @Test
    public void testAddOldWitness(){
        boolean addWitness= witnessList.addWitness("Allison", "Carter", 28, "01/11/1994", 1199, 'f', "Witnes states she saw the victim being assualted at Pawleys Night club at 22:34.", "(864)-331-4455");
        assertFalse(addWitness);
    }

}
