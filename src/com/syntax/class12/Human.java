package com.syntax.class12;

public class Human {
String name;
int age;
double weight;
char gender;
//methods//functions/behaviours
void walk() {
	System.out.println("I can walk");
}
public static void main(String[] args) {
	// TODO Auto-generated method stub

	Human sameer=new Human();
	sameer.name="Naughty Sameer";
	sameer.age=20;
	sameer.weight=98;
	sameer.gender='m';
	sameer.walk();
	
	
}	

}
