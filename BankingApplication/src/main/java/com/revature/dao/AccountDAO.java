package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.revature.models.Account;

public class AccountDAO {
	
	public static boolean createAccount(int account) {
		
		try {
			int accountNumber = generateAccountNumber();
			int accountBalance = 0;
			
			Connection c = ConnectionManager.getConnection();
			PreparedStatement preparedStatement = c.prepareStatement("INSERT INTO accounts(accountNumber, accountBalance, accountApproved) VALUES (?, ?, ?)");
			preparedStatement.setInt(1, accountNumber);
			preparedStatement.setInt(2, 0);
			preparedStatement.setBoolean(3, true);		
			preparedStatement.executeUpdate();
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Current Balance: " + accountBalance);
			System.out.println("Is it active?: " + true);
			System.out.println("");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static Account getAccount (int accountNumber) {
		
		
		try {
			Connection c = ConnectionManager.getConnection();
			PreparedStatement preparedStatement = c.prepareStatement("SELECT * FROM accounts WHERE accountNumber = ?");
			preparedStatement.setInt(1, accountNumber);
			ResultSet results = preparedStatement.executeQuery();
			
			while(results.next()) {
				int balance = results.getInt("accountBalance");
				boolean approved = results.getBoolean("accountApproved");
				Account Account = new Account (accountNumber, balance, approved, 0);
				System.out.println("Account Number: " + accountNumber);
				System.out.println("Current Balance: " + balance);
				System.out.println("");
				return Account;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	public boolean updateAccount (Account account) {
		
		try {
			Connection c = ConnectionManager.getConnection();
			PreparedStatement preparedStatement = c.prepareStatement("UPDATE accounts SET (accountBalance = ?, accountApproved = ? WHERE accountNumber= ?");
			preparedStatement.setInt(1, account.accountBalance);
			preparedStatement.setBoolean(2, account.accountApproved);
			preparedStatement.setInt(3, account.accountNumber);
			preparedStatement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteAccount (Account account) {
		try {
			Connection c = ConnectionManager.getConnection();
			PreparedStatement preparedStatement = c.prepareStatement("DELETE accounts WHERE accountNumber= ?");
			preparedStatement.setInt(1, account.accountNumber);
			preparedStatement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
 
	public static int generateAccountNumber () {
		try {
			Connection c = ConnectionManager.getConnection();
			PreparedStatement prepStatement = c.prepareStatement("SELECT MAX(accountNumber) AS number FROM accounts");
			ResultSet results = prepStatement.executeQuery();
			
			if (results.next()) {
				int number = results.getInt("number");
				return ++number;
			} else {
				return 1230001;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
}