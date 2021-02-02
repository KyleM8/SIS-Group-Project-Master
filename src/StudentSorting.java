import java.util.Collections;
import java.util.Scanner;

public class StudentSorting {
	public static void sortStudentsMain() {
		System.out.println("Sort Students\n1. Sort by last name\n2. Sort by GPA\n3. Sort by period");
		Scanner choiceScanner = new Scanner(System.in);
		String choice = choiceScanner.nextLine();
		if (InputHelper.isNumber(choice)) {
			if (Integer.parseInt(choice) == 1) {
				SortLastName.sortByLastName();
			}
			else if (Integer.parseInt(choice) == 2) {
				SortGPA.sortByGPAMenu();
			}
			else if (Integer.parseInt(choice) == 3) {
				SortPeriod.sortByPeriod();
			}
		}
	}
	
}
