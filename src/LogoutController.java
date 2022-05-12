import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LogoutController implements Initializable {
    @FXML
    private Label tipLabel;

    @FXML
    private Label LabelTF;

    @FXML
    private Button logoutButton;
    @FXML
    void handle(ActionEvent event) {
        try {
            Parent  root = FXMLLoader.load(getClass().getResource("Login.fxml"));
                    
                    Scene scene= new Scene(root);
                    Stage primaryStage=(Stage)logoutButton.getScene().getWindow(); 
                    primaryStage.setScene(scene);
                    primaryStage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      

}
}