package LawEnforcementDatabase;

import java.util.ArrayList;

public class Case {
    
    private User creator;
    private ArrayList witnesses;
    private ArrayList personsOfInterest;
    private ArrayList suspects;
    private boolean caseOpen;
    private int caseNum;
    private ArrayList evidence;
    private int crimeLevel;
    private ArrayList officers;
    private int legalClearance;

    public User getCreator(){
        return null;
    }

    public String getWitnesses(){
        return null;
    }

    public String getPersonsOfInterest(){
        return null;
    }

    public String getSuspects(){
        return null;
    }

    public boolean getCaseOpen(){
        return false;
    }

    public int getCaseNum(){
        return 0;
    }

    public String getEvidence(){
        return null;
    }

    public int getCrimeLevel(){
        return 0;
    }

    public String getOfficers(){
        return null;
    }

    public int getLegalClearance(){
        return 0;
    }

    public void setCaseOpen(boolean caseOpen){

    }

    public void setCaseNum(int caseNum){

    }

    public void setCrimeLevel(int crimeLevel){

    }

    public void setLegalClearance(int legalClearance){

    }

    public void addWitnesses(String name){

    }

    public void addPersonsOfInterest(String name){

    }

    public void addOfficers(String name){

    }

    public void addSuspects(String name){

    }

    public void addEvidence(String name){

    }

    public void removeWitnesses(String name){

    }

    public void removePersonsOfInterest(String name){

    }

    public void removeOfficers(String name){

    }

    public void removeSuspects(String name){

    }

    public void removeEvidence(String name){

    }
}
