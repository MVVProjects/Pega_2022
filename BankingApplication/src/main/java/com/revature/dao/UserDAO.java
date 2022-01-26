package com.revature.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.models.User;

public class UserDAO {

	public static boolean isUsernameTaken(String username) {
		try 
		{
			Connection c = ConnectionManager.getConnection();
			
			PreparedStatement preparedStatement = c.prepareStatement("SELECT * FROM users WHERE username = ?");
			preparedStatement.setString(1, username);
			ResultSet results = preparedStatement.executeQuery();
			if (results.next())
				return true;
			return false;
		}
			
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	public static int signUp(String username, String password, int accountType) {
		try {
			Connection c = ConnectionManager.getConnection();
			PreparedStatement preparedStatement = c.prepareStatement("INSERT INTO users(username, password, accountType ) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			preparedStatement.setInt(3, accountType);
			int howManyRowsWereAffected = preparedStatement.executeUpdate();
			if( 1 == howManyRowsWereAffected)
			{
				ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
				generatedKeys.next();
				int accountID = generatedKeys.getInt(1);
				return accountID;
			}
			else
			{
				return -1;
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	
	
	public static User checkPassword( String user, String pass )
	{
		try 
		{
			Connection c = ConnectionManager.getConnection();
			PreparedStatement preparedStatement;
			preparedStatement = c.prepareStatement("SELECT * FROM users WHERE username LIKE ? and password LIKE ?");
			preparedStatement.setString( 1, user );
			preparedStatement.setString( 2, pass );
			ResultSet results = preparedStatement.executeQuery();
			boolean authenticated = results.next();
			if(  authenticated == false )
			{
				return null;
			}
			else
			{
				String username = results.getString( "username" );
				String password = results.getString( "password" );
				int accountType = results.getInt( "type" );
				int accountID = results.getInt( "id" );
				User logUser = new User( username, password, accountType, accountID );
				return logUser;
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public static boolean createUser(User user) {
		
		try {
			
			Connection connection = ConnectionManager.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users(username, password, accountType) VALUES (?, ?, ?)");
			
			preparedStatement.setString(1, user.username);
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setInt(3, user.accountType);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	public static User getUser(String username) {

		try {
			
			Connection connection = ConnectionManager.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
			
			preparedStatement.setString(1, username);
			
			ResultSet userList = preparedStatement.executeQuery();
			
			while (userList.next()) {
				
				String user = userList.getString("username");
				String pass = userList.getString("password");
				int accType = userList.getInt("accountType");
				int accID = userList.getInt("accountID");

				return new User(user, pass, accType, accID);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	public boolean updateUsername(String username) { 
		try{
			
			Connection connection = ConnectionManager.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("UPDATE users SET username = ? WHERE username = ?");
			
			preparedStatement.setString(1, username);

			preparedStatement.executeUpdate();
				
		} catch (SQLException e) {
		
		System.err.println(e.getMessage());
		
		}
		
		return false;
		
	}
	public boolean deleteUser(String username) {
		
		try{
			
			Connection connection = ConnectionManager.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE username = ?");
			
			preparedStatement.setString(1, username);

			preparedStatement.executeUpdate();
				
		} catch (SQLException e) {
		
		System.err.println(e.getMessage());
		
		}
		
		return false;
	}
public boolean doUsernamePasswordExist(String username, String password, int accountType) {
		
		try {
			
			Connection connection = ConnectionManager.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ? AND accountType = ?");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			preparedStatement.setInt(3, accountType);
			
			ResultSet results = preparedStatement.executeQuery();

			if (results.next()) {
				
				return true;
				
			} else {
				
				return false;
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return true;
	}
}
