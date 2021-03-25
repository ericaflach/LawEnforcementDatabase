package LawEnforcementDatabase;

import java.util.ArrayList;

public class CriminalList {
    private static CriminalList criminalList; 
    private static ArrayList<Criminal> criminals;

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

    public Criminal getCriminal(String firstName, String lastName) {
        for (Criminal criminal : criminals) {
            if (criminal.getfirstName().equals(firstName) && criminal.getlastName().equals(lastName)) {
                return criminal;
            }

            return null;
        }
    }

    public ArrayList<Criminal> getCriminals() {
        return criminals;
    }

    public boolean addCriminal(String firstName, String lastName, int age, String DOB, int ID, char sex) {
        if(haveUser(firstName, lastName))
            return false;
        criminalList.add(new Criminal(firstName, lastName, age, DOB, ID, sex));
        return true;
    }

    public void saveUsers() {
        DataWriter.saveUsers();
    }
}
