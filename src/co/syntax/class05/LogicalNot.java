package co.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean boo=!true; // result false  =! not equal
System.out.println(boo);
		boolean traffic=false;
		if (!traffic) {
			System.out.println("I wiil reach work on time");
		}
		
		String name="Reza";
		if (!name.equals("Emre")) {
			System.out.println("You are not Emre");
		}
	}

}
