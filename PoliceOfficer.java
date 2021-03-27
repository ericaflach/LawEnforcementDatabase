package LawEnforcementDatabase;

import java.util.ArrayList;

public class PoliceOfficer extends User {

    /**
     * This method 
     * @return 
     */
    private String policeDepartment;
    private ArrayList<Integer> myCriminals;
    private ArrayList<Integer> myCases;

    /**
     * This method 
     * @return 
     */
    public PoliceOfficer(String firstName, String lastName, String username, String password, String email, int phoneNumber, int clearanceLevel,
    int ID, String policeDepartment, ArrayList<Integer> myCriminals, ArrayList<Integer> myCases) {

        super(firstName, lastName, username, password, email, phoneNumber, clearanceLevel, ID);
        
        this.policeDepartment = policeDepartment;

        this.myCriminals = myCriminals;
        this.myCases = myCases;
    }

    /**
     * This method 
     * @return 
     */
    public void setPoliceDepartment(String department){
        this.policeDepartment = department;
    }

    /**
     * This method 
     * @return 
     */
    public void setMyCriminals(ArrayList<Integer> myCriminalIDs){
        this.myCriminals = myCriminalIDs;
    }

    /**
     * This method 
     * @return 
     */
    public void setMyCases(ArrayList<Integer> myCaseIDs){
        this.myCases=myCaseIDs;
    }

    /**
     * This method 
     * @return 
     */
    public String getPoliceDepartment(){
        return policeDepartment;
    }

    /**
     * This method 
     * @return 
     */
    public ArrayList<Integer> getMyCriminals(){
        return myCriminals;
    }

    /**
     * This method 
     * @return 
     */
    public ArrayList<Integer> getMyCases(){
        return myCases;
    }

    /**
     * This method 
     * @return 
     */
    public boolean checkPassword(String password) {
        return (password.equals(super.getPassword())); 
    }
    
    /**
     * This method 
     * @return 
     */
    public void addToMyCriminals(int criminalID) {
        myCriminals.add(criminalID);
    }

   /**
     * This method 
     * @return 
     */
    public String toString() {
        return super.toString()
        + "\nPolice Department: " + policeDepartment
        + "\nMy Criminals: " + myCriminals
        + "\nMy Cases: " + myCases;
    }
}
