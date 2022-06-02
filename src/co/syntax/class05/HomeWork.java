package co.syntax.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
	System.out.println("What is the amount of loan user needed?");	
		int loan=in.nextInt();
		
		if (loan<=200000 || loan==200000) {
			System.out.println("You would lend the money");
		}else {
			System.out.println("You would reject the client");
		}
		System.out.println("-----------------------");
		
		System.out.println("Enter numbers of worked years and annual salary");
		int years=in.nextInt();
		
		if (years>=5 || years==5) {
			System.out.println("User eligible for the bonus");
			System.out.println("Enter annula selery");
			int salary=in.nextInt();
if (salary>=50000) {
			System.out.println("And user bonus=5000");
		}else if (salary<=50000 ) {
			System.out.println("User bonus=3000");
		}
		}else {
			System.out.println("He is not eligible for the bonus");
		
	}
}
}
