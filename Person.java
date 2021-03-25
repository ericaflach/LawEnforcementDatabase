package LawEnforcementDatabase;

public class Person {

    protected String firstName;
    protected String lastName;
    private int age;
    private String dateOfBirth;
    private int ID;
    private char sex;

    public Person(String firstName, String lastName, int age, String DOB, int ID, char sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = DOB;
        this.ID = ID;
        this.sex = sex;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return this.age;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getID(){
        return ID;
    }

    public char getSex(){
        return sex;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDOB(String DOB) {
        this.dateOfBirth = DOB;
    }
    
}
