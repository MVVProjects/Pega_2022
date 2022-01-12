package com.revature;

public class Q01 {
	
	// Takes an array and returns the sorted array
	public static int[] BubbleSort(int[] array) {
		
		// We need a variable to tell us whether we are done sorting
		boolean sorted = false;
		
		while (!sorted) {
			// Assume we are sorted at the beginning of each iteration
			sorted = true;
			
			for (int i = 0; i < array.length - 1; ++i) {
				// If we prove that the array is unsorted, unset the "sorted" variable and perform the swap
				if (!sorted(array[i], array[i+1])) {
					swap(array, i, i+1);
					sorted = false;
				}
			}
		}
		
		return array;
	}
	
	// Returns true if an element is less then its next neighbor
	private static boolean sorted(int element, int rightNeighbor) {
		return element < rightNeighbor;
	}
	
	// Swaps two elements in place in an array
	private static void swap(int[] array, int element_a, int element_b) {
		int temp = array[element_a];
		array[element_a] = array[element_b];
		array[element_b] = temp;

		
	}
}