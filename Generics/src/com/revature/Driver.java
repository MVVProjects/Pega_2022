package com.revature;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		
		// ArrayList is a generic collection
		// Generic classes require the target object to be specified within " < > "
		ArrayList<Object> list = new ArrayList<Object>();
		Object o = new Object(), p = new Object();
		
		list.add(o);
		list.add(p);
		list.get(0);

		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		// If we want to store primitives, we have to use a Wrapper Class. The below code won't work.
		// ArrayList<int> intList = new ArrayList<int>();
		
		// Wrapper Classes are classes that represents primitive data, but as reference type
		ArrayList<Integer> intList = new ArrayList<Integer>();
	
		// Sets are used to guarantee unique data
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(3);
		set.remove(3);
		// Cannot use get; Set doesn't have indexes
		// set.get(3);
		
		
		// Deques are used to process list of data in order, one by one
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		// Push means add to the end of the queue
		deque.push(3);
		// Pop means to take from the top of the queve
		int val = deque.pop();
		
		
		// Maps are used when we need key-value behavior, e.g. associate String with a reference
		HashMap<String, Employee> myMap = new HashMap<String, Employee>();
		// To insert into a map, use put with you value
		myMap.put("Mike",new Employee());
		// To retrieve, use get
		Employee myObject = myMap.get("Mike");
	
		// In order to traverse an entire map, you can traverse the map of keys
		Set<String> keys = myMap.keySet();
		for (String key : keys) {
			Employee e = myMap.get(key);
		}
		
		// An alternative way of navigating any collection
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			// Process the current key
		}
	}
}

class Employee {
	
	public void myMethod() {
		
	}
	
}
