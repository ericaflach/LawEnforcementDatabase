package LawEnforcementDatabase;
import java.util.ArrayList;

public class User{

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private int phoneNumber;
    private int clearanceLevel;
    
    public User(String firstName, String lastName, String username, String password, String email, int phoneNumber, int clearanceLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.clearanceLevel = clearanceLevel; 

    }
    public void setName(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void addCriminal(String firstName, String lastName, String nickname, ArrayList<Case> pastCrimes, String address, double shoeSize, int priority, boolean alive, ArrayList physicalAttributes, boolean inJail, int CriminalID){
        
    }

    public void editCriminal(int criminalID, String attribute, String value){

    }

    public void removeCriminal(int criminalID){

    }

    public int getClearanceLevel(){
        return clearanceLevel;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public String toString(){
        String accountInfo;
        accountInfo="Name: "+getName()+"\nUsername: "+getUsername()+"\nEmail: "+getEmail()+"\nPhone number: "+getPhoneNumber()+"\nClearance level: "+getClearanceLevel();
        return accountInfo;
    }
}