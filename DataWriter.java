package LawEnforcementDatabase;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants{
    
    public void savePersons(){
       PersonList personList = PersonList.getInstance();
       ArrayList<Person> people = personList.getPerson();
       JSONArray jsonPeople = new JSONArray();

       for(int i=0; i < people.size(); i++){
           jsonPeople.add(getPersonJSON(people.get(i)));
       }

       try(FileWriter file = new FileWriter(PEOPLE_FILE_NAME)){
           file.write(jsonPeople.toJSONString());
           file.flush();
       }
       catch(IOException e){
           e.printStackTrace();
       }
    }

    public void saveUsers(){
        UserList userList = UserList.getInstance();
        ArrayList<User> users = userList.getUsers();
        JSONArray jsonUsers = new JsonArray();

        for(int i = 0; i < userList.size(); i++){
            jsonUsers.add(getUserJSON(users.get(i)));
        }

        try(FileWriter file = new FileWriter(USER_FILE_NAME)){
            file.write(jsonUsers.toJSONString());
            file.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    public static JSONObject getPersonJSON(Person person){
        JSONObject personDetails = new JSONObject();
        personDetails.put(PEOPLE_FILE_NAME,person.getFirstName());
        personDetails.put(PEOPLE_LAST_NAME, person.getLastName());
        personDetails.put(PEOPLE_AGE, person.getAge());
        personDetails.put(PEOPLE_DATEOFBIRTH, person.getDateOfBirth());
        personDetails.put(PEOPLE_PHONE_NUMBER, person.getPhoneNumber());

    }
}
