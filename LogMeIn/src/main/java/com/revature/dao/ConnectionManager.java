package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static Connection connection;
	
	private static String connectionString = "jdbc:postgresql://ella.db.elephantsql.com:5432/jqxhkoxf",
			username = "jqxhkoxf",
			password = "l0ze6A0V-lhVUrcl8anhhjC7FnS8fL_7";
	
	public static Connection getConnection() {
		try {
			if (connection == null) {
			
				Class.forName("org.postresql.Driver");
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
