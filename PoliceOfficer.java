package LawEnforcementDatabase;

import java.util.ArrayList;

public class PoliceOfficer extends User {

    private String policeDepartment;
    private ArrayList<Integer> myCriminals;
    private ArrayList<Integer> myCases;

    public PoliceOfficer(String firstName, String lastName, String username, String password, String email, int phoneNumber, int clearanceLevel,
    int ID, String policeDepartment, ArrayList<Integer> myCriminals, ArrayList<Integer> myCases) {

        super(firstName, lastName, username, password, email, phoneNumber, clearanceLevel, ID);
        
        this.policeDepartment = policeDepartment;

        this.myCriminals = myCriminals;
        this.myCases = myCases;
    }
    public void setPoliceDepartment(String department){
        this.policeDepartment = department;
    }

    public void setMyCriminals(ArrayList<Integer> myCriminalIDs){
        this.myCriminals = myCriminalIDs;
    }

    public void setMyCases(ArrayList<Integer> myCaseIDs){
        this.myCases=myCaseIDs;
    }

    public String getPoliceDepartment(){
        return policeDepartment;
    }

    public ArrayList<Integer> getMyCriminals(){
        return myCriminals;
    }

    public ArrayList<Integer> getMyCases(){
        return myCases;
    }

    public boolean checkPassword(String password) {
        return (password.equals(super.getPassword())); 
    }
    
    public void addToMyCriminals(int criminalID) {
        myCriminals.add(criminalID);
    }

    public String toString() {
        return super.toString()
        + "\nPolice Department: " + policeDepartment
        + "\nMy Criminals: " + myCriminals
        + "\nMy Cases: " + myCases;
    }
}
