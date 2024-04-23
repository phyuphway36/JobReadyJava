package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	//URL - Uniform Resource Locator
	public static Connection getDBConnection() {
		
		String url = "jdbc:mysql://localhost:3306/programmerdb?useSSL = false";
		String user = "root";
		String password = "1234";
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
