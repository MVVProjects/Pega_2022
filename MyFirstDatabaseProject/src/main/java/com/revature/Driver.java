package com.revature;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Driver {
	
	public static void main(String[] args) {
		
		try {
			// Class.forname unsures this class is loaded and avoids ClassNotFoundException
			Class.forName("org.postgresql.Driver");	
			
			String connectionString = "jdbc:postgresql://ella.db.elephantsql.com:5432/jqxhkoxf",
					username = "jqxhkoxf",
					password = "l0ze6A0V-lhVUrcl8anhhjC7FnS8fL_7";
			
			// Connection object is used to manage the network connection with database
			Connection connection = DriverManager.getConnection(connectionString, username, password); 
		
			// Statement object can be used to run queries and receive ResultSets
			Statement statement = connection.createStatement();
			
			// ResultSets have a built-in iterator that starts one row ABOVE the first row
			// This allows us to call while on its next() method, which moves it 
			ResultSet result = statement.executeQuery("SELECT * FROM apartments");
			while (result.next()) {
				System.out.println("Id: " + result.getInt("apartment_id") + ", rent: " + result.getDouble("rent"));
			}
		
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
