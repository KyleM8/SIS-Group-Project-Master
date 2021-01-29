import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class StudentAdditionOrDeletion {
	
	public static void addOrDeleteStudent() { //addition/deletion main menu
		System.out.println("");
		System.out.println("Add or delete a student.");
		System.out.println("1. Add student\n2. Delete student\n3. Return to main menu");
		Scanner scanner = new Scanner(System.in);
		String choiceStr = scanner.nextLine();
		if (InputHelper.isNumber(choiceStr)) {
			int choice = Integer.parseInt(choiceStr);
			if (choice == 1) { addStudent(); }
			else if (choice == 2) { deleteStudent(); }
			else if (choice == 3) { Main.selectOption();}
			else { addOrDeleteStudent(); }
		}
		else { addOrDeleteStudent(); }
	}
	
	public static void addStudent() { //adds a student using user input
		System.out.println("\nYou are now adding a new student.\nWhat is the student's name?");
		Scanner nameScanner = new Scanner(System.in);
		String name = nameScanner.nextLine();
		if (InputHelper.checkInput(name)) {
			System.out.println("The student's name is: " + name);
			System.out.println("Now, input the student's subjects and grades in the format: Subject, Grade, Subject, Grade, Subject, Grade.");
			System.out.println("Separate each element using a comma followed by a space. Do not use any punctuation other than commas and spaces.");
			Scanner gradesScanner = new Scanner(System.in);
			String gradesStr = gradesScanner.nextLine();
			if (InputHelper.checkInput(gradesStr)) {
				String [] gradesArr = gradesStr.split(", ");
				ArrayList<String> tempSubjects = new ArrayList<String>();
				Map<String,String> tempGrades = new HashMap<String,String>();
				try {
					for (int i = 0; i < gradesArr.length; i+=2) {
						tempSubjects.add(gradesArr[i]);
						tempGrades.put(gradesArr[i], gradesArr[i+1]);
					}
					float gpaTemp = InputHelper.calcGPA(tempGrades.get(tempSubjects.get(0)), tempGrades.get(tempSubjects.get(1)), tempGrades.get(tempSubjects.get(2)));
					Main.students.add(new Student(name, tempGrades, tempSubjects, gpaTemp));
					System.out.println("Student named " + name + " with grade input \"" + gradesStr + "\" has been added.");
					System.out.println("Returning to main menu.");
					Main.selectOption();
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Sorry, it appears that you made a mistake in your input.\nReturning to top menu.");
					Main.selectOption();
				}
			}
			else { addOrDeleteStudent(); }
		}
		else { addOrDeleteStudent(); }
	}
	
	public static void deleteStudent() { //removes a student based on his/her name
		System.out.println("\nYou are now deleting a student.\nWhat is the student's name?\nType the student's first and last name below, separated by a space.");
		Scanner nameScanner = new Scanner(System.in);
		String name = nameScanner.nextLine();
		int ind = InputHelper.getIndexOfStudent(name);
		if (ind == -1) {
			System.out.println("This student does not exist. Returning to the main menu.");
			Main.selectOption();
		}
		else {
			if (InputHelper.checkInput(name)) {
				System.out.print("Deleting student...");
				Main.students.remove(ind);
				System.out.print("deleted.\n");
				System.out.println("Returning to main menu.\n");
				Main.selectOption();
			}
			else { addOrDeleteStudent(); }
		}
	}
	
}
