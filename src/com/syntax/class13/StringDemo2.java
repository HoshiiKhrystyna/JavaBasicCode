package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="fhgufgldjlfjhigdkGFHJ1093214&%^%&";
		System.out.println(str.replaceAll("[0-9]", "+"));
		System.out.println(str.replaceAll("[a-z]", "&"));
		System.out.println(str.replaceAll("[A-Z]", "@"));
		System.out.println(str.replaceAll("[A-Za-z]", "_"));
		System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
		System.out.println(str.replaceAll("[^a-z]","_"));//you can see only lower
		System.out.println(str.replaceAll("[^A-Z]","_"));//you see only upperA-Z
		System.out.println(str.replaceAll("[^A-Za-z0-9]","&"));
		str="abcdkgnjlg";
		System.out.println(str.replaceAll("[a-f]","*"));
		str="ghdjdghdjFDSGDFH16547233^*%";
		System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
		
		
		
		
	}

}
