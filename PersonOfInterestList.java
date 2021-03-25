package LawEnforcementDatabase;

import java.util.ArrayList;

public class PersonOfInterestList {
    private static PersonOfInterestList personOfInterestList;
    private static ArrayList<PersonOfInterest> personsOfInterest;

    private PersonOfInterestList() {
        personsOfInterest = new ArrayList<PersonOfInterest>();
    }

    public static PersonOfInterestList getInstance() {
        if(personsOfInterest == null) {
            personOfInterestList = new PersonOfInterestList();
        }
        return personOfInterestList;
    }

    public ArrayList<PersonOfInterest> getPersonsOfInterest() {
        return personsOfInterest;
    }
}
