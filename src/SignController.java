import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignController implements Initializable {
   

    @FXML
    private Button acButton;
    @FXML
    private Label erorrlbl;

    @FXML
    private Label emailLabel;

    @FXML
    private TextField emailTextField;

    @FXML
    private Label passLabel;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private Label phoLabel;

    @FXML
    private TextField phoTextField;

    @FXML
    private Label userLabel;

    @FXML
    private TextField userTextField;
    @FXML
    private Label emptyLabel;
    @FXML
    private Button backButton;

    @FXML
    void initialize(ActionEvent event) {
        try {
            Parent  root = FXMLLoader.load(getClass().getResource("Login.fxml"));
                    
                    Scene scene= new Scene(root);
                    Stage primaryStage=(Stage)backButton.getScene().getWindow(); 
                    primaryStage.setScene(scene);
                    primaryStage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @FXML
    void account(ActionEvent event) {
        if (userTextField.getText().isBlank()==false && passwordTextField.getText().isBlank()==false  
        && emailTextField.getText().isBlank()==false  && phoTextField.getText().isBlank()==false
        ) {
            store();
            emptyLabel.setText("Account created sucessfuly");

     } else {
        erorrlbl.setText("Please Fill all Requirements!!");
      }
    }

    public void store(){
        Connect c = new  Connect();
        Connection con = c.getconnection();

    String sql = ("insert into Logins(userName,email,password,phoneNumber) values(?,?,?,?)");
    try {
        PreparedStatement st = con.prepareStatement(sql);

        st.setString(1, userTextField.getText());
        st.setString(2, emailTextField.getText());
        st.setString(3, passwordTextField.getText());
        st.setString(4, phoTextField.getText());
   
    
        st.executeUpdate();
 
     
   
        } catch (Exception e) {
     System.out.println(e);
    }

}

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
  
    

        
    }

}
