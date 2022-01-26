package com.revature.models;

public class Account {
	
	public int accountNumber;
	public int accountBalance;
	public boolean accountApproved;
	public int accountID;
	
	public Account(int accNum, int accBal, boolean accApp, int accID) {
		this.accountNumber = accNum;
		this.accountBalance = accBal;
		this.accountApproved = accApp;
		this.accountID = accID;
	}

}