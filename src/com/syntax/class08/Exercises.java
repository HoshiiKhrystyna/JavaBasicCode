package com.syntax.class08;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.out.println("Hello\nAlexandra Abramov");	
	
	int a=74;
	int b=36;
	System.out.println(a+b);
	
	int i=50;
	int j=3;
	System.out.println(i/j);
	
	System.out.println(-5+8*6);
	System.out.println((55+9)%9);
	System.out.println(20+-3*5/8);
	System.out.println(5+15/3*2-8%3);
	
	int f=25;
	int c=5;
	System.out.println(f+"*"+c+"="+f*c);
	
	Scanner in=new Scanner(System.in);
	System.out.println("Input a number");
	int z=in.nextInt();
	for(int x=0; x<10; x++) {
		System.out.println(z+"*"+(x+1)+"="+(z*(x+1)));
	}
	
	System.out.println((54+34+23)/3);
	
	}

}
