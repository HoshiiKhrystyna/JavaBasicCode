package com.syntax.class14;

public class HWRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a String that will hold a sentence.
		//Write a program to get a new String
		//without any spaces.
		
	String str="Olegs building is on fire";
	System.out.println(str.replace(" ", ""));
	
	
	/*
	 * Create a String that should be combination
	 *  of letters, numbers and special characters. 
	 *  Find out how many 
	 * Alphanumeric characters are there 
	 * in the String
	 */
	String str1="dvjldfkhgdlk276823SDFGDHG"	;
	System.out.println(str1.replaceAll("[^A-Za-z0-9]", "").length());
	
	
	
	
	}

}
