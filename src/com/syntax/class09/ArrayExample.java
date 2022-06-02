package com.syntax.class09;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//I want to store prices in array
		
		double[] price=new double[4];
		price[0]=1.99;
		price[1]=2.99;
		price[2]=3.99;
		
		System.out.println(price[1]);
		
		int [] numbers=new int[3];
		numbers[0]=10;
		numbers[1]=11;
		numbers[2]=12;
		//numbers[3]=13; during run time error;
		System.out.println(numbers[2]);
		// arrays are fixed in size
		//during runtime JAVA cannot increase or decrease a size of an array
		
	}

}
