import java.util.Collections;

public class StudentSorting {
	public static void sortStudentsMain() {
		System.out.println("Sort Students\n1. Sort by last name\n2. Sort by GPA\n3. Sort by period");
	}
	
	public static void sortStudents() {
		Collections.sort(students);
		for(int i=0; i<students.size(); i++)
		    System.out.println(students.get(i));
	}
}
