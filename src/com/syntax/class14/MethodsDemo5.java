package com.syntax.class14;

public class MethodsDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo5 md=new MethodsDemo5();
		System.out.println(md.sumNumbers(10,10));
		md.printManyTimes("Java", 3);
}
	//write a method that takes a String and an int and printout
	// that String on the console
int sumNumbers(int num1, int num2) {
	return num1+num2;
}

void printManyTimes(String str, int times) {
for(int i=0; i<times; i++) {
	System.out.println(str);
}

}
}


	
	



