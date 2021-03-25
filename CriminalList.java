package LawEnforcementDatabase;

import java.util.ArrayList;

public class CriminalList {
    private static CriminalList criminalList; 
    private static ArrayList<Criminal> criminals;
    private static ArrayList<Criminal> refinedList;

    private CriminalList() {
        criminals = DataLoader.getCriminals();
    }

    public static CriminalList getInstance() {
        if (criminalList == null) {
            criminalList = new CriminalList();
        }
        return criminalList;
    }

    public boolean haveCriminal(String firstName, String lastName) {
        for (Criminal criminal : criminals) {
            if (criminal.getFirstName().equals(firstName) && criminal.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;
    }
    public ArrayList<Criminal> getCriminals() {
        return criminals;
    }
    
    public void saveUsers() {
        DataWriter.saveUsers();
    }
}
