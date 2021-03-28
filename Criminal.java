/**
 * @author Erica Flach
 */
package LawEnforcementDatabase;

import java.util.ArrayList;

public class Criminal extends Person {

    protected int creatorID;
    protected ArrayList<Integer> pastCrimes;
    protected String address;
    protected double shoeSize;
    protected int priority;
    protected boolean alive;
    protected ArrayList<String> physicalAttributes;
    protected boolean inJail;
    protected ArrayList<String> tattoos;

    /**
     * This method constructs the criminal
     * @param firstName
     * @param lastName
     * @param age
     * @param DOB
     * @param ID
     * @param sex
     * @param creatorID
     * @param pastCrimes
     * @param address
     * @param shoeSize
     * @param priority
     * @param alive
     * @param physicalAttributes
     * @param inJail
     * @param tattoos
     */
    public Criminal(String firstName, String lastName, int age, String DOB, int ID, char sex, int creatorID,
     ArrayList<Integer> pastCrimes, String address, double shoeSize, int priority, boolean alive,
    ArrayList<String> physicalAttributes, boolean inJail, ArrayList<String> tattoos) {

        super(firstName, lastName, age, DOB, ID, sex);
        this.creatorID = creatorID;
        this.pastCrimes = pastCrimes;
        this.address = address;
        this.shoeSize = shoeSize;
        this.priority = priority;
        this.alive = alive;
        this.physicalAttributes = physicalAttributes;
        this.inJail = inJail;
        this.tattoos = tattoos; 
    }

    /**
     * This method gets the criminal's creator ID
     * @return creatorID
     */
	public int getCreatorID() {
        return creatorID;
    }

    /**
     * This method returns the criminal's past crimes
     * @return past crimes
     */
    public ArrayList<Integer> getPastCrimes() {
        return pastCrimes;
    }

    /**
     * This method gets the criminal's address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method gets the criminal's shoe size
     * @return shoe size
     */
    public double getShoeSize() {
        return shoeSize;
    }

    /**
     * This method gets the criminal's priority level
     * @return priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * This method gets whether the criminal is alive or not
     * @return true or false
     */
    public boolean getAlive() {
        return alive;
    }

    /**
     * This method gets the criminal's crimes
     * @return crimes
     */
    public int getCrimesCommitted() {
        return pastCrimes.size();
    }

    /**
     * This method gets whether the criminal is in jail or not
     * @return true or false
     */
    public boolean getInJail() {
        return inJail;
    }

    /**
     * This method gets the criminal's physical attributes
     * @return physical attributes
     */
    public ArrayList<String> getPhysicalAttributes() {
        return physicalAttributes;
    }

    /**
     * This method gets the criminal's tattoos
     * @return tattoos
     */
    public ArrayList<String> getTattoos(){
        return tattoos;
    }

    /**
     * This method sets the criminal's creator ID
     * @param creatorID
     */
    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    /**
     * This method sets the criminal's past crimes
     * @param pastCrimes
     */
    public void setPastCrimes(ArrayList<Integer> pastCrimes) {
        this.pastCrimes = pastCrimes;
    }

    /**
     * This method sets the criminal's address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method sets the criminal's shoe size
     * @param shoeSize
     */
    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    /**
     * This method sets the criminal's priority level
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * This method sets if criminal is alive or not
     * @param alive
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     * This method sets the criminal's physical attributes
     */
    public void setPhysicalAttributes(ArrayList<String> physicalAttributes) {
        this.physicalAttributes = physicalAttributes;
    }

    /**
     * This method sets if criminal is in jail or not
     * @param inJail
     */
    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }

    /**
     * This method sets the criminal's tatoos
     * @param tattoos
     */
    public void setTattoos(ArrayList<String> tattoos) {
        this.tattoos = tattoos;
    }

    /**
     * This method adds a physical attribute to the criminal
     * @param attribute
     */
    public void addPhysicalAttributes(String attribute) {
        physicalAttributes.add(attribute);
    }

    /**
     * This method removes a physical attribute from the criminal
     * @param attribute
     */
    public void removePhysicalAttribute(String attribute) {
        physicalAttributes.remove(attribute);
    }

    /**
     * This method adds a tattoo to the criminal
     * @param tattoo
     */
    public void addTattoos(String tattoo){
        tattoos.add(tattoo);
    }

    /**
     * This method removes a tattoo from the criminal
     * @param tattoo
     */
    public void removeTattoos(String tattoo){
        tattoos.remove(tattoo);
    }

    /**
     * This method adds a past crime to the criminal
     */
    public void addPastCrime(int caseID) {
        pastCrimes.add(caseID);
    }

    /**
     * This method removes a past crimes from the criminal
     * @param caseID
     */
    public void removePastCrime(int caseID) {
        pastCrimes.remove(caseID);
    }
    
    /**
     * This method turns the physical attributes to string
     * @return physical attributes
     */
    public String physicalAttributesToString() {
        String attributes = "";
        if (physicalAttributes == null) {
            return attributes;
        }
        for (int i = 0; i < physicalAttributes.size(); i++) {
            attributes = attributes + physicalAttributes.get(i) + ", "; 
        }
        return attributes;
    }

    /**
     * This method turns the tattoos to string
     * @return tattoos
     */
    public String tattoosToString() {
        String ret = "";
        if(tattoos == null) {
            return ret;
        }
        for (int i = 0; i < tattoos.size(); i++) {
            ret = ret + tattoos.get(i) + ", ";
        }
        return ret;
    }
    
    /**
     * This method turns past crimes to string
     * @return past crimes
     */
    public String pastCrimesToString() {
        String ret = "";
        if (pastCrimes == null) {
            return ret;
        }
        for (int i = 0; i < pastCrimes.size(); i++) {
            ret = ret + pastCrimes.get(i) + ", "; 
        }
        return ret;
    }

    /**
     * This method turns the criminal attributes to string
     * @return criminal attributes
     */
    public String toString() {
        return super.toString()
        + "\nCreator ID: " + creatorID
        + "\nPast Crimes: " + pastCrimes
        + "\nAddress: " + address
        + "\nShoe Size: " + shoeSize
        + "\nPriority: " + priority
        + "\nAlive: " + alive
        + "\nPhysical Attributes: " + physicalAttributes
        + "\nIn Jail: " + inJail
        + "\nTattoos: " + tattoos;
    }
}
