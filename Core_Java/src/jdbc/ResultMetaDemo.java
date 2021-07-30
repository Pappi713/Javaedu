package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class ResultMetaDemo {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		String url = "jdbc:mysql://localhost:3306/test_db";
		
		Connection con = DriverManager.getConnection(url,"root","");
		System.out.println("Connected");
		
		
		String sql ="select * from employee";
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		ResultSetMetaData data = rs.getMetaData();
		System.out.println(data.getColumnCount());
		for(int i =1; i< data.getColumnCount();i++) {
			System.out.println(data.getColumnClassName(i) + " ; " + data.getColumnType(i));
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
