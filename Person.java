package LawEnforcementDatabase;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String dateOfBirth;

    public Person(){

    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String getName(){
        return firstName + lastName;
    }
    public int getAge(){
        return this.age;
    }
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
}
