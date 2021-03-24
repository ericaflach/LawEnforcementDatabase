package LawEnforcementDatabase;

import java.util.ArrayList;

public class Criminal extends Person{



    private User creator;
    private ArrayList<Integer> pastCrimes;
    private String address;
    private double shoeSize;
    private int priority;
    private boolean alive;
    private ArrayList<String> physicalAttributes;
    private boolean inJail;
    private int criminalID;

    public Criminal(String firstName, String lastName, int age, String DOB, User creator, ArrayList<Integer> pastCrimes, String address, double shoeSize, int priority, boolean alive,
    ArrayList<String> physicalAttributes, boolean inJail, int criminalID) {
        super(firstName, lastName, age, DOB);
        
        this.creator = creator;
        this.pastCrimes = pastCrimes;
        this.address = address;
        this.shoeSize = shoeSize;
        this.priority = priority;
        this.alive = alive;
        this.physicalAttributes = physicalAttributes;
        this.inJail = inJail;
        this.criminalID = criminalID;
    }
    public User getCreator(){
        return creator;
    }

    public ArrayList<Integer> getPastCrimes(){
        return pastCrimes;
    }

    public String getAddress(){
        return address;
    }

    public double getShoeSize(){
        return shoeSize;
    }

    public int getPriority(){
        return priority;
    }

    public boolean getAlive(){
        return alive;
    }

    public int getCrimesCommitted(){
        return pastCrimes.size();
    }

    public ArrayList<String> getPhysicalAttributes(){
        return physicalAttributes;
    }

    public boolean inJail(){
        return inJail;
    }

    public int getCriminalID(){
        return criminalID;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setShoeSize(double shoeSize){
        this.shoeSize = shoeSize;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public void setAlive(boolean alive){
        this.alive = alive;
    }

    public void addPhysicalAttributes(String attribute){
        physicalAttributes.add(attribute);
    }

    public void removePhysicalAttribute(String attribute){
        physicalAttributes.remove(attribute);
    }

    public void addPastCrime(int caseNumber){
        pastCrimes.add(caseNumber);
    }

    public void removePastCrime(int caseNumber){
        pastCrimes.remove(caseNumber);
    }

    public string toString(){
        return firstName+" "+lastName;
    }

}
