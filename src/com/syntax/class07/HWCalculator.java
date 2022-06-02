package com.syntax.class07;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please entre the numbers");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		System.out.println("Please entre the operators + , - , * , / ");
		char op = scan.next().charAt(0);
		double result = 0;
		String operator=null;
		switch (op) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '/':
			result = x / y;
			break;
		case '*':
			result=x*y;
			break;
			default:
				System.out.println("Invalid Operatorin");
			
		}
		if(result!=0 || operator==null) {
	System.out.println(result);
		}
		
		
		
		
	}

}
