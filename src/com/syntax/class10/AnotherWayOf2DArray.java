package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create 2D array of states
		//1 array->NY-->all cities of NY state
		//2 array-->CA-->all cities of CA state
		//3 array -->Florida-->
		//4 array--> VA-->
String[][]usa= {{"New York","Albany","Buffalo"},
		{"Los Angeles","San Francisco","San Jose","San Diego","Redding"},
		{"Miami","Orlando","Niceville","Tampa"},
		{"McLean","Riccmomd","Leesburg"}};
		
		System.out.println(usa[0][1]);
		System.out.println(usa[2][0]);
		System.out.println(usa.length);//4
		
		//I want to see how many elements inside my 1 array
		int num1array=usa[0].length;
		System.out.println(num1array);
		int num2array=usa[1].length;
		System.out.println(num2array);
	}

}
