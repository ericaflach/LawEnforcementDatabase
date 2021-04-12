/**
 * @author Caleb Howard
 */

package LawEnforcementDatabase;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class SuspectTest {
    
@Test
public void testConstructor(){

    Suspect sus = new Suspect("Alex", "Gojo", 24, "10-22-97", "M", 1234, pastCrimes[1], "21 Quail Oaks", 10, 2, true, physicalAttributes[1], false, tattoos[2], "N/A");
    }
}
