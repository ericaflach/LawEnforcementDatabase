package LawEnforcementDatabase;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String dateOfBirth;
    private String phoneNumber;

    public Person(String firstName, String lastName, int age, String DOB, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = DOB;
        this.phoneNumber = phoneNumber;
    }
    
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return this.age;
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDOB(String DOB){
        this.dateOfBirth = DOB;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
