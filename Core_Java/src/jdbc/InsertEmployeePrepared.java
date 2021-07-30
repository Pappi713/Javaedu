package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEmployeePrepared {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter id:");
			int id = sc.nextInt();
			
			System.out.println("Enter name:");
			String name = sc.next();
			
			System.out.println("Enter salary:");
			float salary = sc.nextFloat();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String url = "jdbc:mysql://localhost:3306/test_db";
			
			Connection con = DriverManager.getConnection(url,"root","");
			System.out.println("Connected");
			
			String sql = "insert into employee values(?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setFloat(3, salary);
			
			int rows = ps.executeUpdate();
			if(rows> 0) {
				System.out.println("Employee Record Inserted");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
