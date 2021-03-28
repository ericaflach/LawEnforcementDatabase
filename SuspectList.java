/**
 * @author Erica Flach and Chris Nelson
 */
package LawEnforcementDatabase;

import java.util.ArrayList;
import java.util.Random;
public class SuspectList {

    private static SuspectList suspectList;
    private static ArrayList<Suspect> suspects;
    private Random rand;

    /**
     * This method sets the suspects
     */
    private SuspectList() {
        suspects = DataLoader.getSuspects();
        rand = new Random();
    }

    /**
     * This method gets the one instance of suspects
     * @return suspect list
     */
    public static SuspectList getInstance() {
        if(suspectList == null) {
            suspectList = new SuspectList();
        }
        return suspectList;
    }

    /**
     * This method checks if suspects has a suspect
     * @param firstName
     * @param lastName
     * @return true or false
     */
    public boolean haveSuspect(String firstName, String lastName) {
        for(Suspect suspect : suspects) {
            if(suspect.getFirstName().equals(firstName) && suspect.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;
    }

    /**
     * This method finds an suspect from their name
     * @param firstName
     * @param lastName
     * @return suspect that matches name
     */
    public Suspect getSuspect(String firstName, String lastName) {
        for(Suspect suspect : suspects) {
            if(suspect.getFirstName().equals(firstName) && suspect.getLastName().equals(lastName)) {
                return suspect;
            }
        }

        return null;
    }

    /**
     * This method gets all suspects
     * @return suspects
     */
    public ArrayList<Suspect> getSuspects() {
        return suspects;
    }

    /**
     * This method adds an suspect to suspects
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
     * @param alibi
     * @return true or false
     */
    public boolean addSuspect(String firstName, String lastName, int age, String DOB, int ID,
    char sex, int creatorID, ArrayList<Integer> pastCrimes, String address, double shoeSize, int priority,
    boolean alive, ArrayList<String> physicalAttributes, boolean inJail, ArrayList<String> tattoos, String alibi) {
        if(haveSuspect(firstName, lastName)) {
            return false;
        }

        suspects.add(new Suspect(firstName, lastName, age, DOB, ID, sex, creatorID, pastCrimes, address, shoeSize, priority,
        alive, physicalAttributes, inJail, tattoos, alibi));
        return true;
    }

    public int getUniqueID() {
        boolean unique = false;
        int ID = rand.nextInt((9999999) + 1);
        while (!unique) {
            unique = true;
            for(Suspect suspect: suspects) {
                if(suspect.getID() == ID) {
                    unique = false;
                    ID = rand.nextInt((9999999) + 1);
                }
            }
        }
        return ID;
    }
    /**
     * This method saves the suspects to json
     */
    public void saveSuspects() {
        DataWriter.saveSuspects();
    }
}
