package LawEnforcementDatabase;

/**
     * This method 
     * @return 
     */
import java.util.ArrayList;

/**
     * This method 
     * @return 
     */
public class VictimList {
    private static VictimList victimList;
    private static ArrayList<Victim> victims;

    private VictimList() {
        victims = DataLoader.getVictims();
    }

    
    public static VictimList getInstance() {
        if(victimList == null) {
            victimList = new VictimList();
        }
        return victimList;
    }

    public boolean haveVictim(String firstName, String lastName) {
        for(Victim victim : victims) {
            if(victim.getFirstName().equals(firstName) && victim.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;
    }

    public Victim getVictim(String firstName, String lastName) {
        for(Victim victim : victims) {
            if(victim.getFirstName().equals(firstName) & victim.getLastName().equals(lastName)) {
                return victim;
            }
        }

        return null;
    }

    public ArrayList<Victim> getVictims() {
        return victims;
    }

    public boolean addVictim(String firstName, String lastName, int age, String DOB, int ID, char sex,
    String description, String contact) {
        if(haveVictim(firstName, lastName)) {
            return false;
        }

        victims.add(new Victim(firstName, lastName, age, DOB, ID, sex, description, contact));
        return true;
    }

    public void saveVictims() {
        DataWriter.saveVictims();
    }
}
