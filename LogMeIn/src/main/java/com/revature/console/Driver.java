package com.revature.console;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			Menu menu = new Menu();
			menu.mainMenu(scanner);
		}
	}
}
