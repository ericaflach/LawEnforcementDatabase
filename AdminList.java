package LawEnforcementDatabase;

/**
     * This method 
     * @return 
     */
import java.util.ArrayList;
/**
     * This method 
     * @return 
     */
public class AdminList {

    private static AdminList adminList;
    private static ArrayList<Admin> admins;
    
    /**
     * This method 
     * @return 
     */
    private AdminList() {
        admins = DataLoader.getAdmins();
    }
    
    /**
     * This method 
     * @return 
     */
    public static AdminList getInstance() {
        if(adminList == null) {
            adminList = new AdminList();
        }
        return adminList;
    }

    /**
     * This method 
     * @return 
     */
    public boolean haveAdmin(String userName) {
        for(Admin admin : admins) {
            if(admin.getUsername().equals(userName)) {
                return true;
            }
        }

        return false;
    }

    /**
     * This method 
     * @return 
     */
    public Admin getAdmin(String userName) {
        for(Admin admin : admins) {
            if(admin.getUsername().equals(userName)) {
                return admin;
            }
        }

        return null;
    }

    /**
     * This method 
     * @return 
     */
    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    /**
     * This method 
     * @return 
     */
    public boolean addAdmin(String firstName, String lastName, String userName, String password, String email, int phoneNumber,
    int clearanceLevel, int ID) {
        if(haveAdmin(userName)) {
            return false;
        }

        admins.add(new Admin(firstName, lastName, userName, password, email, phoneNumber, clearanceLevel, ID));
        return true;
    }

    /**
     * This method 
     * @return 
     */
    public void saveAdmins() {
        DataWriter.saveAdmins();
    }
}
