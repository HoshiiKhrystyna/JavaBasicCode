package com.syntax.class14;

public class Student {
String name;
	int score;
char getGrade() {
	if(score>=90) {
		return 'A';
	}else if (score>=80) {
		return 'B';
	}else if(score>=70) {
		return 'C';
	}else if (score>=50) {
		return 'D';
	}else {
		return 'F';
	}
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
Student st=new Student();
st.name="Pavlo";
st.score=90;
char rating=st.getGrade();
System.out.println( st.name+ " your grade is "+rating);
	
	
	
}


}
