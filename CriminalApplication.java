package LawEnforcementDatabase;

import java.util.ArrayList;

public class CriminalApplication {

    private PersonList personList;
    private UserList userList;
    private User user;
    private ArrayList<Criminal> criminals;
    private ArrayList<Criminal> refinedList;

    public CriminalApplication(){
        personList = PersonList.getInstance();
        userList = UserList.getInstance();
        criminals = personList.getCriminals();
        refinedList = criminals;

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

    public ArrayList<Criminal> searchByCrimesCommitted(ArrayList<String> crimes) {
        ArrayList<Criminal> ret = new ArrayList<Criminal>();
        for (int i = 0; i < refinedList.size(); i++) {
            ArrayList<Case> pastCrimes = refinedList.get(i).getPastCrimes();
            for (int b = 0; b < pastCrimes.size(); b++) {
                for (int a = 0; a < crimes.size(); a++) {
                    if(pastCrimes.get(b).getCaseType().contains(crimes.get(a))) {
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
    public void createPoliceOfficer(String firstName, String lastName, String username, String email, int phoneNumber, String password, int clearanceLevel, String department, int officerID) {
        
    }

    public void createAdmin(String firstName, String lastName, String username, String email, int phoneNumber, String password, int clearanceLevel, int adminID) {

    }

    public User login(String username, String password) {
        return user;
    }

    public ArrayList<Criminal> getMyCriminals(){
        return new ArrayList<Criminal>();
    }

    public ArrayList<Case> getMyCases(){
        return new ArrayList<Case>();
    }

    public Criminal searchCriminal(int criminalID) {
        return null;
    }

    public boolean addCriminal(String firstName, String lastName, int criminalID) {
        return true;
    }

    public void editCriminal(User creator, String attributes) {
        
    }

    public void resetRefinedList(){
        refinedList = criminals;
    }
    private boolean containsLowerCase(String larger, String shorter) {
        return larger.toLowerCase().contains(shorter.toLowerCase());
    }
}

