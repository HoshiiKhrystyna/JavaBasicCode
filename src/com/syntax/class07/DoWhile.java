package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while loop first checks condition
		//and only then execute block of code
int num=10;
while(num<=3) {
	System.out.print(num+" ");
	num++;
	}
System.out.println("---------------");
//do while first executes the code
//and only then checks the conditions
int num1=1;
do {
	System.out.print(num1+" ");
	num1++;
}while(num1<=3);
//print numbers 1 to 30 using do while

System.out.println();
int p=1;
do {
	System.out.print(p+" ");
	p++;
}while(p<=30);
System.out.println();

int r=70;
do {
	System.out.print(r+" ");
	r-=2;
}while(r>=30);
	}

}
