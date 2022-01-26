package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static Connection connection;
	
	static String connectionString = "jdbc:postgresql://ella.db.elephantsql.com:5432/jqxhkoxf";
	static String username = "jqxhkoxf";
	static String password = "l0ze6A0V-lhVUrcl8anhhjC7FnS8fL_7";
	
	public static Connection getConnection() {
		try {
			if (connection == null || connection.isClosed()) {
			
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(connectionString, username, password);
			}
			
			return connection;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}