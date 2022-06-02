package com.syntax.class06;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quiz=100;
		int midTerm=80;
		int finalScore=120;
		int averageScore;
		averageScore=((quiz+midTerm+finalScore)/3);
		char grade;
		if (averageScore>=90) {
			grade='A';
		}else if(averageScore>=70 && averageScore<90) {
			grade='B';
		}else if (averageScore>=50 && averageScore<70) {
			grade='C';
		}else  {
			grade='F';
	}
		System.out.println("You are a "+grade+" student");
		if (grade=='A' || grade=='B') {
			System.out.println("You are doing well");
		}else {
			System.out.println("Please, try to study more");
		}
	}
}
