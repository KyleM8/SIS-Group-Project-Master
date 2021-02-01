import java.util.Collections;

public class StudentSorting 
{
	public static void sortStudents()
	{
		Collections.sort(students);
		for(int i=0; i<students.size(); i++)
		    System.out.println(students.get(i));
	}
}
