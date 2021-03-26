package LawEnforcementDatabase;

import java.util.ArrayList;
public class SuspectList {

    private static SuspectList suspectList;
    private static ArrayList<Suspect> suspects;

    private SuspectList() {
        suspects = DataLoader.getSuspects();
    }

    public static SuspectList getInstance() {
        if(suspectList == null) {
            suspectList = new SuspectList();
        }
        return suspectList;
    }

    public boolean haveSuspect(String firstName, String lastName) {
        for(Suspect suspect : suspects) {
            if(suspect.getFirstName().equals(firstName) && suspect.getLastName().equals(lastName)) {
                return true;
            }
        }

        return false;
    }

    public Suspect getSuspect(String firstName, String lastName) {
        for(Suspect suspect : suspects) {
            if(suspect.getFirstName().equals(firstName) && suspect.getLastName().equals(lastName)) {
                return suspect;
            }
        }

        return null;
    }

    public ArrayList<Suspect> getSuspects() {
        return suspects;
    }

    public boolean addSuspect(String firstName, String lastName, int age, String DOB, int ID,
    char sex, User creator, ArrayList<Integer> pastCrimes, String address, double shoeSize, int priority,
    boolean alive, ArrayList<String> physicalAttributes, boolean inJail, ArrayList<String> tattoos, String alibi) {
        if(haveSuspect(firstName, lastName)) {
            return false;
        }

        suspects.add(new Suspect(firstName, lastName, age, DOB, ID, sex, creator, pastCrimes, address, shoeSize, priority,
        alive, physicalAttributes, inJail, tattoos, alibi));
        return true;
    }

    public void saveSuspects() {
        DataWriter.saveSuspects();
    }
}
