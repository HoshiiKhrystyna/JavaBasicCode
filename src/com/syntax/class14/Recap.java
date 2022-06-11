package com.syntax.class14;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="I never forget about recording";
System.out.println(str.replace("never", "always"));
str="sdjhfsjkhv1287498rFJFHK"	;
System.out.println(str.replaceAll("[0-9]", ""));//i remove all numbers
	String str2="Batch 13 is Great. Batch 13 is exelent";	
	String [] arr=str2.split("[.]")	;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		String [] arr1=str2.split(" ");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		str ="we #love# Java";
		String [] arr2=str.split("[#]");//ignore
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		
	}

}
