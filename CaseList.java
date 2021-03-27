package LawEnforcementDatabase;

import java.util.ArrayList;

public class CaseList {

    private static CaseList caseList;
    private static ArrayList<Case> cases;

    private CaseList() {
        cases = DataLoader.getCases();
    }

    public static CaseList getInstance() {
        if(caseList == null) {
            caseList = new CaseList();
        }

        return caseList;  
    }

    public boolean haveCase(int ID) {
        for(Case case1 : cases) {
            if(case1.getID() == ID) {
                return true;
            }
        }

        return false;
    } 

    public Case getCase(int ID) {
        for(Case case1 : cases) {
            if(case1.getID() == ID) {
                return case1;
            }
        }

        return null;
    }

    public ArrayList<Case> getCases() {
        return cases;
    }

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

    public void saveCases() {
        DataWriter.saveCases();
    }
}
