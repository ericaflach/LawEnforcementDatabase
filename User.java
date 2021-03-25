package LawEnforcementDatabase;
public class User{

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private int phoneNumber;
    private int clearanceLevel;
    private int ID;
    
    public User(String firstName, String lastName, String username, String password, String email, int phoneNumber, int clearanceLevel, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.setPassword(password);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.clearanceLevel = clearanceLevel; 
        this.ID = ID;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

<<<<<<< HEAD
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public int getClearanceLevel() {
=======
    public int getID(){
        return ID;
    }
    public int getClearanceLevel(){
>>>>>>> ee95bb04114d68a8db05bbd500c54064c13bf652
        return clearanceLevel;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        String accountInfo;
        accountInfo="Name: "+getName()+"\nUsername: "+getUsername()+"\nID: "+ID+"\nEmail: "+getEmail()+"\nPhone number: "+getPhoneNumber()+"\nClearance level: "+getClearanceLevel();
        return accountInfo;
    }

}