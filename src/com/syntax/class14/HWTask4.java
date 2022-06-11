package com.syntax.class14;

public class HWTask4 {
	void palindrom(String str ) {
		String revers="";
		for(int i=str.length()-1; i>=0; i--) {
			revers+=str.charAt(i);
		}
		if(revers.equalsIgnoreCase(str)) {
				System.out.println(str+" is palindrom");
			}else {
				System.out.println(str+" is not palindrom");
			}
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HWTask4 hw=new HWTask4();
		hw.palindrom("Aba");
		
	}

}
