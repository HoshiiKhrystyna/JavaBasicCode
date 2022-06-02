package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i=100;
		double d=100;//widening
		System.out.println(i);//100
		System.out.println(d);//100.0
		//casting in Java is converting 1 tipe into another
		
		/* 
		 * widening /implicit/automatic
		 * byte->short->char->int->long->float->double;
		 * narrowing /explicit/manually
		 * double->float->long->int->char->short->byte;
		 */
	long l=10000;
System.out.println(l);
int x=(int)99.99;//narrowing
System.out.println(x);//99
byte b=(byte)130;//narrowing
System.out.println(b);//-126

float f=(float)10.99;
double dd=9.99;
System.out.println(f);

double price=100; //widening
System.out.println(price);








	
	
	
	
		
		

	}

}
