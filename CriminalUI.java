package LawEnforcementDatabase;
import java.util.Scanner;
public class CriminalUI {

    private Scanner scanner;
    private CriminalApplication application;

    public void run(){
        System.out.println("-----Welcome to the Criminal Database-----");
        System.out.println();
        System.out.println("Please log in");
        System.out.println();
        loginMenu();
    }

    public void loginMenu(){
        Scanner scanner=new Scanner(System.in);
        boolean login=false;
        while(login==false){
            System.out.print("Username: ");
            username=scanner.nextLine();
            System.out.print("Password: ");
            password=scanner.nextLine();
            if(username.equals(getUsername())&&password.equals(getPassword())){
                System.out.println("Hello, "+username);
                login=true;
             }
            else{
                System.out.println("Incorrect username or password, please try again");
            }
        }
    }

    public void displayMainMenu(){
        System.out.println("-----Main Menu-----");
        System.out.println();
        System.out.println("(1) Add a criminal");
        System.out.println("(2) Add a crime");
        System.out.println("(3) Search a criminal");
        System.out.println("(4) Search a crime");
        System.out.println("(5) Account");
        System.out.println("What would you like to do? (1-5)");
    }

    public void searchMenu(){

    }

    public void editMenu(){
        
    }
}
