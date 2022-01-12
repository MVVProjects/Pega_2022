package com.revature;
import java.util.Scanner;

class Menu {
	int select;
	
	Operations operations = new Operations();
	
	public void showMenu() {
		System.out.println("What would you like to do?");
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
             operations.TopUp(deposit);
             showMenu();
             break;
            
        case 2:
             System.out.println("Enter the amount to withdraw: ");
             int withdrawal = scanner.nextInt();
             operations.Withdrawal(withdrawal);
             showMenu();
             break;
            
        case 3:
             System.out.println("Your Account Balance is " + operations.getBalance() + " PLN");  
             showMenu();
             break;
       
        case 4:
             System.out.println("Enter the amount to withdraw: ");
             int transfer = scanner.nextInt();
             banking.transfer(transfer);
             showMenu();
             break;
       
        default:
              System.out.println("Transaction Ended");
              System.exit(0);
            break;
    }
}
    

}
}
