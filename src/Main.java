import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {
		Student.getStudentData(); //calls the getStudentData() method, which reads all the data from the file and writes Student objects to the students ArrayList above
		test();
		selectOption();
	}
	
	//test method to make sure the data is getting written correctly
	public static void test() {
		int testInd = 5;
		System.out.println(students.get(testInd).getName()); //gets the name of the first Student in the students ArrayList
		System.out.println("Subject: " + students.get(testInd).getSubjectList().get(0) + "    Grade: " + students.get(testInd).getGrades().get(students.get(testInd).getSubjectList().get(0))); //gets the grade for the first subject for the first Student in the students ArrayList 
	}
	
	//method to select option
	public static void selectOption()
	{
		System.out.println("What would you like to do?");
		System.out.println("1. add or delete a student \n2. change student grades/schedule \n3. sort students");
		//takes user input and runs appropriate method
		Scanner userIn = new Scanner(System.in);
		int userChoice = userIn.nextInt();
		if(userChoice == 1)
			addOrDeleteStudent();
		else if(userChoice == 2)
			changeGradesOrSchedule();
		else if(userChoice == 3)
			sortStudents();
		else
			selectOption();
	}
	public static void addOrDeleteStudent()
	{
		
	}
	public static void changeGradesOrSchedule()
	{
		
	}
	public static void sortStudents()
	{
		
	}
}
