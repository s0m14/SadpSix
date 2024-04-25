package facade;

public class UserManagementSystem {

    public boolean isUser(String login,String password){
        return login.equals("ars") && password.equals("123");
    }
}
