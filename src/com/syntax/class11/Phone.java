package com.syntax.class11;

public class Phone {

	String name;
	String brand;
	String color;
	int year;
	int storage;
	double price;
	
	void functions () {
		System.out.println("You can contact any country in the world");
	}
	void camera() {
		System.out.println("Make life colorfull and save your real life on phone memory");
	}
	void SMS() {
		System.out.println("Send text messages");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone iphone=new Phone();
		iphone.name="13 pro max";
		iphone.brand="iphone";
		iphone.color="gold";
		iphone.year=2021;
		iphone.storage=256;
		iphone.price=1250;
		iphone.functions();
		
		
		
		Phone samsung=new Phone();
		samsung.name="Galaxy s21 FE 6";
		samsung.brand="samsung";
		samsung.color="gray";
		samsung.year=2021;
		samsung.storage=128;
		samsung.price=500;
		samsung.camera();
		
		
		Phone nokia=new Phone();
		nokia.name="Nokia XR 20";
		nokia.brand="Nokia";
		nokia.color="granite";
		nokia.year=2021;
		nokia.storage=128;
		nokia.price=500;
		nokia.SMS();
	}

}
