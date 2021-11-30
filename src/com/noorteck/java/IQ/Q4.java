package com.noorteck.java.IQ;

import java.util.LinkedHashMap;

public class Q4 {
// Write a program to find the occurance of each character in String
	// "Character" --> C=1, h1, a2, r2, c1,t1,e1,
	
	public static void main(String[] args) {
		occurance("Character");
	}
	
	public static void occurance(String str) {
		
		// convert my string into array object using toCharArray() from string class
		// character
		char []  strArray = str.toLowerCase().toCharArray(); // [C,h,a,r,a,c,t,e,r]
		
		// I have to create LinkedHashMap object 
		
		LinkedHashMap<Character, Integer> strMap = new LinkedHashMap<>(); // []
		
		// to store array elements into my map object i will use for loop and put method from Map interface
		
		for (Character c : strArray) {
			if(strMap.containsKey(c)) {
				strMap.put(c, strMap.get(c)+1); // [C=1, h=1, a=2, r=1], [C=1, h=1, a=2, r=2, c=1, t=1, e=1]
			} else {
				strMap.put(c, 1); // [C=1], [C=1, h=1][C=1, h=1, a=1], [C=1, h=1, a=1, r=1], [C=1, h=1, a=2, r=1, c=1], [C=1, h=1, a=2, r=1, c=1]
									// [C=1, h=1, a=2, r=1, c=1, t=1], [C=1, h=1, a=2, r=1, c=1, t=1, e=1]
			}
		}
		// [C=1, h=1, a=2, r=2, c=1, t=1, e=1]
		
		System.out.println(strMap);
		
		
	}
	
}





















