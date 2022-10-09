package models;
/**
 *
 * @author fricardo
 */
public class AccountService {
    
    public AccountService(){
    
    }
    
    public User login(String username, String password) {
        final String USER1 = "abe";
        final String USER2 = "barb";
        final String PASSWORD = "password";
        
        if((username.equals(USER1) || username.equals(USER2)) && password.equals(PASSWORD)){
            User user = new User(username, null);
            return user;
        } else {
            return null;
        }
    }
}
