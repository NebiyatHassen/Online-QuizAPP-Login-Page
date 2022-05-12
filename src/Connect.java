import java.sql.Connection;
import java.sql.DriverManager;
public class Connect {
      
public Connection connection;

public Connection getconnection(){
      
    String DBName = "Login";
    String user = "root" ;
    String password = "nebiyat";
     String url = "jdbc:mysql://localhost:3306/"+DBName;

    try {
        connection = DriverManager.getConnection(url, user, password);
    } catch (Exception e) {
      System.out.println(e);
    }
    return connection;
}

}

