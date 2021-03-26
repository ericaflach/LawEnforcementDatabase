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

    public boolean addCase(User creator, ArrayList<Witness> witnesses, ArrayList<PersonOfInterest> peopleOfInterest, ArrayList<Suspect> suspects, 
    ArrayList<Criminal> criminals, ArrayList<Victim> victims, boolean caseOpen, int ID, ArrayList<String> evidence, int crimeLevel,
    ArrayList<PoliceOfficer> officers, int legalClearance, CaseType caseType) {
        if(haveCase(ID)) {
            return false;
        }

        cases.add(new Case(creator, witnesses, peopleOfInterest, suspects, criminals, victims, caseOpen, ID,
         evidence, crimeLevel, officers, legalClearance, caseType));
         return true;
    }

    public void saveCases() {
        DataWriter.saveCases();
    }
}
