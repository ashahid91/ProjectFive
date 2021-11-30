package com.noorteck.java.IQ;

public class Q8 {
	
	
	public static void main(String[] args) {
		renoveCharacter("teether", 'e');
		
	}
	
	public static void renoveCharacter(String str, char character) {
		char [] strArray = str.toCharArray(); // [t,e,e,t,h,e,r]
		
		String nStr= "";
		
		for (int i=0; i<strArray.length; i++) {
			if(strArray[i]!=character) {
				nStr= nStr+strArray[i];
			}
		}
		
		System.out.println(nStr);
			
		
	}
	

}
