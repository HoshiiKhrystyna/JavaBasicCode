package com.syntax.class14;

public class MetodsDemo4 {
//write a method that takes an int value is even this method
	//returns true otherwise it returns false
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	MetodsDemo4 sd=new MetodsDemo4();
	System.out.println(sd.isEven(3));
	System.out.println(sd.checkString("Khrystyna"));
}	
boolean isEven(int number){
	
	if(number%2==0) {
		return true;
	}else {
		return false;
	}
}
//write a method that take a String and return true if number
//of characters is that String are even otherwise odd
	boolean checkString(String str) {
		if(str.length()%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
}
		
		
		
		
	


