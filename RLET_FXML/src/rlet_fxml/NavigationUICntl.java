package rlet_fxml;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Joe Fleck
 */
public class NavigationUICntl extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("NavigationUI.fxml"));
        
        Scene scene = new Scene(root);
   
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void taskButtonAction() throws IOException{
        System.out.println("task button");
        loadWindow("TaskUI.fxml", "TaskUI");
        TaskCntl taskCntl = new TaskCntl(this);
    }
    
    @FXML
    public void ridesharingButtonAction() {
        System.out.println("rideButton");
    }
    
    @FXML
    public void expenseButtonAction() {
        System.out.println("expense button");
    }
    
    @FXML
    public void reminderButtonAction() {
        System.out.println("reminder button");
    }
    
    private void loadWindow(String location, String title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(location));
        Scene scene = new Scene(root);
        Stage stage = new Stage (StageStyle.DECORATED);
        stage.setScene (scene);
        stage.setTitle(title);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        launch(args);
//    }
}
