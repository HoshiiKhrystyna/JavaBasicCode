package com.syntax.class06;

import java.util.Scanner;

public class HW6Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
String country, language;
System.out.println("Please enter your country");
country=in.nextLine();
switch (country) {
case "Ukraine":
	language="ukrainian";
	break;
case "USA":
	language="english";
	break;
case "Poland":
	language="polish";
	break;
case "Mexico":
	language="spanish";
	break;
case "Italy":
	language="italian";
	default:
		language="unknown";
}

System.out.println("Your country is "+country+" and your language is "+language);

System.out.println("-------------------------------------------------------");

char grade;
 String explanation;
System.out.println("Enter your grade");
 grade=in.next().charAt(0);
 switch (grade) {
 case 'A':
	 explanation="excelent";
	 break;
 case 'B':
	 explanation="good";
	 break;
 case 'C':
	 explanation="average";
	 break;
 case 'D':
	 explanation="bad";
	 break;
	 default:
		 explanation="Not acceptable";
 }
 
System.out.println(grade+" was entered by a user with explanation "+explanation);

System.out.println("------------------------------------------------");





















	}

}
