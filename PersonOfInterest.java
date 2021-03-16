package LawEnforcementDatabase;

public class PersonOfInterest extends Person{

    private String description;
    private String contact;
    private int poiID;

    public PersonOfInterest(String firstName, String lastName, int age, String DOB, String description, String contact, int poiID) {
        super(firstName, lastName, age, DOB);

        this.description = description;
        this.contact = contact;
        this.poiID = poiID;
    }

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
