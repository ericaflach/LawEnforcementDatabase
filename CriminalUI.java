package LawEnforcementDatabase;
import java.util.Scanner;
public class CriminalUI {

    private Scanner scanner;
    private CriminalApplication application;
    public CriminalUI(){
        scanner = new Scanner(System.in);
        application = new CriminalApplication();
    }
    public void run(){
        System.out.println("-----Welcome to the Criminal Database-----");
        System.out.println();
        System.out.println("Please log in");
        System.out.println();
        loginMenu();
        int option = displayMainMenu();
        if(option == 1) {
            addMenu();
        }else if(option == 2) {
            searchMenu();
        } else if (option == 3) {
            accountMenu();
        } else {
            System.out.println("Incorrect Option. Goodbye!");
            System.exit(0);
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

    public int displayMainMenu(){
        System.out.println("-----Main Menu-----");
        System.out.println();
        System.out.println("(1) Add a criminal or crime");
        System.out.println("(2) Search a criminal or crime");
        System.out.println("(3) Account");
        System.out.println("What would you like to do? (1-3)");
        int option = scanner.nextInt();
        return option;
    }
//ask chris about int vs void
    public int searchMenu(){
        System.out.println("-----Search Menu-----");
        System.out.println();
        System.out.println("(1) Search a criminal");
        System.out.println("(2) Search a crime");
        System.out.println("What would you like to search? (1-2)");
        int choice = scanner.nextInt();
        return choice;
    }

    public int addMenu(){
        System.out.println("-----Add Menu-----");
        System.out.println();
        System.out.println("(1) Add a criminal");
        System.out.println("(2) Add a crime");
        System.out.println("What would you like to search? (1-2)");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Enter the criminal's name");
            
        } else if (choice == 2) {
            System.out.println("Choose the case type");
        }
        return choice;
    }
    public void accountMenu(){
        System.out.println("-----Account Info-----");
        System.out.println();
        System.out.println(toString());
    }
    public static void main(String[] args) {
        CriminalUI ui = new CriminalUI();
        ui.run();
    }
}
