package LawEnforcementDatabase;

public class Victim extends Person {

    /**
     * This method 
     * @return 
     */ 
    private String description;
    private String contact;

     /**
     * This method 
     * @return 
     */
    public Victim(String firstName, String lastName, int age, String DOB, int ID, char sex,
     String description, String contact) {
        super(firstName, lastName, age, DOB, ID, sex);

        this.description = description; 
        this.contact = contact;
    }

     /**
     * This method 
     * @return 
     */
    public String getDescription() {
        return description;
    }

     /**
     * This method 
     * @return 
     */
    public String getContact() {
        return contact;
    }

     /**
     * This method 
     * @return 
     */
    public void setDescription(String description) {
        this.description = description;
    }

     /**
     * This method 
     * @return 
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

     /**
     * This method 
     * @return 
     */
    public String toString() {
        return super.toString()
        + "\nDescription: " + description
        + "\nContact: " + contact;
    }

}