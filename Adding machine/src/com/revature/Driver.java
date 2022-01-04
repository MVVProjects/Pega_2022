package com.revature;

import java.util.Scanner;

public class Driver {
	
	public static void main(String args []) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers to be calculated: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println("Enter operations symbol: ");
		String choose = input.next();
		switch (choose) {
		case "+":
			System.out.println(x + y);
			break;
		case "-":
			System.out.println(x - y);
			break;
		case "*":
			System.out.println(x * y);
			break;
		case "/":
			System.out.println(x / y);
			break;
		default:
			System.out.println("Wrong symbol!");
			
		}
		
		
	}
	
}
