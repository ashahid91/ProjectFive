package com.noorteck.java.IQ;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q2 {
// Write a java program to find the first non-repeated character in a String?
	public static void main(String[] args) {
		nonRepeated("teether"); // treeMap [ttheree
	}

	public static void nonRepeated(String str) {
		// convert  string into array using toCharArray() from string class

		char[] strArray = str.toCharArray(); // [t,e,e,t,h,e,r]

		// create an object of LinkedHashMap
		LinkedHashMap<Character, Integer> strMap = new LinkedHashMap<>(); // 
		

		// we will iterate or traverse through array and store values inside map object
		for (Character c : strArray) {								//	[t=1][t=1,e=1][t=1,e=2][t=2,e=2][t=2,e=2,h=1][ [t=2, e=3,h=1]
																	// [t=2, e=3,h=1,r=1 ]

			// if our map contains key then increment value by 1
			if (strMap.containsKey(c)) {
				strMap.put(c, strMap.get(c) + 1);
				// if map does not contain key put
			} else {
				strMap.put(c, 1);
			}

		}
		// I will loop through my entryset which is combination of keys and values
		for (Map.Entry<Character, Integer> entry : strMap.entrySet()) {
			Character key = entry.getKey(); // [t,e,h,r
			Integer value = entry.getValue();// [2,3,1,1]
			
			if (value==1) {
				System.out.println("First non repeater character: " + key + " it occured " + value);
				break;
			}

		}

	}

}
