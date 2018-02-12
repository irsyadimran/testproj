
public class TestMultiArrays {

	
	public static void main(String[] args) {
		
		String course_subjects [] [] = new String [2][2];
		course_subjects [0][0] = "CS-MATH";
		course_subjects [0][1] = "CS-ENGLISH";
		course_subjects [1][0] = "CS-FRENCH";
		course_subjects [1][1] = "CS-ARABIC";
		
		String course_subjects2 [] [] = {{ "CS-MATH","CS-ENGLISH","CS-FRENCH","CS-ARABIC" }};
		
		for(int i=0; i < course_subjects.length; i++) {
			
			for(int j=0;j< course_subjects[i].length;j++) {
				System.out.println("Course of " + i + "Subject of " + j + " is " + course_subjects [i][j]);
			} 
			
		}
	}
}
