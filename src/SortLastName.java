import java.util.Collections;

public class SortLastName {
	public static void sortLastName() {
		Collections.sort(students);
		for(int i=0; i<students.size(); i++)
		    System.out.println(students.get(i));
	}
	
}
