package com.syntax.class07;

public class WhileLoppExample {

	public static void main(String[] args) {
		// print numbers from 1 to 10
		int num=1;
while(num<=10) {
	System.out.print(num+" ");//1
	num++;//1+1=2+1=3+1=4.....
}
		
		//print numbers from 1 to 10;
int num1=0;
while(num1<10) {
	num1++;
System.out.print(num1+" ");//1
}

System.out.println("____________________");

	//print number from 10 to 100;
int a=10;
while(a<=100) {
	System.out.print(a+" ");
	a++;
}


System.out.println("__________________");
int b=10;
while(b>=1) {
	System.out.print(b+" ");
	b--;
}
System.out.println("________________________");

int c=100;
while(c>=50) {
	System.out.print(c+" ");
	c--;
}
System.out.println("---------------------");
int v=-1;
while (v>=-10) {
	System.out.print(v+ " ");
	v--;
}
System.out.println("+++++++++++++++++");
//1 way
int q=2;
while(q<=20) {
	System.out.print(q+" ");
	q+=2;//q=q+2
}
System.out.println("_________________");
//second way
int f=1;
while(f<=20) {
	System.out.print(f+" ");
	f++;
	
}

System.out.println();
int e=100;
while(e>=1) {
	if(e%2!=0) {
System.out.print(e+" ");
}
	e--;
}
int w=99;
while(w>=1) {
	System.out.println(w+ " ");
	w-=2;
}

	}

}
