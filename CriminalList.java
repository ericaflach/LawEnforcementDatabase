package LawEnforcementDatabase;

import java.util.ArrayList;

public class CriminalList {
    private static CriminalList criminalList; 
    private static ArrayList<Criminal> criminals;
    private static ArrayList<Criminal> refinedList;

    private CriminalList() {
        criminals = DataLoader.getCriminals();
        refinedList = criminals;
    }

    public static CriminalList getInstance() {
        if (criminalList == null) {
            criminalList = new CriminalList();
        }
        return criminalList;
    }

    public static boolean haveCriminal(String firstName, String lastName) {
        for(Criminal criminal : criminals) {
            if(criminal.getFirstName().contentEquals(firstName) && criminal.getLastName().contentEquals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Criminal> getCriminals() {
        return criminals;
    }
    
    public boolean addCriminal(String firstName, String lastName, int age, String DOB,int ID, char sex,
     int creatorID, ArrayList<Integer> pastCrimes, String address, double shoeSize, int priority, boolean alive,
    ArrayList<String> physicalAttributes, boolean inJail, ArrayList<String> tattoos) {
        
        if(haveCriminal(firstName, lastName)) {
            return false;
        }

        criminals.add(new Criminal(firstName, lastName, age, DOB, ID, sex, creatorID, pastCrimes, address, shoeSize,
        priority, alive, physicalAttributes, inJail, tattoos));
        return true;
    }

    public Criminal getCriminal(int criminalID) {
        for(Criminal criminal : criminals) {
            if(criminal.getID() == criminalID) {
                return criminal;
            }
        }
        return null;
    }

    public void saveCriminals() {
        DataWriter.saveCriminals();
    }

}
