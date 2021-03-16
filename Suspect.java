package LawEnforcementDatabase;

public class Suspect extends Criminal {
    
    private String alibi;
    private int suspectID;

    public Suspect(String alibi, int suspectID){
        super();
        this.alibi = alibi;
        this.suspectID = suspectID;
    }
    public void setSuspectID(int suspectID){
        this.suspectID = suspectID;
    }

    public void setAlibi(String alibi){
        this.alibi = alibi;
    }

    public int getSuspectID(){
        return suspectID;
    }

    public String getAlibi(){
        return alibi;
    }
}
