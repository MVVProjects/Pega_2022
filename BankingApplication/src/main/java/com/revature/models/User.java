package com.revature.models;

public class User {
	
		public String username;
		public String password;
		public int accountType;
		public int accountID;
		
		
		public User( String username, String password, int type, int id )
		{
			this.username = username; 
			this.password = password;
			this.accountType = type;
			this.accountID = id;
		}
		
		public String getUsername()
		{
			return this.username;
		}
		
		public int getType()
		{
			return this.accountType;
		}
		
		public String getPassword()
		{
			return this.password;
		}
		
		public String toString()
		{
			String result = "Username: " + this.username + " password: " + this.password + " id: " + this.accountID;
			return result;
		}
		
		public int getId()
		{
			return this.accountID;
		}
		
		public boolean equals( User other )
		{
			boolean userVerify = this.getUsername().equals( other.getUsername() );
			boolean passVerify = this.getPassword().equals( other.getPassword() );
			boolean idVerify = this.getId() == other.getId();
			boolean typeVerify = this.getType() == other.getType();
			if( userVerify && passVerify && idVerify && typeVerify )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
	}
