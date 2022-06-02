package com.syntax.class07;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
x=x+1;
x+=1;
System.out.println(x);
		x++; //increments value of a variable by 1
		System.out.println(x);
		x--;//decrements value of variable by 1
		System.out.println(x);
		//increment and decrement operators work only with variable
		
		int num=100;
		num++;
		System.out.println(num);
		System.out.println("-------------------------");
		int time=1;{
		System.out.println("Morning");
		}
		System.out.println("------------------------------");
		/*
		 * 
		 */
		
		
		while(time<12) {
			System.out.println("Good Morning");//1,2,3,4,5,6,7,8,9,10,11
			time++;//11+1=12; 11 times, but when12 it stop;
		}
		
		System.out.println("Hello");
	}

}
