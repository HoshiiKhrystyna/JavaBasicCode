package com.syntax.class03;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * conditional statements
		 * 1. if statement
		 */
		/*
		 * declare a variable rate.
		 * If rate is more than 5-->I am not buying a house
		 * 
		 */
		double morgageRate=5.5;
		if (morgageRate>5) {
			System.out.println("I am not buying a house");
		}
		
		int num1=99;
		int num2=10;
		if(num1>num2){
			System.out.println(num1+" is bigger than "+num2);
		}
		/*
		 * declare temperature,
		 * if temp is higher than 75-> i wiil go a walk
		 */
int temp=78;//if i take 68 it meanse else;
if (temp>75) {
	
	System.out.println("I wii go for a walk");
}else {
	System.out.println("I am going to study Java");	
}

	char gender='m';
	if (gender=='f') {
			System.out.println("You like shopping");
	}else {
		System.out.println("You like watching sports");
	}
	
	System.out.println("------------------------");
	
	String browser="chrome";
	if (browser.equals("chrome")) {
		
		System.out.println("All test cases wil be executed on chrome");
		
		
	}else {
		System.out.println("I am not executed any test cases");
		System.out.println("Reason-wrong browser");
	}
	
	double comp1=9.99;
	double comp2=10.00;
	if (comp1>comp2) {
		
		System.out.println("Double value" +comp1+"is larger than"+ comp2);
		
	}else {
		System.out.println("Its false" +comp1+ " lower than " +comp2);
	}
	
	
	
	int temp1=50;
	if (temp1<32 ){
		
		System.out.println("Water will freeze with temperature" + temp1);
		
	}else {
		System.out.println("Water will not freeze with temperature" + temp1);
	}
	System.out.println("I am code outside of if block");
	
	
	
	}
	
	
}
