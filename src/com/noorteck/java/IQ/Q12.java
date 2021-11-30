package com.noorteck.java.IQ;

public class Q12 {
	// Q12 "Racecar --> racecaR

	public static void main(String[] args) {

		palindrome("RaceCar");
		palindrome("java");
	}

	public static void palindrome(String str) {

		char[] strArray = str.toLowerCase().toCharArray(); // [ r,a,c,e,c,a,r]

		String reverse = "";
		for (int i = strArray.length - 1; i >= 0; i--) {

			reverse = reverse + strArray[i]; // [racecar]
		}

		if (str.equalsIgnoreCase(reverse)) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}

	}
}
