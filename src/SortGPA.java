import java.util.ArrayList;
import java.util.Scanner;

public class SortGPA {
	public static ArrayList<Student> studentsGPASorted = new ArrayList<Student>(); //highest to lowest
	public static ArrayList<Student> studentsGPASortedReverse = new ArrayList<Student>(); //lowest to highest
	
	public static void sortByGPAMenu() { //choices for sorting by GPA
		sortByGPA();
		System.out.println("\nSort Students by GPA\n1. Sort from highest to lowest GPA\n2. Sort from lowest to highest GPA\n3. Return to main menu");
		Scanner choiceScanner = new Scanner(System.in);
		String choiceStr = choiceScanner.nextLine();
		if (InputHelper.isNumber(choiceStr)) {
			if (Integer.parseInt(choiceStr) == 1) {
				InputHelper.printAllStudentsAndInfo(studentsGPASorted);
			}
			else if (Integer.parseInt(choiceStr) == 2) {
				InputHelper.printAllStudentsAndInfo(studentsGPASortedReverse);
			}
			else if (Integer.parseInt(choiceStr) == 3) {
				System.out.println("Returning to main menu.");
				Main.selectOption();
			}
			else {
				sortByGPAMenu();
			}
		}
	}
	
	public static void sortByGPA() { //sorts by GPA; greatest to smallest
		for (Student s : Main.students) {
			studentsGPASorted.add(s);
			studentsGPASortedReverse.add(s);
		}
		while (stillSorting()) {
			for (int i = 0; i < studentsGPASorted.size(); i++) {
				if (studentsGPASorted.get(i).getGPA() < studentsGPASorted.get(i+1).getGPA()) {
					Student temp = studentsGPASorted.get(i);
					studentsGPASorted.set(i, studentsGPASorted.get(i+1));
					studentsGPASorted.set(i+1, temp);
				}
				if (studentsGPASortedReverse.get(i).getGPA() > studentsGPASortedReverse.get(i+1).getGPA()) {
					Student temp = studentsGPASortedReverse.get(i);
					studentsGPASortedReverse.set(i, studentsGPASorted.get(i+1));
					studentsGPASortedReverse.set(i+1, temp);
				}
			}
		}
	}
	
	public static boolean stillSorting() {
		for (int i = 0; i < studentsGPASorted.size(); i++) {
			if (studentsGPASorted.get(i).getGPA() < studentsGPASorted.get(i+1).getGPA()) {
				return true;
			}
			if (studentsGPASortedReverse.get(i).getGPA() > studentsGPASortedReverse.get(i+1).getGPA()) {
				return true;
			}
		}
		return false;
	}
}