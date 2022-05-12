import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginController implements Initializable{

    @FXML
    private Button buttonText;
    @FXML
    private Label labelId;

    @FXML
    private Button buttonTextField;

    @FXML
    private PasswordField passTextField;

    @FXML
    private TextField textFielduser;
    @FXML
    private GridPane gridPane;
    @FXML
    void root(ActionEvent event) {
        try {
            Parent  root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
            // gridPane.getChildren().setAll(root);
            Scene scene= new Scene(root);
            Stage primaryStage=(Stage)buttonText.getScene().getWindow(); 
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }}

        @FXML
        void pane(ActionEvent event){
            if (textFielduser.getText().isBlank()==false && passTextField.getText().isBlank()==false) {
                validator();
         } else {
           labelId.setText("Please Enter username and password!");
          }
        }
        
         

   
    public void validator(){
        Connect c = new  Connect();
        Connection con = c.getconnection();

        String verify = ("select count(1) From Logins where userName ='"+textFielduser.getText()+"' and password = '"+passTextField.getText() +"'");
           
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(verify);
            while (rs.next())
            if(rs.getInt(1)==1) {
               
                Parent root = FXMLLoader.load(getClass().getResource("Logout.fxml"));
                Stage stage = (Stage)buttonTextField.getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
               
            }
            else{
                labelId.setText("Invalid attempt! please try again!!");
            }
        } catch (Exception e) {
            
        }
    }  

      
    
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      

        

    }
    }
    
    


