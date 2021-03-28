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

	public int getCreatorID() {
        return creatorID;
    }

    public ArrayList<Integer> getPastCrimes() {
        return pastCrimes;
    }

    public String getAddress() {
        return address;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public int getPriority() {
        return priority;
    }

    public boolean getAlive() {
        return alive;
    }

    public int getCrimesCommitted() {
        return pastCrimes.size();
    }

    public boolean getInJail() {
        return inJail;
    }

    public ArrayList<String> getPhysicalAttributes() {
        return physicalAttributes;
    }

    public ArrayList<String> getTattoos(){
        return tattoos;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    public void setPastCrimes(ArrayList<Integer> pastCrimes) {
        this.pastCrimes = pastCrimes;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setPhysicalAttributes(ArrayList<String> physicalAttributes) {
        this.physicalAttributes = physicalAttributes;
    }

    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }

    public void setTattoos(ArrayList<String> tattoos) {
        this.tattoos = tattoos;
    }

    public void addPhysicalAttributes(String attribute) {
        physicalAttributes.add(attribute);
    }

    public void removePhysicalAttribute(String attribute) {
        physicalAttributes.remove(attribute);
    }

    public void addTattoos(String tattoo){
        tattoos.add(tattoo);
    }

    public void removeTattoos(String tattoo){
        tattoos.remove(tattoo);
    }

    public void addPastCrime(int caseID) {
        pastCrimes.add(caseID);
    }

    public void removePastCrime(int caseID) {
        pastCrimes.remove(caseID);
    }
    
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
