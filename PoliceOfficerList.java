package LawEnforcementDatabase;

import java.util.ArrayList;

public class PoliceOfficerList {
    private static PoliceOfficerList officerList;
    private static ArrayList<PoliceOfficer> policeOfficers;
    private PoliceOfficerList() {
        policeOfficers = new ArrayList<PoliceOfficer>();
    }
    public static PoliceOfficerList getInstance() {
        if (officerList == null) {
            officerList = new PoliceOfficerList();
        }
        return officerList;
    }
    public ArrayList<PoliceOfficer> getOfficers() {
        return policeOfficers;
    }
}
