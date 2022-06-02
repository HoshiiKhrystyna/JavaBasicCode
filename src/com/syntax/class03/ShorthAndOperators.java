package com.syntax.class03;

public class ShorthAndOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=100;
		num=num+100;
		System.out.println(num);//200
		num=num+50;
		System.out.println(num);//250
		num+=100;//num=num+100
		num-=10;//num=num-10
		System.out.println(num);//340
		num/=10;//34   //num/10
		num*=2;//68     //num*2
		System.out.println(num);
		num%=2;//0
		System.out.println(num);//0
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b;//a=a+b
		System.out.println(a);
		a+=b+c;//a=a+(b+c)a=30+50=80
		System.out.println(a);
		a*=10;//a=a*10; a=80*10=800
		System.out.println(a);
		
		int v=90;
		v+=500;
		
		System.out.println(v);
	v+=200;
		
		System.out.println(v);
		
		int z=900;
		z-=60;
		System.out.println(z);
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		int cake=25;
		cake%=7;
		System.out.println(cake);
		
		
		
		
	}

}
