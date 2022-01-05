package com.revature.animals;

public class NaturalFunctions {
	
	public void eat();
	
	public void sleep();
	
	// Can have a method body using default keyword, but makes the interface much closer to a class
	default public void doThing() {
		
	}
	
	// Can also have static methods with bodies
	static public void myStaticMethod() {
		
	}
}
