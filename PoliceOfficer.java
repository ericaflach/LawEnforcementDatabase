/**
 * @author Ben Friend
 */
package LawEnforcementDatabase;

import java.util.ArrayList;

public class PoliceOfficer extends User {

    private String policeDepartment;
    private ArrayList<Integer> myCriminals;
    private ArrayList<Integer> myCases;

    /**
     * This method constructs the police officer
     * @param firstName
     * @param lastName
     * @param username
     * @param password
     * @param email
     * @param phoneNumber
     * @param clearanceLevel
     * @param ID
     * @param policeDepartment
     * @param myCriminals
     * @param myCases
     */
    public PoliceOfficer(String firstName, String lastName, String username, String password, String email, Long phoneNumber, int clearanceLevel,
    int ID, String policeDepartment, ArrayList<Integer> myCriminals, ArrayList<Integer> myCases) {

        super(firstName, lastName, username, password, email, phoneNumber, clearanceLevel, ID);
        
        this.policeDepartment = policeDepartment;

        this.myCriminals = myCriminals;
        this.myCases = myCases;
    }

    /**
     * This method sets the police officer's police department
     * @param department
     */
    public void setPoliceDepartment(String department){
        this.policeDepartment = department;
    }

    /**
     * This method sets the police officer's criminals
     * @param myCriminalIDs
     */
    public void setMyCriminals(ArrayList<Integer> myCriminalIDs){
        this.myCriminals = myCriminalIDs;
    }

    /**
     * This method sets the police officer's cases
     * @param myCaseIDs
     */
    public void setMyCases(ArrayList<Integer> myCaseIDs){
        this.myCases=myCaseIDs;
    }

    /**
     * This method gets the police officer's police department
     * @return police department
     */
    public String getPoliceDepartment(){
        return policeDepartment;
    }

    /**
     * This method gets the police officer's criminals
     * @return criminals
     */
    public ArrayList<Integer> getMyCriminals(){
        return myCriminals;
    }

    /**
     * This method gets the police officer's cases
     * @return cases
     */
    public ArrayList<Integer> getMyCases(){
        return myCases;
    }

    /**
     * This method checks if the police officer matches
     * @param password
     * @return true or false
     */
    public boolean checkPassword(String password) {
        return (password.equals(super.getPassword())); 
    }
    
    /**
     * This method adds a criminal to the police officer's criminals
     * @param criminalID
     */
    public void addToMyCriminals(int criminalID) {
        myCriminals.add(criminalID);
    }

    /**
     * This method adds a case to the police officer's cases
     * @param caseID
     */
    public void addToMyCases(int caseID) {
        myCases.add(caseID);
    }

    /**
     * This method converts the police officer's information to a string
     * @return police officer's information
     */
    public String toString() {
        return super.toString()
        + "\nPolice Department: " + policeDepartment
        + "\nMy Criminals: " + myCriminals
        + "\nMy Cases: " + myCases;
    }
}
