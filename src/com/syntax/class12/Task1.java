package com.syntax.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("Task1");
String name="Pavlo";
int middle=0;
if(!name.isEmpty()) {
	if (name.length()%2==1 || name.length()>=3) {
		middle=name.length()/2;
		}
System.out.println(name.charAt(middle));
}
		System.out.println("-----Task2------");	
		
		String word="Sunday";
		for(int i=word.length()-1; i>=0; i--) {
			System.out.print(word.charAt(i));
			}
		System.out.println();
		System.out.println("-----Task3-------");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Mom's first name?");
		String mom=scanner.nextLine();
		System.out.println("Dad's first name?");
		String dad=scanner.nextLine();
		System.out.println("Are you expecting boy or girl?");
		String gender=scanner.next();
		if(gender.equalsIgnoreCase("girl")) {
		System.out.println("Suggested baby name: "+mom.toUpperCase().substring(0,2)+dad.toUpperCase().substring(3,6));
		}else if (gender.equalsIgnoreCase("boy")) {
			System.out.println("Suggested baby name: "+dad.toUpperCase().substring(0,3)+mom.toUpperCase().substring(2,4));
		}else {
			System.out.println("They did'nt know the gender yet");
		}
		
		
		
	}

}
