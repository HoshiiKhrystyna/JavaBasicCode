package com.syntax.class05;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int quiz=100;
int midTerm=80;
int finalScore=120;
int averageScore;
averageScore=((quiz+midTerm+finalScore)/3);
if (averageScore>=90) {
	System.out.println("Grade=A");
}else if(averageScore>=70 && averageScore<90) {
	System.out.println("Grade=B");
}else if (averageScore>=50 && averageScore<70) {
	System.out.println("Grade=C");
}else if (averageScore<50) {
	System.out.println("Grade=F");
}
System.out.println("---------------------");

System.out.println("Please enter the city");
String city=in.next();
System.out.println("Please, enter the temperature");
int temp=in.nextInt();
int C=5*(temp-32)/9;
System.out.println("The temperature in the "+city+" is " +C);




	}

}
