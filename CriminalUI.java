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
                    application.createCriminal();
                } else if (option == 2) {
                    application.createCrime();
                } else {
                    reset=true;
                }
            }else if(option == 2) {
                searchMenu();
                int choice = getUserChoice();
                if (choice == 1) {
                    searchCriminal();
                } else if (choice == 2) {
                    application.searchCrime();
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
    public void searchCriminal(){
        System.out.println("-----Search a criminal-----");
        System.out.println();
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
            String sex = scanner.next();
            char entry = sex.atIn
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
        System.out.println(User.printInfo());
    }
    public static void main(String[] args) {
        CriminalUI ui = new CriminalUI();
        ui.run();
    }
}
