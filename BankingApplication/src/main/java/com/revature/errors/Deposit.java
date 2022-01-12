package com.revature.errors;
import java.util.Scanner;

public class Deposit{
    int amnt= 0;
    
    public int userInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to deposit: ");
        amnt = scanner.nextInt();
        
        if (amnt<=0)
        {
            InvalidTransaction depositnegativeError = new InvalidTransaction("Invalid amount.");
            System.out.println(depositnegativeError.getMessage());
            userInput();
           
        }
        else 
        	return amnt;
		return amnt; 
    }
}
