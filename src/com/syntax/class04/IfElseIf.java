package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * declare 2 numbers and verify which one is the largest
		 */
int num1=20;
int num2=20;
if(num1>num2) {
	System.out.println(num1+" is the large than "+num2);
	
}else if (num2>num1) {
	System.out.println(num2+ " is the large than "+num1);
}else {
	System.out.println(num1+" is equal to "+num2);
}
System.out.println("-------------------------");

int day=7;
if(day==1) {
	System.out.println("MOnday");
}else if (day==2) {
	System.out.println("Tuesday");
}else if (day==3) {
	System.out.println("Wednesday");
}else if (day==4) {
	System.out.println("Thursday");
}else if (day==5) {
	System.out.println("Friday");
}else if (day==6) {
	System.out.println("Saturday");
}else if (day==7) {
	System.out.println("Sunday");
}
System.out.println("------------------------");


int month=31;
if (month==31) {
	System.out.println("May");
} else if (month==30) {
	System.out.println("April");
}else if(month==29) {
	System.out.println("February");
}else {
	System.out.println("It's not a month");
}
System.out.println("------------------------");

int monthh=5;
if (monthh==1) {
	System.out.println("January");
}else if (monthh==2) {
	System.out.println("February");
}else if (monthh==3) {
	System.out.println("March");
}else if (monthh==4) {
	System.out.println("April");
}else if (monthh==5) {
	System.out.println("May");
}else if (month==6) {
	System.out.println("June");
}else if (monthh==7) {
	System.out.println("July");
}else if (month==8) {
	System.out.println("August");
}else if (monthh==9) {
	System.out.println("September");
}else if (monthh==10) {
	System.out.println("October");
}else if (monthh==11) {
	System.out.println("November");
}else if (monthh==12) {
	System.out.println("Desember");
}else {
	System.out.println("It's not a month");
}

	}

}
