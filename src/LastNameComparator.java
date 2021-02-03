import java.util.Comparator;

public class LastNameComparator implements Comparator<Student> {
		return (s1.getLastName().compareToIgnoreCase(s2.getLastName()));	
	}
}