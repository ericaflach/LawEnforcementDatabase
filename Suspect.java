package LawEnforcementDatabase;

import java.util.ArrayList;

public class Suspect extends Criminal {

    private String alibi;

    public Suspect(String firstName, String lastName, int age, String DOB, int ID, char sex, int creatorID,
     ArrayList<Integer> pastCrimes, String address, double shoeSize, int priority, boolean alive,
      ArrayList<String> physicalAttributes, boolean inJail, ArrayList<String> tattoos, String alibi) {
        super(firstName, lastName, age, DOB, ID, sex, creatorID, pastCrimes, address, shoeSize, priority, alive, physicalAttributes, inJail, tattoos);
        this.alibi = alibi;
    }

    public void setAlibi(String alibi){
        this.alibi = alibi;
    }

    public String getAlibi(){
        return alibi;
    }

    public String toString() {
        return super.toString() + "\nAlibi: " + alibi;
    }
}
