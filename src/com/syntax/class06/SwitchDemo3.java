package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * lets ask the user where is he from
 * based on the country we will define favourite food
 */
	Scanner in=new Scanner(System.in);	
		String country, favoriteFood;
		System.out.println("Please tell me where are you from");
		country=in.nextLine();
		
		switch(country) {
		case "Mexico":
			favoriteFood="tacos";
			break;
		case"Canada":
			favoriteFood="poutine";
			break;
		case"Turkey":
		favoriteFood="lahmacun";
		break;
		case"Pakistan":
			favoriteFood="pati chai";
			break;
		case"Egypt":
			favoriteFood="koshary";
			break;
		case "USA":
			favoriteFood="burgers";
			break;
			default:
				favoriteFood="unknown";
				
		}
		System.out.println("You are from "+ country+" and your favorite food is "+favoriteFood);
	
		
		
		char operator;
		int num1, num2, result = 0;
		System.out.println("Please, enter two numbers");
		num1=in.nextInt(); 
		num2=in.nextInt();
		System.out.println("Please enter operator");
		operator=in.next().charAt(0);
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
			default:
				System.out.println("Invalid");
				
		}
		System.out.println("If your use"+operator+" your get the result "+ result);
	}

}
