package com.syntax.class10;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//from an array of integer elements find the largest number
		
	//create an array to store char values
		//and then print those in reverse order	
	int[] numbers= {13,15,25};	
	int max=numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
			}
		System.out.println("The largest element is " + max);
		max=numbers[0];
		for(int num:numbers) {
		if(num>max) {
			max=num;
		}
		}
		System.out.println(max);
		System.out.println();
		
		System.out.println();
		char [] values= {'a', 'b', 'c','d'};
		for(int i=values.length-1; i>=0; i--) {
		System.out.print(values[i]+" ");
		}
	}

}
