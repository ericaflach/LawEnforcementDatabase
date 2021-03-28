/**
 * @author Chris Nelson
 */
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

    /**
     * This method constructs the case
     * @param creatorID
     * @param witnesses
     * @param peopleOfInterest
     * @param suspects
     * @param criminals
     * @param victims
     * @param caseOpen
     * @param ID
     * @param evidence
     * @param crimeLevel
     * @param officers
     * @param legalClearance
     * @param caseType
     */
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

    /**
     * This method gets the case's creatorID
     * @return creatorID
     */
    public int getCreatorID() {
       return creatorID; 
    }

    /**
     * This method gets the case's witnesses
     * @return witnesses
     */
    public ArrayList<Integer> getWitnesses(){
        return witnesses;
    }

    /**
     * This method gets the case's people of interest
     * @return people of interest
     */
    public ArrayList<Integer> getPeopleOfInterest() {
        return peopleOfInterest;
    }

    /**
     * This method gets the case's suspects
     * @return suspects
     */
    public ArrayList<Integer> getSuspects() {
        return suspects;
    }

    /**
     * This method gets the case's criminals
     * @return criminals
     */
    public ArrayList<Integer> getCriminals(){
        return criminals;
    }

    /**
     * This method gets the case's victims
     * @return victims
     */
    public ArrayList<Integer> getVictims() {
        return victims;
    }

    /**
     * This method gets if case is open
     * @return true or false
     */
    public boolean getCaseOpen() {
        return caseOpen;
    }

    /**
     * This method gets the case's ID
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * This method gets the case's evidence
     * @return evidence
     */
    public ArrayList<String> getEvidence() {
        return evidence;
    }

    /**
     * This method gets the case's crime level
     * @return crime level
     */
    public int getCrimeLevel() {
        return crimeLevel;
    }

    /**
     * This method gets the case's officers
     * @return officers
     */
    public ArrayList<Integer> getOfficers() {
        return officers;
    }

    /**
     * This method gets the case's legal clearance
     * @return legal clearance
     */
    public int getLegalClearance() {
        return legalClearance;
    }

    /**
     * This method gets the case type
     * @return case type
     */
    public String getCaseType() {
        return caseType;
    }

    /**
     * This method sets the case's creator ID
     * @param creatorID
     */
    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    /**
     * This method sets the case's witnesses
     * @param witnesses
     */
    public void setWitnesses(ArrayList<Integer> witnesses) {
        this.witnesses = witnesses;
    }

    /**
     * This method sets the case's people of interest
     * @param peopleOfInterest
     */
    public void setPeopleOfInterest(ArrayList<Integer> peopleOfInterest) {
        this.peopleOfInterest = peopleOfInterest;
    }

    /**
     * This method sets the case's suspects
     * @param suspects
     */
    public void setSuspects(ArrayList<Integer> suspects) {
        this.suspects = suspects;
    }

    /**
     * This method sets the case's criminals
     * @param criminals
     */
    public void setCriminals(ArrayList<Integer> criminals) {
        this.criminals = criminals;
    }

    /**
     * This method sets the case's victims
     * @param victims
     */
    public void setVictims(ArrayList<Integer> victims) {
        this.victims = victims;
    }

    /**
     * This method sets if case is open
     * @param caseOpen
     */
    public void setCaseOpen(boolean caseOpen) {
        this.caseOpen = caseOpen;
    }

    /**
     * This method sets the caseID
     * @param ID
     */
    public void setCaseNum(int ID) {
        this.ID = ID;
    }

    /**
     * This method sets the case's evidence
     * @param evidence
     */
    public void setEvidence(ArrayList<String> evidence) {
        this.evidence = evidence;
    }

    /**
     * This method sets the crime level
     * @param crimeLevel
     */
    public void setCrimeLevel(int crimeLevel) {
        this.crimeLevel = crimeLevel;
    }

    /**
     * This method sets the officers
     * @param officers
     */
    public void setOfficers(ArrayList<Integer> officers) {
        this.officers = officers;
    }

    /**
     * This method sets the legal clearance 
     * @param legalClearance
     */
    public void setLegalClearance(int legalClearance) {
        this.legalClearance = legalClearance;
    }

    /**
     * This method sets the case type
     * @param caseType
     */
    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    /**
     * This method turns witnesses to string
     * @return witnesses
     */
    public String witnessesToString() {  
        String ret = "";
        for (int i = 0; i < witnesses.size(); i++)
        {
            ret += witnesses.get(i) + ", "; 
        }
        return ret;
    }

    /**
     * This methor turns persons of interest to string
     * @return persons of interest
     */
    public String personsOfInterestToString() {
        String ret = "";
        for (int i = 0; i < peopleOfInterest.size(); i++)
        {
            ret += peopleOfInterest.get(i) + ", "; 
        }
        return ret;
    }

    /**
     * This method turns suspects to string
     * @return suspects
     */
    public String suspectsToString() {
        String ret = "";
        for (int i = 0; i < suspects.size(); i++)
        {
            ret += suspects.get(i) + ", "; 
        }
        return ret;
    }

    /**
     * This method trusn criminals to string
     * @return criminals
     */
    public String criminalsToString() {
        String ret = "";
        for (int i = 0; i < criminals.size(); i++)
        {
            ret += criminals.get(i) + ", "; 
        }
        return ret;
    }

    /**
     * This method turns victims to string
     */
    public String victimsToString() {
        String ret = "";
        for (int i = 0; i < victims.size(); i++)
        {
            ret += victims.get(i) + ", "; 
        }
        return ret;
    }

    /**
     * This method turns evidence to string
     * @return evidence
     */
    public String evidenceToString() {
        String ret = "";
        for(int i = 0; i < evidence.size(); i++)
        {
            ret += evidence.get(i) + ", "; 
        }
        return ret;
    }

    /**
     * This method turns officers to string
     * @return officers
     */
    public String officersToString() {
        String ret = "";
        for(int i = 0; i < officers.size(); i++)
        {
            ret += officers.get(i) + ", "; 
        }
        return ret;
    }

    /**
     * This method adds a witness
     * @param witnessID
     */
    public void addWitnesses(Integer witnessID) {
        witnesses.add(witnessID);
    }

    /**
     * This method adds a person of interest
     * @param personOfInterestID
     */
    public void addPersonsOfInterest(Integer personOfInterestID){
        peopleOfInterest.add(personOfInterestID);
    }

    /**
     * This method adds a suspect
     * @param suspectID
     */
    public void addSuspect(Integer suspectID) {
        suspects.add(suspectID);
    }

    /**
     * This method adds a criminal
     * @param criminalID
     */
    public void addCriminal(Integer criminalID) {
        criminals.add(criminalID);
    }

    /**
     * This method adds a victim
     * @param victimID
     */
    public void addVictim(Integer victimID) {
        victims.add(victimID);
    }

    /**
     * This method adds evidence
     * @param evidenceString
     */
    public void addEvidence(String evidenceString) {
        evidence.add(evidenceString);
    }

    /**
     * This method adds an officer
     * @param officerID
     */
    public void addOfficers(Integer officerID) {
        officers.add(officerID);
    }

    /**
     * This method removes a witness
     * @param witnessID
     */
    public void removeWitnesses(Integer witnessID) {
        if(witnesses.contains(witnessID))
            witnesses.remove(witnessID);
    }

    /**
     * This method removes a person of interest
     * @param personOfInterestID
     */
    public void removePersonsOfInterest(Integer personOfInterestID) {
        if(peopleOfInterest.contains(personOfInterestID))
            peopleOfInterest.remove(personOfInterestID);
    }

    /**
     * This merhos removes a suspect
     * @param suspectID
     */
    public void removeSuspect(Integer suspectID) {
        if(suspects.contains(suspectID))
            suspects.remove(suspectID);
    }

    /**
     * This method removes a criminal
     * @param criminalID
     */
    public void removeCriminal(Integer criminalID) {
        if(criminals.contains(criminalID))
            criminals.remove(criminalID);
    }

    /**
     * This method removes a victim
     */
    public void removeVictim(Integer victimID) {
        if(victims.contains(victimID))
            victims.remove(victimID);
    }

    /**
     * This method removes evidence
     * @param evidenceString
     */
    public void removeEvidence(String evidenceString) {
        if(evidence.contains(evidenceString))
            evidence.remove(evidenceString);
    }

    /**
     * This method removes an officer
     * @param officerID
     */
    public void removeOfficers(Integer officerID) {
        if(officers.contains(officerID))
            officers.remove(officerID);
    }

    /**
     * This method turns case information to string
     * @return case information
     */
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
