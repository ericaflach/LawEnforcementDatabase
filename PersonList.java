package LawEnforcementDatabase;

import java.util.ArrayList;

public class PersonList {
    private static PersonList personList;
    private static ArrayList<Person> people;
    
    private PersonList()
    {
        people = new ArrayList<Person>();
        people = DataLoader.getPersons();
    }
    public static PersonList getInstance()
    {
        if(personList==null)
        {
            personList = new PersonList();
        }
        return personList;
    }
    public ArrayList<Person> getPerson()
    {
        return people;
    }
}
