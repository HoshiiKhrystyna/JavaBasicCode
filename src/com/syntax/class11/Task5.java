package com.syntax.class11;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [][] arr = {{10,15,10},
		        {20,50,20},
		        {30,30,30}
		        };
		int evenSum=0;
		int oddSum=0;
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%2==0) {
					evenSum=evenSum+arr[i][j];
				}else {
					oddSum=oddSum+arr[i][j];
				}
			}
			}
		System.out.println("Odd sum is "+oddSum);
		System.out.println(("Even sum is "+evenSum));
	}

}
