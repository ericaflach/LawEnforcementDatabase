package LawEnforcementDatabase;

import java.util.ArrayList;

public class Criminal {

    private User creator;
    private ArrayList<Case> pastCrimes;
    private String address;
    private double shoeSize;
    private int priority;
    private boolean alive;
    private ArrayList<String> physicalAttributes;
    private boolean inJail;
    private int criminalID;

    public Criminal(){
        
    }

    public User getCreator(){
        return creator;
    }

    public ArrayList<Case> getPastCrimes(){
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

    public void addPastCrime(Case crime){
        pastCrimes.add(crime);
    }

    public void removePastCrime(Case crime){
        pastCrimes.remove(crime);
    }

}
