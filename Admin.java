/**
 * @author Ben Friend
 */
package LawEnforcementDatabase;

public class Admin extends User{

    /**
     * This method creates an admin
     * @param firstName
     * @param lastName
     * @param username
     * @param password
     * @param email
     * @param phoneNumber
     * @param clearanceLevel
     * @param ID
     */
    public Admin(String firstName, String lastName, String username, String password, String email, Long phoneNumber,
            int clearanceLevel, int ID) {
        super(firstName, lastName, username, password, email, phoneNumber, clearanceLevel, ID);
    }

    /**
     * This method turns the admin to a string
     * @return string
     */
    public String toString() 
    {
       return super.toString();
    }

    /**
     * This method checks if password is correct
     * @param password
     * @return true or false
     */
    public boolean checkPassword(String password) 
    {
        return super.getPassword().contentEquals(password);
    }
}
