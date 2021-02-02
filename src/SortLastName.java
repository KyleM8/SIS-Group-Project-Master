import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class SortLastName {	
	public static ArrayList<Student> studentsLastNameSorted = new ArrayList<Student>();
//working of figuring out how to use collections and comparators for last names.

public static void sortByLastName() {
	studentsLastNameSorted = Main.students;
	Collections.sort(studentsLastNameSorted, new LastNameComparator());
	InputHelper.printAllStudentsAndInfo(studentsLastNameSorted);
	
}
}
