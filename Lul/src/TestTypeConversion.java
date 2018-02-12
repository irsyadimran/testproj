
public class TestTypeConversion {

	public static void main (String[] args) {
		
		//accept a double from command line
		double salary = Double.parseDouble(args [0]);
		String salaryStr = String.valueOf(salary);
		System.out.println(salaryStr);
	}
}
