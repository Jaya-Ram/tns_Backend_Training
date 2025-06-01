package com.tns.jdbc;

import java.sql.*;

public class TransactionHandling{

	private static final String DB_URL = "jdbc:postgresql://localhost:5432/mydb";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "56249";

	public static void main(String[] args) {
		
		try(Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)){
			
			conn.setAutoCommit(false);
			try {
				String sql1 = "UPDATE accounts SET balance = balance - ? WHERE accnum = ?";
				
				// Deduct from Account 1
				PreparedStatement ps1 = conn.prepareStatement(sql1);
				ps1.setInt(1, 13000);
				ps1.setInt(2, 6210);
				ps1.executeUpdate();
				
				// Credit form Account 2
				String sql2 = "UPDATE accounts SET balance = balance + ? WHERE accnum = ?";
				PreparedStatement ps2 = conn.prepareStatement(sql2);
				ps2.setInt(1, 13000);
				ps2.setInt(2, 6211);
				ps2.executeUpdate();
				
				conn.commit();
				System.out.println("Transaction Committed.....");
				
			}
			catch(SQLException e) {
				conn.rollback();
				System.out.println("Transaction Failed.....");
				e.printStackTrace();
			}
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

}