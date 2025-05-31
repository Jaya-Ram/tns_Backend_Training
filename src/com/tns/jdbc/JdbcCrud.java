package com.tns.jdbc;

import java.sql.*;

public class JdbcCrud {

	public static void main(String[] args) {
		
		final String DB_URL = "jdbc:postgresql://localhost:5432/mydb";
		final String USERNAME = "postgres";
		final String PASSWORD = "56249";

		try(Connection conn =DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)){
			
			// CREATE
//			createStudent(conn, "Abhinay", "abhinay@gmail.com");
			
			// READ
			readStudent(conn);
			
			// UPDATE
//			updateStudent(conn, 4, "Bablu", "bablu@gmail.com");
			
			// DELETE
//			deleteStudent(conn, 4);
			
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void createStudent(Connection conn, String name, String email) {
		
		String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
		try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			
			int rowsAffected = preparedStatement.executeUpdate(); 
			
			System.out.println("Inserted " + rowsAffected + " Rows.");
			}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void readStudent(Connection conn) {
		
		try(Statement statement = conn.createStatement()){
			String sql = "SELECT * FROM students";
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				
				System.out.println("Id: " + id + " Name: " + name + " Email Id: " +email);
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void updateStudent(Connection conn, int id, String newName, String newEmail) {
		
		String sql = "UPDATE students SET name = ?, email = ? WHERE id = ?";
		try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
			
			preparedStatement.setString(1, newName);
			preparedStatement.setString(2, newEmail);
			preparedStatement.setInt(3, id);
			
			int rowsAffected = preparedStatement.executeUpdate();
			
			System.out.println("Updated " + rowsAffected + " Row affected");
		}
		catch(SQLException e) {
			
		}
		
	}
	
	public static void deleteStudent(Connection conn, int id) {
		
		String sql = "DELETE FROM students WHERE id = ?";
		try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
			preparedStatement.setInt(1,  id);
			
			int rowsAffected = preparedStatement.executeUpdate();
			
			System.out.println("Deleted " + rowsAffected + " Rows Affected.");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
