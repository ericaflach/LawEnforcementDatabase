package LawEnforcementDatabase;

import java.util.ArrayList;
public class SuspectList {

    private static SuspectList suspectList;
    private static ArrayList<Suspect> suspects;

    private SuspectList() {
        suspects = DataLoader.getSuspects();
    }

    public static SuspectList getInstance() {
        if(suspectList == null) {
            suspectList = new SuspectList();
        }
        return suspectList;
    }

    public ArrayList<Suspect> getSuspects() {
        return suspects;
    }
}
