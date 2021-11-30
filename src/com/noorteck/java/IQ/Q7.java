package com.noorteck.java.IQ;

public class Q7 {
	// Remove all spaces inside a string
	
	public static void main(String[] args) {
		removeSpaces("Java    Program     ");
	}
	
	public static void removeSpaces(String str) {
		char [] strArray= str.toCharArray();
		
		String nStr= "";
		
		for(int i=0; i<strArray.length;i++) {
			if(strArray[i]!=' ') {
				nStr= nStr+ strArray[i];
			}
		}
		
		System.out.println(nStr);
	}

}
