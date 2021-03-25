package LawEnforcementDatabase;

import java.util.ArrayList;

public class WitnessList {
    private static WitnessList witnessList;
    private static ArrayList<Witness> witnesses;
    
    public static WitnessList getInstance() {
        if(witnessList == null) {
            witnessList = new WitnessList();
        }
        return witnessList;
    }

    public ArrayList<Witness> getWitnesses() {
        return witnesses;
    }
}
