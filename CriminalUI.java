/**
* @author Ben Friend
* User interface for the criminal database
*/
package LawEnforcementDatabase;
import java.util.Scanner;
import java.util.ArrayList;

public class CriminalUI {

    private Scanner scanner;
    private boolean reset=true;
    private CriminalApplication application;
    private User user;
    private Case crime;

    /**
     * Creates a new instance of the application
     */
    public CriminalUI(){       
        scanner = new Scanner(System.in);
        application = new CriminalApplication();
    }

    /**
     * Starts the system and calls all of the other methods
     */
    public void run(){
        System.out.println("\n-----Welcome to the Criminal Database-----");
        System.out.println();
        System.out.println("Please log in");
        System.out.println();
        loginMenu();
        while (reset){
            reset = false;
            displayMainMenu();
            int option = getUserChoice();
            if(option == 1) {
                addMenu();
                int choice = getUserChoice();
                if (choice == 1){
                    addCriminal();
                } else if (choice == 2) {
                    addCrime();
                } else {
                    reset = true;
                }
            } else if (option == 2) {
                searchMenu();
                int choice = getUserChoice();
                if (choice == 1) {
                    searchCriminal();
                } else if (choice == 2) {
                    searchCrime();
                } else {
                    reset = true;
                }
            } else if (option == 3) {
                accountMenu();
            } else if (option == 4) {
                editMenu();
            } else if (option == 9){
                application.logout();
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid Option.");
                reset = true; 
            }
        }

    }

    /**
     * Adds a new crime to the database
     */
    public void addCrime(){
        System.out.println("\n-----Add a crime-----");
        System.out.println("Please enter as much of the following as possible, if you do not know, press enter to leave that field blank.");
        System.out.println("Crime: ");
        String caseType = scanner.nextLine();
        System.out.println("Enter the witnesses IDs");
        ArrayList<Integer> witnesses = new ArrayList<Integer>();
        int witnessID = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Witness ID " + (i+1) + ": ");
            witnessID = scanner.nextInt();
            witnesses.add(witnessID);

            witnessID = 0; 
        }
        ArrayList<Integer> peopleOfInterest = new ArrayList<Integer>();
        System.out.println("Enter the people of interest IDs");
        for (int i = 0; i < 3; i++) {
            System.out.println("Person of interest ID " + (i+1) + ": ");
            int poiID = scanner.nextInt();
            peopleOfInterest.add(poiID);
            
            poiID = 0; 
        }
        ArrayList<Integer> suspects = new ArrayList<Integer>();
        System.out.println("Enter the suspects IDs");
        int suspectID = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Suspect ID " + (i+1) + ": ");
            suspectID = scanner.nextInt();
            suspects.add(suspectID);

            suspectID = 0; 
        }
        ArrayList<Integer> victims = new ArrayList<Integer>();
        System.out.println("Enter the victims IDs");
        int victimID = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Victim ID " + (i+1) + ": ");
            victimID = scanner.nextInt();
            victims.add(victimID);
            
            victimID = 0; 
        }
        ArrayList<Integer> criminals = new ArrayList<Integer>();
        int criminalID = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Witness ID " + (i+1) + ": ");
            criminalID = scanner.nextInt();
            criminals.add(criminalID);

            criminalID = 0; 
        }
        ArrayList<Integer> officers = new ArrayList<Integer>();
        System.out.println("Enter officers IDs");
        for (int i = 0; i < 3; i++) {
            System.out.println("Officer ID " + (i+1) + ": ");
            int offID = scanner.nextInt();
            officers.add(offID);
            
            offID = 0; 
        }
        System.out.println("Case Open: (true/false");
        boolean caseOpen = scanner.nextBoolean();
        System.out.println("Case ID: ");
        int ID = scanner.nextInt();
        System.out.println("Crime level: (1-3, 1 being the worst i.e. murder)");
        int crimeLevel = scanner.nextInt();
        System.out.println("Legal clearance: (1-3)");
        int legalClearance = scanner.nextInt();
        ArrayList<String> evidence = new ArrayList<String>();
        System.out.println("Enter the evidence");
        for (int i = 0; i < 3; i++) {
            System.out.println("Evidence " + (i+1) + ": ");
            String exhibit = scanner.nextLine();
            evidence.add(exhibit);
        }
        int creatorID = user.getID();
        application.createCase(creatorID, witnesses, peopleOfInterest, suspects, criminals, victims, caseOpen, ID, evidence, crimeLevel, officers, legalClearance, caseType);
        System.out.println("New crime successfully added.");
        reset = true;
    }

    /**
     * Displays the menu for editing contents of the database
     */
    public void editMenu(){
        System.out.println("\n-----Edit-----");
        System.out.println("Only an admin. can edit a user, anyone can edit a criminal.");
        System.out.println("Would you like to edit a criminal or crime?");
        System.out.println("(1) Criminal" + "\n(2) Crime");
        int choice = scanner.nextInt();
        if(choice == 1 && user.getClearanceLevel() >=2) {
            System.out.println("First enter the criminal ID");
            int criminalID = scanner.nextInt();
            System.out.println("What would you like to edit on the criminal?\n(1) Name\n(2) Age\n(3) Past Crimes\n(4) Address\n(5) Physical Attributes\n(6) Tattoos\n(7) In Jail");
            scanner.next();
            choice = scanner.nextInt();
            if(choice == 1) {
                String firstName = scanner.nextLine();
                String lastName = scanner.nextLine();
                application.editCriminalName(firstName, lastName, criminalID);
            } else if (choice == 2) {
                int age = scanner.nextInt();
                application.editCriminalAge(age, criminalID);
            } else if (choice == 3) {
                int caseID = scanner.nextInt();
                application.editCriminalPastCrimes(caseID, criminalID);
            } else if (choice == 4) {
                String address = scanner.nextLine();
                application.editCriminalAddress(address, criminalID);
            } else if (choice == 5) {
                String attribute = scanner.nextLine();
                application.editCriminalPhysicalAttributes(attribute, criminalID);
            } else if (choice == 6) {
                String tattoo = scanner.nextLine();
                application.editCriminalTattoos(tattoo, criminalID);
            } else if (choice == 7) {
                int entry = scanner.nextInt();
                boolean inJail = false;
                if (entry == 1) {
                    inJail = true;
                }
                application.editCriminalInJail(inJail, criminalID);
            } else {
                System.out.println("Invalid choice.");
            }
        } else if (choice == 2) {
            System.out.println("First enter the officerID");
            int officerID = scanner.nextInt();
            System.out.println("What would you like to edit on the user?");
            System.out.println("\n(1) Name" + "\n(2) E-mail" + "(3) Phone number" + "(4) Clearance Level" + "(5) Police Department");
            choice = scanner.nextInt();
            if (choice == 1) {
                String firstName = scanner.nextLine();
                String lastName = scanner.nextLine();
                application.editUserName(firstName, lastName, officerID);
            } else if (choice == 2) {
                String email = scanner.nextLine();
                application.editUserEmail(email, officerID);
            } else if (choice == 3) {
                int number = scanner.nextInt();
                application.editUserPhoneNumber(number, officerID);
            } else if (choice == 4) {
                int level = scanner.nextInt();
                application.editUserClearanceLevel(level, officerID);
            } else if (choice == 5) {
                String department = scanner.nextLine();
                application.editUserDepartment(department, officerID);
            } else {
                System.out.println("Invalid option.");
            }
        } else {
            System.out.println("Invalid choice");
        }
        
    }

    /**
     * Search for a specific crime
     */
    public void searchCrime(){
        System.out.println("\n-----Search a crime-----");
        System.out.println("You can lookup a specific case by its ID number, or enter 0 to go back to the menu, where you can search for criminals by their past crimes.");
        System.out.println("Case ID number: ");
        int ID = scanner.nextInt();
        if (ID == 0) {
            reset=true;
        } else {
            crime = application.searchCaseID(ID);
            System.out.println("Here is your case: ");
            System.out.println(crime.toString());
            System.out.println("Enter \"print\" to print to a text file, or type \"exit\" to return to the main menu");
            scanner.next();
            String enter = scanner.nextLine();
            if (enter.equals("print")){
                System.out.println(crime.toString());
            }
            reset = true;
        }   
    }

    /**
     * adds a new criminal to the database
     */
    public void addCriminal(){
        System.out.println("\n-----Add a criminal-----");
        System.out.println("Please enter as much of the following as possible, if you do not know, press enter to leave that field blank.");
        System.out.println("First name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("DOB (mm/dd/yyy): ");
        scanner.next();
        String DOB = scanner.nextLine();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        ArrayList<Integer> pastCrimes=new ArrayList<Integer>();
        System.out.println("Shoe size: ");
        double shoeSize = scanner.nextDouble();
        System.out.println("Priority: ");
        int priority = scanner.nextInt();
        System.out.println("Alive (true/false): ");
        boolean alive = scanner.nextBoolean();
        System.out.println("In jail (true/false): ");
        boolean inJail = scanner.nextBoolean();
        System.out.println("ID: ");
        int ID = scanner.nextInt();
        System.out.println("Sex (m/f): ");
        scanner.next();
        String entry = scanner.nextLine();
        char sex = ' ';
        if (entry.equalsIgnoreCase("m")) {
            sex = 'm';
        } else if (entry.equalsIgnoreCase("f")) {
            sex = 'f';
        }
        ArrayList<String> physicalAttributes=new ArrayList<String>();
        System.out.println("Enter up to 10 physical attributes. Type \"exit\" when done entering attributes");
        for (int i=0; i<10; i++) {
            System.out.println("Physical attribute "+(i + 1)+": ");
            String attribute = scanner.nextLine();
            if (attribute.equals("exit")) {
                break;
            } else {
                physicalAttributes.add(attribute);
            }
        }
        ArrayList<String> tattoos=new ArrayList<String>();
        System.out.println("Enter up to 10 tattoos. Type \"exit\" when done entering tattoos");
        for (int i=0; i<10; i++) {
            System.out.println("Tattoo "+(i + 1)+": ");
            String tat = scanner.nextLine();
            if (tat.equals("exit")) {
                break;
            } else {
                tattoos.add(tat);
            }
        }
        System.out.println("New criminal "+name+" "+lastName+" added successfully.");
        application.createCriminal(name, lastName, age, DOB, ID, sex, application.getUser().getID(), pastCrimes, address, shoeSize, priority, alive, physicalAttributes, inJail, tattoos);
        reset = true;
    }

    /**
     * Search a criminal in the database
     */
    public void searchCriminal(){
        System.out.println("\n-----Search a criminal-----");
        System.out.println();
        boolean refine = true;
        while (refine){
            refine = false;
            System.out.println("You can search by:");
            System.out.println("(1) Name");
            System.out.println("(2) Age range");
            System.out.println("(3) Crimes committed");
            System.out.println("(4) Location");
            System.out.println("(5) Sex");
            System.out.println("(6) Physical attribute");
            System.out.println("How would you like to search? (1-6)");
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("Search by name");
                System.out.println("First name: ");
                scanner.next();
                String firstName = scanner.nextLine();
                System.out.println("Last name: ");
                String lastName = scanner.nextLine();
                application.searchByName(firstName, lastName);
            } else if (choice == 2) {
                System.out.println("Search by age range");
                System.out.println("Lower age bound: ");
                int lowerAge = scanner.nextInt();
                System.out.println("Upper age bound: ");
                int upperAge = scanner.nextInt();
                application.searchByAge(lowerAge, upperAge);
            } else if (choice == 3) {
                System.out.println("Search by crimes committed");
                System.out.println("You may enter up to three crimes, type \"exit\" to stop");
                ArrayList<String> searchedCrimes=new ArrayList<String>();
                scanner.nextLine();
                for (int i=0; i<4; i++) {
                    System.out.println("Enter crime "+(i + 1)+": ");
                    String crime = scanner.nextLine();
                    if (crime.equals("exit")) {
                        break;
                    } else {
                        searchedCrimes.add(crime);
                    }
                }
                application.searchByCrimesCommitted(searchedCrimes);
            } else if (choice == 4) {
                System.out.println("Search by location");
                System.out.println("City: ");
                String city = scanner.nextLine();
                System.out.println("State: ");
                String state = scanner.nextLine();
                application.searchByLocation(city, state);
            } else if (choice == 5) {
                    System.out.println("Search by sex");
                    System.out.println("Sex: ");
                    scanner.next();
                    String entry = scanner.nextLine();
                    char sex = ' ';
                    if (entry.equalsIgnoreCase("m")) {
                        sex = 'm';
                    } else if (entry.equalsIgnoreCase("f")) {
                        sex = 'f';
                    }
                    application.searchBySex(sex);
            } else if (choice == 6) {
                System.out.println("Search by physical attributes");
                ArrayList<String> physicalAttributes=new ArrayList<String>();
                System.out.println("Enter up to 10 physical attributes. Type \"exit\" when done entering attributes");
                for (int i=0; i<10; i++) {
                    System.out.println("Physical attribute "+(i + 1)+": ");
                    String attribute = scanner.nextLine();
                    if (attribute.equals("exit")) {
                        break;
                    } else {
                        physicalAttributes.add(attribute);
                    }
                }
                application.searchByAttributes(physicalAttributes);
            }
            System.out.println("Here are your results: ");
            System.out.println(application.refinedListToString());
            System.out.println("Enter \"refine\" to add another search parameter, enter \"reset\" to start a new search, or enter \"exit\" to go back to the main menu");
            String entry = scanner.nextLine();
            if (entry.equalsIgnoreCase("reset")) {
            refine = true;
            application.resetRefinedList();
            } else if (entry.equalsIgnoreCase("refine")) {
            refine = true;
            } else {
            reset = true;
            }
         }
     }
    

    /**
     * Displays the menu for looging into the system
     */
    public void loginMenu(){
        boolean login = false;
        String username = null;
        String password = null;
        int attempts = 0;
        while(!login){
            System.out.print("Username: ");
            username = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();
            if (application.login(username, password))
            {
                System.out.println("Login successful.");
                login = true;
                user = application.getUser();
            }
            if (!login) {
                System.out.println("Login unsuccessful. Please try again");
            }
            if (attempts == 2) {
                System.out.println("Too many unsuccessful attempts. Goodbye!");
                System.exit(0);
            }
        }
    }

    /**
     * Takes in the users input and returns it
     */
    public int getUserChoice(){
        int option = scanner.nextInt();
        return option;
    }

    /**
     * Displays the main menu to the user
     */
    public void displayMainMenu(){
        System.out.println("\n-----Main Menu-----");
        System.out.println();
        System.out.println("(1) Add a criminal or crime");
        System.out.println("(2) Search a criminal or crime");
        System.out.println("(3) Account");
        System.out.println("(4) Edit criminal or edit crime");
        System.err.println("(9) To exit the program");
        System.out.println("What would you like to do? (1-4, 9)");
    }

    /**
     * Displays the menu for searching the database
     */
    public void searchMenu(){
        System.out.println("\n-----Search Menu-----");
        System.out.println();
        System.out.println("(1) Search a criminal");
        System.out.println("(2) Search a crime");
        System.out.println("What would you like to search? (1-2)");
    }

    /**
     * Displays the menu for adding things to the database
     */
    public void addMenu(){
        System.out.println("\n-----Add Menu-----");
        System.out.println();
        System.out.println("(1) Add a criminal");
        System.out.println("(2) Add a crime");
        System.out.println("What would you like to add? (1-2)");
    }

    /**
     * Displays the account information of the user
     */
    public void accountMenu(){
        System.out.println("\n-----Account Info-----");
        System.out.println();
        System.out.println(user.toString());
        reset = true;
    }

    /**
     * The main driver
     */
    public static void main(String[] args) {
        CriminalUI ui = new CriminalUI();
        ui.run();
    }
}
