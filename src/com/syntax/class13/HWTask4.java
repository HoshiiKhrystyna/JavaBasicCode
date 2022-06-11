package com.syntax.class13;

public class HWTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is sentence i want to reverse";
		String[] words=str.split("\\s");
		String reverse="";
		for(String r:words) {
			StringBuilder b=new StringBuilder(r);
			b.reverse();
			reverse+=b+" ";
		
		}
		System.out.print("Reverse string: "+reverse);
		
		}
	}
		
	


