package LawEnforcementDatabase;

import java.util.ArrayList;

public class PoliceOfficer extends User {

    private String policeDepartment;
    private int officerID;
    private ArrayList<Criminal> myCriminals;
    private ArrayList<Case> myCases;

    public PoliceOfficer(String firstName, String lastName, String username, String password, String email,int phoneNumber, int clearanceLevel, 
    String policeDepartment, int officerID) {

        super(firstName, lastName, username, password, email, phoneNumber, clearanceLevel);
        
        this.policeDepartment = policeDepartment;
        this.officerID = officerID;

        myCriminals = new ArrayList<Criminal>();
        myCases = new ArrayList<Case>();
    }
    public void setPoliceDepartment(String department){
        this.policeDepartment = department;
    }

    public void setOfficerID(int officerID){
        this.officerID=officerID;
    }

    public void setMyCriminals(ArrayList<Criminal> myCriminals){
        this.myCriminals=myCriminals;
    }

    public void setMyCases(ArrayList<Case> myCases){
        this.myCases=myCases;
    }

    public String getPoliceDepartment(){
        return policeDepartment;
    }

    public int getOfficerID(){
        return officerID;
    }

    public ArrayList<Criminal> getMyCriminals(){
        return myCriminals;
    }

    public ArrayList<Case> getMyCases(){
        return myCases;
    }
    public boolean checkPassword(String password) {
        return (password.equals(super.getPassword())); 
    }
    
}
