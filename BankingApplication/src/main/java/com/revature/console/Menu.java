package com.revature.console;

import java.util.Scanner;
import com.revature.dao.Operations;
import com.revature.errors.Deposit;

public class Menu {
	int select;
	
	Operations operations = new Operations();
	
	public void showMenu() {
		System.out.println("Welcome, what would you like to do?");
        System.out.println("Press 1 to Deposit.");
        System.out.println("Press 2 to Withdraw.");
        System.out.println("Press 3 to View Balance");
        System.out.println("Press 4 to Transfer");
        System.out.println("Press any key to Exit");
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void Choose() {
    System.out.println("Press the key:");
    select = scanner.nextInt();
    switch (select) {
    
        case 1:
             Deposit d = new Deposit();
             int deposit =  d.userInput();
             operations.topUp(deposit);
             showMenu();
             break;
            
        case 2:
             System.out.println("Enter the amount to withdraw: ");
             int withdrawal = scanner.nextInt();
             scanner.nextLine();
             operations.Withdrawal(withdrawal);
             showMenu();
             break;
            
        case 3:
             System.out.println("Your Account Balance is " + operations.getBalance() + " PLN");  
             showMenu();
             break;
       
        case 4:
             System.out.println("Enter the amount to transfer: ");
             int transfer = scanner.nextInt();
             scanner.nextLine();
             System.out.println("Enter the account to transfer from: ");
             int account1 = scanner.nextInt();
             scanner.nextLine();
             System.out.println("Enter the account to transfer to: ");
             int account2 = scanner.nextInt();
             scanner.nextLine();
             operations.Transfer(transfer, account1, account2);
             showMenu();
             break;
       
        default:
              System.out.println("Transaction ended");
              System.exit(0);
            break;
    }
}
    

}

