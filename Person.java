/**
 * @author Erica Flach
 */
package LawEnforcementDatabase;

public class Person {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String dateOfBirth;
    protected int ID;
    protected char sex;

     /**
      * This method constructs the person
      * @param firstName
      * @param lastName
      * @param age
      * @param DOB
      * @param ID
      * @param sex
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
     * This method gets the person's first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

     /**
     * This method gets the person's last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

     /**
     * This method gets the person's full name
     * @return full name
     */
    public String getName() {
        return firstName + " " + lastName;
    }

     /**
     * This method gets the person's age
     * @return age
     */
    public int getAge() {
        return this.age;
    }
    
     /**
     * This method gets the person's date of birth
     * @return date of birth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

     /**
     * This method gets the person's ID
     * @return ID
     */
    public int getID(){
        return ID;
    }

     /**
     * This method gets the person's sex
     * @return sex
     */
    public char getSex(){
        return sex;
    }

     /**
     * This method sets the person's first name
     * @param first name
     */
    public void setFirstName(String name) {
        this.firstName = name;
    }

     /**
     * This method sets the person's last name
     * @param last name
     */
    public void setLastName(String name) {
        this.lastName = name;
    }

     /**
     * This method sets the person's age
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }

     /**
     * This method sets the person's date of birth
     * @param date of birth
     */
    public void setDOB(String DOB) {
        this.dateOfBirth = DOB;
    }

    /**
     * This method sets the person's ID
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * This method sets the person's sex
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

     /**
     * This method turns the person's information to a string
     * @return person's information
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
