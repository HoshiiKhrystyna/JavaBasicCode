package com.syntax.class11;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array or integer type where 
		//you will store odd and even numbers.
		// Develop a program which will identify/print
		//the even numbers only.
		int [][] arr = {{10,10,10},
		        {20,20,20},
		        {30,30,30,60}
		        };
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%2==0) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}

}
