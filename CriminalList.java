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

    public Criminal getCriminal(String firstName, String lastName) {
        for(Criminal criminal : criminals) {
            if(criminal.getFirstName().equals(firstName) && criminal.getLastName().equals(lastName)) {
                return criminal;
            }
        }

        return null;
    }
    public ArrayList<Criminal> getCriminals() {
        return criminals;
    }
    
    public boolean addCriminal(String firstName, String lastName, int age, String DOB,int ID, char sex, User creator, ArrayList<Integer> pastCrimes, String address, double shoeSize, int priority, boolean alive,
    ArrayList<String> physicalAttributes, boolean inJail, ArrayList<String> tattoos) {
        
        if(haveCriminal(firstName, lastName)) {
            return false;
        }

        criminals.add(new Criminal(firstName, lastName, age, DOB, ID, sex, creator, pastCrimes, address, shoeSize, priority, alive, 
        physicalAttributes, inJail, tattoos));
        return true;
}
    public void saveUsers() {
        DataWriter.saveUsers();
    }
}
