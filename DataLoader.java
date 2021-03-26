package LawEnforcementDatabase;

import java.util.ArrayList;
import java.io.FileReader;
//import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class DataLoader extends DataConstants {

    public static ArrayList<Criminal> getCriminals() {
        ArrayList<Criminal> criminals = new ArrayList<Criminal>();

        try {
            FileReader reader = new FileReader("LawEnforcementDatabase/Criminal.json");
            JSONParser parser = new JSONParser();
            JSONArray criminalsJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < criminalsJSON.size(); i++) {
<<<<<<< HEAD
                  JSONObject criminalJSON = (JSONObject)criminalsJSON.get(i);
                  String firstName = (String)criminalJSON.get(PERSON_FIRST_NAME);
                  String lastName = (String)criminalJSON.get(PERSON_LAST_NAME);
                  int age = ((Long)criminalJSON.get(PERSON_AGE)).intValue();
                  String dateOfBirth = (String)criminalJSON.get(PERSON_DATEOFBIRTH);
                  int ID = ((Long)criminalJSON.get(PERSON_ID)).intValue();
                  char sex = ((String)criminalJSON.get(PERSON_SEX)).charAt(0);
                  User creator = new User("firstName", "lastName", "username", "password", "email", 3, 4, 5);//FIX!!!!!
                  ArrayList<Integer> pastCrimes = new ArrayList<Integer>();//FIX!!!!!
                  String address = (String)criminalJSON.get(CRIMINAL_ADDRESS);
                  double shoeSize = Double.parseDouble((String)criminalJSON.get(CRIMINAL_SHOE_SIZE));
                  int priority = ((Long)criminalJSON.get(CRIMINAL_PRIORITY)).intValue();
                  boolean alive = Boolean.parseBoolean((String)criminalJSON.get(CRIMINAL_ALIVE));
                  ArrayList<String> physicalAttributes = new ArrayList<String>();//FIX!!!!!
                  boolean inJail = Boolean.parseBoolean((String)criminalJSON.get(CRIMINAL_IN_JAIL));
                  ArrayList<String> tattoos = new ArrayList<String>();//FIX!!!
=======
                JSONObject criminalJSON = (JSONObject)criminalsJSON.get(i);
                String firstName = (String)criminalJSON.get(PERSON_FIRST_NAME);
                String lastName = (String)criminalJSON.get(PERSON_LAST_NAME);
                int age = ((Long)criminalJSON.get(PERSON_AGE)).intValue();
                String dateOfBirth = (String)criminalJSON.get(PERSON_DATEOFBIRTH);
                int ID = ((Long)criminalJSON.get(PERSON_ID)).intValue();
                char sex = ((String)criminalJSON.get(PERSON_SEX)).charAt(0);
                //User creator = new User("firstName", "lastName", "username", "password", "email", 3, 4);//FIX!!!!!
                JSONArray pastCrimesJSON = (JSONArray)criminalJSON.get(CRIMINAL_PAST_CRIMES);
                ArrayList<Integer> pastCrimes = new ArrayList<Integer>();
                for (int j = 0; j < pastCrimesJSON.size(); j++) {
                    pastCrimes.add(((Long)pastCrimesJSON.get(i)).intValue());
                }
                String address = (String)criminalJSON.get(CRIMINAL_ADDRESS);
                double shoeSize = ((Long)criminalJSON.get(CRIMINAL_SHOE_SIZE)).doubleValue();
                int priority = ((Long)criminalJSON.get(CRIMINAL_PRIORITY)).intValue();
                boolean alive = Boolean.parseBoolean((String)criminalJSON.get(CRIMINAL_ALIVE));
                ArrayList<String> physicalAttributes = new ArrayList<String>();//FIX!!!!!
                boolean inJail = Boolean.parseBoolean((String)criminalJSON.get(CRIMINAL_IN_JAIL));
                int criminalID = ((Long)criminalJSON.get(PERSON_ID)).intValue();
>>>>>>> 655c25bd8b3bd7cc880e0575fa14fdfb3081cf23

                  criminals.add(new Criminal(firstName, lastName, age, dateOfBirth, ID, sex, creator, pastCrimes, address, shoeSize, priority,
                  alive, physicalAttributes, inJail, tattoos));
              }

              return criminals;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    //This method works please do not edit!!
    public static ArrayList<PersonOfInterest> getPeopleOfInterest() {
        ArrayList<PersonOfInterest> peopleOfInterest = new ArrayList<PersonOfInterest>();

        try {
            FileReader reader = new FileReader(PERSON_OF_INTEREST_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleOfInterestJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < peopleOfInterestJSON.size(); i++) {
                  JSONObject personOfInterestJSON = (JSONObject)peopleOfInterestJSON.get(i);
                  String firstName = (String)personOfInterestJSON.get(PERSON_FIRST_NAME);
                  String lastName = (String)personOfInterestJSON.get(PERSON_LAST_NAME);
                  int age = ((Long)personOfInterestJSON.get(PERSON_AGE)).intValue();
                  String dateOfBirth = (String)personOfInterestJSON.get(PERSON_DATEOFBIRTH);
                  int ID = ((Long)personOfInterestJSON.get(PERSON_ID)).intValue();
                  char sex = ((String)personOfInterestJSON.get(PERSON_SEX)).charAt(0);
                  String description = (String)personOfInterestJSON.get(PERSON_OF_INTEREST_DESCRIPTION);
                  String contact = (String)personOfInterestJSON.get(PERSON_OF_INTEREST_CONTACT);

                  peopleOfInterest.add(new PersonOfInterest(firstName, lastName, age, dateOfBirth, ID, sex, description, contact));
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
            FileReader reader = new FileReader("LawEnforcementDatabase/Suspect.json");
            JSONParser parser = new JSONParser();
            JSONArray suspectsJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < suspectsJSON.size(); i++) {
                  JSONObject suspectJSON = (JSONObject)suspectsJSON.get(i);
                  String firstName = (String)suspectJSON.get(PERSON_FIRST_NAME);
                  String lastName = (String)suspectJSON.get(PERSON_LAST_NAME);
                  int age = ((Long)suspectJSON.get(PERSON_AGE)).intValue();
                  String dateOfBirth = (String)suspectJSON.get(PERSON_DATEOFBIRTH);
                  int ID = ((Long)suspectJSON.get(PERSON_ID)).intValue();
                  char sex = ((String)suspectJSON.get(PERSON_SEX)).charAt(0);
                  User creator = new User("firstName", "lastName", "username", "password", "email", 3, 4, 5);//FIX!!!!!
                  ArrayList<Integer> pastCrimes = new ArrayList<Integer>();//FIX!!!!!
                  String address = (String)suspectJSON.get(CRIMINAL_ADDRESS);
                  double shoeSize = Double.parseDouble((String)suspectJSON.get(CRIMINAL_SHOE_SIZE));
                  int priority = ((Long)suspectJSON.get(CRIMINAL_PRIORITY)).intValue();
                  boolean alive = Boolean.parseBoolean((String)suspectJSON.get(CRIMINAL_ALIVE));
                  ArrayList<String> physicalAttributes = new ArrayList<String>();//FIX!!!!!
                  boolean inJail = Boolean.parseBoolean((String)suspectJSON.get(CRIMINAL_IN_JAIL));
                  ArrayList<String> tattoos = new ArrayList<String>();//FIX!!!
                  String alibi = (String)suspectJSON.get(SUSPECT_ALIBI);

                  suspects.add(new Suspect(firstName, lastName, age, dateOfBirth, ID, sex, creator, pastCrimes, address,
                  shoeSize, priority, alive, physicalAttributes, inJail, tattoos, alibi));
              }

              return suspects;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    //Dont touch this method, it works!!
    public static ArrayList<Victim> getVictims() {
        ArrayList<Victim> victims = new ArrayList<Victim>();

        try {
            FileReader reader = new FileReader("LawEnforcementDatabase/Victim.json");
            JSONParser parser = new JSONParser();
            JSONArray victimsJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < victimsJSON.size(); i++) {
                  JSONObject victimJSON = (JSONObject)victimsJSON.get(i);
                  String firstName = (String)victimJSON.get(PERSON_FIRST_NAME);
                  String lastName = (String)victimJSON.get(PERSON_LAST_NAME);
                  int age = ((Long)victimJSON.get(PERSON_AGE)).intValue();
                  String dateOfBirth = (String)victimJSON.get(PERSON_DATEOFBIRTH);
                  int ID = ((Long)victimJSON.get(PERSON_ID)).intValue();
                  char sex = ((String)victimJSON.get(PERSON_SEX)).charAt(0);
                  String description = (String)victimJSON.get(VICTIM_DESCRIPTION);
                  String contact = (String)victimJSON.get(VICTIM_CONTACT);

                  victims.add(new Victim(firstName, lastName, age, dateOfBirth, ID, sex, description, contact));
              }

              return victims;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    //Dont touch this method, it works!!
    public static ArrayList<Witness> getWitnesses() {
        ArrayList<Witness> witnesses = new ArrayList<Witness>();

        try {
            FileReader reader = new FileReader(WITNESS_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray witnessesJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < witnessesJSON.size(); i++) {
                  JSONObject witnessJSON = (JSONObject)witnessesJSON.get(i);
                  String firstName = (String)witnessJSON.get(PERSON_FIRST_NAME);
                  String lastName = (String)witnessJSON.get(PERSON_LAST_NAME);
                  int age = ((Long)witnessJSON.get(PERSON_AGE)).intValue();
                  String dateOfBirth = (String)witnessJSON.get(PERSON_DATEOFBIRTH);
                  int ID = ((Long)witnessJSON.get(PERSON_ID)).intValue();
                  char sex = ((String)witnessJSON.get(PERSON_SEX)).charAt(0);
                  String description = (String)witnessJSON.get(WITNESS_DESCRIPTION);
                  String contact = (String)witnessJSON.get(WITNESS_CONTACT);

                  //witnesses.add(new Witness(firstName, lastName, age, dateOfBirth, ID, sex, description, contact));
              }

              return witnesses;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    //This method works, please don't edit
    public static ArrayList<Admin> getAdmins() {
        ArrayList<Admin> admins = new ArrayList<Admin>();

        try {
            FileReader reader = new FileReader("LawEnforcementDatabase/Admin.json");
            JSONParser parser = new JSONParser();
            JSONArray adminsJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < adminsJSON.size(); i++) {
                  JSONObject adminJSON = (JSONObject)adminsJSON.get(i);
                  String firstName = (String)adminJSON.get(USER_FIRST_NAME);
                  String lastName = (String)adminJSON.get(USER_LAST_NAME);
                  String userName = (String)adminJSON.get(USER_USERNAME);
                  String password = (String)adminJSON.get(USER_PASSWORD);
                  String email = (String)adminJSON.get(USER_EMAIL);
                  int phoneNumber = ((Long)adminJSON.get(USER_PHONE_NUMBER)).intValue();
                  int clearanceLevel = ((Long)adminJSON.get(USER_CLEARANCE_LEVEL)).intValue();
                  int ID = ((Long)adminJSON.get(USER_ID)).intValue();

                  admins.add(new Admin(firstName, lastName, userName, password, email, phoneNumber, clearanceLevel, ID));
              }
            
            return admins;
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<PoliceOfficer> getPoliceOfficers() {
        ArrayList<PoliceOfficer> policeOfficers = new ArrayList<PoliceOfficer>();

        try {
            FileReader reader = new FileReader("LawEnforcementDatabase/PoliceOfficer.json");
            JSONParser parser = new JSONParser();
            JSONArray policeOfficersJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < policeOfficersJSON.size(); i++) {
                  JSONObject policeOfficerJSON = (JSONObject)policeOfficersJSON.get(i);
                  String firstName = (String)policeOfficerJSON.get(USER_FIRST_NAME);
                  String lastName = (String)policeOfficerJSON.get(USER_LAST_NAME);
                  String userName = (String)policeOfficerJSON.get(USER_USERNAME);
                  String password = (String)policeOfficerJSON.get(USER_PASSWORD);
                  String email = (String)policeOfficerJSON.get(USER_EMAIL);
                  int phoneNumber = ((Long)policeOfficerJSON.get(USER_PHONE_NUMBER)).intValue();
                  int clearanceLevel = ((Long)policeOfficerJSON.get(USER_CLEARANCE_LEVEL)).intValue();
                  int ID = ((Long)policeOfficerJSON.get(USER_ID)).intValue();
                  String policeDepartment = (String)policeOfficerJSON.get(POLICE_DEPARTMENT);
                  ArrayList<Criminal> myCriminals = new ArrayList<Criminal>();//FIX!!!
                  ArrayList<Case> myCases = new ArrayList<Case>();//FIX!!!

                  policeOfficers.add(new PoliceOfficer(firstName, lastName, userName, password, email, phoneNumber, clearanceLevel, ID,
                  policeDepartment, myCriminals, myCases));
              }
            
            return policeOfficers;
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
				User creator = new User("firstName", "lastName", "username", "password", "email", 3, 4, 5);//FIX!!!!!
                ArrayList<Person> witnesses = new ArrayList<Person>();//Should be person or suspect??? + FIX!!!
                ArrayList<Person> peopleOfInterest = new ArrayList<Person>();//FIX!!!
                ArrayList<Person> suspects = new ArrayList<Person>();//FIX!!!
                ArrayList<Criminal> criminals = new ArrayList<Criminal>();//FIX!!!
                ArrayList<Victim> victims = new ArrayList<Victim>();//FIX!!!
                boolean caseOpen = Boolean.parseBoolean((String)caseJSON.get(CASE_OPEN));
                int ID = ((Long)caseJSON.get(CASE_ID)).intValue();
                ArrayList<String> evidence = new ArrayList<String>();//FIX!!!
                int crimeLevel = ((Long)caseJSON.get(CASE_CRIME_LEVEL)).intValue();
                ArrayList<User> officers = new ArrayList<User>();//FIX!!!
                int legalClearance = ((Long)caseJSON.get(CASE_LEGAL_CLEARANCE)).intValue();
                CaseType caseType = CaseType.Arson;

                cases.add(new Case(creator, witnesses, peopleOfInterest, suspects, criminals, victims, caseOpen, ID, evidence,
                crimeLevel, officers, legalClearance, caseType));
			}
			
			return cases;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
    }
    public static void main(String[] args){
<<<<<<< HEAD
        ArrayList<Suspect> suspects = DataLoader.getSuspects();

        for (int i=0; i < suspects.size(); i++){
            System.out.println(suspects.get(i).toString());
=======
        ArrayList<Victim> victims = DataLoader.getVictims();
        for (int i=0; i<victims.size(); i++){
            System.out.println(victims.get(i));
>>>>>>> 655c25bd8b3bd7cc880e0575fa14fdfb3081cf23
        }
    }
}
