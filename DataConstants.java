package LawEnforcementDatabase;


public abstract class DataConstants {

        protected static final String PERSON_FIRST_NAME = "firstName";
        protected static final String PERSON_LAST_NAME = "lastName";
        protected static final String PERSON_AGE = "age";
        protected static final String PERSON_DATEOFBIRTH = "dateOfBirth";
        protected static final String PERSON_ID = "ID";
        protected static final String PERSON_SEX = "sex";
        
        protected static final String CRIMINAL_FILE_NAME = "LawEnforcementDatabase/Criminal.json";
        protected static final String CRIMINAL_CREATOR_ID = "creatorID";
        protected static final String CRIMINAL_PAST_CRIMES = "pastCrimes";
        protected static final String CRIMINAL_ADDRESS = "address";
        protected static final String CRIMINAL_SHOE_SIZE = "shoeSize";
        protected static final String CRIMINAL_PRIORITY = "priority";
        protected static final String CRIMINAL_ALIVE = "alive";
        protected static final String CRIMINAL_PHYSICAL_ATTRIBUTES = "physicalAttributes";
        protected static final String CRIMINAL_IN_JAIL = "inJail";
        protected static final String CRIMINAL_TATOOS = "tatoos";
        protected static final String CRIMINAL_CREATORID = "tatoos";

        protected static final String PERSON_OF_INTEREST_FILE_NAME = "LawEnforcementDatabase/PersonOfInterest.json";
        protected static final String PERSON_OF_INTEREST_DESCRIPTION = "description";
        protected static final String PERSON_OF_INTEREST_CONTACT = "contact";
        protected static final String PERSON_OF_INTEREST_ID = "personOfInterestID";

        protected static final String SUSPECT_FILE_NAME = "LawEnforcementDatabase/Suspect.json";
        protected static final String SUSPECT_ALIBI = "alibi";

        protected static final String VICTIM_FILE_NAME = "LawEnforcementDatabase/Victim.json";
        protected static final String VICTIM_DESCRIPTION = "description";
        protected static final String VICTIM_CONTACT = "contact";

        protected static final String WITNESS_FILE_NAME = "LawEnforcementDatabase/Witness.json";
        protected static final String WITNESS_DESCRIPTION = "description";
        protected static final String WITNESS_CONTACT = "contact";

        protected static final String USER_FILE_NAME = "LawEnforcementDatabase/User.json";
        protected static final String USER_FIRST_NAME = "firstName";
        protected static final String USER_LAST_NAME = "lastName";
        protected static final String USER_USERNAME = "userName";
        protected static final String USER_PASSWORD = "password";
        protected static final String USER_EMAIL = "email";
        protected static final String USER_PHONE_NUMBER = "phoneNumber";
        protected static final String USER_CLEARANCE_LEVEL = "clearanceLevel";
        protected static final String USER_ID = "ID";

        protected static final String POLICE_FILE_NAME = "LawEnforcementDatabase/PoliceOfficer.json";
        protected static final String POLICE_DEPARTMENT = "policeDepartment";
        protected static final String POLICE_MY_CRIMINALS = "myCriminals";

        protected static final String ADMIN_FILE_NAME = "LawEnforcementDatabase/Admin.json";

        protected static final String CASE_FILE_NAME = "LawEnforcementDatabase/Case.json";
        protected static final String CASE_CREATOR_ID = "creatorID";
        protected static final String CASE_WITNESSES = "witnesses";
        protected static final String CASE_PEOPLE_OF_INTEREST = "peopleOfInterest";
        protected static final String CASE_SUSPECTS = "suspects";
        protected static final String CASE_CRIMINALS = "criminals";
        protected static final String CASE_VICTIMS = "victims";
        protected static final String CASE_OPEN = "caseOpen";
        protected static final String CASE_ID = "ID";
        protected static final String CASE_EVIDENCE = "evidence";
        protected static final String CASE_CRIME_LEVEL = "crimeLevel";
        protected static final String CASE_OFFICERS = "officers";
        protected static final String CASE_LEGAL_CLEARANCE = "legalClearance";
        protected static final String CASE_TYPE = "caseType";
}
