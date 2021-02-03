import java.util.Comparator;

public class LastNameComparator implements Comparator<Student> {
<<<<<<< Updated upstream
=======
	public int compare(Student s1, Student s2) {
>>>>>>> Stashed changes
		return (s1.getLastName().compareToIgnoreCase(s2.getLastName()));	
	}
}