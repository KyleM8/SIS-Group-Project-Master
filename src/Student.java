import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Student {
	// Student object variables
	protected String name;
	protected Map<String,String> grades = new HashMap<String,String>();
	protected ArrayList<String> subjects = new ArrayList<String>();
	protected float gpa = 0f;
	
	
	// reads data from file and creates new Student objects, adding them to the arraylist declared in the Main class
	public static void getStudentData() {
		try {
			String uri = "src/SISInput.txt";
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(uri)));
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				String [] lineArr = line.split(" ");
				String tempName = lineArr[0] + " " + lineArr[1];
				Map<String,String> tempGrades = new HashMap<String,String>();
				ArrayList<String> tempSubjects = new ArrayList<String>();
				for (int i = 2; i < 7; i+=2) {
					tempGrades.put(lineArr[i], lineArr[i+1]);
					tempSubjects.add(lineArr[i]);
				}
				float gpaTemp = InputHelper.calcGPA(tempGrades.get(tempSubjects.get(0)), tempGrades.get(tempSubjects.get(1)), tempGrades.get(tempSubjects.get(2)));
				Student studentTemp = new Student(tempName, tempGrades, tempSubjects, gpaTemp);
				Main.students.add(studentTemp);
			}
			bufferedReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
		catch (IOException e) {
			System.out.println("IO Exception.");
		}
	}
	
	// constructors (the first one is a blank one, and the second one is a full one)
	Student() {
		
	}
	Student(String n, Map<String,String> g, ArrayList<String> s) {
		this.name = n;
		this.grades = g;
		this.subjects = s;
	}
	Student(String n, Map<String,String> g, ArrayList<String> s, float f) {
		this.name = n;
		this.grades = g;
		this.subjects = s;
		this.gpa = f;
	}
	
	// getters and setters / helper methods
	public String getName() {
		return name;
	}
	public String getLastName() {
		String[] arr = name.split(" ");
		return arr[1];
	}
	public void setName(String n) {
		this.name = n;
	}
	public Map<String,String> getGrades() {
		return grades;
	}
	public void setGrades(Map<String,String> g) {
		this.grades = g;
	}
	public void addStudent(Student s) {
		Main.students.add(s);
	}
	public ArrayList<String> getSubjectList() {
		return subjects;
	}
	public void setSubjectList(ArrayList<String> s) {
		this.subjects = s;
	}
	public float getGPA() {
		return gpa;
	}
	public void setGPA(float f) {
		this.gpa = f;
	}
	
}
