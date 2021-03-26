package LawEnforcementDatabase;

import java.util.ArrayList;

public class PersonOfInterestList {
    private static PersonOfInterestList personsOfInterestList;
    private static ArrayList<PersonOfInterest> personsOfInterest;

    private PersonOfInterestList() {
        personsOfInterest = DataLoader.getPeopleOfInterest();
    }

    public static PersonOfInterestList getInstance() {
        if(personsOfInterestList == null) {
            personsOfInterestList = new PersonOfInterestList();
        }
        return personsOfInterestList;
    }

    public boolean havePersonOfInterest(String firstName, String lastName) {
        for(PersonOfInterest personOfInterest : personsOfInterest) {
            if(personOfInterest.getFirstName().equals(firstName) && personOfInterest.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;
    }

    public PersonOfInterest getPersonOfInterest(String firstName, String lastName) {
        for(PersonOfInterest personOfInterest : personsOfInterest) {
            if(personOfInterest.getFirstName().equals(firstName) && personOfInterest.getLastName().equals(lastName)) {
                return personOfInterest;
            }
        }

        return null;
    }

    public ArrayList<PersonOfInterest> getPersonsOfInterest() {
        return personsOfInterest;
    }

    public boolean addPersonOfInterest(String firstName, String lastName, int age,
    String DOB, int ID, char sex, String description, String contact) {
        if(havePersonOfInterest(firstName, lastName)) {
            return false;
        }

        personsOfInterest.add(new PersonOfInterest(firstName, lastName, age, DOB, ID, sex, description, contact));
        return true;
    }

    public void savePersonsOfInterest() {
        DataWriter.savePeopleOfInterest();
    }
}
