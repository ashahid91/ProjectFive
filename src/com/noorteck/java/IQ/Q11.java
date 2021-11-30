package com.noorteck.java.IQ;

import java.util.Arrays;

public class Q11 {
	public static void main(String[] args) {
		check("listen", "silent");

	}
	public static void check(String a, String b) {
		// convert strings into arrays
		char[] arrayA = a.toCharArray();
		char[] arrayB = b.toCharArray();
		// create two temporary variables to swap
		char tempA = ' ';
		char tempB = ' ';
		// sorting array using two for loops
		for (int i = 0; i < arrayA.length; i++) { // Outer loop
			for (int j = 0; j < arrayA.length; j++) { // inner loop
				if (arrayA[j] > arrayA[i]) { // checking if the element at position j is greater than i
					tempA = arrayA[i];		// if the condition is true assign the value of array at index i to tempA
					arrayA[i] = arrayA[j];	// assign value of array[j] to array[i]
					arrayA[j] = tempA;		// assign value of temp to array[j]
				}
			}
		}
		System.out.println(Arrays.toString(arrayA)); 
		// sorting second array
		for (int k = 0; k < arrayB.length; k++) {
			for (int l = 0; l < arrayA.length; l++) { 
				if (arrayB[l] > arrayB[k]) { // checking if the element at position l  is greater than i	
					tempB = arrayB[k];		// if the condition is true assign the value of array at index k to tempB
					arrayB[k] = arrayB[l];	// assign value of array[l] to array[k]
					arrayB[l] = tempB;		// assign value of tempB to array[l]
				}
			}
		}
		System.out.println(Arrays.toString(arrayB));
		// NOW WE HAVE TWO SORTED LENGTH SORTED IN ASCENDING ORDER
		// check if the length of arrays are not equal then return false output
		if (arrayA.length != arrayB.length) {
			System.out.println("Both strings are not anagram");
		} else {
			// if length is equal then check through each sorted array
			for (int m = 0; m < arrayA.length; m++) {
				if (arrayA[m] == arrayB[m]) { // Check two arrays at each index position if they are equal, if all elements are eual then outout is true

				}
			}
			System.out.println("Both strings are anagram");
		}
	}
}
