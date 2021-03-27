package LawEnforcementDatabase;
public class User{
    
     /**
     * This method 
     * @return 
     */
    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String password;
    protected String email;
    protected int phoneNumber;
    protected int clearanceLevel;
    protected int ID;
    
     /**
     * This method 
     * @return 
     */
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

     /**
     * This method 
     * @return 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

     /**
     * This method 
     * @return 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

     /**
     * This method 
     * @return 
     */
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

     /**
     * This method 
     * @return 
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

     /**
     * This method 
     * @return 
     */
    public void setPassword(String password) {
        this.password = password;
    }

     /**
     * This method 
     * @return 
     */
    public void setEmail(String email) {
        this.email = email;
    }

     /**
     * This method 
     * @return 
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

     /**
     * This method 
     * @return 
     */
    public void setClearanceLevel(int clearanceLevel) {
        this.clearanceLevel = clearanceLevel;
    }

     /**
     * This method 
     * @return 
     */
    public void setID(int ID) {
        this.ID = ID;
    }

     /**
     * This method 
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }

     /**
     * This method 
     * @return 
     */
    public String getLastName() {
        return lastName;
    }

     /**
     * This method 
     * @return 
     */
    public String getName() {
        return firstName + " " + lastName;
    }

     /**
     * This method 
     * @return 
     */
    public String getUsername() {
        return userName;
    }
    
     /**
     * This method 
     * @return 
     */
    public String getPassword() {
        return password;
    }

     /**
     * This method 
     * @return 
     */
    public String getEmail() {
        return email;
    }

     /**
     * This method 
     * @return 
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

     /**
     * This method 
     * @return 
     */
    public int getClearanceLevel() {
        return clearanceLevel;
    }

     /**
     * This method 
     * @return 
     */
    public int getID() {
        return ID;
    }

     /**
     * This method 
     * @return 
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