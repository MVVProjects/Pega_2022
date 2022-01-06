package com.revature;

public class MyArrayList<T> {

	// In a generic class, T is called a "placeholder type"
	T myThing;
	
	// Can also use placeholder types as arguments
	public void myMethod(T myParam) {
		
	}
	
	int size = 0;
	Object[] array = new Object[10];
	
	public void add(T obj) {
		array[size] = obj;
		++size;
	}
	
	public T get(int i) {
		return (T)array[i];
	}
}
