package com.noorteck.java.IQ;

public class Q9 {

	
	public static void main(String[] args) {
		reverseSentece("Who ate my candy");
	}
	public static void reverseSentece(String str) {
		
		// convert string to array by using split()
											//	0	1		2	3
		String [] strArray = str.split(" "); // [Who, ate, my,candy]
		
		String nStr ="";
		for(int i = strArray.length-1; i>=0; i--) {
			nStr = nStr+ " "+ strArray[i];
			
		}
		
		System.out.println(nStr);

	}
}
