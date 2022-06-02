package com.syntax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter item which you want to buy");
String item=in.nextLine();
System.out.println("What the price of the item");
int price;
price=in.nextInt();
int sum=0;
do {
System.out.println("please enter money");
int money,change = 0;
money=in.nextInt();
sum+=money;
change=sum-price;
if(sum>price) {
	System.out.println("Here your "+ change );
}else if (sum==price) {
	System.out.println("Thank you for purchuse");
}

System.out.println("Price of the "+ item+" is "+price);
}while(sum<price);




	



	}

}
