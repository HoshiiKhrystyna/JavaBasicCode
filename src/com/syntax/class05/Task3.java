package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Please, input the current time");
int hour=in.nextInt();
if (hour>=1 && hour<=11) {
	System.out.println("Morning");
}else if (hour>=12 && hour<=15) {
	System.out.println("Afternoon");
}else if (hour>=16 && hour<=20) {
	System.out.println("Evening");
}else if (hour>=21 && hour<=24) {
	System.out.println("Night");
}else {
	System.out.println("Invalid time entered");
}

	}

}
