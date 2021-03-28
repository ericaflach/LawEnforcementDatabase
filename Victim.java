/**
 * @author Caleb Howard
 */
package LawEnforcementDatabase;

public class Victim extends Person {

    private String description;
    private String contact;

    /**
     * This method creates a victim
     * @param firstName
     * @param lastName
     * @param age
     * @param DOB
     * @param ID
     * @param sex
     * @param description
     * @param contact
     */
    public Victim(String firstName, String lastName, int age, String DOB, int ID, char sex,
     String description, String contact) {
        super(firstName, lastName, age, DOB, ID, sex);

        this.description = description; 
        this.contact = contact;
    }

    /**
     * This method gets the victim's description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method gets the victim's contact
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * This method sets the victim's description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method sets the victim's contact
     * @param contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * This method turns the victim's information into a string
     * @return victim's information
     */
    public String toString() {
        return super.toString()
        + "\nDescription: " + description
        + "\nContact: " + contact;
    }

}