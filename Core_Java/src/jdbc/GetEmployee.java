package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetEmployee {
		public static void main(String[] args) {
			Connection con =null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loaded");
				String url = "jdbc:mysql://localhost:3306/test_db";
				
				con = DriverManager.getConnection(url,"root","");
				System.out.println("Connected");
				
				String sql = "Select * from employee";
				
				Statement st = con.createStatement();
				
				ResultSet rs = st.executeQuery(sql);
				
				while(rs.next()) {
					System.out.println("ID: " + rs.getInt(1));
					System.out.println("Name: " + rs.getString(2));
					System.out.println("Salary: " + rs.getFloat(3));
					System.out.println("--------------------------------");
				}
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					if(con != null) {
						con.close();
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
