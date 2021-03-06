/**
 * @author Erica Flach and Chris Nelson
 */
package LawEnforcementDatabase;

import java.util.ArrayList;
import java.util.Random;

public class PersonOfInterestList {
    private static PersonOfInterestList personsOfInterestList;
    private static ArrayList<PersonOfInterest> personsOfInterest;
    private Random rand;
     /**
     * This method sets the personsOfInterest
     */
    private PersonOfInterestList() {
        personsOfInterest = DataLoader.getPeopleOfInterest();
        rand = new Random();
    }

     /**
     * This method gets the one instance of personsOfInterest
     * @return personOfInterest list
     */
    public static PersonOfInterestList getInstance() {
        if(personsOfInterestList == null) {
            personsOfInterestList = new PersonOfInterestList();
        }
        return personsOfInterestList;
    }

     /**
     * This method checks if personsOfInterest has a person of interest
     * @param firstName
     * @param lastName
     * @return true or false
     */
    public boolean havePersonOfInterest(String firstName, String lastName) {
        for(PersonOfInterest personOfInterest : personsOfInterest) {
            if(personOfInterest.getFirstName().equals(firstName) && personOfInterest.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;
    }

    /**
     * This method finds a person of interest from their name
     * @param firstName
     * @param lastName
     * @return person of interest that matches name
     */
    public PersonOfInterest getPersonOfInterest(String firstName, String lastName) {
        for(PersonOfInterest personOfInterest : personsOfInterest) {
            if(personOfInterest.getFirstName().equals(firstName) && personOfInterest.getLastName().equals(lastName)) {
                return personOfInterest;
            }
        }

        return null;
    }

    public PersonOfInterest getPersonOfInterestFromID(int ID) {
        for(PersonOfInterest personOfInterest : personsOfInterest) {
            if(personOfInterest.getID() == ID) {
                return personOfInterest;
            }
        }

        return null;
    }

    /**
     * This method gets all persons of interest
     * @return persons of interest
     */
    public ArrayList<PersonOfInterest> getPersonsOfInterest() {
        return personsOfInterest;
    }

    /**
     * This method adds a person of interest to persons of interest
     * @param firstName
     * @param lastName
     * @param age
     * @param DOB
     * @param ID
     * @param sex
     * @param description
     * @param contact
     * @return true or false
     */
    public boolean addPersonOfInterest(String firstName, String lastName, int age,
    String DOB, int ID, char sex, String description, String contact) {
        if(havePersonOfInterest(firstName, lastName)) {
            return false;
        }

        personsOfInterest.add(new PersonOfInterest(firstName, lastName, age, DOB, ID, sex, description, contact));
        return true;
    }

    public int getUniqueID() {
        boolean unique = false;
        int ID = rand.nextInt((9999999) + 1);
        while (!unique) {
            unique = true;
            for(PersonOfInterest poi: personsOfInterest) {
                if(poi.getID() == ID) {
                    unique = false;
                    ID = rand.nextInt((9999999) + 1);
                }
            }
        }
        return ID;
    }

    /**
     * This method saves the persons of interest to json
     */
    public void savePersonsOfInterest() {
        DataWriter.savePeopleOfInterest();
    }
}
