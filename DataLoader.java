package LawEnforcementDatabase;

import java.util.ArrayList;
import java.io.FileReader;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants{
    
    public static ArrayList<Person> getPersons(){
        ArrayList<Person> people = new ArrayList<Person>();
        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);

            for(int i = 0; i < peopleJSON.size(); i++){
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
                String firstName = (String)peopleJSON.get(PEOPLE_FIRST_NAME);
				String lastName = (String)peopleJSON.get(PEOPLE_LAST_NAME);
				int age = (int)peopleJSON.get(PEOPLE_AGE);
				String dateOfBirth = (String)peopleJSON.get(PEOPLE_DATEOFBIRTH);

				people.add(new Person(firstName, lastName, age, dateOfBirth));
            }
            
            return people;
        }

        catch(Exception e){
            e.printStackTrace();
        }

        return null;
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
				String phoneNumber = (String)usersJSON.get(USER_PHONE_NUMBER);
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
