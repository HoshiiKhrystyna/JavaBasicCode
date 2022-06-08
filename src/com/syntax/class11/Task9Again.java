package com.syntax.class11;

public class Task9Again {

	public static void main(String[] args) {
		// to find the second largest
		int[]arr= {10,20,50,5,8};
		int maxNumber=arr[0];
		int secondLargest=arr[0];
		for(int num:arr) {
			if(num>maxNumber) {
				secondLargest=maxNumber;
				maxNumber=num;
				
			}
			if(num>secondLargest && secondLargest<maxNumber && num<maxNumber) {
				secondLargest=num;
			}
		}
		System.out.println(maxNumber);
		System.out.println(secondLargest);
	}

}
