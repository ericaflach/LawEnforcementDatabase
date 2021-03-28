/**
 * @author Erica Flach and Chris Nelson
 */
package LawEnforcementDatabase;

import java.util.ArrayList;
import java.util.Random;

public class CaseList {

    private static CaseList caseList;
    private static ArrayList<Case> cases;
    private Random rand; 
    /**
     * This method sets the cases
     */
    private CaseList() {
        cases = DataLoader.getCases();
        rand = new Random();
    }

    /**
     * This method gets the one instance of cases
     * @return case list
     */
    public static CaseList getInstance() {
        if(caseList == null) {
            caseList = new CaseList();
        }

        return caseList;  
    }

    /**
     * This method checks if cases has a case
     * @return true or false
     */
    public boolean haveCase(int ID) {
        for(Case case1 : cases) {
            if(case1.getID() == ID) {
                return true;
            }
        }

        return false;
    } 

    /**
     * This method finds a case from it's ID
     * @param ID
     * @return case that matches ID
     */
    public Case getCase(int ID) {
        for(Case case1 : cases) {
            if(case1.getID() == ID) {
                return case1;
            }
        }

        return null;
    }

    /**
     * This method gets all cases
     * @return cases
     */
    public ArrayList<Case> getCases() {
        return cases;
    }

    /**
     * This method finds cases that match all the given IDS
     * @param caseIDs
     * @return cases that match IDs
     */
    public ArrayList<Case> getCasesFromIDs(ArrayList<Integer> caseIDs) {
        ArrayList<Case> temp = new ArrayList<Case>();
        for(int caseID : caseIDs) {
            temp.add(getCase(caseID));
        }
        return temp;
    }

    /**
     * This method adds a case to cases
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
     * @return true or false
     */
    public boolean addCase(int creatorID, ArrayList<Integer> witnesses, ArrayList<Integer> peopleOfInterest, ArrayList<Integer> suspects, 
    ArrayList<Integer> criminals, ArrayList<Integer> victims, boolean caseOpen, int ID, ArrayList<String> evidence, int crimeLevel,
    ArrayList<Integer> officers, int legalClearance, String caseType) {
        if(haveCase(ID)) {
            return false;
        }

        cases.add(new Case(creatorID, witnesses, peopleOfInterest, suspects, criminals, victims, caseOpen, ID,
         evidence, crimeLevel, officers, legalClearance, caseType));
         return true;
    }

    public int getUniqueID() {
        boolean unique = false;
        int ID = rand.nextInt((9999999) + 1);
        while (!unique) {
            unique = true;
            for(Case crimes : cases) {
                if(crimes.getCaseID() == ID) {
                    unique = false;
                    ID = rand.nextInt((9999999) + 1);
                }
            }
        }
        return ID;
    }

    /**
     * This method saves the cases to json
     */
    public void saveCases() {
        DataWriter.saveCases();
    }
}
