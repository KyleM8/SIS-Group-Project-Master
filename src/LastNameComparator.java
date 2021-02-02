import java.util.Comparator;
public class LastNameComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2)
	{
		return (s1.getLastName().compareToIgnoreCase(s2.getLastName()));	
	}
}