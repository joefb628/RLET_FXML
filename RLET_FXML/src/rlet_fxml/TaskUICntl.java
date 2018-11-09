package rlet_fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 *
 * @author Joe Fleck
 */
public class TaskUICntl extends Application {    
    
    public TableView taskTable;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TaskUI.fxml"));
        System.out.println("asdf");
        Scene scene = new Scene(root);
        stage.setTitle("Task Log");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void done() {
        System.out.println("back");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
}
