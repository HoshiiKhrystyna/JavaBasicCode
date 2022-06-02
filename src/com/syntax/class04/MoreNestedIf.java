package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * we need to check if repl was completed
 * if repl is completed we want to see
 * if you did 15 and more --> great job
 * if more than 10-->did good
 * if less than 10--> try to complete all assigments
 * 
 */
		boolean didRepl=true;
		int assigments;
		if (didRepl) {
			System.out.println("How many assigment have you done");
			assigments=17;
			
			if (assigments>15) {
				System.out.println("You did a great job");
			}else if (assigments>10) {
				System.out.println("You did a good job");
			}else {
				System.out.println("Pleas complete a repl assigments");
			}
		
			
		}else {
			System.out.println("You should complete you Repl HW");
		}
		
		
		boolean diploma=true;
		double gpaScore;
		
		if (diploma) {
			System.out.println("Congraduation");
			gpaScore=3.0;
			if (gpaScore==3.5) {
				System.out.println("You are eligible for scholarship");
			}else if (gpaScore<3.5){
				System.out.println("You should have studied harder");
			}
			
		}else {
			System.out.println("Suggest to get a degree");
			
		}
	}

}
