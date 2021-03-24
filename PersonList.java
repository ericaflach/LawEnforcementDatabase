package LawEnforcementDatabase;

import java.util.ArrayList;

public class PersonList {
    private static PersonList personList;
    private static ArrayList<Criminal> criminals;
    private static ArrayList<Witness> witnesses;
    private static ArrayList<Victim> victims;
    private static ArrayList<PersonOfInterest> personOfInterests;
    private static ArrayList<Suspect> suspects;
    private PersonList(){
        criminals = new ArrayList<Criminal>();
        witnesses = new ArrayList<Witness>();
        victims = new ArrayList<Victim>();
        personOfInterests = new ArrayList<PersonOfInterest>();
        suspects = new ArrayList<Suspect>();

    }
    public static PersonList getInstance(){
        if(personList==null){
            personList = new PersonList();
        }
        return personList;
    }
    public ArrayList<Criminal> getCriminals(){
        return criminals;
    }
    public ArrayList<Witness> getWitnesses(){
        return witnesses;
    }
    public ArrayList<Victim> getVictims(){
        return victims;
    }
    public ArrayList<PersonOfInterest> getPOI(){
        return personOfInterests;
    }
    public ArrayList<Suspect> getSuspects(){
        return suspects;
    }
}
