import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeOrScheduleChanger {
	public static void changeGradesOrSchedule() {
		System.out.println("Change Student Grades/Schedule");
		System.out.println("1. Change Grades \n2. Switch Classes \n3. Return to main menu");
		Scanner userChoiceIn = new Scanner(System.in);
		int userChoice = userChoiceIn.nextInt();
		if(userChoice == 1)
			changeGrades();
		else if(userChoice == 2)
			switchClasses();
		else if(userChoice == 3)
			Main.selectOption();
		else
			changeGradesOrSchedule();	
	}
<<<<<<< Updated upstream

=======
	
>>>>>>> Stashed changes
	public static void changeGrades() {
		//gather all info needed in order to set grades
		InputHelper.printAllStudentsAndInfo(Main.students);
		System.out.println("Enter the index of the student whose grades you would like to change.");
		Scanner userStudentIn = new Scanner(System.in);
		int studentIndex = userStudentIn.nextInt();
		System.out.println("Which period would you like to change?");
		Scanner selectedClassIn = new Scanner(System.in);
		int selectedClassIndex = selectedClassIn.nextInt();
		System.out.println("What would you like to change the grade to?");
		Scanner newGradeIn = new Scanner(System.in);
		String newGrade = newGradeIn.nextLine();
		//create new temporary HashMap here
		Map<String,String> tempGrades = new HashMap<String,String>();
		//update it to the current value
		tempGrades = Main.students.get(studentIndex - 1).getGrades();
		//get the key
		String subjectToBeChanged = Main.students.get(studentIndex - 1).getSubjectList().get(selectedClassIndex - 1);
		//replace according to the key
		tempGrades.replace(subjectToBeChanged, newGrade);
		//print all info to show change
		InputHelper.printAllStudentsAndInfo(Main.students);
		System.out.println("Grades have been updated.");
		Main.selectOption();
	}
<<<<<<< Updated upstream
  
=======
	
>>>>>>> Stashed changes
	public static void switchClasses() {
		//print out current students
		InputHelper.printAllStudentsAndInfo(Main.students);
		//gather needed info
		System.out.println("Enter the index of the student whose schedule you would like to change.");
		Scanner userStudentIn = new Scanner(System.in);
		int studentIndex = userStudentIn.nextInt();
		System.out.println("Which period would you like to change?");
		Scanner selectedClassIn = new Scanner(System.in);
		int selectedClassIndex = selectedClassIn.nextInt();
		System.out.println("What class would you like to transfer the student to?");
		Scanner newClassIn = new Scanner(System.in);
		String newClass = newClassIn.nextLine();
		//replace the class
		Main.students.get(studentIndex - 1).getSubjectList().set(selectedClassIndex - 1, newClass);
		
		//update the grades
		//determine new grade
		System.out.println("What would you like the new grade to be?");
		Scanner newGradeIn = new Scanner(System.in);
		String newGrade = newGradeIn.nextLine();
		//create new temporary HashMap here
				Map<String,String> tempGrades = new HashMap<String,String>();
				//update it to the current value
				tempGrades = Main.students.get(studentIndex - 1).getGrades();
				//replace according to the key
				String subjectToBeChanged = Main.students.get(studentIndex - 1).getSubjectList().get(selectedClassIndex - 1);
				tempGrades.remove(subjectToBeChanged);
				
				tempGrades.put(newClass, newGrade);
				//tempGrades.replace(newClass, newGrade);
				Main.students.get(studentIndex - 1).setGrades(tempGrades); 
				//I think if I remove the previous subject form the array list it will work
				//It also needs to be set to the correct index
				
		//print out new info
		InputHelper.printAllStudentsAndInfo(Main.students);
		Main.selectOption();
	}
}
