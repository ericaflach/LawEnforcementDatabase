package LawEnforcementDatabase;

import java.util.ArrayList;

public class CriminalApplication {

    private CriminalList criminalList;
    private VictimList victimList;
    private WitnessList witnessList;
    private PersonOfInterestList personOfInterestList;
    private SuspectList suspectList;
    private PoliceOfficerList officerList;
    private CaseList caseList;
    private PoliceOfficer user;
    private ArrayList<Criminal> refinedList;

    public CriminalApplication() {
        criminalList = CriminalList.getInstance();
        victimList = VictimList.getInstance();
        witnessList = WitnessList.getInstance();
        personOfInterestList = PersonOfInterestList.getInstance();
        suspectList = SuspectList.getInstance();
        officerList = PoliceOfficerList.getInstance();
        caseList = CaseList.getInstance();
        
        
    }
    
    public ArrayList<Criminal> searchByName(String firstName, String lastName) {
        ArrayList<Criminal> ret = new ArrayList<Criminal>();
        for (int i = 0; i < refinedList.size(); i++) {
            if (refinedList.get(i).getFirstName().contentEquals(firstName) && refinedList.get(i).getLastName().contentEquals(lastName)) {
                ret.add(refinedList.get(i));
            }
        }
        refinedList = ret;
        return ret;
    }

    public ArrayList<Criminal> searchByAge(int lowerAge, int upperAge) {
        ArrayList<Criminal> ret = new ArrayList<Criminal>();
        for (int i = 0; i < refinedList.size(); i++) {
            if(refinedList.get(i).getAge() >= lowerAge && refinedList.get(i).getAge() <= upperAge) {
                ret.add(refinedList.get(i));
            }
        }
        refinedList = ret;
        return ret;
    }

    public ArrayList<Criminal> searchByCrimesCommitted(ArrayList<String> searchedCrimes) {
        ArrayList<Criminal> ret = new ArrayList<Criminal>();
        for (int i = 0 ; i < refinedList.size(); i++) {
            ArrayList<Case> criminalCases = getCasesFromID(refinedList.get(i)); 
            for (int a = 0; a < searchedCrimes.size(); a++) {
                for (int b = 0; b < criminalCases.size(); b++) {
                    if(containsLowerCase(criminalCases.get(b).getCaseType(), searchedCrimes.get(a))) {
                        ret.add(refinedList.get(i));
                    } 
                }
            }
        }
        refinedList = ret;
        return ret;
    }
    
    public ArrayList<Criminal> searchByLocation(String city, String state) {
        ArrayList<Criminal> ret = new ArrayList<Criminal>();
        for (int i = 0; i < refinedList.size(); i++) {
            if(containsLowerCase(refinedList.get(i).getAddress(), city) && containsLowerCase(refinedList.get(i).getAddress(), state)) {
                ret.add(refinedList.get(i));
            }
        }
        refinedList = ret;
        return ret;
    }

    public ArrayList<Criminal> searchBySex(char sex) {
        return null;
    }

    public void createCriminal(String firstName, String lastName, int age, String DOB, User creator, ArrayList<Integer> pastCrimes, String address, double shoeSize, int priority, boolean alive,
    ArrayList<String> physicalAttributes, boolean inJail, int ID, char sex, ArrayList<String> tattoos) {
        criminals.add(new Criminal(firstName, lastName, age, DOB, ID, sex, creator, pastCrimes, address, shoeSize, priority, alive, physicalAttributes, inJail, tattoos)
    }
    public void createPoliceOfficer(String firstName, String lastName, String username, String email, int phoneNumber, String password, int clearanceLevel, String department, int officerID) {
        policeOfficers.add(new PoliceOfficer(firstName, lastName, username, password, email, phoneNumber, clearanceLevel, department, officerID));
    }

    public void createAdmin(String firstName, String lastName, String username, String email, int phoneNumber, String password, int clearanceLevel, int adminID) {
        admins.add(new Admin(firstName, lastName, username, password, email, phoneNumber, clearanceLevel, adminID));
    }

    public boolean login(String username, String password) {
        for (int i = 0; i < policeOfficers.size(); i++) {
            if (policeOfficers.get(i).getUsername().equals(username) && policeOfficers.get(i).checkPassword(password)) {
                user = policeOfficers.get(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Criminal> getMyCriminals(){
        return user.getMyCriminals();
    }

    public ArrayList<Case> getMyCases(){
        return user.getMyCases();
    }
    public void editCriminal() {

    }

    public void resetRefinedList() {
        refinedList = criminals;
    }

    private boolean containsLowerCase(String larger, String shorter) {
        return larger.toLowerCase().contains(shorter.toLowerCase());
    }
    
    private ArrayList<Case> getCasesFromID(Criminal criminal) {
        ArrayList<Case> ret = new ArrayList<Case>();
        for (int i = 0; i < criminal.getPastCrimes().size(); i++) {
            for (int a = 0; a < cases.size(); a++) {
                if(criminal.getPastCrimes().get(i) == cases.get(a).getID()) {
                    ret.add(cases.get(a));
                }
            }
        }
        return ret;
    }

    public Criminal pickCriminal() {
        
    }

    public String toString() {
        String ret = "";
        for (int i = 0; i < refinedList.size(); i++) {
            String criminal = 
        }
    }

}