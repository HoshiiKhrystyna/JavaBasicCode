package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array of integer values. Print the sum of all numbers.
		int [][] arr = {{10,10,10},
				        {20,20,20},
				        {30,30,30,60}
				        };
		//System.out.println(arr[0][1]);
		//System.out.println(arr[0][2]);
		//System.out.println(arr[2][3]);
		int sum=0;
		for(int j=0; j<3; j++) {
		
			for (int i=0; i<3; i++) {
			sum=sum+arr[j][i];
		}
		}
		System.out.println(sum);
	}

}
