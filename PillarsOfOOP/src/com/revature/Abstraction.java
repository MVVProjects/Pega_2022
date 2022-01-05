package com.revature;

import com.revature.animals.Deer;
import com.revature.animals.NaturalFunctions;

public class Abstraction {

		public void doStuff() {
			
			Deer d = new Deer();
			executeNaturalFunctions(d);
		}
		
		public void executeNaturalFunctions(NaturalFunctions n) {
			
			n.eat();
			n.sleep();
		}
}
