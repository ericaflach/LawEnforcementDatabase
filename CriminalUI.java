package LawEnforcementDatabase;
import java.util.Scanner;
import java.util.ArrayList;

public class CriminalUI {

    private Scanner scanner;
    private boolean reset=true;
    private CriminalApplication application;
    public CriminalUI(){        scanner = new Scanner(System.in);
        application = new CriminalApplication();
    }
    public void run(){
        System.out.println("-----Welcome to the Criminal Database-----");
        System.out.println();
        System.out.println("Please log in");
        System.out.println();
        loginMenu();
        while (reset){
            reset=false;
            displayMainMenu();
            int option = getUserChoice();
            if(option == 1) {
                addMenu();
                int choice = getUserChoice();
                if (choice == 1){
                    addCriminal();
                } else if (option == 2) {
                    addCrime();
                } else {
                    reset=true;
                }
            }else if(option == 2) {
                searchMenu();
                int choice = getUserChoice();
                if (choice == 1) {
                    searchCriminal();
                } else if (choice == 2) {
                    searchCrime();
                } else {
                    reset=true;
                }
            } else if (option == 3) {
                accountMenu();
            } else {
                System.out.println("Incorrect Option");
                reset=true;
            }
        }

    }
    public void addCrime(){
        System.out.println("-----Add a crime-----");
        System.out.println("Please enter as much of the following as possible, if you do not know, press enter to leave that field blank.");
        System.out.println("First name: ");
        String firstName = scanner.next();
        System.out.println("Last name: ");
        String lastName = scanner.next();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("DOB (mm/dd/yyy): ");
        String DOB = scanner.next();
        System.out.println("Address: ");
        String address = scanner.next();
        ArrayList<String> pastCrimes=new ArrayList<String>();
        System.out.println("Enter crime committed: ");
        String crime = scanner.next();
        pastCrimes.add(crime);
        System.out.println("Creator (your name): ");
        String creator = scanner.next();
        System.out.println("Shoe size: ");
        double shoeSize = scanner.nextDouble();
        System.out.println("Priority: ");
        int priority = scanner.nextInt();
        System.out.println("Alive (true/false): ");
        boolean alive = scanner.nextBoolean();
        ArrayList<String> physicalAttributes=new ArrayList<String>();
        for (int i=0; i<10; i++) {
            System.out.println("Physical attribute "+i+": ");
            String attribute = scanner.next();
            if (attribute == null) {
                break;
            } else {
                physicalAttributes.add(attribute);
            }
        }
        System.out.println("In jail (true/false): ");
        boolean inJail = scanner.nextBoolean();
        System.out.println("ID: ");
        int ID = scanner.nextInt();
        System.out.println("Sex (m/f): ");
        String entry = scanner.next();
        char sex = entry.charAt(0);
        ArrayList<String> tattoos=new ArrayList<String>();
        for (int i=0; i<10; i++) {
            System.out.println("Tattoo "+i+": ");
            String tat = scanner.next();
            if (tat == null) {
                break;
            } else {
                tattoos.add(tat);
            }
        }
        application.createCriminal(firstName, lastName, age, DOB, creator, pastCrimes, address, shoeSize, priority, alive, physicalAttributes, inJail, ID, sex, tattoos);
        System.out.println(crime+" has been entered for "+firstName+" "+lastName);
        reset=true;
    }
    public void searchCrime(){
        System.out.println("-----Search a crime-----");
        System.out.println("You can lookup a specific case by its ID number, or press enter to go back to the menu, where you can search for criminals by their past crimes.");
        System.out.println("Case ID number: ");
        int ID = scanner.nextInt();
        if (ID == 0) {
            reset=true;
        } else {
            application.searchCaseID(ID);
            System.out.println("Here is your case: ");
            System.out.println(Case.toString());
            System.out.println("Press enter to return to the main menu");
            String enter = scanner.next();
            reset=true;
        }
        
    }
    public void addCriminal(){
        System.out.println("-----Add a criminal-----");
        System.out.println("Please enter as much of the following as possible, if you do not know, press enter to leave that field blank.");
        System.out.println("First name: ");
        String firstName = scanner.next();
        System.out.println("Last name: ");
        String lastName = scanner.next();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("DOB (mm/dd/yyy): ");
        String DOB = scanner.next();
        System.out.println("Address: ");
        String address = scanner.next();
        ArrayList<String> pastCrimes=new ArrayList<String>();
                for (int i=0; i<10; i++) {
                    System.out.println("Enter crime "+i+": ");
                    String crime = scanner.next();
                    if (crime == null) {
                        break;
                    } else {
                        pastCrimes.add(crime);
                    }
                    
                }
        System.out.println("Creator (your name): ");
        String creator = scanner.next();
        System.out.println("Shoe size: ");
        double shoeSize = scanner.nextDouble();
        System.out.println("Priority: ");
        int priority = scanner.nextInt();
        System.out.println("Alive (true/false): ");
        boolean alive = scanner.nextBoolean();
        ArrayList<String> physicalAttributes=new ArrayList<String>();
        for (int i=0; i<10; i++) {
            System.out.println("Physical attribute "+i+": ");
            String attribute = scanner.next();
            if (attribute == null) {
                break;
            } else {
                physicalAttributes.add(attribute);
            }
        }
        System.out.println("In jail (true/false): ");
        boolean inJail = scanner.nextBoolean();
        System.out.println("ID: ");
        int ID = scanner.nextInt();
        System.out.println("Sex (m/f): ");
        String entry = scanner.next();
        char sex = entry.charAt(0);
        ArrayList<String> tattoos=new ArrayList<String>();
        for (int i=0; i<10; i++) {
            System.out.println("Tattoo "+i+": ");
            String tat = scanner.next();
            if (tat == null) {
                break;
            } else {
                tattoos.add(tat);
            }
        }
        application.createCriminal(firstName, lastName, age, DOB, creator, pastCrimes, address, shoeSize, priority, alive, physicalAttributes, inJail, ID, sex, tattoos);
        System.out.println(firstName+" "+lastName+" has been entered into the database, you will now be taken back to the main menu.");
        reset = true;
    }
    public void searchCriminal(){
        System.out.println("-----Search a criminal-----");
        System.out.println();
        boolean refine = true;
        while (refine){
            System.out.println("You can search by:");
            System.out.println("(1) Name");
            System.out.println("(2) Age range");
            System.out.println("(3) Crimes committed");
            System.out.println("(4) Location");
            System.out.println("(5) sex");
            System.out.println("How would you like to search? (1-5)");
            int choice=scanner.nextInt();
            if (choice == 1){
                System.out.println("Search by name");
                System.out.println("First name: ");
                String firstName=scanner.next();
                System.out.println("Last name: ");
                String lastName=scanner.next();
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
                System.out.println("You may enter up to three crimes, press enter to skip.");
                ArrayList<String> searchedCrimes=new ArrayList<String>();
                for (int i=0; i<4; i++) {
                    System.out.println("Enter crime "+i+": ");
                    String crime = scanner.next();
                    if (crime == null) {
                        break;
                    } else {
                        searchedCrimes.add(crime);
                    }
                    
                }
                application.searchByCrimesCommitted(searchedCrimes);
            } else if (choice == 4) {
                System.out.println("Search by location");
                System.out.println("City: ");
                String city = scanner.next();
                System.out.println("State: ");
                String state = scanner.next();
                application.searchByLocation(city, state);
            } else if (choice == 5) {
                    System.out.println("Search by sex");
                    System.out.println("Sex: ");
                    String entry = scanner.next();
                    char sex = entry.charAt(0);
                    application.searchBySex(sex);
            }
            System.out.println("Here are your results: ");
            System.out.println(refinedList);
            System.out.println("Enter in a criminals name to view his or her profile, enter \"refine\" to add another search parameter, or enter \"reset\" to start a new search.");
            String entry = scanner.next();
            if (entry.equalsIgnoreCase("reset")) {
                refine = true;
                application.resetRefinedList();
            } else if (entry.equalsIgnoreCase("refine")) {
                refine = true;
            } else {
                for (int i=0; i<refinedList.size(); i++) {
                    if (entry.equalsIgnoreCase(refinedList.get(i))){
                        System.out.println(Criminal.toString());
                        refine = false;
                        System.out.println("When you are finished, press enter to go back to the main menu");
                        String enter = scanner.next();
                        reset = true;
                    } else {
                        System.out.println("Invalid entry, you will be taken back to the main menu.");
                        refine = false;
                        reset = true;
                    }
                }
            }
        }

    }

    public void loginMenu(){
        boolean login = false;
        String username = null;
        String password = null;
        int attempts = 0;
        while(!login){
            System.out.print("Username: ");
            username=scanner.nextLine();
            System.out.print("Password: ");
            password=scanner.nextLine();
            if (application.login(username, password))
            {
                System.out.println("Login successful.");
                login = true;
            }
            if (!login) {
                System.out.println("Login unsuccessful. Please try again");
            }
            if (attempts == 2) {
                System.out.println("Too many unsuccessful attempts. Goodbye!");
                
            }
        }
        

    }
    public int getUserChoice(){
        int option = scanner.nextInt();
        return option;
    }

    public void displayMainMenu(){
        System.out.println("-----Main Menu-----");
        System.out.println();
        System.out.println("(1) Add a criminal or crime");
        System.out.println("(2) Search a criminal or crime");
        System.out.println("(3) Account");
        System.out.println("What would you like to do? (1-3)");
    }

    public void searchMenu(){
        System.out.println("-----Search Menu-----");
        System.out.println();
        System.out.println("(1) Search a criminal");
        System.out.println("(2) Search a crime");
        System.out.println("What would you like to search? (1-2)");
    }

    public void addMenu(){
        System.out.println("-----Add Menu-----");
        System.out.println();
        System.out.println("(1) Add a criminal");
        System.out.println("(2) Add a crime");
        System.out.println("What would you like to search? (1-2)");
    }
    public void accountMenu(){
        System.out.println("-----Account Info-----");
        System.out.println();
        System.out.print(User.toString());
    }
    public static void main(String[] args) {
        CriminalUI ui = new CriminalUI();
        ui.run();
    }
}
