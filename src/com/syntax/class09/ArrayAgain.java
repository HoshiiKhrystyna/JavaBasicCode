package com.syntax.class09;

public class ArrayAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words= {"Java", "Saturday","day"};
		//I want to retrieve all elements
		for (int i=0; i<words.length; i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println("-----------------------");
		//Enhanced for loop/advanced for loop/for each loop
		/*
		 * 
		 * Can be used only when we work with array or collections
		 */
		String[] colors= {"pink", "blue", "white", "black"};
		for(String color:colors) {
			System.out.print(color+" ");
		}
		
		System.out.println("----------------");
		
		int[] numbers= {10,20,30,40};
		for(int num:numbers) {
			System.out.print(num+" ");
		}
	}

}
