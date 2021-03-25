package LawEnforcementDatabase;

import java.util.ArrayList;

public class AdminList {
    private static AdminList adminList;
    private static ArrayList<Admin> admins;
    
    private AdminList () {
        admins = new ArrayList<Admin>();
    }
    
    public static AdminList getInstance() {
        if(adminList == null) {
            adminList = new AdminList();
        }
        return adminList;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }
}
