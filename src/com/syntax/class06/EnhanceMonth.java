package com.syntax.class06;

import java.util.Scanner;

public class EnhanceMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please, enter your birth month");
		String month=in.next();
		String season;
	 if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May")) {
			season="Spring";
		}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season="Summer";
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			season="Autumn";
		}else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			season="Winter";			;
	}else {
		System.out.println("Invalid");
	}
		
		}
	}

