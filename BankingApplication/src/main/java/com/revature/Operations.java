package com.revature;
import java.util.Scanner;

class Operations {
	int amount = 0;
	
	public void initialization();
	{
		Login login = new Login();
		try {
			login.acceptInput();
			login.verify();
		}
		
		catch (Exception a) {
			
			try {
				login.acceptInput();
				login.verify();
			}
			
			catch (Exception b) {
				
			}
		}
		
	}
	
	public int getBalance() {
		return amount;
	}
	
	public void topUp(int amnt) {
		if (amount <= 0) {
			InvalidTransaction InvalidDeposit = new InvalidTransaction("The amount is incorrect.");
			System.out.println(InvalidDeposit.getMessage());
		}
		else {
			amount = amount + amnt;
			System.out.println(amnt + "PLN deposited succesfully.");
			System.out.println("Current balance: " + amount + " PLN.");
		}
	}
	
	public void Withdrawal(int amnt) {
		if (amount < amnt || amnt <= 0) {
			InvalidTransaction InvalidWithdrawal = new InvalidTransaction("The amount is incorrect.");
			System.out.println(InvalidWithdrawal.getMessage());
		}
		else {
			amount = (amount - amnt);
			System.out.println("The " + amnt + " was succesfully withdrawn.");
			System.out.println("Current balance: " + amount + " PLN.");
		}
		
	public void Transfer(int amnt, account1, account2) {
		if (amount < amnt || amnt <= 0) {
			InvalidTransaction InvalidTransfer = new InvalidTransaction("The amount is incorrect.");
			System.out.println(InvalidTransfer.getMessage());
			break
			
			if (account1 ! int || account2 ! int) {
				InvalidTransaction InvalidAccount = new InvalidAccount("The account is incorrect.");
				System.out.println(InvalidAccount.getMessage());
				break
			}
		}
		
		else {
			amount = (amount - amnt);
			System.out.println("The " + amnt + " was successfully transferred.");
			System.out.println("Current balance: " + amount + " PLN.");
		}
	}
}
