/**
 * @author Erica Flach and Chris Nelson
 */
package LawEnforcementDatabase;

import java.util.ArrayList;
public class PoliceOfficerList {

    private static PoliceOfficerList officerList;
    private static ArrayList<PoliceOfficer> policeOfficers;

    /**
     * This method sets the police officers
     */
    private PoliceOfficerList() {
        policeOfficers = DataLoader.getPoliceOfficers();
    }

    /**
     * This method gets the one instance of police officers
     * @return police officer list
     */
    public static PoliceOfficerList getInstance() {
        if (officerList == null) {
            officerList = new PoliceOfficerList();
        }

        return officerList;
    }

    /**
     * This method checks if police officers has a police officer
     * @return true or false
     */
    public boolean havePoliceOfficer(String userName) {
        for(PoliceOfficer officer : policeOfficers) {
            if(officer.getUsername().equals(userName)) {
                return true;
            }
        }

        return false;
    }

    /**
     * This method finds a police officer from their ID
     * @param ID
     * @return police officer that matches ID
     */
    public PoliceOfficer getPoliceOfficer(int officerID) {
        for(PoliceOfficer officer : policeOfficers) {
            if(officer.getID() == officerID) {
                return officer;
            }
        }

        return null;
    }

    /**
     * This method finds a police officer from their username
     * @param username
     * @return police officer that matches username
     */
    public PoliceOfficer getPoliceOfficerUsername(String username) {
        for(PoliceOfficer officer : policeOfficers) {
            if(officer.getUsername().equals(username)) {
                return officer;
            }
        }

        return null;
    }

    /**
     * This method gets all police officers
     * @return police officers
     */
    public ArrayList<PoliceOfficer> getPoliceOfficers() {
        return policeOfficers;
    }

    /**
     * This method adds a police officer to police officers
     * @return true or false
     */
    public boolean addUser(String firstName, String lastName, String userName, String password, String email,
    Long phoneNumber, int clearanceLevel, int ID, String policeDepartment, ArrayList<Integer> myCriminals,
    ArrayList<Integer> myCases) {
        if(havePoliceOfficer(userName)) {
            return false;
        }

        policeOfficers.add(new PoliceOfficer(firstName, lastName, userName, password, email, phoneNumber,
        clearanceLevel, ID, policeDepartment, myCriminals, myCases));
        return true;
    }

    /**
     * This method saves the police officers to json
     */
    public void saveUsers() {
        DataWriter.savePoliceOfficers();
    }
}
