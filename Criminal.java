package LawEnforcementDatabase;

import java.util.ArrayList;

public class Criminal extends Person {

    private User creator;
    private ArrayList<Integer> pastCrimes;
    private String address;
    private double shoeSize;
    private int priority;
    private boolean alive;
    private ArrayList<String> physicalAttributes;
    private boolean inJail;
    private ArrayList<String> tattoos;

    public Criminal(String firstName, String lastName, int age, String DOB,int ID, char sex, User creator, ArrayList<Integer> pastCrimes, String address, double shoeSize, int priority, boolean alive,
    ArrayList<String> physicalAttributes, boolean inJail, ArrayList<String> tattoos) {

        super(firstName, lastName, age, DOB, ID, sex);
        this.creator = creator;
        this.pastCrimes = pastCrimes;
        this.address = address;
        this.shoeSize = shoeSize;
        this.priority = priority;
        this.alive = alive;
        this.physicalAttributes = physicalAttributes;
        this.inJail = inJail;
        this.tattoos = tattoos; 
    }

	public User getCreator() {
        return creator;
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

    public ArrayList<String> getPhysicalAttributes() {
        return physicalAttributes;
    }

    public boolean getInJail() {
        return inJail;
    }

    public ArrayList<String> getTattoos(){
        return tattoos;
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

    public void addPastCrime(int caseNumber) {
        pastCrimes.add(caseNumber);
    }

    public void removePastCrime(int caseNumber) {
        pastCrimes.remove(caseNumber);
    }

    public String toString() {
        return "Name: "+firstName+" "+lastName+"\nAge: "+age+"\nDOB: "+DOB+"\nID: "+ID+"\nSex: "+sex+"\nCreator: "+creator+"\nPast crimes: "+pastCrimes+"\nAddress: "+address+"\nShoe size: "+shoeSize+"\nPriority: "+priority+"\nAlive: "+alive+"\nPhysical attributes: "+physicalAttributes+"\nIn jail: "+inJail+"\nTattoos: "+tattoos;
    }

}
