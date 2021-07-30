//package jdbc;
//
//import java.sql.CallableStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Types;
//
//public class CallabDemo {
//public static void main(String[] args) {
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver Loaded");
//		String url = "jdbc:mysql://localhost:3306/test_db";
//		
//		Connection con = DriverManager.getConnection(url,"root","");
//		System.out.println("Connected");
//		
//		
//		String sql ="{call getEmp(?,?,?)}";
//		
//		CallableStatement cs = con.prepareCall(sql);
//		
//		cs.setInt(1, 101);
//		cs.registerOutParameter(2, Types.VARCHAR);
//		cs.registerOutParameter(3, Types.FLOAT);
//		
//		cs.execute();
//		
//		System.out.println("Emp details");
////		System.out.println("ID :" + cs.getInt(1));
//		System.out.println("Name :" + cs.getString(2));
//		System.out.println("salary :" + cs.getFloat(3));
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//}
