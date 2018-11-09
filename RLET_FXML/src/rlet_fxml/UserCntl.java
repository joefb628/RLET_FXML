package rlet_fxml;

import java.io.IOException;

/**
 *
 * @author Joe Fleck
 */
public class UserCntl {
    
    UserList userList;
    LoginCntl loginCntl;
    
    public UserCntl(LoginCntl loginCntl) {
        this.loginCntl = loginCntl;
        
        userList = new UserList(this, loginCntl.getUsernameField().getText(), 
                loginCntl.getPasswordField().getText());
    }
    
    public UserList getUserList() {
        return userList;
    }
    
    public void sendAuthentication() throws IOException {
        loginCntl.initNavigation();
    }
       
}
