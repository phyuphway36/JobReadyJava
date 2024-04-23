package test;

import java.sql.Connection;

import database.DBConnection;

public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection= DBConnection.getDBConnection();
		
		if(connection != null)
			System.out.println("Successfully Connected to DB");
		else
			System.out.println("DBConnection fail!");
	}

}
