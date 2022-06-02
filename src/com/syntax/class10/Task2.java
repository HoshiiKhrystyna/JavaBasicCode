package com.syntax.class10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	System.out.println("Enter the numbers of elements in array");
		int num=in.nextInt();
		String [] countries=new String[num];
			
			System.out.println("Enter the name of the countries");
			String capital="null";
			in.nextLine();
			for(int i=0; i<num;i++) {
				countries[i]=in.nextLine();
				
			
				switch (countries[i]) {
				case "Ukraine":
					capital="Kyiv";
					break;
				case "Poland":
					capital="Warszawa";
					break;
				case "USA":
					capital="Washington";
					break;
					default:
						capital ="Unknown";
				}
				System.out.println(countries[i]+":"+capital);
			
	}
}
		
}
	


