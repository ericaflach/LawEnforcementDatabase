package LawEnforcementDatabase;

public class Admin extends User{

    public Admin(String firstName, String lastName, String username, String password, String email, int phoneNumber,
            int clearanceLevel, int ID) {
        super(firstName, lastName, username, password, email, phoneNumber, clearanceLevel, ID);
    }

    public String toString() {
        return super.toString();
    }

}
