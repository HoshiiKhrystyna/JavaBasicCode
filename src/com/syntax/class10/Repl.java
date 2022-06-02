package com.syntax.class10;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] day=new String[7];
	    Scanner input=new Scanner(System.in);
	    for(int i=0; i<7; i++){
	      System.out.println("Please enter day "+(i+1)+" of the week");
	      day[i]=input.next();
	    }
	    for(int i=0; i<day.length; i++){
	      System.out.println(day[i]);
	    }
	    
	    
	    
	    //Create an array of integers that will store 5 elements taken from a user

	    //Don't print any prompt message for the user

	   // Then print out all the elements you have created in the first loop in reverse order.
	    int [] numbers=new int[5];
	    Scanner in=new Scanner (System.in);
	    for(int i=0; i<5; i++){
	    numbers[i]=in.nextInt();
	    }
	   for (int i=5-1; i>=0; i-- ){
	     System.out.println(numbers[i]);
	   }
	     
	     
	     
	     
	     
	   

	}
}