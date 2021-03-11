package LawEnforcementDatabase;

public class Victim extends Person{

    private String description;
    private String contact;
    private int victimID;

    public String getDescription(){
        return description;
    }

    public String getContact(){
        return contact;
    }

    public int getID(){
        return victimID;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public void setID(int ID){
        this.victimID = ID;
    }
}