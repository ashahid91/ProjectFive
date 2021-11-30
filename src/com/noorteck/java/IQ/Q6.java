package com.noorteck.java.IQ;

public class Q6 {
// Write a program to count total number of words in given string
	
	
	
	public static void main(String[] args) {
		countWords("I Love Java" );
		countWords("I do not want to go to work tomorrow");
	}
	
	public static void countWords(String str) {
		// we have to split string by spaces to store in String Array
		
		String [] strArray = str.split(" ");
		
		int count =0;
		
		for(int i =0; i<strArray.length;i++) {
			count++;
		}
		System.out.println("Number of words in String:" +count);
		
		
		
		
		
	}
}
