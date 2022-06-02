package co.syntax.class05;

public class LogicalAndExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Monday friday ->no class
 * Tuesday and wednesday-> manual testing
 * thursday-> review
 * saturday sunday-> Java
 */
		String day="Monday";
		if (day.equals("Monday")||day.equals("Friday")) {
			System.out.println("I have no class");
		}else if (day.equals("Tuesday")|| day.equals("Wednesday")){
			System.out.println("I have manual class");
		}else if (day.equals("Thursday")) {
			System.out.println("I have review class");
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have java class");
		}
		
		
	}

}
