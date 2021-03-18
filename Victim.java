package LawEnforcementDatabase;

public class Victim extends Person{

    
    private String description;
    private String contact;
    private int victimID;

    public Victim(String firstName, String lastName, int age, String DOB, String description, String contact, int victimID) {
        super(firstName, lastName, age, DOB);

        this.description = description; 
        this.contact = contact;
        this.victimID = victimID;
    }

    public String getDescription(){
        return description;
    }

    public String getContact(){
        return contact;
    }

    public int getVictimID(){
        return victimID;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public void setID(int victimID){
        this.victimID = victimID;
    }
}