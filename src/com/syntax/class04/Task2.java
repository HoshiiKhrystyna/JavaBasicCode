package com.syntax.class04;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner numbers=new Scanner(System.in);

System.out.println("Please, enter number 1 ");
int num1=numbers.nextInt();
System.out.println(num1 +" please enter number 2");
int num2=numbers.nextInt();
System.out.println(" I have two numbers " + num1+" and " +num2 +". Please, enter which one is the largest ");

if (num2>num1) {
	System.out.println(num2 +" is largest ");
}else {
	System.out.println("Wrong answer");
}



	}

}
