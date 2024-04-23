package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;

public class ProgrammerDAO {
	
	private Connection connection;
	private Statement stmt;
	private PreparedStatement pStmt;
	private ResultSet resultSet;
	//Delete d
	public int deleteProgrammer(int id) {
		connection = DBConnection.getDBConnection();
		int rowEffect = 0;
		
		try {
			stmt = connection.createStatement();
			rowEffect = stmt.executeUpdate("delete from programmer where id = '"+id+"';");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowEffect;
		
	}
	public int updateProgrammer(Programmer programmer) {
		//Update u
		connection = DBConnection.getDBConnection();
		int rowEffect = 0;
		
		try {
			pStmt = connection.prepareStatement(
					"UPDATE `programmer` SET"
					+ " `name` = ?,"
					+"`role` = ?, "
					+"`height` = ? WHERE (`id` = ?);"
					);
			
			pStmt.setString(1, programmer.getName());
			pStmt.setString(2, programmer.getRole());
			pStmt.setDouble(3, programmer.getHeight());
			pStmt.setInt(4, programmer.getId());
			
			rowEffect = pStmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return rowEffect;
	}
	
	
	//Create - C
	public int createProgrammer(Programmer programmer) {
		connection = DBConnection.getDBConnection();
		int rowEffect = 0;
		
		try {
			pStmt = connection.prepareStatement(
					"INSERT INTO `programmer` (`name`, `role`, `height`) VALUES (?, ?, ?);"
					);
			pStmt.setString(1, programmer.getName());
			pStmt.setString(2, programmer.getRole());
			pStmt.setDouble(3, programmer.getHeight());


			rowEffect = pStmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return rowEffect;
	}
	public List<Programmer> readProgrammerList(){
		List<Programmer> programmerList = new ArrayList<>();
		connection = DBConnection.getDBConnection();
		try {
			stmt = connection.createStatement();
			
			resultSet = stmt.executeQuery("select * from programmer");
			
			while (resultSet.next()) {
				programmerList.add(new Programmer(
						resultSet.getInt("id"), 
						resultSet.getString("name"), 
						resultSet.getString("role"),
						resultSet.getDouble("height")));
						
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return programmerList;
	}
//	public void close() {
//		try {
//			connection.close();
//		} catch (SQLException e) {
//			// TODO: handle exception
//		}
//	}
	//Read - R(Specify)
	public List<Programmer> readProgrammerSpecify(String name){
		List<Programmer> programmerList = new ArrayList<>();
		connection = DBConnection.getDBConnection();
		try {
			stmt = connection.createStatement();
			
			resultSet = stmt.executeQuery("select * from programmer where name = '"+name+"';");
			
			while (resultSet.next()) {
				programmerList.add(new Programmer(
						resultSet.getInt("id"), 
						resultSet.getString("name"), 
						resultSet.getString("role"),
						resultSet.getDouble("height")));
						
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return programmerList;
	}
	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
