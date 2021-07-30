package jdbc;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Test {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded !!!!");

            String url = "jdbc:mysql://localhost:3306/test_db";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connected !!!!");
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("End Of Application !!!!");

    }
 
}