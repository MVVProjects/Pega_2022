package com.revature;

import com.revature.animals.Animal;
import com.revature.animals.Bear;
import com.revature.animals.MultiCellLifeform;

public class Driver {

	public static void main(String[] args) {
		Inheritance i = new Inheritance();
		//i.doStuff();
		
		Polymorphism p = new Polymorphism();
		p.doStuff();
		
		p.eat();
		p.eat("ham");
		p.eat("bacon", 200);
		p.eat(300, "pork cutlet");
	}
}
