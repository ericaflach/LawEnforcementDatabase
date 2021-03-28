/**
 * @author Erica Flach and Chris Nelson
 */
package LawEnforcementDatabase;

import java.util.ArrayList;

public class CriminalList {

    private static CriminalList criminalList; 
    private static ArrayList<Criminal> criminals;
    private static ArrayList<Criminal> refinedList;

    /**
     * This method sets the criminals
     */
    private CriminalList() {
        criminals = DataLoader.getCriminals();
        refinedList = criminals;
    }

    /**
     * This method gets the one instance of criminals
     * @return criminal list
     */
    public static CriminalList getInstance() {
        if (criminalList == null) {
            criminalList = new CriminalList();
        }
        return criminalList;
    }

    /**
     * This method checks if criminals has a criminal
     * @param firstName
     * @param lastName
     * @return true or false
     */
    public static boolean haveCriminal(String firstName, String lastName) {
        for(Criminal criminal : criminals) {
            if(criminal.getFirstName().contentEquals(firstName) && criminal.getLastName().contentEquals(lastName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method gets all criminals
     * @return criminals
     */
    public ArrayList<Criminal> getCriminals() {
        return criminals;
    }
    
    /**
     * This method adds a criminal to criminals
     * @param firstName
     * @param lastName
     * @param age
     * @param DOB
     * @param ID
     * @param sex
     * @param creatorID
     * @param pastCrimes
     * @param address
     * @param shoeSize
     * @param priority
     * @param alive
     * @param physicalAttributes
     * @param inJail
     * @param tattoos
     * @return boolean
     */
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

    /**
     * This method finds an criminal from it's ID
     * @param criminalID
     * @return criminal that matches username
     */
    public Criminal getCriminal(int criminalID) {
        for(Criminal criminal : criminals) {
            if(criminal.getID() == criminalID) {
                return criminal;
            }
        }
        return null;
    }
    
    /**
     * This method saves the criminals to json
     */
    public void saveCriminals() {
        DataWriter.saveCriminals();
    }

}
