package com.noorteck.java.IQ;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q3 {
	// Write a java program to find duplicate characters

	// "teether" --> t, e
	public static void main(String[] args) {
		duplicate("teether");
		duplicate("aaabbcdeeefggggggghhh");
	}

	public static void duplicate(String str) {

		// convert string to char array using toCharArray() from the string class

		char[] strArray = str.toCharArray();// [t,e,e,t,h,e,r]

		// LinkedHashMap map object because it maintains insertion order and we have
		// key, value pair

		LinkedHashMap<Character, Integer> strMap = new LinkedHashMap<>(); // []

		// I will loop through array and put values into my Map object

		for (Character c : strArray) {
			if (strMap.containsKey(c)) {
				// if it contains the key , then increment the value by 1
				strMap.put(c, strMap.get(c) + 1);// [t=1,e=2], [t=2, e=2],[t=2,e=3,h=1]

			} else {
				// if it does not contain the KEY , add key and assign value to 1
				strMap.put(c, 1); // [t=1],[t=1,e=1] [t=2,e=2,h=1], [t=2,e=3,h=1, r=1]

			}
		}

		// i have to loop through entry set to get keys individually and also values

		for (Map.Entry<Character, Integer> entry : strMap.entrySet()) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			if (value >= 2) {
				System.out.println("Duplicate character: " + key + " occured " + value);
			}

		}

	}

}
