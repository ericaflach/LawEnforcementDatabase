package LawEnforcementDatabase;
public class User{

    protected String firstName;
    protected String lastName;
    protected String username;
    protected String password;
    protected String email;
    protected int phoneNumber;
    protected int clearanceLevel;
    protected int ID;
    
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

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public int getClearanceLevel() {
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
        return "\nFirst Name: " + firstName
        + "\nLast Name: " + lastName
        + "\nUserName: " + username
        + "\nPassword: " + password
        + "\nEmail: " + email
        + "\nPhone Number: " + phoneNumber
        + "\nClearance Level: " + clearanceLevel
        + "\nID: " + ID;
    }


}