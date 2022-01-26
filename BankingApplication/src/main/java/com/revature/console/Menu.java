package com.revature.console;

import java.util.Scanner;

import com.revature.dao.AccountDAO;
import com.revature.dao.Operations;



public class Menu {
	public static Scanner menuScanner = new Scanner(System.in);
	
	Operations operations = new Operations();
	
	public static void showMenu() {
		System.out.println("Welcome, what would you like to do?");
		System.out.println("Press 1 to Open account.");
        System.out.println("Press 2 to Show account.");
        System.out.println("Press 3 to Deposit.");
        System.out.println("Press 4 to Withdraw.");
        System.out.println("Press 5 to Transfer");
        System.out.println("Press any key to Exit");
	
        String choose = menuScanner.nextLine();
		switch (choose) {
		case "1":
			 int scanner = 0;
			 AccountDAO.createAccount(scanner);
			 System.out.println("");
			 showMenu();
		case "2":
			 System.out.println("Please give account number:");
			 int scanner1 = menuScanner.nextInt();
			 AccountDAO.getAccount(scanner1);
			 System.out.println("");
			 showMenu();
        case "3":
			 System.out.println("What ammount?:");
			 System.out.println("To which account?:");
        	 int scanner2 = menuScanner.nextInt();
        	 int scanner3 = menuScanner.nextInt();
             Operations.deposit(scanner2, scanner3);
             System.out.println("Deposited " + scanner2 + "PLN to account nr " + scanner3 +".");
             System.out.println("");
             showMenu();
            
        case "4":
			 System.out.println("What ammount?:");
			 System.out.println("From which account?:");
       	 	 int scanner4 = menuScanner.nextInt();
       	 	 int scanner5 = menuScanner.nextInt();
        	 Operations.withdraw(scanner4, scanner5);
        	 System.out.println("Withdrawn " + scanner4 + "from account nr " + scanner4 +".");
        	 System.out.println("");
             showMenu();
           
        case "5":
			 System.out.println("From which account?:");
			 System.out.println("To which account?:");
			 System.out.println("What ammount?:");
      	 	 int scanner6 = menuScanner.nextInt();
      	 	 int scanner7 = menuScanner.nextInt();
      	 	 int scanner8 = menuScanner.nextInt();
        	 Operations.transfer(scanner6, scanner7, scanner8);
        	 System.out.println("Transfered " + scanner6 + " from account nr " + scanner7 + " to account nr " + scanner8 + ".");
        	 System.out.println("");
             showMenu();
       
        default:
              System.out.println("Transaction ended");
              System.exit(0);
            break;
    }
}
    

}

