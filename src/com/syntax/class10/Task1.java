package com.syntax.class10;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n;	
Scanner in=new Scanner(System.in);
System.out.print("Print the numbers you want to store");
n=in.nextInt();
int []numbers=new int[5];
System.out.println("Enter the elements of the array");
int sum=0;
for(int i=0; i<n; i++) {
	numbers[i]=in.nextInt();
	sum=sum+numbers[i];
	
}
System.out.println("Sum of all elements is "+sum);
}
}