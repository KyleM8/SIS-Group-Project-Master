import java.util.Comparator;
<<<<<<< Updated upstream
public class PeriodThreeComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
=======

public class PeriodThreeComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
>>>>>>> Stashed changes
		return (s1.getSubjectList().get(2).compareTo(s2.getSubjectList().get(2)));
	}
}
