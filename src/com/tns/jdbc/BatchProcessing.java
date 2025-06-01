package com.tns.jdbc;

import java.sql.*;
import java.util.*;

public class BatchProcessing {
	
	private final static String DB_URL = "jdbc:postgresql://localhost:5432/mydb";
	private final static String USERNAME = "postgres";
	private final static String PASSWORD = "56249";

	public static void main(String[] args) {
		
		String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
		try(Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);
				){
			
			while(true) {
				System.out.print("Enter your Name: ");
				String name = sc.nextLine();
				System.out.print("Enter your Email Id: ");
				String email = sc.nextLine();
				
				preparedStatement.setString(1, name);
				preparedStatement.setString(2, email);
				preparedStatement.addBatch();
				
				
				System.out.println("Add More (Y/N): ");
				String choice = sc.nextLine();
				
				if(choice.toUpperCase().equals("N")) {
					break;
				}
			}
			
			int[] result = preparedStatement.executeBatch();
			
			for(int i : result) {
				System.out.println(i);
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
