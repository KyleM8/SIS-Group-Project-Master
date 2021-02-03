import java.util.Scanner;
public class GroupSorter {
	public static void SortIntoGroups() {
		System.out.println("How many groups would you like?");
		Scanner numOfGroupsIn = new Scanner(System.in);
		int numOfGroups = numOfGroupsIn.nextInt();
		int studentsPerGroup = Main.students.size() / numOfGroups;
		
	}
}
