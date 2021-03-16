package LawEnforcementDatabase;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String dateOfBirth;

    public Person(String firstName, String lastName, int age, String DOB){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = DOB;
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }

    public int getAge(){
        return this.age;
    }
    
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
}
