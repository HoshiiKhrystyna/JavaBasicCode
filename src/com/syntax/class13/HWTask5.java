package com.syntax.class13;

public class HWTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//How would you check if String is palindrome or not? aba=> true
				//Abbc =>false
		String str="aba";
		int t=0;
		boolean palindrome=true;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==str.charAt(t)) {
				t++;
			}else {
				palindrome=false;
			}
		}
		System.out.println(palindrome);
	}

}
