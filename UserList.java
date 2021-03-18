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
<<<<<<< HEAD
    public ArrayList<User> getUser(String username)
=======
    public User getUsers()
>>>>>>> 442e7e95e9eb516fe2cbb3fb23a39375587bfd10
    {
        return users;
    }
}
