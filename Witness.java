package LawEnforcementDatabase;

public class Witness {
    
    private String description;
    private String contact;
    private int witnessID;

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
