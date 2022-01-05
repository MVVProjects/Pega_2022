package com.revature.animals;

public abstract class MultiCellLifeform {

	public boolean living = true;
	
	public void consumeCalories() {
		System.out.println("Calories consumed!");
	}
	
	// Abstract methods behave similarly to interface methods, they MUST be implemented by children
	abstract public void move();
}
