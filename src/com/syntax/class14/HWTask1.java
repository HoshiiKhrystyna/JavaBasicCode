package com.syntax.class14;

public class HWTask1 {
	//Task1
	
	int largestNumber(int num1, int num2) {
		if(num1>num2) {
		return num1;
		}else {
			return num2;
		}
	}
     //Task2        
	String number(int num) {
		if(num%2==0) {
			return "even";
	}else {
	return "odd";
	}
		}
	public static void main(String[] args) {
		
		HWTask1 hw=new HWTask1();
System.out.println("The largest number is "+hw.largestNumber(10,11));
	
System.out.println("This number is "+ hw.number(15));

		}}
