package com.syntax.class10;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to creat 2d array we specify number of rows and coloms;
		int[][] numbers=new int[3][4];
		//1row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		//2 row
		numbers[1][0]=1;
		numbers[1][1]=2;
		numbers[1][2]=3;
		numbers[1][3]=4;
		//row3
		numbers[2][0]=9;
		numbers[2][1]=8;
		numbers[2][2]=7;
		numbers[2][3]=6;
		
		System.out.println(numbers[1][3]);//4
		System.out.println(numbers[0][1]);//20]);
		
		int rows=numbers.length;//gives numbers of 1D arrays
		System.out.println("Numbers of row = "+rows);
		
		int colomsOf1row=numbers[0].length;
		System.out.println("Numbers of cols in row =" +colomsOf1row);
		System.out.println();
		
		
		
	}

}
