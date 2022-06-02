package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char choice='N';
String meaning;
//variable and matching cases MUSR BE of same type
switch(choice) {
case 'Y':
	meaning="yes";
	break;
case 'M':
meaning="Maybe";
break;
case 'N':
	meaning="No";
	break;
	default:
		meaning="Unknown";
}

System.out.println(meaning);


	}

}
