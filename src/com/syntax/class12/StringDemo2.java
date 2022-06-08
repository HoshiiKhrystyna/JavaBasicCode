package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String firstName="Adam";
String lastName=" Jones";
String fullName=firstName+lastName;//always prefer this
String fullName2=firstName.concat(lastName);//never use this
//because it can lead to nullpointer expection;
System.out.println(fullName2);
System.out.println(fullName);

String name="";
System.out.println(name.isEmpty());

String str=" never ";
System.out.println(str.trim());

	}

}
