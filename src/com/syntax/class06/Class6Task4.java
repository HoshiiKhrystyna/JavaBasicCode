package com.syntax.class06;
import java.util.Scanner;
public class Class6Task4 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Please enter value for sale yes or no");
String sale=in.next();
if (sale.equalsIgnoreCase("No")) {
System.out.println("You are not going for shopping");
	}else {
		System.out.println("You are going for shopping");System.out.println("Which item you want to buy and tell the price");
	}
String item = null;int price = 0;int discount,discountPrice,finalPrice;
item=in.next(); price=in.nextInt();
if (price<=20) {                        
	discount=10;
}else if (price>=20&&price<=100) {      
	discount=20;
}else if (price>100&& price<=500) {     
	discount=30;
}else {                                 
	discount=50;
}
discountPrice=price*discount/100;


switch (discount) {
case 10:
	finalPrice=price-discountPrice;
	break;
case 20:
	finalPrice=price-discountPrice;
	break;
case 30:
	finalPrice=price-discountPrice;
	break;
default:
	finalPrice=price-discountPrice;
}
	System.out.println("After discount "+discount+" the price of the item reduce from "+price+" to "+finalPrice);






}
}