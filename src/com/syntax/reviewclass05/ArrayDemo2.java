package com.syntax.reviewclass05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] names=new String[5];
names[0]="Khrystyna";
names[1]="Pavlo";
names[2]="Sasha2";
names[3]="Svitlans";
names[4]="Elisa";

Scanner scanner=new Scanner(System.in);
names[0]=scanner.next();
names[1]=scanner.next();
names[2]=scanner.next();
names[3]=scanner.next();
names[4]=scanner.next();
for (int i=0; i<=4; i++) {
	names[i]=scanner.next();	
}
System.out.println(Arrays.toString(names));





		
		
		
		
		
	}

}
