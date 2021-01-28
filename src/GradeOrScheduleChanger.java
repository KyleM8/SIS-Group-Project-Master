import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeOrScheduleChanger 
{
	public static void changeGradesOrSchedule()
	{
		System.out.println("Change Student Grades/Schedule");
		System.out.println("1. Change Grades \n2. Switch Classes");
		Scanner userChoiceIn = new Scanner(System.in);
		int userChoice = userChoiceIn.nextInt();
		if(userChoice == 1)
			changeGrades();
		else if(userChoice == 2)
			switchClasses();
		else
			changeGradesOrSchedule();
		
	}
	public static void changeGrades()
	{
		//gather all info needed in order to set grades
		InputHelper.printAllStudentsAndInfo();
		System.out.println("Enter the index of the student whose grades you would like to change.");
		Scanner userStudentIn = new Scanner(System.in);
		int studentIndex = userStudentIn.nextInt();
		System.out.println("Which period would you like to change?");
		Scanner selectedClassIn = new Scanner(System.in);
		int selectedClassIndex = selectedClassIn.nextInt();
		System.out.println("What would you like to change the grade to?");
		Scanner newGradeIn = new Scanner(System.in);
		String newGrade = newGradeIn.nextLine();
		String gradeLetter, gradeValue;
		gradeLetter = newGrade.substring(0, 1);
		if(newGrade.length() < 2)
			gradeValue = "";
		else
			gradeValue = newGrade.substring(1);
		//create new temporary HashMap here
		Map<String,String> tempGrades = new HashMap<String,String>();
		//update it to the current value
		tempGrades = Main.students.get(studentIndex - 1).getGrades();
		//get the key
		String subjectToBeChanged = Main.students.get(studentIndex - 1).getSubjectList().get(selectedClassIndex - 1);
		//replace according to the key
		tempGrades.replace(subjectToBeChanged, newGrade);
		System.out.println(Main.students.get(studentIndex - 1).getGrades());
		//print all info to show change
		InputHelper.printAllStudentsAndInfo();
		System.out.println("Grades have been updated.");
	}
	public static void switchClasses()
	{
		
	}
}
