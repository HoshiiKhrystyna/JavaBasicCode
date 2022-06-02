package com.syntax.class08;

public final class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=1; i<6; i++) {
			sum+=i;
			System.out.print(sum+" ");
		}
		System.out.println("-------------------");
		int sum1=0;
		for(int a=1; a<=70; a++) {
			if(a%2==0) {
			sum1+=a;
			}
		}
		System.out.print(sum1+" ");
		System.out.println("-------------------");
		int sum2=0;
		for(int a=1; a<70; a++) {
			if(a%2!=0) {
			sum2+=a;
			}	
			}
		System.out.println(sum2+" ");
		//another way
		
		int sumEven=0;
		int sumOdd=0;
		for(int i=1; i<=70; i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		System.out.print(sumEven+" ");
		System.out.print(sumOdd+" ");
		
		
		
		
		
	}

}
