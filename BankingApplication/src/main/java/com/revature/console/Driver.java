package com.revature.console;

import com.revature.dao.Operations;

public class Driver {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Bank of Wroclavia!");
		
		Operations ops = new Operations();
		ops.initialization();
	}
}
