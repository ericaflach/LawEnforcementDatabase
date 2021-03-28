/**
 * @author Ben Friend
 */
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
    
    /**
     * This method constructs a user
     * @param firstName
     * @param lastName
     * @param userName
     * @param password
     * @param email
     * @param phoneNumber
     * @param clearanceLevel
     * @param ID
     */
    public User(String firstName, String lastName, String userName, String password,
     String email, int phoneNumber, int clearanceLevel, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.clearanceLevel = clearanceLevel; 
        this.ID = ID;

    }

    /**
     * This method sets the user's first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method sets the user's last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method sets the user's full name
     * @param firstName
     * @param lastName
     */
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * This method sets the user's username
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method sets the user's password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method sets the user's email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method sets the user's phone number
     * @param phoneNumber
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This method sets the user's clearance level
     * @param clearanceLevel
     */
    public void setClearanceLevel(int clearanceLevel) {
        this.clearanceLevel = clearanceLevel;
    }

    /**
     * This method sets the user's ID
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * This method gets the user's first name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method gets the user's last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method gets the user's full name
     * @return name
     */
    public String getName() {
        return firstName + " " + lastName;
    }

    /**
     * This method gets the user's username
     * @return username
     */
    public String getUsername() {
        return userName;
    }
    
    /**
     * This method gets the user's password
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * this method gets the user's email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * this method gets the user's phone number
     * @return phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method gets the user's clearance level
     * @return clearanceLevel
     */
    public int getClearanceLevel() {
        return clearanceLevel;
    }

    /**
     * This method gets the user's ID
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * This method converts user's information to a string
     * @return user's information
     */
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