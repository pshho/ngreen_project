package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
	
	// oracle connect
	static String driverClass = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/javaweb";
	static String username = "jweb";
	static String password = "jweb";
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName(driverClass);
			System.out.println("연결");
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
