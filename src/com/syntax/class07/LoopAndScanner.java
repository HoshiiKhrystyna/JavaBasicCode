package com.syntax.class07;

import java.util.Scanner;

public class LoopAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String job;
do {
System.out.println("Did you get a job");
job=scan.next();
}while(!job.equalsIgnoreCase("yes"));
System.out.println("Congradiation");
System.out.println("--------------");



Scanner input=new Scanner(System.in);
String offer;
System.out.println("Did you get a job");
offer=input.next();

while(!offer.equalsIgnoreCase("yes")) {
	System.out.println("Did you get a job");
	offer=input.next();
}
System.out.println("Congradiation");
	}

}
