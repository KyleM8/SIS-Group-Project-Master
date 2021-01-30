import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//liz section
public class SortPeriod 
{
	public static void sortByPeriod()
	{
		//gather info
		System.out.println("Which period would you like to sort by?");
		Scanner periodChoiceIn = new Scanner(System.in);
		int periodChoice = periodChoiceIn.nextInt();
		//conditionals to sort proper period
		//each one calls the proper comparator class and sorts it, then prints out all the info
		if(periodChoice == 1)
		{
			Collections.sort(Main.students, new PeriodOneComparator());
			InputHelper.printAllStudentsAndInfo(Main.students);	
		}
		else if(periodChoice == 2)
		{
			Collections.sort(Main.students, new PeriodTwoComparator());
			InputHelper.printAllStudentsAndInfo(Main.students);	
		}
		else if(periodChoice == 3)
		{
			Collections.sort(Main.students, new PeriodThreeComparator());
<<<<<<< Updated upstream
      InputHelper.printAllStudentsAndInfo(Main.students);	
=======
			InputHelper.printAllStudentsAndInfo(Main.students);	
>>>>>>> Stashed changes
		}
		else
		{
			sortByPeriod();
		}
	}
}
