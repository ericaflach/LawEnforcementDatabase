package LawEnforcementDatabase;

public class PersonOfInterest extends Person{
    
    private String description;
    private String contact;
    private int poiID;

    public String getDescription(){
        return description;
    }

    public String getContact(){
        return contact;
    }

    public int getPoiID(){
        return poiID;
    }

    public void setDescription(String description){
        this.description = description;

    }

    public void setContact(String contact){
        this.contact = contact;

    }

    public void setWitnessID(int poiID){
        this.poiID = poiID;
        
    }
}
