/**
 * @author Caleb Howard
 */
package LawEnforcementDatabase;

public class PersonOfInterest extends Person{

    private String description;
    private String contact;

    /**
     * This method constructs the person of interest
     * @param firstName
     * @param lastName
     * @param age
     * @param DOB
     * @param ID
     * @param sex
     * @param description
     * @param contact
     */
    public PersonOfInterest(String firstName, String lastName, int age, String DOB, int ID,
     char sex, String description, String contact) {
        super(firstName, lastName, age, DOB, ID, sex);

        this.description = description;
        this.contact = contact;
    }

    /**
     * This method gets the person of interest's description
     * @return description
     */
    public String getDescription(){
        return description;
    }

    /**
     * This method gets the person of interest's contact
     * @return contact
     */
    public String getContact(){
        return contact;
    }

    /**
     * This method sets the person of interest's description
     * @param description
     */
    public void setDescription(String description){
        this.description = description;

    }

    /**
     * This method sets the person of interest's contact
     */
    public void setContact(String contact){
        this.contact = contact;

    }

    /**
     * This method converts the person of interest's information to string
     * @return person of interest's information
     */
    public String toString() {
        return super.toString()
        + "\nDescription: " + description
        + "\nContact: " + contact;
    }

}
