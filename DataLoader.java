package LawEnforcementDatabase;

import java.util.ArrayList;
import java.io.FileReader;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class DataLoader extends DataConstants {

    public static ArrayList<Criminal> readCriminal() {
        FileReader reader = new FileReader("src/Criminal.json");
        JSONParser parser = new JSONParser();
        JSONArray criminalsJSON = (JSONArray)new JSONParser().parse(reader);
        ArrayList<Criminal> criminals = new ArrayList<Criminal>();
        ArrayList<Admin> admins = new ArrayList<Admin>();

        for (int i = 0; i < criminalsJSON.size(); i++) {
            JSONObject criminalJSON = (JSONObject)criminalJSON.get(i);
            String firstName = (String)criminalJSON.get(PEOPLE_FIRST_NAME);
            String lastName = (String)criminalJSON.get(PEOPLE_LAST_NAME);
            int age = (int)criminalJSON.get(PEOPLE_AGE);
            String dateOfBirth = (String)criminalJSON.get(PEOPLE_DATEOFBIRTH);
            String creator = (String)criminalJSON.get(CRIMINAL_CREATOR);
            String pastCrimes = (String)criminalJSON.get(CRIMINAL_PAST_CRIMES);
            String address = (String)criminalJSON.get(CRIMINAL_ADDRESS);
            double shoeSize = (double)criminalJSON.get(CRIMINAL_SHOE_SIZE);
            int priority = (int)criminalJSON.get(CRIMINAL_PRIORITY);
            boolean alive = (boolean)criminalJSON.get(CRIMINAL_ALIVE);
            //ArrayList<String> physicalAttributes = (ArrayList<String>)criminalJSON.get("physicalAttributes");
            boolean inJail = (boolean)criminalJSON.get(CRIMINAL_IN_JAIL);
            int criminalID = (int)criminalJSON.get(CRIMINAL_ID);
            
            criminals.add(new Criminal(firstName, lastName, age, dateOfBirth, creator, pastCrimes, address, shoeSize, priority, alive, physicalAttributes, inJail, criminalID));

        }

        return criminals;
    }

    public static ArrayList<PersonOfInterest> readPersonOfInterest() {
        FileReader reader = new FileReader("src/PersonOfInterest.json");
        JSONParser parser = new JSONParser();
        JSONArray poiJSON = (JSONArray)new JSONParser().parse(reader);
        ArrayList<PersonOfInterest> personsOfInterest = new ArrayList<PersonOfInterest>();

        for (int i = 0; i < poiJSON.size(); i++) {
            JSONObject personJSON = (JSONObject)poiJSON.get(i);
            String firstName = (String)personJSON.get("firstName");
            String lastName = (String)personJSON.get("lastName");
            int age = ((long)personJSON.get("age")).intValue();
            String dateOfBirth = (String)personJSON.get("dateOfBirth");
            String description = (String)personJSON.get("description");
            String contact = (String)personJSON.get("contact");
            int id = ((long)personJSON.get("personOfInterestID")).intValue();
            
            criminals.add(new PersonOfInterest(firstName, lastName, age, dateOfBirth, description, contact, id));
        }

        return people;
    }
    
    public static ArrayList<Person> readSuspect() {
        FileReader reader = new FileReader("src/Suspect.json");
        JSONParser parser = new JSONParser();
        JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
        ArrayList<Suspect> suspects = new ArrayList<Suspect>();

        for (int i = 0; i < peopleJSON.size(); i++) {
            JSONObject personJSON = (JSONObject)peopleJSON.get(i);
            String firstName = (String)personJSON.get("firstName");
            String lastName = (String)personJSON.get("lastName");
            int age = ((long)personJSON.get("age")).intValue();
            String dateOfBirth = (String)personJSON.get("dateOfBirth");
            String alibi = (String)personJSON.get("alibi");
            int id = ((long)personJSON.get("suspectID")).intValue();
            
            people.add(new Suspect(firstName, lastName, age, dateOfBirth, alibi, id));
        }

        return people;
    }

    public static ArrayList<Person> readVictim() {
        FileReader reader = new FileReader("src/Victim.json");
        JSONParser parser = new JSONParser();
        JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
        ArrayList<Victim> victims = new ArrayList<Victim>();

        for (int i = 0; i < peopleJSON.size(); i++) {
            JSONObject personJSON = (JSONObject)peopleJSON.get(i);
            String firstName = (String)personJSON.get("firstName");
            String lastName = (String)personJSON.get("lastName");
            int age = (int)personJSON.get("age"));
            String dateOfBirth = (String)personJSON.get("dateOfBirth");
            String description = (String)personJSON.get("description");
            String contact = (String)personJSON.get("contact");
            int id = (int)personJSON.get("victimID");
            
            people.add(new Victim(firstName, lastName, age, dateOfBirth, description, contact, id));
        }

        return people;
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();

        try {
            users.addAll(readCreateUser());
            users.addAll(readUpdateUser());
            
            return users;
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<User> readCreateUser() {
        FileReader reader = new FileReader("src/CreateUser.json");
        JSONParser parser = new JSONParser();
        JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
        ArrayList<User> users = new ArrayList<User>();

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
                String firstName = (String)personJSON.get(USER_FIRST_NAME);
				String lastName = (String)personJSON.get(USER_LAST_NAME);
				String username = (String)personJSON.get(USER_USERNAME);
				String password = (String)personJSON.get(USER_PASSWORD);
                String email = (String)personJSON.get(USER_EMAIL);
				int phoneNumber = (int)personJSON.get(USER_PHONE_NUMBER);
				int clearanceLevel = (int)personJSON.get(USER_CLEARANCE_LEVEL);

				users.add(new User(firstName, lastName, username, password, email, phoneNumber, clearanceLevel));
            }

        return users;
    }

    public static ArrayList<User> readUpdateUser() {
        FileReader reader = new FileReader("src/UpdateUser.json");
        JSONParser parser = new JSONParser();
        JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
        ArrayList<User> users = new ArrayList<User>();

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
                String firstName = (String)personJSON.get(USER_FIRST_NAME);
				String lastName = (String)personJSON.get(USER_LAST_NAME);
				String username = (String)personJSON.get(USER_USERNAME);
				String password = (String)personJSON.get(USER_PASSWORD);
                String email = (String)personJSON.get(USER_EMAIL);
				int phoneNumber = (int)personJSON.get(USER_PHONE_NUMBER);
				int clearanceLevel = (int)personJSON.get(USER_CLEARANCE_LEVEL);

				users.add(new User(firstName, lastName, username, password, email, phoneNumber, clearanceLevel));
            }

        return users;
    }

    public static ArrayList<Case> getCases() {
        ArrayList<Case> users = new ArrayList<User>();
		
		try {
			FileReader reader = new FileReader("src/Cases.json");
			JSONParser parser = new JSONParser();	
			JSONArray casesJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < casesJSON.size(); i++) {
				JSONObject caseJSON = (JSONObject)casesJSON.get(i);
				/*UUID id = UUID.fromString((String)caseJSON.get(USER_ID));
				String userName = (String)caseJSON.get(USER_USER_NAME);
				String firstName = (String)caseJSON.get(USER_FIRST_NAME);
				String lastName = (String)caseJSON.get(USER_LAST_NAME);
				int age = ((Long)caseJSON.get(USER_AGE)).intValue();
				String phoneNumber = (String)caseJSON.get(USER_PHONE_NUMBER);
				
				users.add(new User(id, userName, firstName, lastName, age, phoneNumber));*/
			}
			
			return users;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
    }
    public static void main(String[] args){
        ArrayList<Criminal> criminals=DataLoader.readCriminal();
        for (int i=0; i<criminals.size(); i++){
            System.out.println(criminals.get(i));
        }
    }
}
