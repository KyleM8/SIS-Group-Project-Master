import java.util.Comparator;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
public class PeriodTwoComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2) 
	{
=======
=======
>>>>>>> Stashed changes

public class PeriodTwoComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
>>>>>>> Stashed changes
		return (s1.getSubjectList().get(1).compareTo(s2.getSubjectList().get(1)));	
	}
}
