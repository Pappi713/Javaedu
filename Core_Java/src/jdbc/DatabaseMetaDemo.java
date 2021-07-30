package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMetaDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String url = "jdbc:mysql://localhost:3306/test_db";
			
			Connection con = DriverManager.getConnection(url,"root","");
			System.out.println("Connected");
			
			
			DatabaseMetaData data = con.getMetaData();
			System.out.println(data.getDatabaseProductName());
			System.out.println(data.getDatabaseProductVersion());
			System.out.println(data.getDriverName());
			System.out.println(data.getSQLKeywords());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
