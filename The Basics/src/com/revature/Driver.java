package com.revature;

public class Driver {

	public static void main(String[] args) {
		
		// Here I am instantiating a new DataTypes object
		DataTypes dt = new DataTypes();
		
		System.out.println(dt.add(1, 2));
		
		int answer = dt.add(1, 2);
		System.out.println(answer);
		
		Dog felix = new Dog(), henry = new Dog(), patty = new Dog();
		
		felix.name = "Felix";
		felix.age = 2;
		felix.weight = 106.5;
		felix.bread = "German Shepard";
		
		dt.printDogName(felix);
	}
}
