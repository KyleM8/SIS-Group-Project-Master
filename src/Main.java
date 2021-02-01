import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static ArrayList<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {
		InputHelper.setGradeScale();
		Student.getStudentData(); //calls the getStudentData() method, which reads all the data from the file and writes Student objects to the students ArrayList above
		InputHelper.printAllStudentsAndInfo(students);
		selectOption();
	}
	
	//method to select option
	public static void selectOption()
	{
		System.out.println("What would you like to do?");
		System.out.println("1. Add or delete a student \n2. Change student grades or schedule \n3. Sort students\n4. Print out all students and their corresponding data");
		//takes user input and runs appropriate method
		Scanner userIn = new Scanner(System.in);
		int userChoice = userIn.nextInt();
		if (userChoice == 1) {
			StudentAdditionOrDeletion.addOrDeleteStudent();
		}
		else if (userChoice == 2) {
			GradeOrScheduleChanger.changeGradesOrSchedule();
		}
		else if (userChoice == 3) {
			StudentSorting.sortStudentsMain();
		}
		else if (userChoice == 4) {
		InputHelper.printAllStudentsAndInfo(students);
		selectOption();
		}
		else {
			selectOption();
		}
	}
	
}
