package com.syntax.class08;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * declare a secret number;
 * you want to ask user to guess your secret number
 * you code should keep asking to guess until user gets your secret number
 * 
 * 
 * once user gets the secret number -> you got it!
 * 
 */
		Scanner in=new Scanner(System.in);
		int secretNum=25;
		int guessedNum;
		
		do {
		System.out.println("Guess my secret number");
			guessedNum=in.nextInt();
		}while(guessedNum!=secretNum);
		
		System.out.println("You got it");
		
		
		}
		
		
	}


