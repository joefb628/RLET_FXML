package rlet_fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

/**
 *
 * @author Joe Fleck
 */
public class LoginCntl implements Initializable {
    
    @FXML private TextField usernameField;
    @FXML private TextField passwordField;
    private UserCntl userCntl;
    private NavigationCntl navigationCntl;
    private User user;
    private Window loginWindow;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {        
        loginWindow = ((Node)event.getSource()).getScene().getWindow();
        userCntl = new UserCntl(this);       
    }
    
    private void loadWindow(String location, String title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(location));
        Scene scene = new Scene(root);
        Stage stage = new Stage (StageStyle.DECORATED);
        stage.setScene (scene);
        stage.setTitle(title);
        stage.show();
    }
    
    private void closeWindow(String location) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(location));
        loginWindow.hide();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
    public void initNavigation() throws IOException {
        navigationCntl = new NavigationCntl();
        loadWindow("NavigationUI.fxml", "NavigationUI");
        closeWindow("LoginUI.fxml");
    }
    
//    public void setLoginStage(Stage stage) {
//        this.loginStage = stage;
//    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public TextField getPasswordField() {
        return passwordField;
    }
    
    
}