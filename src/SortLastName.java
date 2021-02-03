import java.util.Collections;

<<<<<<< Updated upstream
public class SortLastName {
	public static void sortLastName() {
		Collections.sort(students);
		for(int i=0; i<students.size(); i++)
		    System.out.println(students.get(i));
	}
	
=======
public class SortLastName {	
	public static ArrayList<Student> studentsLastNameSorted = new ArrayList<Student>();
	
	public static void sortByLastName() {
		studentsLastNameSorted = Main.students;
		Collections.sort(studentsLastNameSorted, new LastNameComparator());
		InputHelper.printAllStudentsAndInfo(studentsLastNameSorted);
		
	}
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
}
