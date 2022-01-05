package com.revature;

import com.revature.animals.Animal;
import com.revature.animals.Deer;

public class Polymorphism {	
	
		public void doStuff() {
			Animal animal = new Animal("Deer");
			Deer deer = new Deer();
			
			// Basic parent behaviors
			animal.eat();
			animal.sleep();
			animal.attackAnimal(deer);
			
			deer.eat();
			deer.sleep();
			// This method is overridden!
			deer.attackAnimal(animal);
			// This method is a special overload
			deer.attackAnimal(animal);
			
			// Can explicitly cast from child to parent like so:
			Animal b = (Animal)deer; // "upcasting". Not risky
			
			// Can cast from parent to child as well, but can run into strange behaviors
			Deer e = (Deer)animal; // "downcasting". Could be risky
			
			// The below method will not compile because Animal cannot be implicitly
			// converted to Deer.
			// tryToConvert(animal);
		}
		
		public void eat() {
			System.out.println("I am eating!");
		}
		
		// We can add overload by introducing new parameters
		public void eat(String food) {
			System.out.println("I am eating " + food + "!");
		}
		
		// We can keep going and introduce more parameters
		public void eat(String f, int calories) {
			System.out.println("I am eating " + f + ", which is " + calories + " calories!");
		}
		
		// The type and order of parameters determines whether it is a unique overload
		public void eat(int calories, String f) {
			eat(f, calories);
		}
		
		public void tryToConvert(Deer d) {
			Animal a = (Animal) d;
		}
		
		// We cannot only change the return type to create a new overload
		/* public int eat(String f, int calories) {
			System.out.println("I am eating " + f + ", which is " + calories + " calories!");
		}*/
}
