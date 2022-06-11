package com.syntax.class14;

public class HWRecap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * You have a String a=”Is it saturday? 
 * Is it raining? Do we have a Java Class today?” 
 * How would you find 
 * out how many sentences are in that String?* 
 */
		String str ="Is it saturday? Is it raining? Do we have a Java Class today?";
		System.out.println(str.split("[?.!]").length);
		
		/*
		 * How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
		 */
		String str1="This is sentence i want to reverse";
		String[] arr=str1.split(" ");
		for(String s:arr) {
			System.out.print(new StringBuilder(s).reverse()+" ");
		}
		
	}

}
