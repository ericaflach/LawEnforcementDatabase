/**
 * @author Ben Friend
 */
package LawEnforcementDatabase;

public class Witness extends Person{
   
    private String description;
    private String contact;

    /**
     * This method creates a witness
     * @param firstName
     * @param lastName
     * @param age
     * @param DOB
     * @param ID
     * @param sex
     * @param description
     * @param contact
     */
    public Witness(String firstName, String lastName, int age, String DOB, int ID,
     char sex, String description, String contact) {
        super(firstName, lastName, age, DOB, ID, sex);
        
        this.description = description;
        this.contact = contact;
    }

    /**
     * This method gets the witness's description
     * @return description
     */
    public String getDescription() {
        return description;
    }

     /**
     * This method gets the witness's contact
     * @return contact
     */
    public String getContact() {
        return contact;
    }

     /**
     * This method sets the witness's description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method sets the witness's contact
     * @param contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * This method turns the witness' information in a string
     * @return witness's information
     */
    public String toString() {
        return super.toString()
        + "\nDescription: " + description
        + "\nContact: " + contact;
    }
}
