package LawEnforcementDatabase;

import java.util.ArrayList;

public class Case {
    
    private int creatorID;
    private ArrayList<Integer> witnesses;
    private ArrayList<Integer> peopleOfInterest;
    private ArrayList<Integer> suspects;
    private ArrayList<Integer> criminals;
    private ArrayList<Integer> victims;
    private boolean caseOpen;
    private int ID;
    private ArrayList<String> evidence;
    private int crimeLevel;
    private ArrayList<Integer> officers;
    private int legalClearance;
    private String caseType;

    public Case(int creatorID, ArrayList<Integer> witnesses, ArrayList<Integer> peopleOfInterest, ArrayList<Integer> suspects, 
    ArrayList<Integer> criminals, ArrayList<Integer> victims, boolean caseOpen, int ID, ArrayList<String> evidence, int crimeLevel,
    ArrayList<Integer> officers, int legalClearance, String caseType) {
        this.creatorID = creatorID;
        this.witnesses = witnesses;
        this.peopleOfInterest = peopleOfInterest;
        this.suspects = suspects;
        this.criminals = criminals;
        this.victims = victims;
        this.caseOpen = caseOpen;
        this.ID = ID;
        this.evidence = evidence;
        this.crimeLevel = crimeLevel;
        this.officers = officers;
        this.legalClearance = legalClearance;
        this.caseType = caseType;
    }

    public int getCreatorID() {
       return creatorID; 
    }

    public ArrayList<Integer> getWitnesses(){
        return witnesses;
    }

    public ArrayList<Integer> getPeopleOfInterest() {
        return peopleOfInterest;
    }

    public ArrayList<Integer> getSuspects() {
        return suspects;
    }

    public ArrayList<Integer> getCriminals(){
        return criminals;
    }

    public ArrayList<Integer> getVictims() {
        return victims;
    }

    public boolean getCaseOpen() {
        return caseOpen;
    }

    public int getID() {
        return ID;
    }

    public ArrayList<String> getEvidence() {
        return evidence;
    }

    public int getCrimeLevel() {
        return crimeLevel;
    }

    public ArrayList<Integer> getOfficers() {
        return officers;
    }

    public int getLegalClearance() {
        return legalClearance;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    public void setWitnesses(ArrayList<Integer> witnesses) {
        this.witnesses = witnesses;
    }

    public void setPeopleOfInterest(ArrayList<Integer> peopleOfInterest) {
        this.peopleOfInterest = peopleOfInterest;
    }

    public void setSuspects(ArrayList<Integer> suspects) {
        this.suspects = suspects;
    }

    public void setCriminals(ArrayList<Integer> criminals) {
        
    }

    public void setCaseOpen(boolean caseOpen) {
        this.caseOpen = caseOpen;
    }

    public void setCaseNum(int ID) {
        this.ID = ID;
    }

    public void setCrimeLevel(int crimeLevel) {
        this.crimeLevel = crimeLevel;
    }

    public void setLegalClearance(int legalClearance) {
        this.legalClearance = legalClearance;
    }


    public String witnessesToString() {  
        String ret = "";
        for (int i = 0; i < witnesses.size(); i++)
        {
            ret += witnesses.get(i) + ", "; 
        }
        return ret;
    }

    public String personsOfInterestToString() {
        String ret = "";
        for (int i = 0; i < peopleOfInterest.size(); i++)
        {
            ret += peopleOfInterest.get(i) + ", "; 
        }
        return ret;
    }

    public String suspectsToString() {
        String ret = "";
        for (int i = 0; i < suspects.size(); i++)
        {
            ret += suspects.get(i) + ", "; 
        }
        return ret;
    }

    public String criminalsToString() {
        String ret = "";
        for (int i = 0; i < criminals.size(); i++)
        {
            ret += criminals.get(i) + ", "; 
        }
        return ret;
    }

    public String victimsToString() {
        String ret = "";
        for (int i = 0; i < victims.size(); i++)
        {
            ret += victims.get(i) + ", "; 
        }
        return ret;
    }

    public String evidenceToString() {
        String ret = "";
        for(int i = 0; i < evidence.size(); i++)
        {
            ret += evidence.get(i) + ", "; 
        }
        return ret;
    }

    public String officersToString() {
        String ret = "";
        for(int i = 0; i < officers.size(); i++)
        {
            ret += officers.get(i) + ", "; 
        }
        return ret;
    }

    public void addWitnesses(Integer witnessID) {
        witnesses.add(witnessID);
    }

    public void addPersonsOfInterest(Integer personOfInterestID){
        peopleOfInterest.add(personOfInterestID);
    }

    public void addSuspect(Integer suspectID) {
        suspects.add(suspectID);
    }

    public void addCriminal(Integer criminalID) {
        criminals.add(criminalID);
    }

    public void addVictim(Integer victimID) {
        victims.add(victimID);
    }

    public void addEvidence(String evidenceString) {
        evidence.add(evidenceString);
    }

    public void addOfficers(Integer officerID) {
        officers.add(officerID);
    }

    public void removeWitnesses(Integer witnessID) {
        if(witnesses.contains(witnessID))
            witnesses.remove(witnessID);
    }

    public void removePersonsOfInterest(Integer personOfInterestID) {
        if(peopleOfInterest.contains(personOfInterestID))
            peopleOfInterest.remove(personOfInterestID);
    }

    public void removeSuspect(Integer suspectID) {
        if(suspects.contains(suspectID))
            suspects.remove(suspectID);
    }

    public void removeCriminal(Integer criminalID) {
        if(criminals.contains(criminalID))
            criminals.remove(criminalID);
    }

    public void removeVictim(Integer victimID) {
        if(victims.contains(victimID))
            victims.remove(victimID);
    }

    public void removeEvidence(String evidenceString) {
        if(evidence.contains(evidenceString))
            evidence.remove(evidenceString);
    }

    public void removeOfficers(Integer officerID) {
        if(officers.contains(officerID))
            officers.remove(officerID);
    }

    public String toString() {
        return  "\nCreator: " + creatorID +
                "\nWitnesses: " + witnesses +
                "\nPeople of Interest: " + peopleOfInterest +
                "\nSuspects: " + suspects +
                "\nCriminals: " + criminals +
                "\nVictims: " + victims +
                "\nCase Open: " + caseOpen +
                "\nID: " + ID +
                "\nEvidence: " + evidence +
                "\nCrime Level: " + crimeLevel +
                "\nOfficers: " + officers +
                "\nLegal Clearance: " + legalClearance +
                "\nCase Type: " + caseType;
    }
}
