package com.syntax.class13;

public class Taks3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String father="Sameer";
String mother="Taylor swift";
boolean boy=false;//if the girl otherwise boy
if(boy) {
	String firstHalf=father.substring(0,father.length()/2);
	String secondHalf=mother.substring(mother.length()/2);
		System.out.println(firstHalf.trim()+secondHalf.trim());
	}else {
		String firstHalf=mother.substring(0,mother.length()/2);
		String secondHalf=father.substring(father.length()/2);
			System.out.println(firstHalf.trim()+secondHalf.trim());
	}
}
		
		
		
		
	}


