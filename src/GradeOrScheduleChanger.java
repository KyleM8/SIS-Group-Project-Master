import java.util.ArrayList;
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
		System.out.println("Enter the index of the student whose grades you would like to change.");
		Scanner userStudentIn = new Scanner(System.in);
		int studentIndex = userStudentIn.nextInt();
		System.out.println("Which period would you like to change?");
		Scanner selectedClassIn = new Scanner(System.in);
		int selectedClassIndex = selectedClassIn.nextInt();
		System.out.println("What would you like to change the grade to?");
		Scanner newGradeIn = new Scanner(System.in);
		String newGrade = newGradeIn.nextLine();
		
	}
	public static void switchClasses()
	{
		
	}
}
