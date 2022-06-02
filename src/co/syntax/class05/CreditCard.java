package co.syntax.class05;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);

System.out.println("Do you have credit card?");
String card=in.next();
if (card.equalsIgnoreCase("no")) {
System.out.println("We will offer you a credit card");
}else {
	System.out.println("What is the balance on the card");
}
int balance=in.nextInt();
  if (balance>=1000) {
	  System.out.println("Pay off immediately");
  }else {
	  System.out.println("You can spend more");
  }
  }
	}


