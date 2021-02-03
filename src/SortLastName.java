import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

<<<<<<< Updated upstream
  public class SortLastName {	
    public static ArrayList<Student> studentsLastNameSorted = new ArrayList<Student>();
    
    public static void sortByLastName() {
      studentsLastNameSorted = Main.students;
      Collections.sort(studentsLastNameSorted, new LastNameComparator());
      InputHelper.printAllStudentsAndInfo(studentsLastNameSorted);
    }
  }
=======
public class SortLastName {	
	public static ArrayList<Student> studentsLastNameSorted = new ArrayList<Student>();
	
	public static void sortByLastName() {
		studentsLastNameSorted = Main.students;
		Collections.sort(studentsLastNameSorted, new LastNameComparator());
		InputHelper.printAllStudentsAndInfo(studentsLastNameSorted);
		
	}
>>>>>>> Stashed changes
}
