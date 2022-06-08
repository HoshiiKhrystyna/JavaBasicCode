package com.syntax.class05;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int height=in.nextInt();
if (height<60) {
	System.out.println("You are short");
}else if (height>=60 && height<=72) {
	System.out.println("You are medium");
}else if (height>72) {
	System.out.println("You are tall");
}

System.out.println("-------------");

	}

}
