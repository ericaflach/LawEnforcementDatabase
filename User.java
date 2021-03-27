package LawEnforcementDatabase;
public class User{

    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String password;
    protected String email;
    protected int phoneNumber;
    protected int clearanceLevel;
    protected int ID;
    
    public User(String firstName, String lastName, String userName, String password, String email, int phoneNumber, int clearanceLevel, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.clearanceLevel = clearanceLevel; 
        this.ID = ID;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setClearanceLevel(int clearanceLevel) {
        this.clearanceLevel = clearanceLevel;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getUsername() {
        return userName;
    }
    
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getClearanceLevel() {
        return clearanceLevel;
    }

    public int getID() {
        return ID;
    }

    public String toString() {
        return "\nFirst Name: " + firstName
        + "\nLast Name: " + lastName
        + "\nUserName: " + userName
        + "\nPassword: " + password
        + "\nEmail: " + email
        + "\nPhone Number: " + phoneNumber
        + "\nClearance Level: " + clearanceLevel
        + "\nID: " + ID;
    }


}