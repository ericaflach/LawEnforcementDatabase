package LawEnforcementDatabase;

import java.util.ArrayList;

public class UserList {
    private UserList userList;
    private ArrayList<User> users;
    private UserList()
    {
        users = new ArrayList<User>();
    }
    public UserList getInstance()
    {
        if(userList == null){
            userList = new UserList();
        }
        return userList;
    }
    public ArrayList<User> getUser(String username)
    {
        return users;
    }
}
