package LawEnforcementDatabase;

import java.util.ArrayList;

public class CriminalApplication {

    private PersonList personList;
    private UserList userList;
    private User user;
    private ArrayList<Criminal> criminals;

    public CriminalApplication(){
        personList = PersonList.getInstance();
        userList = UserList.getInstance();
        criminals = personList.getCriminals();
    }

    public ArrayList<Criminal> searchCriminals(String firstName, String lastName){
        ArrayList<Criminal> ret = new ArrayList<Criminal>();
        for(int i = 0; i < criminals.size(); i++){
            if(criminals.get(i).getFirstName().contains(firstName) && criminals.get(i).getLastName().contains(lastName)){
                ret.add(criminals.get(i));
            }
        }
        return ret;
    }
    public void createPoliceOfficer(String firstName, String lastName, String username, String email, int phoneNumber, String password, int clearanceLevel, String department, int officerID){
        
    }

    public void createAdmin(String firstName, String lastName, String username, String email, int phoneNumber, String password, int clearanceLevel, int adminID){

    }

    public User login(String username, String password){
        return user;
    }

    public ArrayList<Criminal> getMyCriminals(){
        return new ArrayList<Criminal>();
    }

    public ArrayList<Case> getMyCases(){
        return new ArrayList<Case>();
    }

    public Criminal searchCriminal(int criminalID){
        return null;
    }

    public boolean addCriminal(String firstName, String lastName, int criminalID){
        return true;
    }

    public void editCriminal(User creator, String attributes){
        
    }
}

