package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//>, <, >=, <=, ==,!=
		int num1=20;
		int num2=22;
		System.out.println(num1>num2);//false
		
		System.out.println(num1<num2);//true
		System.out.println(num1!=num2);//true
		System.out.println(num1==num2);//false
		System.out.println(num1=num2);//22
		System.out.println(num1==num2);//true); because num1=22 now;
				
		boolean result=100>200;
		System.out.println(result); //false
		int result1=100+200;
		System.out.println(result1);//300
		String result2 ="Emre" +10;
		int num3=10;
		int num4=11;
		
		result=num3==num4;//if num3 equals to num4(=)
		System.out.println(result);//false
		result=num3!=num4;//if num3 not equal to num4 (!=)
		System.out.println(result);//true
		
		
		
		
	}

}
