package LawEnforcementDatabase;

public class Person {

       /**
     * This method 
     * @return 
     */
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String dateOfBirth;
    protected int ID;
    protected char sex;

     /**
     * This method 
     * @return 
     */
    public Person(String firstName, String lastName, int age, String DOB, int ID, char sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = DOB;
        this.ID = ID;
        this.sex = sex;
    }
    
     /**
     * This method 
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }

     /**
     * This method 
     * @return 
     */
    public String getLastName() {
        return lastName;
    }

     /**
     * This method 
     * @return 
     */
    public String getName() {
        return firstName + " " + lastName;
    }

     /**
     * This method 
     * @return 
     */
    public int getAge() {
        return this.age;
    }
    
     /**
     * This method 
     * @return 
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

     /**
     * This method 
     * @return 
     */
    public int getID(){
        return ID;
    }

     /**
     * This method 
     * @return 
     */
    public char getSex(){
        return sex;
    }

     /**
     * This method 
     * @return 
     */
    public void setFirstName(String name) {
        this.firstName = name;
    }

     /**
     * This method 
     * @return 
     */
    public void setLastName(String name) {
        this.lastName = name;
    }

     /**
     * This method 
     * @return 
     */
    public void setAge(int age) {
        this.age = age;
    }

     /**
     * This method 
     * @return 
     */
    public void setDOB(String DOB) {
        this.dateOfBirth = DOB;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

     /**
     * This method 
     * @return 
     */
    public String toString() {
        return "\nFirst Name: " + firstName
        + "\nLast Name: " + lastName
        + "\nAge: " + age
        + "\nDate of Birth: " + dateOfBirth
        + "\nID: " + ID
        + "\nSex: " + sex;
    }
    
}
