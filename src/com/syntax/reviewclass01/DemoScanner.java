package com.syntax.reviewclass01;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your Account Balance");
double accountBalance=scanner.nextDouble();
System.out.println("Please enter the amount tha t you want to lend to your friend");
double amountTolend=scanner.nextDouble();
if (accountBalance>=amountTolend) {
	System.out.println("Yes i can help you");
}else {
	System.out.println("Sorry i dont have enough money to help you");
}

	}

}
