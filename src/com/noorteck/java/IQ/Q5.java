package com.noorteck.java.IQ;

import java.util.LinkedHashSet;

public class Q5 {
// Write java program to remove duplicate characters
	
	//"teether" t2,e3,h1,r1 --> tehr
	
	// hret , ehrt, tehr
	
	public static void main(String[] args) {
		removeDuplicate("teether");
	}
	
	
	public static void removeDuplicate(String str) {
		
		// convert string to array object using toCharArray() from string class
		char [] strArray = str.toLowerCase().toCharArray(); // [t,e,e,t,h,e,r]
		
		// I have to create object of LinkedHashSet from java collection fram work because it does not contain dulicates and maintain insertion order
		
		LinkedHashSet<Character> strSet = new LinkedHashSet<>(); // [] 
		
		for ( Character c : strArray) {
			strSet.add(c); // [t], [t,e],[t,e,h],[t,e,h,r]
		}
		
		// create String object which is empty to append objects of LinkedHashSet
		
		String nStr="";
		
		for(Character s: strSet) {
			nStr= nStr + s;
		}
		
		System.out.println(nStr);
		
		
	}
}
