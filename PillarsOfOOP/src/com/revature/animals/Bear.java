package com.revature.animals;

/* Access Modifiers
 * 
 * private - Can be accessed by the class only.
 * 'default' - Also called package-private. Can be accessed by the class or any class in the package.
 * protected - Can be accessed by the class or its children
 * public - Can be accessed by anyone.
 */
public class Bear extends Animal implements NaturalFunctions {

	public void eat() {
		
	}
	
	public void sleep() {
		species = "accessing species!";
	}
	
	private String denAdress;
	private String favoriteFishingSpot;
	
	// Standard Getter formulation. Note that code for things logging and security can also run here.
	public String getDenAdress() {
		return denAdress;
	}
	
	// We can also set private 
	public void setDenAddress(String denAdress) {
		this.denAddress = denAddress;
	}
}
