package com.syntax.class09;

public class AnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruits= {"mango","apple", "kiwi", "pear","watermelon","melon"};
		System.out.println(fruits[2]);
	//	fruits[4]="peach";//error :index out of bounds
		
		System.out.println("My favorite fruit is "+fruits[0]);
		
		//I want to find a size of an array/how many elements?
		int size=fruits.length;
		System.out.println(size);
		
		
		//Second task
		String[] words= {"Java", "Saturday","day","coding"};
		System.out.println(words[1]+" is "+words[0]+" "+words[3]+" "+words[2]);
		//First task
		char[] grades={'A','B','C','D','E','F' };
		System.out.println(grades[1]);
		
		char[]grades1=new char[6];
		grades1[0]='A';
		grades1[1]='B';
		grades1[2]='C';
		grades1[3]='D';
		grades1[4]='E';
		grades1[5]='F';
		System.out.println(grades1[1]);
		
		for(int i=0;i<grades1.length; i++  ) {
			System.out.print(grades1[i]+" ");
		}
	}

}
