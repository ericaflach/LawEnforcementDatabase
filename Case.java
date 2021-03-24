package LawEnforcementDatabase;

import java.util.ArrayList;

public class Case {
    
    private User creator;
    private ArrayList<Person> witnesses;
    private ArrayList<Person> personsOfInterest;
    private ArrayList<Person> suspects;
    private boolean caseOpen;
    private int caseNum;
    private ArrayList<String> evidence;
    private int crimeLevel;
    private ArrayList<User> officers;
    private int legalClearance;
    private CaseType caseType;

    public Case(int caseNumber, int crimeLevel, boolean caseOpen, int legalClearance, User creator, CaseType caseType)
    {
        witnesses = new ArrayList<Person>();
        personsOfInterest = new ArrayList<Person>();
        suspects = new ArrayList<Person>();
        evidence = new ArrayList<String>();
        officers = new ArrayList<User>();
        this.caseNum = caseNumber;
        this.crimeLevel = crimeLevel;
        this.caseOpen = caseOpen;
        this.legalClearance = legalClearance;
        this.creator = creator;
        this.caseType = caseType;
    }
    public User getCreator(){
       return creator; 
    }

    public String getWitnesses(){  
        String ret = "";
        for(int i = 0; i < witnesses.size(); i++)
        {
            ret += witnesses.get(i).getName() + ", "; 
        }
        return ret;
        
    }

    public String getPersonsOfInterest(){
        String ret = "";
        for(int i = 0; i < personsOfInterest.size(); i++)
        {
            ret += personsOfInterest.get(i).getName() + ", "; 
        }
        return ret;
    }

    public String getSuspects(){
        String ret = "";
        for(int i = 0; i < suspects.size(); i++)
        {
            ret += suspects.get(i).getName() + ", "; 
        }
        return ret;
    }

    public boolean getCaseOpen(){
        return caseOpen;
    }

    public int getCaseNum(){
        return caseNum;
    }

    public String getEvidence(){
        String ret = "";
        for(int i = 0; i < evidence.size(); i++)
        {
            ret += evidence.get(i) + ", "; 
        }
        return ret;
    }

    public int getCrimeLevel(){
        return crimeLevel;
    }

    public String getOfficers(){
        String ret = "";
        for(int i = 0; i < officers.size(); i++)
        {
            ret += officers.get(i).getName() + ", "; 
        }
        return ret;
    }

    public int getLegalClearance(){
        return legalClearance;
    }

    public void setCaseOpen(boolean caseOpen){
        this.caseOpen = caseOpen;
    }

    public void setCaseNum(int caseNum){
        this.caseNum = caseNum;
    }

    public void setCrimeLevel(int crimeLevel){
        this.crimeLevel = crimeLevel;
    }

    public void setLegalClearance(int legalClearance){
        this.legalClearance = legalClearance;
    }

    public void addWitnesses(Witness witness){
        witnesses.add(witness);
    }

    public void addPersonsOfInterest(PersonOfInterest personOfInterest)
    {
        personsOfInterest.add(personOfInterest);
    }

    public void addOfficers(PoliceOfficer officer){
        officers.add(officer);
    }

    public void addSuspects(Suspect suspect){
        suspects.add(suspect);
    }

    public void addEvidence(String evidenceString){
        evidence.add(evidenceString);
    }

    public void removeWitnesses(Person witness){
        if(witnesses.contains(witness))
            witnesses.remove(witness);
    }

    public void removePersonsOfInterest(PersonOfInterest personOfInterest){
        if(personsOfInterest.contains(personOfInterest))
            personsOfInterest.remove(personOfInterest);
    }

    public void removeOfficers(PoliceOfficer officer){
        if(officers.contains(officer))
            officers.remove(officer);
    }

    public void removeSuspects(Suspect suspect){
        if(suspects.contains(suspect))
            suspects.remove(suspect);
    }

    public void removeEvidence(String evidenceString){
        if(evidence.contains(evidenceString))
            evidence.remove(evidenceString);
    }

    public String getCaseType() {
        return caseType.toString();
    }
}
