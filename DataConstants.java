package LawEnforcementDatabase;

public abstract class DataConstants {

        //protected static final String PEOPLE_FILE_NAME = "src/people.json";
        //protected static final String PEOPLE = "people";
        protected static final String PEOPLE_FIRST_NAME = "firstName";
        protected static final String PEOPLE_LAST_NAME = "lastName";
        protected static final String PEOPLE_AGE = "age";
        protected static final String PEOPLE_DATEOFBIRTH = "dateOfBirth";
        //protected static final String PEOPLE_PHONE_NUMBER = "phoneNumber";
        
        protected static final String CRIMINAL_FILE_NAME = "src/Criminal.json";
        protected static final String CRIMINAL_CREATOR = "creator";
        protected static final String CRIMINAL_PAST_CRIMES = "pastCrimes";
        protected static final String CRIMINAL_ADDRESS = "address";
        protected static final String CRIMINAL_SHOE_SIZE = "shoeSize";
        protected static final String CRIMINAL_PRIORITY = "priority";
        protected static final String CRIMINAL_ALIVE = "alive";
        protected static final String CRIMINAL_PHYSICAL_ATTRIBUTES = "physicalAttributes";
        protected static final String CRIMINAL_IN_JAIL = "inJail";
        protected static final String CRIMINAL_ID = "criminalID";

        protected static final String SUSPECT_FILE_NAME = "src/Suspect.json";
        protected static final String SUSPECT_ALIBI = "alibi";
        protected static final String SUSPECT_ID = "suspectID";

        protected static final String VICTIM_FILE_NAME = "src/Victim.json";
        protected static final String VICTIM_DESCRIPTION = "description";
        protected static final String VICTIM_CONTACT = "contact";
        protected static final String VICTIM_ID = "victimID";

        protected static final String WITNESS_FILE_NAME = "src/Witness.json";
        protected static final String WITNESS_DESCRIPTION = "description";
        protected static final String WITNESS_CONTACT = "contact";
        protected static final String WITNESS_ID = "witnessID";

        protected static final String PERSON_OF_INTEREST_FILE_NAME = "src/PersonOfInterest";
        protected static final String PERSON_OF_INTEREST_DESCRIPTION = "description";
        protected static final String PERSON_OF_INTEREST_CONTACT = "contact";
        protected static final String PERSON_OF_INTEREST_ID = "personOfInterestID";

        protected static final String USER_FILE_NAME = "src/User.json";
        protected static final String USER = "user";
        protected static final String USER_FIRST_NAME = "firstName";
        protected static final String USER_LAST_NAME = "lastName";
        protected static final String USER_USERNAME = "username";
        protected static final String USER_PASSWORD = "password";
        protected static final String USER_EMAIL = "email";
        protected static final String USER_PHONE_NUMBER = "phoneNumber";
        protected static final String USER_CLEARANCE_LEVEL = "clearanceLevel";

        protected static final String CASE_FILE_NAME = "src/Case.json";
        protected static final String CASE_CREATOR = "creator";
        protected static final String CASE_WITNESSES = "witnesses";
        protected static final String CASE_PEOPLE_OF_INTEREST = "peopleOfInterest";
        protected static final String CASE_SUSPECTS = "suspects";
        protected static final String CASE_OPEN = "caseOpen";
        protected static final String CASE_NUMBER = "caseNumber";
        protected static final String CASE_EVIDENCE = "evidence";
        protected static final String CASE_CRIME_LEVEL = "crimeLevel";
        protected static final String CASE_OFFICERS = "officers";
        protected static final String CASE_LEGAL_CLEARANCE = "legalClearance";
        protected static final String CASE_TYPE = "caseType";
    
}
