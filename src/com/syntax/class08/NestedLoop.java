package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1; i<=3; i++) {//outer loop
	System.out.println("Hello");
	for( int y=1;y<=2;y++) {//nested loop
		System.out.println("Bye");
	}
}
		System.out.println("-----------------");
		
		for (int i=1; i<=3; i++) {
			System.out.println(i);
			for(int y =1; y<=2; y++) {
				System.out.println(y);
			}
		}
		System.out.println("-----------------------");
		for (int i=1; i<=3; i++) {
			System.out.println("Hello");
			for (int y=1; y>=2; y++) {
				System.out.println("bye");
				
			}
		}
		
		for (int i=1; i>3; i--) {//false it is mean nothing in console
			System.out.println("hello");
			for(int y=1;y<2; y++) {//inner loop
				System.out.println("bye");
			}
		}
		System.out.println("-----------------------------------------");
		
		
	}

}
