/**
 * @author Erica Flach and Chris Nelson
 */
package LawEnforcementDatabase;

import java.util.ArrayList;
import java.util.Random;

public class WitnessList {
    private static WitnessList witnessList;
    private static ArrayList<Witness> witnesses;
    private Random rand;
    /**
     * This method sets the witnesses
     */
    public WitnessList() {
        witnesses = DataLoader.getWitnesses();
        rand = new Random();
    }

    /**
     * This method gets the one instance of witnesses
     * @return witness list
     */
    public static WitnessList getInstance() {
        if(witnessList == null) {
            witnessList = new WitnessList();
        }
        return witnessList;
    }

    /**
     * This method checks if witnesses has a witness
     * @param firstName
     * @param lastName
     * @return true or false
     */
    public boolean haveWitness(String firstName, String lastName) {
        for(Witness witness : witnesses) {
            if(witness.getFirstName().equals(firstName) && witness.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;
    }

    /**
     * This method finds an witness from their name
     * @param firstName
     * @param lastName
     * @return witness that matches name
     */
    public Witness getWitness(String firstName, String lastName) {
        for(Witness witness : witnesses) {
            if(witness.getFirstName().equals(firstName) && witness.getLastName().equals(lastName)) {
                return witness;
            }
        }

        return null;
    }

    /**
     * This method gets all witnesses
     * @return witnesses
     */
    public ArrayList<Witness> getWitnesses() {
        return witnesses;
    }

    /**
     * This method adds a witness to witnesses
     * @param firstName
     * @param lastName
     * @param age
     * @param DOB
     * @param ID
     * @param sex
     * @param description
     * @param contact
     * @return true or false
     */
    public boolean addWitness(String firstName, String lastName, int age, String DOB, int ID,
    char sex, String description, String contact) {
        if(haveWitness(firstName, lastName)) {
            return false;
        }
        
        witnesses.add(new Witness(firstName, lastName, age, DOB, ID, sex, description, contact));
        return true;
    }

    public int getUniqueID() {
        boolean unique = false;
        int ID = rand.nextInt((9999999) + 1);
        while (!unique) {
            unique = true;
            for(Witness witness: witnesses) {
                if(witness.getID() == ID) {
                    unique = false;
                    ID = rand.nextInt((9999999) + 1);
                }
            }
        }
        return ID;
    }
    /**
     * This method saves the witnesses to json
     */
    public void saveWitnesses() {
        DataWriter.saveWitnesses();
    }
}
