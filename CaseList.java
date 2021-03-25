package LawEnforcementDatabase;

import java.util.ArrayList;

public class CaseList {
    private static CaseList caseList;
    private static ArrayList<Case> cases;
    private CaseList() {
        cases = new ArrayList<Case>();
    }
    public static CaseList getInstance() {
        if(caseList == null) {
            caseList = new CaseList();
        }
        return caseList;  
    }
    public ArrayList<Case> getCases() {
        return cases;
    }
}
