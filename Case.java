package LawEnforcementDatabase;

import java.util.ArrayList;

public class Case {
    
    private User creator;
    private ArrayList<Criminal> criminal;
    private ArrayList<Victim> victim;
    private ArrayList<Witness> witnesses;
    private ArrayList<PersonOfInterest> peopleOfInterest;
    private ArrayList<Suspect> suspects;
    private ArrayList<Criminal> criminals;
    private ArrayList<Victim> victims;
    private boolean caseOpen;
    private int ID;
    private ArrayList<String> evidence;
    private int crimeLevel;
    private ArrayList<PoliceOfficer> officers;
    private int legalClearance;
    private CaseType caseType;

    public Case(User creator, ArrayList<Witness> witnesses, ArrayList<PersonOfInterest> peopleOfInterest, ArrayList<Suspect> suspects, 
    ArrayList<Criminal> criminals, ArrayList<Victim> victims, boolean caseOpen, int ID, ArrayList<String> evidence, int crimeLevel,
    ArrayList<PoliceOfficer> officers, int legalClearance, CaseType casetype) {
        this.creator = creator;
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
        this.caseType = casetype;
    }

    public User getCreator() {
       return creator; 
    }

    public String getCriminal(){
        String ret = "";
        for(int i = 0; i < criminal.size(); i ++)
        {
            ret += criminal.get(i).getName() + ", ";
        }
        return ret;
    }

    public String getVictim(){
        String ret = "";
        for(int i = 0; i < victim.size(); i++)
        {
            ret += victim.get(i).getName() + ", ";
        }
        return ret;
    }
    public String getWitnesses() {  
        String ret = "";
        for(int i = 0; i < witnesses.size(); i++)
        {
            ret += witnesses.get(i).getName() + ", "; 
        }
        return ret;
        
    }

    public String getPersonsOfInterest() {
        String ret = "";
        for(int i = 0; i < peopleOfInterest.size(); i++)
        {
            ret += peopleOfInterest.get(i).getName() + ", "; 
        }
        return ret;
    }

    public String getSuspects() {
        String ret = "";
        for(int i = 0; i < suspects.size(); i++)
        {
            ret += suspects.get(i).getName() + ", "; 
        }
        return ret;
    }

    public String getCriminals() {
        String ret = "";
        for(int i = 0; i < criminals.size(); i++)
        {
            ret += criminals.get(i).getName() + ", "; 
        }
        return ret;
    }

    public String getVictims() {
        String ret = "";
        for(int i = 0; i < victims.size(); i++)
        {
            ret += victims.get(i).getName() + ", "; 
        }
        return ret;
    }

    public boolean getCaseOpen() {
        return caseOpen;
    }

    public int getID() {
        return ID;
    }

    public String getEvidence() {
        String ret = "";
        for(int i = 0; i < evidence.size(); i++)
        {
            ret += evidence.get(i) + ", "; 
        }
        return ret;
    }

    public int getCrimeLevel() {
        return crimeLevel;
    }

    public String getOfficers() {
        String ret = "";
        for(int i = 0; i < officers.size(); i++)
        {
            ret += officers.get(i).getName() + ", "; 
        }
        return ret;
    }

    public int getLegalClearance() {
        return legalClearance;
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

    public void addWitnesses(Witness witness) {
        witnesses.add(witness);
    }

    public void addPersonsOfInterest(PersonOfInterest personOfInterest){
        peopleOfInterest.add(personOfInterest);
    }

    public void addSuspect(Suspect suspect) {
        suspects.add(suspect);
    }

    public void addCriminal(Criminal criminal) {
        criminals.add(criminal);
    }

    public void addVictim(Victim victim) {
        victims.add(victim);
    }

    public void addEvidence(String evidenceString) {
        evidence.add(evidenceString);
    }

    public void addOfficers(PoliceOfficer officer) {
        officers.add(officer);
    }

    public void removeWitnesses(Person witness) {
        if(witnesses.contains(witness))
            witnesses.remove(witness);
    }

    public void removePersonsOfInterest(PersonOfInterest personOfInterest) {
        if(peopleOfInterest.contains(personOfInterest))
            peopleOfInterest.remove(personOfInterest);
    }

    public void removeSuspect(Suspect suspect) {
        if(suspects.contains(suspect))
            suspects.remove(suspect);
    }

    public void removeCriminal(Criminal criminal) {
        if(criminals.contains(criminal))
            criminals.remove(criminal);
    }

    public void removeVictim(Victim victim) {
        if(victims.contains(victim))
            victims.remove(victim);
    }

    public void removeEvidence(String evidenceString) {
        if(evidence.contains(evidenceString))
            evidence.remove(evidenceString);
    }

    public void removeOfficers(PoliceOfficer officer) {
        if(officers.contains(officer))
            officers.remove(officer);
    }

    public String getCaseType() {
        return caseType.toString();
    }
}
