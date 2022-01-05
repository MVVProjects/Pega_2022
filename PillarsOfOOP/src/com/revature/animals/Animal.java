package com.revature.animals;

public class Animal extends MultiCellLifefrom implements NaturalFunctions {
	
	public Animal(String species) {
		// The 'this' keyword is an object reffering to itself
		this.species = species;
	}
	
	public Animal() {
		this.species = "animal";
	}	
	
	protected String species;
	
	public void eat() {
		System.out.println("This " + species + " is eating.");		
	}
	
	public void sleep() {
		System.out.println("This " + species + " is sleeping.");
	}
	
	public void move() {
		System.out.println("This " + species + " moved!");
	}
	
	public Animal attackAnimal(Animal a) {
		System.out.println("Just attacked a " + a.species);
		return a;
	}
}
