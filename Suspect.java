/**
 * @author Erica Flach
 */
package LawEnforcementDatabase;

import java.util.ArrayList;

public class Suspect extends Criminal {

    private String alibi;

    /**
     * This method creates a criminal
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
     */
    public Suspect(String firstName, String lastName, int age, String DOB, int ID, char sex, int creatorID,
     ArrayList<Integer> pastCrimes, String address, double shoeSize, int priority, boolean alive,
      ArrayList<String> physicalAttributes, boolean inJail, ArrayList<String> tattoos, String alibi) {
        super(firstName, lastName, age, DOB, ID, sex, creatorID, pastCrimes, address, shoeSize, priority, alive, physicalAttributes, inJail, tattoos);
        this.alibi = alibi;
    }

    /**
     * This method sets the suspect's alibi
     * @param alibi
     */
    public void setAlibi(String alibi){
        this.alibi = alibi;
    }

    /**
     * This method gets the suspect's alibi
     * @return
     */
    public String getAlibi(){
        return alibi;
    }

    /**
     * This method turns the suspect's attributes to a string
     * @return string
     */
    public String toString() {
        return super.toString() 
        + "\nAlibi: " + alibi;
    }
}
