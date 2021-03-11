package LawEnforcementDatabase;

import java.util.ArrayList;

public class PoliceOfficer extends User {
    
    private String policeDepartment;
    private int OfficerID;
    private ArrayList<Criminal> myCriminals;
    private ArrayList<Case> myCases;

    public String getPoliceDepartment(){
        return policeDepartment;
    }

    public int getOfficerID(){
        return OfficerID;
    }

    public ArrayList<Criminal> getMyCriminals(){
        return myCriminals;
    }

    public ArrayList<Case> getMyCases(){
        return myCases;
    }

    public void setPoliceDepartment(String department){
      this.policeDepartment = department;
    }
}
