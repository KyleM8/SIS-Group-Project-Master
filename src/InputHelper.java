import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class InputHelper {
	public static Map<String,Float> gradeScale = new HashMap<String,Float>();
	
	public static void setGradeScale() {
		gradeScale.put("A+", 4f);
		gradeScale.put("A", 4f);
		gradeScale.put("A-", 3.7f);
		gradeScale.put("B+", 3.3f);
		gradeScale.put("B", 3f);
		gradeScale.put("B-", 2.7f);
		gradeScale.put("C+", 2.3f);
		gradeScale.put("C", 2f);
		gradeScale.put("C-", 1.7f);
		gradeScale.put("D+", 1.3f);
		gradeScale.put("D", 1f);
		gradeScale.put("D-", 0.7f);
		gradeScale.put("F", 0f);
	}
	
	public static float calcGPA(String... grades) {
		float gpa = 0f;
		for (String g : grades) {
			gpa += gradeScale.get(g);
		}
		gpa = gpa / 3;
		gpa = gpa * 100;
		gpa = Math.round(gpa);
		gpa = gpa/100;
		
		return gpa;
	}
	
	public static void printAllStudentsAndInfo() {
		System.out.println("ALL STUDENTS:\n");
		String spacing = "    ";
		int index = 1;
		for (Student s : Main.students) {
			if (index < 10) {
				System.out.println("\n0" + index + ". " + s.getName());
			}
			else {
				System.out.println("\n" + index + ". " + s.getName());
			}
			System.out.print(spacing + "Classes and grades: ");
			int counter = 1;
			for (String str : s.getSubjectList()) {
				System.out.print(str + ", "+ s.getGrades().get(str));
				if (counter <= 2) {
					System.out.print("; ");
				}
				counter++;
			}
			System.out.println(spacing + "GPA: " + s.getGPA());
			System.out.println("");
			index++;
		}
		System.out.println("\n\n\n");
	}
	
	public static boolean checkInput(String str) { //given a string, asks the user if it is the correct input, and returns a boolean based on the user's response
		System.out.println("Is this the correct input? Type y for yes, or n for no.");
		System.out.println(str);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if (input.toLowerCase().equals("y")) {
			return true;
		}
		else if (input.toLowerCase().equals("n")) {
			return false;
		}
		else {
			checkInput(str);
		}
		return false;
	}
	
	public static int getIndexOfStudent(String name) { //given the first and last name of a student separated by a space, search the array of students to find a student with a matching name. Returns -1 if the student does not exist.
		for (int i = 0; i < Main.students.size(); i++) {
			if (Main.students.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean isNumber(String str) { //given a string, this method will return true if the string is a number
		try {
			float num = Float.parseFloat(str);
		}
		catch (NumberFormatException e) {
			System.out.println("Input format is incorrect, returning to top menu.");
			Main.selectOption();
			return false;
		}
		return true;
	}
	
	public static boolean isChoice(String... params) { //Given an unlimited number of strings, returns true if the first parameter matches any of the following parameters. Helpful to ensure the input actually matches one of the given options.
		int counter = 0;
		String choice = "";
		ArrayList<String> list = new ArrayList<String>();
		for (String str : params) {
			if (counter == 0) {
				choice = str;
			}
			else {
				list.add(str);
			}
		}
		for (String str : list) {
			if (choice.equals(str)) {
				return true;
			}
		}
		return false;
	}
	
}
