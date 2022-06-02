package com.syntax.class08;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I need to print numbers from 1 to 90
		
		for(int i=1; i<=90; i++) {
			System.out.print(i+" ");
		}
		System.out.println("---------------------");
		for(int a=60; a>=10; a--) {
			System.out.print(a+" ");
		}
		System.out.println("--------------------");
// what is the output?
		
		for(int i=5; i<=40; i+=5) {
			System.out.print(i+" ");
		}
		System.out.println("---------------------------");
		
		for(int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		System.out.println("---------------------------");
		for(int a=100; a>=1; a--) {
			System.out.print(a+" ");
		}
		System.out.println("------------------------------");
		
		for(int a=20; a>=1; a-=2) {
			System.out.print(a+" ");
		}
		System.out.println("----------------------------");
		
		for (int a=20; a<=50; a+=1) {
			System.out.print(a+" ");
		}
		System.out.println("--------------------------");
		
		for(int a=20;a>=1; a--) {
			if(a%2!=0) {
				System.out.print(a+" ");
			}
		}
			
		System.out.println("---------------------------------------");
		for(int a=20; a>=50; a++) {
			
			if(a%2!=0) {
				System.out.print(a+" ");
			}
			
		}
		
	}
}

