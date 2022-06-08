package com.syntax.class05;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Please,enter a number");
int num=in.nextInt();
if (num>=1 && num<=10) {
	System.out.println("It is small number");
}else if(num>=11 && num<=100) {
	System.out.println("It is a medium number");
}else if (num>=101 && num<=1000) {
	System.out.println("It is a large number");
}
	}

}
