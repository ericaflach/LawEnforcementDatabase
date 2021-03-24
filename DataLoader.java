package LawEnforcementDatabase;

import java.util.ArrayList;
import java.io.FileReader;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class DataLoader extends DataConstants {

    public static ArrayList<Criminal> getCriminals() {
        ArrayList<Criminal> criminals = new ArrayList<Criminal>();

        try {
            FileReader reader = new FileReader(CRIMINAL_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray criminalsJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < criminalsJSON.size(); i++) {
                  JSONObject criminalJSON = (JSONObject)criminalsJSON.get(i);
                  String firstName = (String)criminalJSON.get(PEOPLE_FIRST_NAME);
                  String lastName = (String)criminalJSON.get(PEOPLE_LAST_NAME);
                  int age = ((Long)criminalJSON.get(PEOPLE_AGE)).intValue();
                  String dateOfBirth = (String)criminalJSON.get(PEOPLE_DATEOFBIRTH);
                  User creator = new User("firstName", "lastName", "username", "password", "email", 3, 4);//FIX!!!!!
                  ArrayList<Integer> pastCrimes = new ArrayList<Integer>();//FIX!!!!!
                  String address = (String)criminalJSON.get(CRIMINAL_ADDRESS);
                  double shoeSize = ((Long)criminalJSON.get(CRIMINAL_SHOE_SIZE)).doubleValue();
                  int priority = ((Long)criminalJSON.get(CRIMINAL_PRIORITY)).intValue();
                  boolean alive = false;//FIX!!!!!
                  ArrayList<String> physicalAttributes = new ArrayList<String>();//FIX!!!!!
                  boolean inJail = false;//FIX!!!!!
                  int criminalID = ((Long)criminalJSON.get(CRIMINAL_ID)).intValue();

                  criminals.add(new Criminal(firstName, lastName, age, dateOfBirth, creator, pastCrimes, address, shoeSize, priority,
                  alive, physicalAttributes, inJail, criminalID));
              }

              return criminals;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<PersonOfInterest> getPeopleOfInterest() {
        ArrayList<PersonOfInterest> peopleOfInterest = new ArrayList<PersonOfInterest>();

        try {
            FileReader reader = new FileReader(PERSON_OF_INTEREST_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleOfInterestJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < peopleOfInterestJSON.size(); i++) {
                  JSONObject personOfInterestJSON = (JSONObject)peopleOfInterestJSON.get(i);
                  String firstName = (String)personOfInterestJSON.get(PEOPLE_FIRST_NAME);
                  String lastName = (String)personOfInterestJSON.get(PEOPLE_LAST_NAME);
                  int age = ((Long)personOfInterestJSON.get(PEOPLE_AGE)).intValue();
                  String dateOfBirth = (String)personOfInterestJSON.get(PEOPLE_DATEOFBIRTH);
                  String description = (String)personOfInterestJSON.get(PERSON_OF_INTEREST_DESCRIPTION);
                  String contact = (String)personOfInterestJSON.get(PERSON_OF_INTEREST_CONTACT);
                  int id = ((Long)personOfInterestJSON.get(PERSON_OF_INTEREST_ID)).intValue();

                  peopleOfInterest.add(new PersonOfInterest(firstName, lastName, age, dateOfBirth, description, contact, id));
              }

              return peopleOfInterest;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public static ArrayList<Suspect> getSuspects() {
        ArrayList<Suspect> suspects = new ArrayList<Suspect>();

        try {
            FileReader reader = new FileReader(SUSPECT_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray suspectsJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < suspectsJSON.size(); i++) {
                  JSONObject suspectJSON = (JSONObject)suspectsJSON.get(i);
                  String firstName = (String)suspectJSON.get(PEOPLE_FIRST_NAME);
                  String lastName = (String)suspectJSON.get(PEOPLE_LAST_NAME);
                  int age = ((Long)suspectJSON.get(PEOPLE_AGE)).intValue();
                  String dateOfBirth = (String)suspectJSON.get(PEOPLE_DATEOFBIRTH);
                  User creator = new User("firstName", "lastName", "username", "password", "email", 3, 4);//FIX!!!!!
                  ArrayList<Integer> pastCrimes = new ArrayList<Integer>();//FIX!!!!!
                  String address = (String)suspectJSON.get(CRIMINAL_ADDRESS);
                  double shoeSize = ((Long)suspectJSON.get(CRIMINAL_SHOE_SIZE)).doubleValue();
                  int priority = ((Long)suspectJSON.get(CRIMINAL_PRIORITY)).intValue();
                  boolean alive = false;//FIX!!!!!
                  ArrayList<String> physicalAttributes = new ArrayList<String>();//FIX!!!!!
                  boolean inJail = false;//FIX!!!!!
                  int criminalID = ((Long)suspectJSON.get(CRIMINAL_ID)).intValue();
                  String alibi = (String)suspectJSON.get(SUSPECT_ALIBI);
                  int suspectID = ((Long)suspectJSON.get(SUSPECT_ID)).intValue();

                  //suspects.add(new Suspect(firstName, lastName, age, dateOfBirth, creator, pastCrimes, address,
                  //shoeSize, priority, alive, physicalAttributes, inJail, criminalID, alibi, suspectID));
              }

              return suspects;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Victim> getVictims() {
        ArrayList<Victim> victims = new ArrayList<Victim>();

        try {
            FileReader reader = new FileReader(VICTIM_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray victimsJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < victimsJSON.size(); i++) {
                  JSONObject victimJSON = (JSONObject)victimsJSON.get(i);
                  String firstName = (String)victimJSON.get(PEOPLE_FIRST_NAME);
                  String lastName = (String)victimJSON.get(PEOPLE_LAST_NAME);
                  int age = ((Long)victimJSON.get(PEOPLE_AGE)).intValue();
                  String dateOfBirth = (String)victimJSON.get(PEOPLE_DATEOFBIRTH);
                  String description = (String)victimJSON.get(VICTIM_DESCRIPTION);
                  String contact = (String)victimJSON.get(VICTIM_CONTACT);
                  int victimID = ((Long)victimJSON.get(VICTIM_CONTACT)).intValue();

                  victims.add(new Victim(firstName, lastName, age, dateOfBirth, description, contact, victimID));
              }

              return victims;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();

        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < usersJSON.size(); i++) {
                  JSONObject userJSON = (JSONObject)usersJSON.get(i);
                  String firstName = (String)userJSON.get(USER_FIRST_NAME);
                  String lastName = (String)userJSON.get(USER_LAST_NAME);
                  String userName = (String)userJSON.get(USER_USERNAME);
                  String password = (String)userJSON.get(USER_PASSWORD);
                  String email = (String)userJSON.get(USER_EMAIL);
                  int phoneNumber = ((Long)userJSON.get(USER_PHONE_NUMBER)).intValue();
                  int clearanceLevel = ((Long)userJSON.get(USER_CLEARANCE_LEVEL)).intValue();

                  users.add(new User(firstName, lastName, userName, password, email, phoneNumber, clearanceLevel));
              }
            
            return users;
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }



    public static ArrayList<Case> getCases() {
        ArrayList<Case> cases = new ArrayList<Case>();
		
		try {
			FileReader reader = new FileReader("src/Case.json");
			JSONParser parser = new JSONParser();	
			JSONArray casesJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < casesJSON.size(); i++) {
				JSONObject caseJSON = (JSONObject)casesJSON.get(i);
				User creator = new User("firstName", "lastName", "username", "password", "email", 3, 4);//FIX!!!!!
                ArrayList<Person> witnesses = new ArrayList<Person>();//Should be person or suspect??? + FIX!!!
                ArrayList<Person> peopleOfInterest = new ArrayList<Person>();//FIX!!!
                ArrayList<Person> suspects = new ArrayList<Person>();//FIX!!!
                boolean caseOpen = false;//FIX!!!
                int caseNumber = ((Long)caseJSON.get(CASE_NUMBER)).intValue();
                ArrayList<String> evidence = new ArrayList<String>();//FIX!!!
                int crimeLevel = ((Long)caseJSON.get(CASE_CRIME_LEVEL)).intValue();
                ArrayList<User> officers = new ArrayList<User>();//FIX!!!
                int legalClearance = ((Long)caseJSON.get(CASE_LEGAL_CLEARANCE)).intValue();
                CaseType caseType = CaseType.AggravatedAssault;//FIX!!!

                //cases.add(new Case(creator, witnesses, peopleOfInterest, suspects, caseOpen, caseNumber, evidence, crimeLevel, officers, 
                //legalClearance, caseType));
			}
			
			return cases;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
    }
    public static void main(String[] args){
        ArrayList<Criminal> criminals = DataLoader.getCriminals();
        for (int i=0; i<criminals.size(); i++){
            System.out.println(criminals.get(i));
        }
    }
}
