package com.syntax.class06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		char operator;
		int num1, num2, result=0;
		System.out.println("Please, enter first number");
		num1=in.nextInt(); 
		System.out.println("Please enter operator");
		operator=in.next().charAt(0);
		System.out.println("Please,enter second number");
		num2=in.nextInt();
		if(operator=='+') {
			result=num1+num2;
		}else if (operator=='-') {
			result=num1-num2;
		}else if (operator=='*') {
			result=(num1*num2);
		}else if(operator=='/') {
			result=num1/num2;
		}
		System.out.println("If your use "+operator+" your get the result "+ result);
	
		System.out.println("----------------------------------------");
	
	switch (operator){
	case '+':
		result=num1+num2;
		break;
	case'-':
		result=num1-num2;
		break;
	case'*':
		result=num1*num2;
		break;
	case'/':
		result=num1/num2;
		break;
		}
	System.out.println("If your use "+operator+" you get the result "+ result);
}
}
