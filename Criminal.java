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
        return null;
    }
    public ArrayList<Case> getPastCrimes(){
        return null;
    }
    public String getAddress(){
        return null;
    }
    public double getShoeSize(){
        return 0.0;
    }
    public int getPriority(){
        return 0;
    }
    public boolean getAlive(){
        return false;
    }
    public int getCrimesCommitted(){
        return 0;
    }
    public ArrayList<String> getPhysicalAttributes(){
        return null;
    }
    public boolean inJail(){
        return false;
    }
    public int getCriminalID(){
        return 0;
    }
    public void setAddress(String address){

    }
    public void setShoeSize(double shoeSize){

    }
    public void setPriority(int priority){

    }
    public void setAlive(boolean alive){

    }
    public void addPhysicalAttributes(String attribute){

    }
    public void addPastCrime(Case crime){

    }
    public void removePastCrime(Case crime){

    }
    public void removePhysicalAttribute(String attribute){
        
    }
}
