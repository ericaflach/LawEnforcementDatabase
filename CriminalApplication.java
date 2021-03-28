/**
 * @author Chris Nelson
 */
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

    /**
     * This method constructs the criminal application
     */
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
    
    /**
     * This method searches criminals by name
     * @param firstName
     * @param lastName
     * @return criminals that match name
     */
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

    /**
     * This method searches criminals by age
     * @param lowerAge
     * @param upperAge
     * @return criminals that match age
     */
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

    /**
     * This method searches criminals by crimes committed
     * @param searchedCrimes
     * @return criminals that match crimes comitted
     */
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

    public ArrayList<Criminal> searchByAttributes(ArrayList<String> physicalAttributes) {
        ArrayList<Criminal> ret = new ArrayList<Criminal>();
        for (int i = 0; i < refinedList.size(); i++) {
            for (int j = 0; j < physicalAttributes.size(); j++) {
                for (int k = 0; k < refinedList.get(i).getPhysicalAttributes().size(); k++) {
                    if (refinedList.get(i).getPhysicalAttributes().get(k).contains(physicalAttributes.get(j))) {
                        ret.add(refinedList.get(i));
                    }
                }
            }
        }
        refinedList = ret;
        return ret;
    }
    
    /**
     * This method searches criminals by location
     * @param city
     * @param state
     * @return criminals that match location
     */
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

    /**
     * This method searches criminals by their sex
     * @param sex
     * @return criminals that match sex
     */
    public ArrayList<Criminal> searchBySex(char sex) {
        return null;
    }

    /**
     * This method creates a new criminal
     * @param firstName
     * @param lastName
     * @param age
     * @param DOB
     * @param ID
     * @param sex
     * @param creatorID
     * @param pastCrimes
     * @param address
     * @param shoeSize
     * @param priority
     * @param alive
     * @param physicalAttributes
     * @param inJail
     * @param tattoos
     */
    public void createCriminal(String firstName, String lastName, int age, String DOB, int ID, char sex, int creatorID, ArrayList<Integer> pastCrimes, String address,
    double shoeSize, int priority, boolean alive, ArrayList<String> physicalAttributes, boolean inJail, ArrayList<String> tattoos) {
        criminalList.addCriminal(firstName, lastName, age, DOB, ID, sex, creatorID, pastCrimes, address, shoeSize, priority, alive, physicalAttributes, inJail, tattoos);
    }

    /**
     * This method creates a new case
     * @param creatorID
     * @param witnesses
     * @param peopleOfInterest
     * @param suspects
     * @param criminals
     * @param victims
     * @param caseOpen
     * @param ID
     * @param evidence
     * @param crimeLevel
     * @param officers
     * @param legalClearance
     * @param caseType
     */
    public void createCase(int creatorID, ArrayList<Integer> witnesses, ArrayList<Integer> peopleOfInterest, ArrayList<Integer> suspects, 
    ArrayList<Integer> criminals, ArrayList<Integer> victims, boolean caseOpen, ArrayList<String> evidence, int crimeLevel,
    ArrayList<Integer> officers, int legalClearance, String caseType) {
        
        caseList.addCase(creatorID, witnesses, peopleOfInterest, suspects, criminals, victims, caseOpen, caseList.getUniqueID(), evidence, crimeLevel, officers, legalClearance, caseType);
    }

    /**
     * This method creates a new police officer
     * @param firstName
     * @param lastName
     * @param username
     * @param email
     * @param phoneNumber
     * @param password
     * @param clearanceLevel
     * @param department
     * @param officerID
     */
    public void createPoliceOfficer(String firstName, String lastName, String username, String email,
     Long phoneNumber, String password, int clearanceLevel, String department, int officerID) {
         ArrayList<Integer> myCriminals = null; 
         ArrayList<Integer> myCases = null;
        officerList.addUser(firstName, lastName, username, password, email, phoneNumber, clearanceLevel, officerID, department, myCriminals, myCases);
    }

    /**
     * This method creates a new admin
     * @param firstName
     * @param lastName
     * @param username
     * @param email
     * @param phoneNumber
     * @param password
     * @param clearanceLevel
     * @param adminID
     */
    public void createAdmin(String firstName, String lastName, String username, String email,
     Long phoneNumber, String password, int clearanceLevel, int adminID) {
        adminList.addAdmin(firstName, lastName, username, password, email, phoneNumber, clearanceLevel, adminID);
    }

    /**
     * This method logs in users with their username and password
     * @param username
     * @param password
     * @return true or false
     */
    public boolean login(String username, String password) {
        if(officerList.havePoliceOfficer(username)) {
            if(officerList.getPoliceOfficerUsername(username).checkPassword(password)) {
                officer = officerList.getPoliceOfficerUsername(username);
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

    /**
     * This method searches cases by their IDs
     * @param ID
     * @return case that matches ID
     */
    public Case searchCaseID(int ID){
        Case crime = caseList.getCase(ID);
        return crime;
    }

    /**
     * This method gets criminals
     * @return criminals
     */
    public ArrayList<Criminal> getMyCriminals(){
        ArrayList<Criminal> myCriminals = new ArrayList<Criminal>();
        for(int criminalID : officer.getMyCriminals()) {
            myCriminals.add(criminalList.getCriminal(criminalID));
        }
        return myCriminals;
    }

    /**
     * This method gets cases
     * @return cases
     */
    public ArrayList<Case> getMyCases(){
        ArrayList<Case> myCases = new ArrayList<Case>();
        for(int caseID : officer.getMyCases()) {
            myCases.add(caseList.getCase(caseID));
        }
        return myCases;
    }

    /**
     * This method returns the refined criminal list
     * @return refined list
     */
    public void resetRefinedList() {
        refinedList = criminalList.getCriminals();
    }

    /**
     * This method determines if string contains lowercase
     * @param larger
     * @param shorter
     * @return true or false
     */
    private boolean containsLowerCase(String larger, String shorter) {
        return larger.toLowerCase().contains(shorter.toLowerCase());
    }

    /**
     * This method edits criminal's name
     * @param firstName
     * @param lastName
     * @param criminalID
     */
    public void editCriminalName(String firstName, String lastName, int criminalID) {
        criminalList.getCriminal(criminalID).setFirstName(firstName);
        criminalList.getCriminal(criminalID).setLastName(lastName);
    }

    /**
     * This method edits criminal's age
     * @param age
     * @param criminalID
     */
    public void editCriminalAge(int age, int criminalID) {
        criminalList.getCriminal(criminalID).setAge(age);
    }

    /**
     * This method edits criminal's past crimes
     * @param caseID
     * @param criminalID
     */
    public void editCriminalPastCrimes(int caseID, int criminalID) {
        criminalList.getCriminal(criminalID).addPastCrime(caseID);
    }

    /**
     * This method edits criminal's address
     * @param address
     * @param criminalID
     */
    public void editCriminalAddress(String address, int criminalID) {
        criminalList.getCriminal(criminalID).setAddress(address);
    }

    /**
     * This method edits criminal's physical attributes
     * @param attribute
     * @param criminalID
     */
    public void editCriminalPhysicalAttributes(String attribute, int criminalID) {
        criminalList.getCriminal(criminalID).addPhysicalAttributes(attribute);
    }

    /**
     * This method edits criminal's tattoos
     * @param tattoo
     * @param criminalID
     */
    public void editCriminalTattoos(String tattoo, int criminalID) {
        criminalList.getCriminal(criminalID).addTattoos(tattoo);
    }
    
    /**
     * This method edits if criminal is in jail or not
     * @param inJail
     * @param criminalID
     */
    public void editCriminalInJail(boolean inJail, int criminalID) {
        criminalList.getCriminal(criminalID).setInJail(inJail);
    }
    
    /**
     * This method edits the user's name
     * @param firstName
     * @param lastName
     * @param officerID
     */
    public void editUserName(String firstName, String lastName, int officerID) {
        officerList.getPoliceOfficer(officerID).setFirstName(firstName);
        officerList.getPoliceOfficer(officerID).setLastName(lastName);
    }

    /**
     * This method edits the user's email
     * @param email
     * @param officerID
     */
    public void editUserEmail(String email, int officerID) {
        officerList.getPoliceOfficer(officerID).setEmail(email);
    }
    
    /**
     * This method edits the user's phone number
     * @param phoneNumber
     * @param officerID
     */
    public void editUserPhoneNumber(Long phoneNumber, int officerID) {
        officerList.getPoliceOfficer(officerID).setPhoneNumber(phoneNumber);
    }
    
    /**
     * This method edits the user's clearance level
     * @param clearanceLevel
     * @param officerID
     */
    public void editUserClearanceLevel(int clearanceLevel, int officerID) {
        officerList.getPoliceOfficer(officerID).setClearanceLevel(clearanceLevel);
    }
    
    /**
     * This method edits the police officer's department
     * @param department
     * @param officerID
     */
    public void editUserDepartment(String department, int officerID) {
        officerList.getPoliceOfficer(officerID).setPoliceDepartment(department);
    }
    
    /**
     * This method converts refined list to string
     * @return refined list
     */
    public String refinedListToString() {
        String ret = "[";
        for(Criminal criminal : refinedList) {
            ret = ret + criminal.getName() + ", ";
        }
        ret += "]";
        return ret;
    }

    /**
     * This method gets the user
     * @return user
     */
    public User getUser() {
        if(admin == null) {
            return officer;
        }
        return admin; 
    }

    public int addWitness(String firstName, String lastName, int age, String DOB, char sex, String description, String contact) {
        int ID = witnessList.getUniqueID();
        witnessList.addWitness(firstName, lastName, age, DOB, ID, sex, description, contact);
        return ID; 
    }

    public int addPOI(String firstName, String lastName, int age, String DOB, char sex, String description, String contact) {
        int ID = personOfInterestList.getUniqueID();
        personOfInterestList.addPersonOfInterest(firstName, lastName, age, DOB, ID, sex, description, contact);
        return ID;
    }

    public int addSuspect(int age, char sex, ArrayList<String>attributes, int priority, ArrayList<String> tattoos, int creatorID) {
        int ID = suspectList.getUniqueID();
        String unknown = "unknown";
        double unknownShoeSize = -1.0; 
        ArrayList<Integer> crimesUnknown = null;
        suspectList.addSuspect(unknown, unknown, age, unknown, ID, sex, creatorID, crimesUnknown, unknown, unknownShoeSize, priority, true, attributes, false, tattoos, unknown);
        return ID;
    }
    public boolean logout() {
        criminalList.saveCriminals();
        adminList.saveAdmins();
        officerList.saveUsers();
        victimList.saveVictims();
        witnessList.saveWitnesses();
        suspectList.saveSuspects();
        return true;
    }
}