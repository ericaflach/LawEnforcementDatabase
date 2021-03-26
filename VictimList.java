package LawEnforcementDatabase;

import java.util.ArrayList;
public class VictimList {
    private static VictimList victimList;
    private static ArrayList<Victim> victims;

    private VictimList() {
        victims = new ArrayList<Victim>();
    }

    
    public static VictimList getInstance() {
        if(victimList == null) {
            victimList = new VictimList();
        }
        return victimList;
    }

    public ArrayList<Victim> getVictims() {
        return victims;
    }
}
