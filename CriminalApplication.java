package LawEnforcementDatabase;

import java.util.ArrayList;

public class CriminalApplication {

    private CriminalList criminalList;
    private VictimList victimList;
    private WitnessList witnessList;
    private PersonOfInterestList personOfInterestList;
    private SuspectList suspectList;
    private PoliceOfficerList officerList;
    private AdminList adminList;
    private CaseList caseList;
    private PoliceOfficer officer;
    private Admin admin; 
    ArrayList<Criminal> refinedList;

    public CriminalApplication() {
        criminalList = CriminalList.getInstance();
        victimList = VictimList.getInstance();
        witnessList = WitnessList.getInstance();
        personOfInterestList = PersonOfInterestList.getInstance();
        suspectList = SuspectList.getInstance();
        officerList = PoliceOfficerList.getInstance();
        caseList = CaseList.getInstance();
        adminList = AdminList.getInstance();
        refinedList = criminalList.getCriminals();
    }
    
    public ArrayList<Criminal> searchByName(String firstName, String lastName) {
        ArrayList<Criminal> ret = new ArrayList<Criminal>();
        for(Criminal criminal : refinedList) {
            if(criminal.getFirstName().contentEquals(firstName) && criminal.getLastName().contentEquals(lastName)) {
                ret.add(criminal);
            }
        }
        refinedList = ret;
        return ret;
    }

    public ArrayList<Criminal> searchByAge(int lowerAge, int upperAge) {
                ArrayList<Criminal> ret = new ArrayList<Criminal>();
        for(Criminal criminal : refinedList) {
            if(criminal.getAge() >= lowerAge && criminal.getAge() <= upperAge) {
                ret.add(criminal);
            }
        }
        refinedList = ret;
        return ret;
    }

    public ArrayList<Criminal> searchByCrimesCommitted(ArrayList<String> searchedCrimes) {
        ArrayList<Criminal> ret = new ArrayList<Criminal>();
        for (int i = 0 ; i < refinedList.size(); i++) {
            ArrayList<Case> criminalCases = caseList.getCasesFromIDs(refinedList.get(i).getPastCrimes()); 
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

    public void createCriminal(String firstName, String lastName, int age, String DOB, int ID, char sex, int creatorID, ArrayList<Integer> pastCrimes, String address,
    double shoeSize, int priority, boolean alive, ArrayList<String> physicalAttributes, boolean inJail, ArrayList<String> tattoos) {
        criminalList.addCriminal(firstName, lastName, age, DOB, ID, sex, creatorID, pastCrimes, address, shoeSize, priority, alive, physicalAttributes, inJail, tattoos);
    }

    public void createCase(int creatorID, ArrayList<Integer> witnesses, ArrayList<Integer> peopleOfInterest, ArrayList<Integer> suspects, 
    ArrayList<Integer> criminals, ArrayList<Integer> victims, boolean caseOpen, int ID, ArrayList<String> evidence, int crimeLevel,
    ArrayList<Integer> officers, int legalClearance, String caseType) {
        caseList.addCase(creatorID, witnesses, peopleOfInterest, suspects, criminals, victims, caseOpen, ID, evidence, crimeLevel, officers, legalClearance, caseType);
    }
    public void createPoliceOfficer(String firstName, String lastName, String username, String email,
     int phoneNumber, String password, int clearanceLevel, String department, int officerID) {
         ArrayList<Integer> myCriminals = null; 
         ArrayList<Integer> myCases = null;
        officerList.addUser(firstName, lastName, username, password, email, phoneNumber, clearanceLevel, officerID, department, myCriminals, myCases);
    }

    public void createAdmin(String firstName, String lastName, String username, String email,
     int phoneNumber, String password, int clearanceLevel, int adminID) {
        adminList.addAdmin(firstName, lastName, username, password, email, phoneNumber, clearanceLevel, adminID);
    }

    public boolean login(String username, String password) {
        if(officerList.havePoliceOfficer(username)) {
            if(officerList.getPoliceOfficer(username).checkPassword(password)) {
                officer = officerList.getPoliceOfficer(username);
                return true;
            }
        }
        if(adminList.haveAdmin(username)) {
            if(adminList.getAdmin(username).checkPassword(password)) {
                admin = adminList.getAdmin(username); 
                return true;
            }
        }
        return false;
    }

    public Case searchCaseID(int ID){
        Case crime = caseList.getCase(ID);
        return crime;
    }

    public ArrayList<Criminal> getMyCriminals(){
        ArrayList<Criminal> myCriminals = new ArrayList<Criminal>();
        for(int criminalID : officer.getMyCriminals()) {
            myCriminals.add(criminalList.getCriminal(criminalID));
        }
        return myCriminals;
    }

    public ArrayList<Case> getMyCases(){
        ArrayList<Case> myCases = new ArrayList<Case>();
        for(int caseID : officer.getMyCases()) {
            myCases.add(caseList.getCase(caseID));
        }
        return myCases;
    }
    public void resetRefinedList() {
        refinedList = criminalList.getCriminals();
    }

    private boolean containsLowerCase(String larger, String shorter) {
        return larger.toLowerCase().contains(shorter.toLowerCase());
    }

    public String toString() {
        String ret = "";
        for (int i = 0; i < refinedList.size(); i++) {
            
        }
        return ret;
    }
    public User getUser() {
        if(admin == null) {
            return officer;
        }
        return admin; 
    }
}