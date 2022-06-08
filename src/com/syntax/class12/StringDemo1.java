package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name=new String("Khrystyna");//proper way of
//creating an object from a class
		
	String name2="Khrystyna";// its same as String name=new String("Khrystyna");	
	//all the classes in java can be created as data types;	
	//if a class is present inside the same package or if
	// a class belong to java.lan package
		name.length();
		System.out.println(name.length());
		
		name2="Zameer";
		System.out.println(name2.length());
		String name3="SASHA";
		System.out.println(name3.toLowerCase());
		name3="I love Java";
		System.out.println(name3.toUpperCase());
	}

}
