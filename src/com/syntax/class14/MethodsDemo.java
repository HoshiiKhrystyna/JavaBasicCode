package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo {

	//Method is a block of code a group of java statements
	//that are grouped together and
	//we can execute those statements buy just creating an object
	//of the class that contains that methods and by writing
	//the object name.method name
		// TODO Auto-generated method stub
void printHello() {
	System.out.println("How are you guys");
}
boolean returnTrue() {
	return true;
}
int returnInt() {
	return 10;
}
	public static void main(String[] args) {
	MethodsDemo md=new MethodsDemo();	
		md.printHello();
		boolean xs=md.returnTrue();
		int num=md.returnInt();
		System.out.println(num);//10
		System.out.println(md.returnInt());//10
	Scanner scanner=new Scanner(System.in);	
		scanner.next();
		
		
	}

}
