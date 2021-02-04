import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//liz section
public class SortPeriod {
	public static void sortByPeriod() {
		//create new ArrayList as to not change the main list
		ArrayList<Student> sortedPeriod = new ArrayList<Student>();
		sortedPeriod = Main.students;
		//gather info
		System.out.println("Which period would you like to sort by?");
		Scanner periodChoiceIn = new Scanner(System.in);
		int periodChoice = periodChoiceIn.nextInt();
		//conditionals to sort proper period
		//each one calls the proper comparator class and sorts it
		//info is printed afterwards for the new list as to not change the main list
		if(periodChoice == 1){
			Collections.sort(sortedPeriod, new PeriodOneComparator());
			InputHelper.printAllStudentsAndInfo(sortedPeriod);	
		}
		else if(periodChoice == 2) {
			Collections.sort(sortedPeriod, new PeriodTwoComparator());
			InputHelper.printAllStudentsAndInfo(sortedPeriod);	
		}
		else if(periodChoice == 3) {
			Collections.sort(sortedPeriod, new PeriodThreeComparator());
			InputHelper.printAllStudentsAndInfo(sortedPeriod);	
		}
		else{
			sortByPeriod();
		}
		Main.selectOption();
	}
}
