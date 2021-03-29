/**
 * @author Erica Flach and Chris Nelson
 */
package LawEnforcementDatabase;


import java.util.ArrayList;
public class AdminList {

    private static AdminList adminList;
    private static ArrayList<Admin> admins;
    
    /**
     * This method sets the admins
     */
    private AdminList() {
        admins = DataLoader.getAdmins();
    }
    
    /**
     * This method gets the one instance of admins
     * @return admin list
     */
    public static AdminList getInstance() {
        if(adminList == null) {
            adminList = new AdminList();
        }
        return adminList;
    }

    /**
     * This method checks if admins has an admin
     * @param username
     * @return true or false
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
     * This method finds an admin from it's username
     * @param username
     * @return admin that matches username
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
     * This method gets all admins
     * @return admins
     */
    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    /**
     * This method adds an admin to admins
     * @param firstName
     * @param lastName
     * @param userName
     * @param password
     * @param email
     * @param phoneNumber
     * @param clearanceLevel
     * @param ID
     * @return true or false
     */
    public boolean addAdmin(String firstName, String lastName, String userName, String password, String email, Long phoneNumber,
    int clearanceLevel, int ID) {
        if(haveAdmin(userName)) {
            return false;
        }

        admins.add(new Admin(firstName, lastName, userName, password, email, phoneNumber, clearanceLevel, ID));
        return true;
    }

    /**
     * This method saves the admins to json
     */
    public void saveAdmins() {
        DataWriter.saveAdmins();
    }

    public Admin getAdminFromID(int adminID) {
        for(Admin admin : admins) {
            if(admin.getID()==adminID) {
                return admin;
            }
        }

        return null;
    }
}
