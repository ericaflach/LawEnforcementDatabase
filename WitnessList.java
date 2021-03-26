package LawEnforcementDatabase;

import java.util.ArrayList;

public class WitnessList {
    private static WitnessList witnessList;
    private static ArrayList<Witness> witnesses;
    
    public WitnessList() {
        witnesses = DataLoader.getWitnesses();
    }

    public static WitnessList getInstance() {
        if(witnessList == null) {
            witnessList = new WitnessList();
        }
        return witnessList;
    }

    public boolean haveWitness(String firstName, String lastName) {
        for(Witness witness : witnesses) {
            if(witness.getFirstName().equals(firstName) && witness.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;
    }

    public Witness getWitness(String firstName, String lastName) {
        for(Witness witness : witnesses) {
            if(witness.getFirstName().equals(firstName) && witness.getLastName().equals(lastName)) {
                return witness;
            }
        }

        return null;
    }

    public ArrayList<Witness> getWitnesses() {
        return witnesses;
    }

    public boolean addWitness(String firstName, String lastName, int age, String DOB, int ID,
    char sex, String description, String contact) {
        if(haveWitness(firstName, lastName)) {
            return false;
        }

        witnesses.add(new Witness(firstName, lastName, age, DOB, ID, sex, description, contact));
        return true;
    }

    public void saveWitnesses() {
        DataWriter.saveWitnesses();
    }
}
