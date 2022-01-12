package com.revature.errors;

public class InvalidTransaction extends Exception
{
     String errorMessage;
     public InvalidTransaction(String message)
     {
        errorMessage = message;
     }  
      public String getMessage()
      {
          return errorMessage;
      }
}
