package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Task1");
		String[]cars= {"BMW","Acura","Jeep","GMC","Ferrari","Audi","Infinity"};
		for(int i=0;i<cars.length; i++  ) {
			System.out.print(cars[i]+" ");
		}
		System.out.println("======================");
		String[] cars1= {"BMW","Acura","Jeep","GMC","Ferrari","Audi","Infinity"};
		for(String car:cars1) {
			System.out.print(car+" ");
		}
		System.out.println("-------------------");
		System.out.println("Task2");
		
		String[] animals= {"Monkey","fox","tiger","dog","cat"};
		for(int i=0;i<animals.length; i++  ) {
			System.out.print(animals[i]+" ");
		}
		System.out.println("===================");
		String[] animals1={"Monkey","fox","tiger","dog","cat"};
		for(String a:animals1) {
			System.out.print(a+" ");
		}
		System.out.println("--------------------");
		System.out.println("Task3");
		double[] price= {19.99, 20.99, 30.99};
		for(int i=0; i<price.length; i++) {
			System.out.print(price[i]+" ");
		}
		System.out.println("==============");
		double[] price1= {19.99,20.99,30.99};
		for(double p:price1) {
			System.out.print(p+" ");
		}
		System.out.println("------------------");
		System.out.println("Task4");
	
		int [] n=new int[4];
		n[0]=1;
		n[1]=2;
		n[2]=3;
		n[3]=4;
		int sum=n[0]+n[1]+n[2]+n[3];
		System.out.println("Sum of all elements "+sum);
		System.out.println("============");
		int []numbers={1,2,3,4};
		int sum1=0;
		for(int i=0; i<numbers.length; i++) {
			sum1=sum1+numbers[i];
			}
		System.out.println("Sum off all elements "+sum1);
		
		
	}

}
