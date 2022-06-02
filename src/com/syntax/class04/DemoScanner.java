package com.syntax.class04;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Please your age");
int age=scanner.nextInt();

String newLine=scanner.nextLine();//or use this variant scanner.nextLine();
System.out.println("Please enter your name");
String name=scanner.next();


System.out.println(name+newLine+age);

	}

}
