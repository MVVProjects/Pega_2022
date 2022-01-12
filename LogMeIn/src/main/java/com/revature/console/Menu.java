package com.revature.console;

import java.util.Scanner;

import com.revature.dao.UserDAO;

public class Menu {

	public void mainMenu(Scanner scanner) {
		System.out.println("Welcome! Would you like to:");
		System.out.println("  1 - Log in");
		System.out.println("  2 - Sign up");
		
		try {
			// If we do scanner.NextInt, nextDouble, or some other 
			// nextLine() is needed to flush the scanner of extra characters
			int input = scanner.nextInt();
			scanner.nextLine();
			
			switch (input) {
			case 1:
				// Do log in stuff
				break;
			case 2:
				signUp(scanner);
				break;
			default:
				throw new Exception("Invalid input: " + input);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void signUp(Scanner scanner) {
		System.out.println("To sign up, we'll need a username and password.");
		System.out.println("Username: ");
		
		// Because we are consuming the whole line, the scanner does not need to be flushed
		String username = scanner.nextLine();
		
		UserDAO userDao = new UserDAO();
		if (userDao.isUsernameTaken(username)) {
			System.out.println("Username taken! Returning to main menu.");
			return;
		}
		
		System.out.println("Password: ");
		
		String password = scanner.nextLine();
		
		userDao.signUp(username, password);
		
	}
}
