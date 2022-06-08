package com.syntax.class13;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Batch 13 is great but i say this to every batch";
		int len=str.length();
		System.out.println(str.toUpperCase());
		str=str.toUpperCase();
		System.out.println(str);
		System.out.println(str.isEmpty());
		
		String str2=" Tara       ";
		System.out.println(str2.trim());//remove spaces"";
		str="Batch is great but i say to every batch";
		System.out.println(str.contains("batch"));
		System.out.println(str.startsWith("Batch"));
		System.out.println(str.endsWith("ch"));
	}

}
