package com.revature.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Operations {
	
	 	public static int deposit(int accountID, int amount) {
	        try {
	            Connection conn = ConnectionManager.getConnection();
	            String sql = "UPDATE accounts SET accountBalance = accountBalance + ? WHERE accountID = ?";

	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, amount);
	            ps.setInt(2, accountID);

	            ps.execute();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
			return amount;

	    }

	    public static int withdraw(int accountID, int amount) {
	        try {
	            Connection con = ConnectionManager.getConnection();
	            // String sql1 = "SELECT accountBalance FROM accounts WHERE accountID = ?";
	            String sql2 = "UPDATE accounts SET accountBalance = accountBalance - ? WHERE accountID = ?";
	            
	            // PreparedStatement ps = con.prepareStatement(sql1);
	            // ps.setInt(1, accountID);
	            
	            PreparedStatement ps1 = con.prepareStatement(sql2);
	            ps1.setInt(1, amount);
	            ps1.setInt(2, accountID);

	            ps1.execute();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
			return accountID;
	    }

	    public static int transfer(int accountID1, int accountID2, int amount) {

	        try {
	            Connection con = ConnectionManager.getConnection();
	            // String sql1 = "SELECT accountBalance FROM accounts WHERE accountID = ?";
	            String sql2 = "UPDATE accounts SET accountBalance = accountBalance - ? WHERE accountID = ?";

	            PreparedStatement ps = con.prepareStatement(sql2);
	            ps.setInt(1, amount);
	            ps.setInt(2, accountID1);

	            ps.execute();

	            sql2 = "UPDATE accounts SET accountBalance = accountBalance + ? WHERE accountID = ?";

	            ps = con.prepareStatement(sql2);
	            ps.setInt(1, amount);
	            ps.setInt(2, accountID2);

	            ps.execute();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
			return accountID2;
	    }
}