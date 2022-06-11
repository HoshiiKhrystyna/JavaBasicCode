package com.syntax.class13;

public class HWTask1 {

	public static void main(String[] args) {
		System.out.println("----Task1-----");
String str="Everything is good";
System.out.println(str.replace(" ", ""));
	
System.out.println();	
System.out.println("------Task2-----");

String str1="ADFjglfm12347&^!?*";
System.out.println(str1.length());
	
System.out.println();
System.out.println("----Taks3----");
String a="Is it saturday? Is it raining? Do we have a Java Class today?";
int count=a.split("[?]").length;
System.out.println("In this String are: "+count+" sentences.");

		
		
		
		
	}

}
