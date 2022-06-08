package com.syntax.class11;

import java.util.Scanner;

public class TAsk2 {

	public static void main(String[] args) {
		//Using Scanner create an array of countries.
		//When an array is created,retrieve all values
		//from it and while retrieving those values 
		//print capital for each country. (use 2 different loops).

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int  arraySize =scanner.nextInt();
		String []countries =new String[arraySize];
		for(int i=0; i<countries .length;i++  ) {
			countries [i]=scanner.nextLine();
			}
		for(String elements:countries ) {
			if(elements.equalsIgnoreCase("usa")) {
				System.out.println("Washington");
			}else if (elements.equalsIgnoreCase("Turkey")) {
				System.out.println("Ankara");
			}else if (elements.equalsIgnoreCase("Thailand")) {
				System.out.println("Bankok");
			}else {
				System.out.println("Country not supported by My Great Java program");
			}
		}
	}

}
