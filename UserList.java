package LawEnforcementDatabase;

import java.util.ArrayList;
public class UserList {
    private static UserList userList;
    private static ArrayList<Admin> admins;
    private UserList(){
        admins = new ArrayList<Admin>();
        policeOfficers = new ArrayList<PoliceOfficer>();


    }
    public static UserList getInstance(){
        if(userList == null){
            userList = new UserList();
        }
        return userList;
    }

    public ArrayList<Admin> getAdmins(){
        return admins;
    }
}
