package com.revature.console;

import java.sql.SQLException;
import com.revature.dao.ConnectionManager;

public class Driver {
	
	public static void main(String[] args) {
		try {	
			
			System.out.println("Welcome to the Bank of Wroclavia!");
			SignIn first = new SignIn();
			first.FirstScreen();
			} 
		finally 
			{
			// When the program is stopped, this will trigger and close the connection
			// You have to use the stop button in your IDE. Similar to finalize in ConnectionManager
			try 
				{
				ConnectionManager.getConnection().close();
				System.out.println("Thank you for siging in!");
				} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
