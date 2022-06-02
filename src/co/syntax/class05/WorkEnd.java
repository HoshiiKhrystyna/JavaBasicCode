package co.syntax.class05;

import java.util.Scanner;

public class WorkEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int day=9;
if (day==1||day==2||day==3 || day==4 || day==5){
	System.out.println("It is a weekday");
}else if (day==6 || day == 7) {
	System.out.println("It is a weekend");
}else {
	System.out.println("Invalid ");
}
Scanner in=new Scanner(System.in);

System.out.println("Print the number");
int num=in.nextInt();
if (num>=1 && num<=10) {
	System.out.println("It is small");
}else if (num>11 && num<=100) {
	System.out.println("It is medium");
}else if (num>=101 && num<=1000) {
	System.out.println("It is large");
}else {
	System.out.println("Invalid");
}

}
}
		
	
	
	
	


