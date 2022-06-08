package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		//Using Scanner create an array of integer values.
		//After the array is created, calculate the sum of all stored
		//elements in that array.
		
		
Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int  arraySize =scanner.nextInt();
	System.out.println(" The size of the array "+arraySize);
	System.out.println("Please, enter "+arraySize +" elements ");
	int []integerArray=new int[arraySize];
	// we can't use enhanced for loop for inserting or updating the vales of an array;
	for(int i=0; i<integerArray.length;i++  ) {
		integerArray[i]=scanner.nextInt();
		}
	System.out.println(Arrays.toString(integerArray));	
	int sum=0;
		for(int element:integerArray) {
			sum+=element;
		}
		System.out.println("The sum of all he elements is "+sum);
		scanner.close();
	}

}
