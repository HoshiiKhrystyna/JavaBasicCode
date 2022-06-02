package com.syntax.class04;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean biggestNumber=true;
		int a,b,c;
		a=10;
		b=5;
		c=4;
		
		if (biggestNumber) {
			
		System.out.println("Congraduation, it's a biggest number");
		
		if (a>b){
		
		System.out.println("It's a biggest number");

				}else if (a<b) {
					System.out.println("Find another number");
					if (a>c) {
						System.out.println("It's a biggest number");
					}else if (a<c) {
						System.out.println("Find again another number");
					}
					}
		}else {
			System.out.println("It's a mistake");
		}
	}
		
}
	


