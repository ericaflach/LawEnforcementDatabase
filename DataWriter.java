package LawEnforcementDatabase;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants{
    
    public void savePersons(){
       PersonList people = PersonList.getInstance();
       ArrayList<Person> criminals = people.getPerson();
       JSONArray jsonCriminals = new JSONArray();

       for(int i=0; i < Criminals.size(); i++){
           jsonCriminals.add(getCriminalJSON(criminals.get(i)));
       }

       try(FileWriter file = new FileWriter(PEOPLE_FILE_NAME)){
           file.write(jsonCriminals.toJSONString());
           file.flush();
       }
       catch(IOException e){
           e.printStackTrace();
       }
    }

    public void saveUsers(){
      
    }

    public static JSONObject getPersonJSON(Person person){
        JSONObject personDetails = new JSONObject();
        personDetails.put(PEOPLE_FILE_NAME,person.getFirstName());
        personDetails.put(PEOPLE_LAST_NAME, person.getLastName());
        personDetails.put(PEOPLE_PHONE_NUMBER, person.getPhoneNumber());
        
    }
}
