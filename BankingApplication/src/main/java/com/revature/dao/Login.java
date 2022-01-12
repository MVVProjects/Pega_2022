package com.revature.dao;
import java.util.Scanner;

import com.revature.console.Menu;
import com.revature.errors.InvalidTransaction;

class Login {
	
	String account_login = "Admin";
	int account_pin = 0000;
	String account;
	int pin;

	public void acceptInput() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the account login:");
		account = scanner.toString();
		System.out.println("Enter the PIN number:");
		pin = scanner.nextInt();
	}
	
	public void verify () throws Exception {
		
		if (account == account_login && pin == account_pin) {
			System.out.println("Login successfull");
		
			Operations operations = new Operations();
			System.out.println("Your balance is: " + operations.getBalance() + " PLN.");
			Menu menu = new Menu();
			menu.showMenu();
		}
		else {
			InvalidTransaction loginFail = new InvalidTransaction("Wrong credentials!");
			System.out.println(loginFail.getMessage());
			throw loginFail;
		}
	}
}