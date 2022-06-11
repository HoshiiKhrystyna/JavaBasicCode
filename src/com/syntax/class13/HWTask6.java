package com.syntax.class13;

public class HWTask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//How would you swap  2 strings 
	//	without a temporary variable?
		
		String a="Five";
		String b="Fifty";
		a = a + b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
          
	System.out.println("After swap a="+a+" b= "+b);	
	}

}
