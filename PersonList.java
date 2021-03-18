package LawEnforcementDatabase;

import java.util.ArrayList;

public class PersonList {
    private static PersonList personList = null;
    private static ArrayList<Person> people = new ArrayList<Person>();
    
    private PersonList()
    {

    }
    public static PersonList getInstance()
    {
        return null;
    }
    public ArrayList<Person> getPerson()
    {
        return people;
    }
}
