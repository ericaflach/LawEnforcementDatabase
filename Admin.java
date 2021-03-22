package LawEnforcementDatabase;

public class Admin extends User{

    private int adminID;

    public Admin(String firstName, String lastName, String username, String password, String email, int phoneNumber,
            int clearanceLevel, int adminID) {
        super(firstName, lastName, username, password, email, phoneNumber, clearanceLevel);

        this.adminID=adminID;
    }

    public void setAdminID(int adminID){
        this.adminID=adminID;
    }

    public int setAdminID(){
        return adminID;
    }

}
