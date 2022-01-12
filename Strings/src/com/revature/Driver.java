package com.revature;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		String name = "Mike",
				location = "Wroc³aw",
				vocation = "Trainee";
				
		// startsWith checks if the start of a String matches with Input		
		System.out.println(name.startsWith("Mi")); // This would return True
		
		// indexOf of String would identify where in the operating String the substring can be found
		System.out.println(location.indexOf("oc")); // The returned index will be 3. Returns -1 when no match found
		System.out.println(location.indexOf("³"));
		
		String allLower = vocation.toLowerCase();
		String allUpper = vocation.toUpperCase();
		System.out.println(allLower + ", " + allUpper);
		
		// Trim removes leading and trailing whitespace.
		String input = "   training   instructor    ";
		System.out.println(input + " becomes " + input.trim());
		
		String newStateName = location.replace('w', 'z');
		System.out.println(newStateName);
		
		// Split creates an array of Strings using an input and delimiter
		// The delimiter becomes the breaking point of the input string
		String sentence = "This is my multi-word sentence";
		String[] words = sentence.split(" ");
		System.out.println(Arrays.toString(words));
	}
}
