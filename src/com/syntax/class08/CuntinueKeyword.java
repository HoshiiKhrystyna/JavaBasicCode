package com.syntax.class08;

import java.util.Scanner;

public class CuntinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue -- skips current execution/iteration
		//when java executes continue->
		//go back to the beginning of the loop
		//so rest of the code inside loop body
		//wiil be skipped/ignored
for (int i=1; i<=5; i++) {
	if (i==2) {
		continue;
	}
	System.out.print(i + " ");
	System.out.println("hello");
	System.out.println("We are going on break soon");
}



//print number from 1 to 10 except number 5 and 7;
for(int i=1; i<=10; i++) {
	if (i==5 || i==7) {
		continue;
	}
	System.out.print(i+" ");
}


for(int a=1; a<=50; a++) {
	if (a%3==0) {
		continue;
	}
System.out.print(a+" ");
	}
	
System.out.println("-------------------------");

Scanner scan = new Scanner(System.in);
String card;
do {
	System.out.println("Did you apply for a credit card. Please enter yes or no");
	card = scan.next();
} while (!card.equalsIgnoreCase("yes"));
	System.out.println("Thank you for applying for a credit card");
	scan.close();

	}
}
