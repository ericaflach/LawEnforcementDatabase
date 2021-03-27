package LawEnforcementDatabase;

import java.util.ArrayList;
public class PoliceOfficerList {

    private static PoliceOfficerList officerList;
    private static ArrayList<PoliceOfficer> policeOfficers;

    private PoliceOfficerList() {
        policeOfficers = DataLoader.getPoliceOfficers();
    }

    public static PoliceOfficerList getInstance() {
        if (officerList == null) {
            officerList = new PoliceOfficerList();
        }

        return officerList;
    }

    public boolean havePoliceOfficer(String userName) {
        for(PoliceOfficer officer : policeOfficers) {
            if(officer.getUsername().equals(userName)) {
                return true;
            }
        }

        return false;
    }
    public PoliceOfficer getPoliceOfficer(String userName) {
        for(PoliceOfficer officer : policeOfficers) {
            if(officer.getUsername().equals(userName)) {
                return officer;
            }
        }

        return null;
    }

    public ArrayList<PoliceOfficer> getPoliceOfficers() {
        return policeOfficers;
    }

    public boolean addUser(String firstName, String lastName, String userName, String password, String email,
    int phoneNumber, int clearanceLevel, int ID, String policeDepartment, ArrayList<Integer> myCriminals,
    ArrayList<Integer> myCases) {
        if(havePoliceOfficer(userName)) {
            return false;
        }

        policeOfficers.add(new PoliceOfficer(firstName, lastName, userName, password, email, phoneNumber,
        clearanceLevel, ID, policeDepartment, myCriminals, myCases));
        return true;
    }

    public void saveUsers() {
        DataWriter.savePoliceOfficers();
    }
}
