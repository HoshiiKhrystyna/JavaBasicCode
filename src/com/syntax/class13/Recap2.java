package com.syntax.class13;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Where is sameer";
System.out.println(str.charAt(3));
System.out.println(str.charAt(5));
//System.out.println(str.charAt(-2));error
System.out.println(str.indexOf("e"));
	System.out.println(str.indexOf("e",6));	//start from char 6
	System.out.println(str.indexOf("e",3));//3 ignore first three letters
	System.out.println(str.indexOf("e",2));
		
		System.out.println(str.indexOf("r",4));
		int counter=0;
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='e') {
				counter++;
				if(counter==4) {
				System.out.print(i+" ");
			}
			}
		}
	}

}
