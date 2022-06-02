package com.syntax.class06;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
	     String result=null; 
	  boolean loan=in.nextBoolean();
	    if (loan) {
	   int score=in.nextInt();
	if (score<600){
	 result="Not eligible";
	}else if (score>=600 && score<=700){
	result="Maybe eligible";
	}else if (score>=701&&score<=800){
	 result="Eligible";
	  }else {
	  result="Definitely eligible";
	  }
	    }else{
	     System.out.println("Unknown");
	}
	  
	   System.out.println("The eligibility is "+result);
	   }
	}
	   
