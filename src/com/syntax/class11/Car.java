package com.syntax.class11;

public class Car {

	String model;
	String color;
	String make;
	int year;
	String typeOfEngine;
	int NoOfDoors;
	int HP;
void moveForward() {
	System.out.println("Car is mowing forward");
}
	void reverse() {
		System.out.println("Mowing backward");
	}
	public static void main(String[] args) {
	Car BMW=new Car();
	BMW.model="X6";
	BMW.make="BMW";
	BMW.color="Black";
	BMW.year=2022;
	BMW.typeOfEngine="V8";
	BMW.HP=500;
	System.out.println(BMW.model);
	BMW.moveForward();
	BMW.reverse();
	
	
	Car lexus=new Car();
	lexus.make="Lexus";
	lexus.model="LFA";
	lexus.color="white";
	lexus.moveForward();
	
}
}