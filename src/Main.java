import java.util.ArrayList;
//Hello this is Austin

public class Main {
	public static ArrayList<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {
		Student.getStudentData(); //calls the getStudentData() method, which reads all the data from the file and writes Student objects to the students ArrayList above
		test();
	}
	
	//test method to make sure the data is getting written correctly
	public static void test() {
		int testInd = 5;
		System.out.println(students.get(testInd).getName()); //gets the name of the first Student in the students ArrayList
		System.out.println("Subject: " + students.get(testInd).getSubjectList().get(0) + "    Grade: " + students.get(testInd).getGrades().get(students.get(testInd).getSubjectList().get(0))); //gets the grade for the first subject for the first Student in the students ArrayList 
	}

}
