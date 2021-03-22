package LawEnforcementDatabase;

import java.util.ArrayList;
import java.io.FileReader;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class DataLoader extends DataConstants{
    static ArrayList<Person> people = new ArrayList<Person>();

    public static ArrayList<Person> getPersons(){

        try {
            readCriminal();
            readPersonOfInterest();
            readSuspect();
            readVictim();
            
            return people;
        }

        catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Person> readCriminal(){
        FileReader reader = new FileReader("src/criminal.json");
        JSONParser parser = new JSONParser();
        JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);

        for(int i = 0; i < peopleJSON.size(); i++){
            JSONObject personJSON = (JSONObject)peopleJSON.get(i);
            String firstName = (String)personJSON.get("firstName");
            String lastName = (String)personJSON.get("lastName");
            int age = ((long)personJSON.get("age")).intValue();
            String dateOfBirth = (String)personJSON.get("dateOfBirth");
            String creator = (String)personJSON.get("creator");
            String pastCrimes = (String)personJSON.get("pastCrimes");
            String address = (String)personJSON.get("address");
            double shoeSize = ((String)personJSON.get("shoeSize")).doubleValue();
            int priority = ((long)personJSON.get("priority")).intValue();
            boolean alive = ((String)personJSON.get("alive")).booleanValue();
            String physicalAttributes = (String)personJSON.get("physicalAttributes");
            boolean inJail = ((String)personJSON.get("inJail")).booleanValue();
            int criminalID = ((long)personJSON.get("criminalID")).intValue();
            
            people.add(new Criminal(firstName, lastName, age, dateOfBirth, creator, pastCrimes, address,
            shoeSize, priority, alive, physicalAttributes, inJail, criminalID));
        }
    }

    public static ArrayList<Person> readPersonOfInterest(){
        FileReader reader = new FileReader("src/personOfInterest.json");
        JSONParser parser = new JSONParser();
        JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);

        for(int i = 0; i < peopleJSON.size(); i++){
            JSONObject personJSON = (JSONObject)peopleJSON.get(i);
            String firstName = (String)personJSON.get("firstName");
            String lastName = (String)personJSON.get("lastName");
            int age = ((long)personJSON.get("age")).intValue();
            String dateOfBirth = (String)personJSON.get("dateOfBirth");
            String description = (String)personJSON.get("description");
            String contact = (String)personJSON.get("contact");
            int id = ((long)personJSON.get("personOfInterestID")).intValue();
            
            people.add(new PersonOfInterest(firstName, lastName, age, dateOfBirth, description, contact, id));
        }
    }
    
    public static ArrayList<Person> readSuspect(){
        FileReader reader = new FileReader("src/suspect.json");
        JSONParser parser = new JSONParser();
        JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);

        for(int i = 0; i < peopleJSON.size(); i++){
            JSONObject personJSON = (JSONObject)peopleJSON.get(i);
            String firstName = (String)personJSON.get("firstName");
            String lastName = (String)personJSON.get("lastName");
            int age = ((long)personJSON.get("age")).intValue();
            String dateOfBirth = (String)personJSON.get("dateOfBirth");
            String alibi = (String)personJSON.get("alibi");
            int id = ((long)personJSON.get("suspectID")).intValue();
            
            people.add(new PersonOfInterest(firstName, lastName, age, dateOfBirth, alibi, id));
        }
    }

    public static ArrayList<Person> readVictim(){
        FileReader reader = new FileReader("src/victim.json");
        JSONParser parser = new JSONParser();
        JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);

        for(int i = 0; i < peopleJSON.size(); i++){
            JSONObject personJSON = (JSONObject)peopleJSON.get(i);
            String firstName = (String)personJSON.get("firstName");
            String lastName = (String)personJSON.get("lastName");
            int age = ((long)personJSON.get("age")).intValue();
            String dateOfBirth = (String)personJSON.get("dateOfBirth");
            String description = (String)personJSON.get("description");
            String contact = (String)personJSON.get("contact");
            int id = ((long)personJSON.get("victimID")).intValue();
            
            people.add(new PersonOfInterest(firstName, lastName, age, dateOfBirth, description, contact, id));
        }
    }

    public static ArrayList<User> getUsers(){
        ArrayList<User> users = new ArrayList<User>();
        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);

            for(int i = 0; i < usersJSON.size(); i++){
                JSONObject userJSON = (JSONObject)usersJSON.get(i);
                String firstName = (String)usersJSON.get(USER_FIRST_NAME);
				String lastName = (String)usersJSON.get(USER_LAST_NAME);
				String username = (String)usersJSON.get(USER_USERNAME);
				String password = (String)usersJSON.get(USER_PASSWORD);
                String email = (String)usersJSON.get(USER_EMAIL);
				int phoneNumber = (int)usersJSON.get(USER_PHONE_NUMBER);
				int clearanceLevel = (int)usersJSON.get(USER_CLEARANCE_LEVEL);

				users.add(new User(firstName, lastName, username, password, email, phoneNumber, clearanceLevel));
            }
            
            return users;
        }

        catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
