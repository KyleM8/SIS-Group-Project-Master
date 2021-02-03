import java.util.Comparator;

public class PeriodTwoComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return (s1.getSubjectList().get(1).compareTo(s2.getSubjectList().get(1)));	
	}
}
