package com.syntax.class08;

import java.text.DecimalFormat;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DecimalFormat formatter=new DecimalFormat("00");
		for(int i=0; i<24; i++) {
			for (int a=0; a<=59; a++) {
			System.out.println(formatter.format(i)+":"+formatter.format(a));
			}
		}
		
				
		
		
		
	}
	}

