package LawEnforcementDatabase;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String dateOfBirth;

    public Person(){

    }
    public void setAge(int age){

    }
    public void setName(String firstName, String lastName){

    }
    public void setDateOfBirth(String dateOfBirth){

    }
    public String getName(){
        return firstName + lastName;
    }
    public int getAge(){
        return age;

    }
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
}
