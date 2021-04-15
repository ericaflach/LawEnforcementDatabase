/**
 * @author Chris Nelson
 */
package LawEnforcementDatabase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class DataLoaderTest {
    private AdminList adminList = AdminList.getInstance();
    private CriminalList criminalList = CriminalList.getInstance();
    private ArrayList<Criminal> criminals = criminalList.getCriminals();
    private ArrayList<Admin> admins = adminList.getAdmins();


    @BeforeEach
    public void setup() {
        AdminList.getInstance().getAdmins().clear();
        admins.add(new Admin("firstName", "lastName", "username", "password", "email", 2352323433L, 2, 2421));
        admins.add(new Admin("Bob", "Baker", "gtf", "wefefe", "edu@sc.edu", 3334344343L, 1, 3426));
        criminals.add(new Criminal("firstName", "lastName", 19, "10/22/00", 1023, 'M', 12038, new ArrayList<Integer>(), "2929 fjsdkf", 9.0, 2, true, new ArrayList<String>(),false, new ArrayList<String>()));
        criminals.add(new Criminal("Yes", "No", 34, "08/22/00", 1023, 'M', 12038, new ArrayList<Integer>(), "34 lane", 10.0, 2, false, new ArrayList<String>(),true, new ArrayList<String>()));
        DataWriter.saveAdmins();
        DataWriter.saveCriminals();
    }

    @AfterEach
    public void tearDown() {
        AdminList.getInstance().getAdmins().clear();
        DataWriter.saveAdmins();
    }

    @Test
    public void testAdminSize() {
        setup();
        admins = DataLoader.getAdmins();
        assertEquals(2, admins.size());
        tearDown();
    }

    @Test
    public void testAdminSizeZero() {
        setup();
        AdminList.getInstance().getAdmins().clear();
        DataWriter.saveAdmins();
        assertEquals(0,admins.size());
        tearDown();
    }

    @Test
    public void testCriminalSize() {
        setup();
        criminals = DataLoader.getCriminals();
        assertEquals(2, criminals.size());
        tearDown();
    }

    @Test
    public void testCriminalSizeZero() {
        setup();
        CriminalList.getInstance().getCriminals().clear();
        DataWriter.saveCriminals();
        assertEquals(0,admins.size());
        tearDown();
    }
}
