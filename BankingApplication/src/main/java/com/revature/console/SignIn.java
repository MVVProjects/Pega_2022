package com.revature.console;

import java.util.Scanner;
import com.revature.dao.*;
import com.revature.models.User;

public class SignIn {
	
	public void FirstScreen() {
		System.out.println("Welcome! Would you like to:");
		System.out.println("  1 - Log in");
		System.out.println("  2 - Sign up");
		Scanner scanner = new Scanner(System.in);
		
		try {
			// If we do scanner.NextInt, nextDouble, or some other 
			// nextLine() is needed to flush the scanner of extra characters
			int input = scanner.nextInt();
			scanner.nextLine();
			
			switch (input) {
			case 1:
				logIn();
				scanner.nextLine();
				break;
			case 2:
				signUp(scanner);
				scanner.nextLine();
				break;
			default:
				throw new Exception("Invalid input.");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void signUp(Scanner scanner) {
		System.out.println("To sign up, we'll need a username and password.");
		System.out.println("Username: ");
		
		// Because we are consuming the whole line, the scanner does not need to be flushed
		String username = scanner.nextLine();
		
		UserDAO userDao = new UserDAO();
		if (UserDAO.isUsernameTaken(username)) {
			System.out.println("Username taken! Returning to main menu.");
			return;
		}
		
		System.out.println("Password: ");
		
		String password = scanner.nextLine();
		
		System.out.println("If you are a client, press 1.");
		System.out.println("If you are an employee, press 3.");
		System.out.println("If you are a bank admin, press 9.");
		
		int accountType = scanner.nextInt();
		
		UserDAO.signUp(username, password, accountType);
		
	}
	private void logIn () {
		User user = null;
		UserDAO userDao = new UserDAO();
		
		while (user == null) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter your username.");
			String username = scanner.next();
			System.out.println("Please enter your password.");
			String password = scanner.next();
			
			user = UserDAO.getUser(username);
			
			if (user == null || !user.password.equals(password)) {
				System.out.println("Credentials are incorrect. Please try again.");
				user = null;
			}
		}
		
		Menu.showMenu();	
    }
}

