package com.syntax.class14;

public class HWTask3 {
	void hello(String country) {
		if (country.equalsIgnoreCase("USA")) {
			System.out.println("Hello");
		}else if (country.equalsIgnoreCase("Ukraine")) {
			System.out.println("Привіт");
		}else if (country.equalsIgnoreCase("Spain")) {
		System.out.println("Hola");
		}else {
			System.out.println("Unknown");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HWTask3 hw=new HWTask3();
hw.hello("Ukraine");
	}

}
