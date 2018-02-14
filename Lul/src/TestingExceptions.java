
public class TestingExceptions {

	public static void main (String[] args) {
		
		try {
			System.out.println("Your name is : " + args[0]);
			System.out.println("Name printed...");
			
			}catch(Exception ex) { 
				System.out.println("Please provide your name as Command Line parameter.  " 
			+ "eg: java TestingExceptions <Your Name>");
			} 
		
		System.out.println("Im done " );
	}
	
}
