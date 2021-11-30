package com.noorteck.java.IQ;

import java.util.Arrays;

public class Q24 {
	public static void main(String[] args) {
	      String str = "sielnt";
	      System.out.println("Before Sorting:" + str);
	      int j = 0;
	      char temp = ' ';
	      char[] chars = str.toCharArray();
	      for(int i=0; i < chars.length; i++) {
	         for(j=0; j < chars.length; j++) {
	        
	            if(chars[j] > chars[i]) {
	               temp = chars[i]; // j
		        	
	               chars[i] = chars[j]; // v
		        	

	               chars[j] = temp;// j
	               
	          	 System.out.println("i:" + i + " j: "+ j);
	        	 System.out.println( "temp: "+ temp +" and i: " +chars[i] + " and j: " +  chars[j]);
	        	 System.out.println("*********************************************");
	             System.out.println(Arrays.toString(chars));
	        	 System.out.println("*********************************************");

	            }
	         }
	      }
	      System.out.println("After Sorting:");
	      for(int k=0; k < chars.length; k++) {
	         System.out.println(chars[k]);
	      }
	   }
	}

	
