import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application{
    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root=FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene= new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login and SignUp Form");
        //primaryStage.initStyle(StageStyle.UNDECORATED);
    primaryStage.setResizable(false);

        primaryStage.show();
    }
    
}
