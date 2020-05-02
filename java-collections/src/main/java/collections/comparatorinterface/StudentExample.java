package collections.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;

public class StudentExample {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();

		studentList.add(new Student(45, "Ram", 98));
		studentList.add(new Student(24, "Arvind", 56));
		studentList.add(new Student(37, "Tapan", 75));

		Collections.sort(studentList, new RollComparator()); // sorting by roll number

		System.out.println("studentList is sorted by roll no:");
		for (Student student : studentList) {
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getMarks());
		}

		Collections.sort(studentList, new NameComparator()); // sorting by name

		System.out.println("\nstudentList is sorted by name:");
		for (Student student : studentList) {
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getMarks());
		}

		Collections.sort(studentList, new MarksComparator()); // sorting by marks

		System.out.println("\nstudentList is sorted by marks:");
		for (Student student : studentList) {
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getMarks());
		}

	}

}
