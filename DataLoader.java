package LawEnforcementDatabase;

import java.util.ArrayList;
import java.io.FileReader;
//import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class DataLoader extends DataConstants {

    public static ArrayList<Criminal> getCriminals() {
        ArrayList<Criminal> criminals = new ArrayList<Criminal>();

        try {
            FileReader reader = new FileReader(CRIMINAL_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray criminalsJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < criminalsJSON.size(); i++) {
                JSONObject criminalJSON = (JSONObject)criminalsJSON.get(i);
                String firstName = (String)criminalJSON.get(PERSON_FIRST_NAME);
                String lastName = (String)criminalJSON.get(PERSON_LAST_NAME);
                int age = ((Long)criminalJSON.get(PERSON_AGE)).intValue();
                String dateOfBirth = (String)criminalJSON.get(PERSON_DATEOFBIRTH);
                int ID = ((Long)criminalJSON.get(PERSON_ID)).intValue();
                char sex = ((String)criminalJSON.get(PERSON_SEX)).charAt(0);
                int creatorID = ((Long)criminalJSON.get(CRIMINAL_CREATOR_ID)).intValue();
                JSONArray pastCrimesJSON = (JSONArray)criminalJSON.get(CRIMINAL_PAST_CRIMES);
                ArrayList<Integer> pastCrimes = new ArrayList<Integer>();
                for(int j = 0; j < pastCrimesJSON.size(); j++) {
                    pastCrimes.add(((Long)pastCrimesJSON.get(j)).intValue());
                }
                String address = (String)criminalJSON.get(CRIMINAL_ADDRESS);
                double shoeSize = Double.parseDouble((String)criminalJSON.get(CRIMINAL_SHOE_SIZE));
                int priority = ((Long)criminalJSON.get(CRIMINAL_PRIORITY)).intValue();
                boolean alive = Boolean.parseBoolean((String)criminalJSON.get(CRIMINAL_ALIVE));
                JSONArray physicalAttributesJSON = (JSONArray)criminalJSON.get(CRIMINAL_PHYSICAL_ATTRIBUTES);
                ArrayList<String> physicalAttributes = new ArrayList<String>();
                for(int j = 0; j < physicalAttributesJSON.size(); j++) {
                    physicalAttributes.add((String)physicalAttributesJSON.get(j));
                }
                boolean inJail = Boolean.parseBoolean((String)criminalJSON.get(CRIMINAL_IN_JAIL));
                JSONArray tattoosJSON = (JSONArray)criminalJSON.get(CRIMINAL_TATOOS);
                ArrayList<String> tattoos = new ArrayList<String>();
                for(int j = 0; j < tattoosJSON.size(); j++) {
                    tattoos.add((String)tattoosJSON.get(j));
                }

                  criminals.add(new Criminal(firstName, lastName, age, dateOfBirth, ID, sex, creatorID, pastCrimes, address, shoeSize, priority,
                  alive, physicalAttributes, inJail, tattoos));
              }

              return criminals;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<PersonOfInterest> getPeopleOfInterest() {
        ArrayList<PersonOfInterest> peopleOfInterest = new ArrayList<PersonOfInterest>();

        try {
            FileReader reader = new FileReader(PERSON_OF_INTEREST_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleOfInterestJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < peopleOfInterestJSON.size(); i++) {
                  JSONObject personOfInterestJSON = (JSONObject)peopleOfInterestJSON.get(i);
                  String firstName = (String)personOfInterestJSON.get(PERSON_FIRST_NAME);
                  String lastName = (String)personOfInterestJSON.get(PERSON_LAST_NAME);
                  int age = ((Long)personOfInterestJSON.get(PERSON_AGE)).intValue();
                  String dateOfBirth = (String)personOfInterestJSON.get(PERSON_DATEOFBIRTH);
                  int ID = ((Long)personOfInterestJSON.get(PERSON_ID)).intValue();
                  char sex = ((String)personOfInterestJSON.get(PERSON_SEX)).charAt(0);
                  String description = (String)personOfInterestJSON.get(PERSON_OF_INTEREST_DESCRIPTION);
                  String contact = (String)personOfInterestJSON.get(PERSON_OF_INTEREST_CONTACT);

                  peopleOfInterest.add(new PersonOfInterest(firstName, lastName, age, dateOfBirth, ID, sex, description, contact));
              }

              return peopleOfInterest;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public static ArrayList<Suspect> getSuspects() {
        ArrayList<Suspect> suspects = new ArrayList<Suspect>();

        try {
            FileReader reader = new FileReader(SUSPECT_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray suspectsJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < suspectsJSON.size(); i++) {
                  JSONObject suspectJSON = (JSONObject)suspectsJSON.get(i);
                  String firstName = (String)suspectJSON.get(PERSON_FIRST_NAME);
                  String lastName = (String)suspectJSON.get(PERSON_LAST_NAME);
                  int age = ((Long)suspectJSON.get(PERSON_AGE)).intValue();
                  String dateOfBirth = (String)suspectJSON.get(PERSON_DATEOFBIRTH);
                  int ID = ((Long)suspectJSON.get(PERSON_ID)).intValue();
                  char sex = ((String)suspectJSON.get(PERSON_SEX)).charAt(0);
                  int creatorID = ((Long)suspectJSON.get(CRIMINAL_CREATOR_ID)).intValue();
                  JSONArray pastCrimesJSON = (JSONArray)suspectJSON.get(CRIMINAL_PAST_CRIMES);
                  ArrayList<Integer> pastCrimes = new ArrayList<Integer>();
                  for(int j = 0; j < pastCrimesJSON.size(); j++) {
                      pastCrimes.add(((Long)pastCrimesJSON.get(j)).intValue());
                  }
                  String address = (String)suspectJSON.get(CRIMINAL_ADDRESS);
                  double shoeSize = Double.parseDouble((String)suspectJSON.get(CRIMINAL_SHOE_SIZE));
                  int priority = ((Long)suspectJSON.get(CRIMINAL_PRIORITY)).intValue();
                  boolean alive = Boolean.parseBoolean((String)suspectJSON.get(CRIMINAL_ALIVE));
                  JSONArray physicalAttributesJSON = (JSONArray)suspectJSON.get(CRIMINAL_PHYSICAL_ATTRIBUTES);
                  ArrayList<String> physicalAttributes = new ArrayList<String>();
                  for(int j = 0; j < physicalAttributesJSON.size(); j++) {
                      physicalAttributes.add((String)physicalAttributesJSON.get(j));
                  }
                  boolean inJail = Boolean.parseBoolean((String)suspectJSON.get(CRIMINAL_IN_JAIL));
                  JSONArray tattoosJSON = (JSONArray)suspectJSON.get(CRIMINAL_TATOOS);
                  ArrayList<String> tattoos = new ArrayList<String>();
                  for(int j = 0; j < tattoosJSON.size(); j++) {
                    tattoos.add((String)tattoosJSON.get(j));
                  }
                  String alibi = (String)suspectJSON.get(SUSPECT_ALIBI);

                  suspects.add(new Suspect(firstName, lastName, age, dateOfBirth, ID, sex, creatorID, pastCrimes, address,
                  shoeSize, priority, alive, physicalAttributes, inJail, tattoos, alibi));
              }

              return suspects;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Victim> getVictims() {
        ArrayList<Victim> victims = new ArrayList<Victim>();

        try {
            FileReader reader = new FileReader(VICTIM_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray victimsJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < victimsJSON.size(); i++) {
                  JSONObject victimJSON = (JSONObject)victimsJSON.get(i);
                  String firstName = (String)victimJSON.get(PERSON_FIRST_NAME);
                  String lastName = (String)victimJSON.get(PERSON_LAST_NAME);
                  int age = ((Long)victimJSON.get(PERSON_AGE)).intValue();
                  String dateOfBirth = (String)victimJSON.get(PERSON_DATEOFBIRTH);
                  int ID = ((Long)victimJSON.get(PERSON_ID)).intValue();
                  char sex = ((String)victimJSON.get(PERSON_SEX)).charAt(0);
                  String description = (String)victimJSON.get(VICTIM_DESCRIPTION);
                  String contact = (String)victimJSON.get(VICTIM_CONTACT);

                  victims.add(new Victim(firstName, lastName, age, dateOfBirth, ID, sex, description, contact));
              }

              return victims;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Witness> getWitnesses() {
        ArrayList<Witness> witnesses = new ArrayList<Witness>();

        try {
            FileReader reader = new FileReader(WITNESS_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray witnessesJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < witnessesJSON.size(); i++) {
                  JSONObject witnessJSON = (JSONObject)witnessesJSON.get(i);
                  String firstName = (String)witnessJSON.get(PERSON_FIRST_NAME);
                  String lastName = (String)witnessJSON.get(PERSON_LAST_NAME);
                  int age = ((Long)witnessJSON.get(PERSON_AGE)).intValue();
                  String dateOfBirth = (String)witnessJSON.get(PERSON_DATEOFBIRTH);
                  int ID = ((Long)witnessJSON.get(PERSON_ID)).intValue();
                  char sex = ((String)witnessJSON.get(PERSON_SEX)).charAt(0);
                  String description = (String)witnessJSON.get(WITNESS_DESCRIPTION);
                  String contact = (String)witnessJSON.get(WITNESS_CONTACT);

                  witnesses.add(new Witness(firstName, lastName, age, dateOfBirth, ID, sex, description, contact));
              }

              return witnesses;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Admin> getAdmins() {
        ArrayList<Admin> admins = new ArrayList<Admin>();

        try {
            FileReader reader = new FileReader(ADMIN_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray adminsJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < adminsJSON.size(); i++) {
                  JSONObject adminJSON = (JSONObject)adminsJSON.get(i);
                  String firstName = (String)adminJSON.get(USER_FIRST_NAME);
                  String lastName = (String)adminJSON.get(USER_LAST_NAME);
                  String userName = (String)adminJSON.get(USER_USERNAME);
                  String password = (String)adminJSON.get(USER_PASSWORD);
                  String email = (String)adminJSON.get(USER_EMAIL);
                  int phoneNumber = ((Long)adminJSON.get(USER_PHONE_NUMBER)).intValue();
                  int clearanceLevel = ((Long)adminJSON.get(USER_CLEARANCE_LEVEL)).intValue();
                  int ID = ((Long)adminJSON.get(USER_ID)).intValue();

                  admins.add(new Admin(firstName, lastName, userName, password, email, phoneNumber, clearanceLevel, ID));
              }
            
            return admins;
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<PoliceOfficer> getPoliceOfficers() {
        ArrayList<PoliceOfficer> policeOfficers = new ArrayList<PoliceOfficer>();

        try {
            FileReader reader = new FileReader(POLICE_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray policeOfficersJSON = (JSONArray)new JSONParser().parse(reader);

              for (int i = 0; i < policeOfficersJSON.size(); i++) {
                  JSONObject policeOfficerJSON = (JSONObject)policeOfficersJSON.get(i);
                  String firstName = (String)policeOfficerJSON.get(USER_FIRST_NAME);
                  String lastName = (String)policeOfficerJSON.get(USER_LAST_NAME);
                  String userName = (String)policeOfficerJSON.get(USER_USERNAME);
                  String password = (String)policeOfficerJSON.get(USER_PASSWORD);
                  String email = (String)policeOfficerJSON.get(USER_EMAIL);
                  int phoneNumber = ((Long)policeOfficerJSON.get(USER_PHONE_NUMBER)).intValue();
                  int clearanceLevel = ((Long)policeOfficerJSON.get(USER_CLEARANCE_LEVEL)).intValue();
                  int ID = ((Long)policeOfficerJSON.get(USER_ID)).intValue();
                  String policeDepartment = (String)policeOfficerJSON.get(POLICE_DEPARTMENT);
                  JSONArray myCriminalsJSON = (JSONArray)policeOfficerJSON.get(POLICE_MY_CRIMINALS);
                  ArrayList<Integer> myCriminals = new ArrayList<Integer>();
                  for (int j = 0; j < myCriminalsJSON.size(); j++) {
                      myCriminals.add(((Long)myCriminalsJSON.get(j)).intValue());
                      
                  }
                  JSONArray myCasesJSON = (JSONArray)policeOfficerJSON.get(POLICE_MY_CRIMINALS);
                  ArrayList<Integer> myCases = new ArrayList<Integer>();
                  for (int j = 0; j < myCasesJSON.size(); j++) {
                    myCases.add(((Long)myCasesJSON.get(j)).intValue());
                      
                  }

                  policeOfficers.add(new PoliceOfficer(firstName, lastName, userName, password, email,
                  phoneNumber, clearanceLevel, ID, policeDepartment, myCriminals, myCases));
              }
            
            return policeOfficers;
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Case> getCases() {
        ArrayList<Case> cases = new ArrayList<Case>();
		
		try {
			FileReader reader = new FileReader(CASE_FILE_NAME);
			JSONParser parser = new JSONParser();	
			JSONArray casesJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < casesJSON.size(); i++) {
				JSONObject caseJSON = (JSONObject)casesJSON.get(i);
				int creatorID = ((Long)caseJSON.get(CRIMINAL_CREATOR_ID)).intValue();

                JSONArray witnessesJSON = (JSONArray)caseJSON.get(CASE_WITNESSES);
                ArrayList<Integer> witnesses = new ArrayList<Integer>();
                for(int j = 0; j < witnessesJSON.size(); j++) {
                    witnesses.add(((Long)witnessesJSON.get(j)).intValue());
                }

                JSONArray poiJSON = (JSONArray)caseJSON.get(CASE_PEOPLE_OF_INTEREST);
                ArrayList<Integer> peopleOfInterest = new ArrayList<Integer>();
                for(int j = 0; j < poiJSON.size(); j++) {
                    peopleOfInterest.add(((Long)poiJSON.get(j)).intValue());
                }

                JSONArray suspectsJSON = (JSONArray)caseJSON.get(CASE_SUSPECTS);
                ArrayList<Integer> suspects = new ArrayList<Integer>();
                for(int j = 0; j < suspectsJSON.size(); j++) {
                    suspects.add(((Long)suspectsJSON.get(j)).intValue());
                }

                JSONArray criminalsJSON = (JSONArray)caseJSON.get(CASE_CRIMINALS);
                ArrayList<Integer> criminals = new ArrayList<Integer>();
                for(int j = 0; j < criminalsJSON.size(); j++) {
                    criminals.add(((Long)criminalsJSON.get(j)).intValue());
                }

                JSONArray victimsJSON = (JSONArray)caseJSON.get(CASE_VICTIMS);
                ArrayList<Integer> victims = new ArrayList<Integer>();
                for(int j = 0; j < victimsJSON.size(); j++) {
                    victims.add(((Long)victimsJSON.get(j)).intValue());
                }

                boolean caseOpen = Boolean.parseBoolean((String)caseJSON.get(CASE_OPEN));
                int ID = ((Long)caseJSON.get(CASE_ID)).intValue();

                JSONArray evidenceJSON = (JSONArray)caseJSON.get(CASE_EVIDENCE);
                ArrayList<String> evidence = new ArrayList<String>();
                for (int j = 0; j < evidenceJSON.size(); j++) {
                    evidence.add((String)evidenceJSON.get(j));
                }

                int crimeLevel = ((Long)caseJSON.get(CASE_CRIME_LEVEL)).intValue();

                JSONArray officersJSON = (JSONArray)caseJSON.get(CASE_OFFICERS);
                ArrayList<Integer> officers = new ArrayList<Integer>();
                for(int j = 0; j < officersJSON.size(); j++) {
                    officers.add(((Long)officersJSON.get(i)).intValue());
                }

                int legalClearance = ((Long)caseJSON.get(CASE_LEGAL_CLEARANCE)).intValue();
                String caseType = "";

                cases.add(new Case(creatorID, witnesses, peopleOfInterest, suspects, criminals, victims,
                 caseOpen, ID, evidence, crimeLevel, officers, legalClearance, caseType));
			}
			
			return cases;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
    }
    /*public static void main(String[] args){
        ArrayList<Case> x = DataLoader.getCases();

        for (int i=0; i < x.size(); i++){
            System.out.println(x.get(i).toString());
        }
    }*/
}
