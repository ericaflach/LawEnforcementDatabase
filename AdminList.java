package LawEnforcementDatabase;

import java.util.ArrayList;

public class AdminList {

    private static AdminList adminList;
    private static ArrayList<Admin> admins;
    
    private AdminList() {
        admins = DataLoader.getAdmins();
    }
    
    public static AdminList getInstance() {
        if(adminList == null) {
            adminList = new AdminList();
        }
        return adminList;
    }

    public boolean haveAdmin(String userName) {
        for(Admin admin : admins) {
            if(admin.getUsername().equals(userName)) {
                return true;
            }
        }

        return false;
    }

    public User getAdmin(String userName) {
        for(Admin admin : admins) {
            if(admin.getUsername().equals(userName)) {
                return admin;
            }
        }

        return null;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public boolean addAdmin(String firstName, String lastName, String userName, String password, String email, int phoneNumber,
    int clearanceLevel, int ID) {
        if(haveAdmin(userName)) {
            return false;
        }

        admins.add(new Admin(firstName, lastName, userName, password, email, phoneNumber, clearanceLevel, ID));
        return true;
    }

    public void saveAdminss() {
        DataWriter.saveAdmins();
    }
}
