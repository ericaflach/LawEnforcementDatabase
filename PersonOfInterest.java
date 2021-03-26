package LawEnforcementDatabase;

public class PersonOfInterest extends Person{

    private String description;
    private String contact;

    public PersonOfInterest(String firstName, String lastName, int age, String DOB, int ID,
     char sex, String description, String contact) {
        super(firstName, lastName, age, DOB, ID, sex);

        this.description = description;
        this.contact = contact;
    }

    public String getDescription(){
        return description;
    }

    public String getContact(){
        return contact;
    }

    public void setDescription(String description){
        this.description = description;

    }

    public void setContact(String contact){
        this.contact = contact;

    }

}
