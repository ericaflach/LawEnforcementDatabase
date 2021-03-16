package LawEnforcementDatabase;

import java.util.ArrayList;

public class Suspect extends Criminal {

    private String alibi;
    private int suspectID;

    public Suspect(String firstName, String lastName, int age, String DOB, User creator, ArrayList<Case> pastCrimes, String address, double shoeSize, 
        int priority, boolean alive, ArrayList<String> physicalAttributes, boolean inJail, int criminalID, String alibi, int suspectID) {
        super(firstName, lastName, age, DOB, creator, pastCrimes, address, shoeSize, priority, alive, physicalAttributes,
                inJail, criminalID);
        
        this.alibi = alibi;
        this.suspectID = suspectID;
    }

    public void setSuspectID(int suspectID){
        this.suspectID = suspectID;
    }

    public void setAlibi(String alibi){
        this.alibi = alibi;
    }

    public int getSuspectID(){
        return suspectID;
    }

    public String getAlibi(){
        return alibi;
    }
}
