/**
 * @author Erica Flach and Chris Nelson
 */
package LawEnforcementDatabase;

import java.util.ArrayList;

public class VictimList {
    private static VictimList victimList;
    private static ArrayList<Victim> victims;

    /**
     * This method sets the victims
     */
    private VictimList() {
        victims = DataLoader.getVictims();
    }

    /**
     * This method gets the one instance of victims
     * @return victim list
     */
    public static VictimList getInstance() {
        if(victimList == null) {
            victimList = new VictimList();
        }
        return victimList;
    }

    /**
     * This method checks if victims has an victim
     * @param firstName
     * @param lastName
     * @return true or false
     */
    public boolean haveVictim(String firstName, String lastName) {
        for(Victim victim : victims) {
            if(victim.getFirstName().equals(firstName) && victim.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;
    }

    /**
     * This method finds a victim from their name
     * @param firstName
     * @param lastName
     * @return victim that matches name
     */
    public Victim getVictim(String firstName, String lastName) {
        for(Victim victim : victims) {
            if(victim.getFirstName().equals(firstName) & victim.getLastName().equals(lastName)) {
                return victim;
            }
        }

        return null;
    }

    public Victim getVictimFromID(int ID) {
        for(Victim victim : victims) {
            if(victim.getID() == ID) {
                return victim;
            }
        }

        return null;
    }
    /**
     * This method gets all victims
     * @return victims
     */
    public ArrayList<Victim> getVictims() {
        return victims;
    }

    /**
     * This method adds a victim to victims
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
    public boolean addVictim(String firstName, String lastName, int age, String DOB, int ID, char sex,
    String description, String contact) {
        if(haveVictim(firstName, lastName)) {
            return false;
        }

        victims.add(new Victim(firstName, lastName, age, DOB, ID, sex, description, contact));
        return true;
    }

    /**
     * This method saves the victims to json
     */
    public void saveVictims() {
        DataWriter.saveVictims();
    }
}
