package com.revature.animals;

import java.util.Comparator;

// In order to inherit methods and variables, we use the 'extends' keyword
// When a class inherits, it BECOMES it's parent for all intents and purposes
public class Deer extends Animal {
	
	double weight;
	String eyeColor;
	
	public boolean equals(Dear other) {
		if (this.weight == other.weight && this.eyeColor == other.eyeColor)
				return true;
		
		return false;
	}
	
	// This method is an override of the Animal class: attackAnimal
	@Override
	public Animal attackAnimal(Animal a) {
		System.out.println("I am an override!");
		return a;
	}
	
	// This method is overload but not an override because the method signature has changed
	public Deer attackAnimal(Deer d) {
		// To refer to a parent class from a child class, use the 'super' keyword
		super.attackAnimal(d);
		System.out.println("Attacked a fellow Deer!");
		return d;
	}
}
