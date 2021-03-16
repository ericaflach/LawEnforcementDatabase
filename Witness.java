package LawEnforcementDatabase;

public class Witness extends Person{
    
    private String description;
    private String contact;
    private int witnessID;

    public Witness(String firstName, String lastName, int age, String DOB, String description, String contact, int witnessID) {
        super(firstName, lastName, age, DOB);
        
        this.description = description;
        this.contact = contact;
        this.witnessID = witnessID;
    }

    public String getDescription(){
        return description;
    }

    public String getContact(){
        return contact;
    }

    public int getWitnessID(){
        return witnessID;
    }

    public void setDescription(String description){
        this.description = description;

    }

    public void setContact(String contact){
        this.contact = contact;

    }

    public void setWitnessID(int witnessID){
        this.witnessID = witnessID;

    }
}
