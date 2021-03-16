package LawEnforcementDatabase;

import java.util.ArrayList;

public class Case {
    
    private User creator;
    private ArrayList<Witness> witnesses;
    private ArrayList<PersonOfInterest> personsOfInterest;
    private ArrayList<Suspect> suspects;
    private boolean caseOpen;
    private int caseNum;
    private ArrayList<String> evidence;
    private int crimeLevel;
    private ArrayList<PoliceOfficer> officers;
    private int legalClearance;

    public Case(int caseNumber, int crimeLevel, boolean caseOpen, int legalClearance, User creator)
    {
        witnesses = new ArrayList<Witness>();
        personsOfInterest = new ArrayList<PersonOfInterest>();
        suspects = new ArrayList<Suspect>();
        evidence = new ArrayList<String>();
        officers = new ArrayList<PoliceOfficer>();

        this.caseNum = caseNumber;
        this.crimeLevel = crimeLevel;
        this.caseOpen = caseOpen;
        this.legalClearance = legalClearance;
        this.creator = creator;
    }
    public User getCreator(){
       return creator; 
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
        return caseOpen;
    }

    public int getCaseNum(){
        return caseNum;
    }

    public String getEvidence(){
        return null;
    }

    public int getCrimeLevel(){
        return crimeLevel;
    }

    public String getOfficers(){
        return null;
    }

    public int getLegalClearance(){
        return 0;
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

    public void removeWitnesses(Witness witness){
        witnesses.remove(witness);
    }

    public void removePersonsOfInterest(PersonOfInterest personOfInterest){
        personsOfInterest.remove(personOfInterest);
    }

    public void removeOfficers(){

    }

    public void removeSuspects(String name){

    }

    public void removeEvidence(String name){

    }
}
