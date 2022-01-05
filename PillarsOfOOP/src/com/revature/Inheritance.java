package com.revature;

import com.revature.animals.Deer;

public class Inheritance {

	public void doStuff() {
		
		Deer d = new Deer();
		d.eat();
		d.sleep();
		
		Deer e = new Deer();
		
		// d and e are references, and directly only carry a memory address (just a number!)
		System.out.println(d);
		System.out.println(e);
		
		// This is comparing memory addresses, always!
		if (d==e)
			System.out.println("They're equal!");
	}
}
