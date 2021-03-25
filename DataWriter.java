package LawEnforcementDatabase;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
    
    public static void saveCriminals() {
       CriminalList criminalList = CriminalList.getInstance();
       ArrayList<Criminal> criminals = criminalList.getCriminals();
       JSONArray jsonCriminals = new JSONArray();

       for (int i = 0; i < criminals.size(); i++) {
           jsonCriminals.add(getCriminalJSON(criminals.get(i)));
       }

       try (FileWriter file = new FileWriter(CRIMINAL_FILE_NAME)) {
           file.write(jsonCriminals.toJSONString());
           file.flush();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

    public static void saveSuspects() {
        SuspectList suspectList = SuspectList.getInstance();
        ArrayList<Suspect> suspects = suspectList.getSuspects();
        JSONArray jsonSuspects = new JSONArray();

        for (int i = 0; i < suspects.size(); i++) {
            jsonSuspects.add(getSuspectJSON(suspects.get(i)));
        }

        try(FileWriter file = new FileWriter(SUSPECT_FILE_NAME)) {
            file.write(jsonSuspects.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveVictims() {
        VictimList victimList = VictimList.getInstance();
        ArrayList<Victim> victims = victimList.getVictims();
        JSONArray jsonVictims = new JSONArray();

        for (int i = 0; i < victims.size(); i++) {
            jsonVictims.add(getVictimJSON(victims.get(i)));
        }

        try(FileWriter file = new FileWriter(VICTIM_FILE_NAME)) {
            file.write(jsonVictims.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void savePeopleOfInterest() {
        PersonOfInterestList personOfInterestList = PersonOfInterestList.getInstance();
        ArrayList<PersonOfInterest> peopleOfInterest = personOfInterestList.getPeopleOfInterest();
        JSONArray jsonPeopleOfInterest = new JSONArray();

        for (int i = 0; i < peopleOfInterest.size(); i++) {
            jsonPeopleOfInterest.add(getPersonOfInterestJSON(peopleOfInterest.get(i)));
        }

        try(FileWriter file = new FileWriter(PERSON_OF_INTEREST_FILE_NAME)) {
            file.write(jsonPeopleOfInterest.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveWitnesses() {
        WitnessList witnessList = WitnessList.getInstance();
        ArrayList<Witness> witnesses = witnessList.peopleOfInterest();
        JSONArray jsonWitness = new JSONArray();

        for (int i = 0; i < witnesses.size(); i++) {
            jsonWitness.add(getPersonOfInterestJSON(witnesses.get(i)));
        }

        try(FileWriter file = new FileWriter()) {
            file.write(jsonWitness.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getCriminalJSON(Criminal criminal) {
        JSONObject criminalDetails = new JSONObject();
        criminalDetails.put(PERSON_FIRST_NAME, criminal.getFirstName());
        criminalDetails.put(PERSON_LAST_NAME, criminal.getLastName());
        criminalDetails.put(PERSON_AGE, criminal.getAge());
        criminalDetails.put(PERSON_DATEOFBIRTH, criminal.getDateOfBirth());
        criminalDetails.put(PERSON_ID, criminal.getID());
        criminalDetails.put(CRIMINAL_CREATOR, criminal.getCreator().toString());
        criminalDetails.put(CRIMINAL_PAST_CRIMES, criminal.getPastCrimes());
        criminalDetails.put(CRIMINAL_ADDRESS, criminal.getAddress());
        criminalDetails.put(CRIMINAL_SHOE_SIZE, criminal.getShoeSize());
        criminalDetails.put(CRIMINAL_PRIORITY, criminal.getPriority());
        criminalDetails.put(CRIMINAL_ALIVE, criminal.getAlive());
        criminalDetails.put(CRIMINAL_PHYSICAL_ATTRIBUTES, criminal.getPhysicalAttributes());
        criminalDetails.put(CRIMINAL_IN_JAIL, criminal.getInJail());
        criminalDetails.put(CRIMINAL_TATOOS, criminal.getTattoos());

        return criminalDetails;
    }

    public static JSONObject getSuspectJSON(Suspect suspect) {
        JSONObject suspectDetails = new JSONObject();
        suspectDetails.put(PERSON_FIRST_NAME, suspect.getFirstName());
        suspectDetails.put(PERSON_LAST_NAME, suspect.getLastName());
        suspectDetails.put(PERSON_AGE, suspect.getAge());
        suspectDetails.put(PERSON_DATEOFBIRTH, suspect.getDateOfBirth());
        suspectDetails.put(PERSON_ID, suspect.getID());
        suspectDetails.put(CRIMINAL_CREATOR, suspect.getCreator().toString());
        suspectDetails.put(CRIMINAL_PAST_CRIMES, suspect.getPastCrimes());
        suspectDetails.put(CRIMINAL_ADDRESS, suspect.getAddress());
        suspectDetails.put(CRIMINAL_SHOE_SIZE, suspect.getShoeSize());
        suspectDetails.put(CRIMINAL_PRIORITY, suspect.getPriority());
        suspectDetails.put(CRIMINAL_ALIVE, suspect.getAlive());
        suspectDetails.put(CRIMINAL_PHYSICAL_ATTRIBUTES, suspect.getPhysicalAttributes());
        suspectDetails.put(CRIMINAL_IN_JAIL, suspect.getInJail());
        suspectDetails.put(CRIMINAL_TATOOS, suspect.getTattoos());
        suspectDetails.put(SUSPECT_ALIBI, suspect.getAlibi());

        return suspectDetails;
    }

    public static JSONObject getVictimJSON(Victim victim) {
        JSONObject victimDetails = new JSONObject();
        victimDetails.put(PERSON_FIRST_NAME, victim.getFirstName());
        victimDetails.put(PERSON_LAST_NAME, victim.getLastName());
        victimDetails.put(PERSON_AGE, victim.getAge());
        victimDetails.put(PERSON_DATEOFBIRTH, victim.getDateOfBirth());
        victimDetails.put(PERSON_ID, victim.getID());
        victimDetails.put(VICTIM_DESCRIPTION, victim.getDescription());
        victimDetails.put(VICTIM_CONTACT, victim.getContact());

        return victimDetails;
    }

    public static JSONObject getPersonOfInterestJSON(PersonOfInterest personOfInterest) {
        JSONObject personOfInterestDetails = new JSONObject();
        personOfInterestDetails.put(PERSON_FIRST_NAME, personOfInterest.getFirstName());
        personOfInterestDetails.put(PERSON_LAST_NAME, personOfInterest.getLastName());
        personOfInterestDetails.put(PERSON_AGE, personOfInterest.getAge());
        personOfInterestDetails.put(PERSON_DATEOFBIRTH, personOfInterest.getDateOfBirth());
        personOfInterestDetails.put(PERSON_OF_INTEREST_DESCRIPTION, personOfInterest.getDescription());
        personOfInterestDetails.put(PERSON_OF_CONTACT, personOfInterest.getContact());

        return personOfInterestDetails;
    }

    public static JSONObject getWitnessJSON(Witness witness) {
        JSONObject witnessDetails = new JSONObject();
        witnessDetails.put(PERSON_FIRST_NAME, witness.getFirstName());
        witnessDetails.put(PERSON_LAST_NAME, witness.getLastName());
        witnessDetails.put(PERSON_AGE, witness.getAge());
        witnessDetails.put(PERSON_DATEOFBIRTH, witness.getDateOfBirth());
        witnessDetails.put(WITNESS_DESCRIPTION, witness.getDescription());
        witnessDetails.put(WITNESS_CONTACT, witness.getContact());
    }

    public static void saveUsers() {
    }
}
