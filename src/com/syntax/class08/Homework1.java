package com.syntax.class08;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("Please enter start number");
		int start=in.nextInt();
		System.out.println("Please enter end number");
		int end=in.nextInt();
		int even=0, odd=0;
		for(int i=start; i<=end;i++) {
			if(i%2==0)
				even+=i;}
				System.out.println("Sum of even numbers "+even);
		for(int i=start; i<=end; i++) {
			if(i%2!=0) 
				odd+=i;}
		System.out.println("Sum of odd numbers "+odd);
				
		}	
				
		}
		



