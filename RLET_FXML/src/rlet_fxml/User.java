package rlet_fxml;

import java.io.IOException;

/**
 *
 * @author Joe Fleck
 */
public class User {
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String password;
    
    private final String enteredUsername;
    private final String enteredPassword;
    
    private final UserList userList;
    
    public User(UserList userList,String userFirstName, String userLastName, String userUserName, String userPassword,
            String enteredUsername, String enteredPassword) {
        
        this.userList = userList;
        
        this.firstName = userFirstName;
        this.lastName = userLastName;
        this.username = userUserName;
        this.password = userPassword;
        this.enteredUsername = enteredUsername;
        this.enteredPassword = enteredPassword;
        
        if(authenticator()) {
            try { 
                this.userList.getUserCntl().sendAuthentication();
                
                } catch(IOException io) {
                    System.out.println(io.getMessage());
                }
            
        }
    }
    
    public boolean authenticator() {
        boolean authenticated = false;
        
        if (getEnteredUsername().equals(username) && getEnteredPassword().equals(password)) {
            authenticated = true;
        }
        
        return authenticated;
    }
    
    public String getEnteredUsername() {
        return enteredUsername;
    }
    
    public String getEnteredPassword() {
        return enteredPassword;
    }
}
