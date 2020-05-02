package collections.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();

		studentList.add(new Student(1, "Ram", 98));
		studentList.add(new Student(2, "Arvind", 56));
		studentList.add(new Student(3, "Tapan", 75));

		Collections.sort(studentList); // sorting in natural order

		System.out.println("studentList is sorted in natural order by marks:");
		for (Student student : studentList) {
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getMarks());
		}

		Collections.reverse(studentList); // sorting in reverse order

		System.out.println("\nstudentList is sorted in reverse order by marks:");
		for (Student student : studentList) {
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getMarks());
		}

		Collections.sort(studentList); // sorting in natural order
		Collections.sort(studentList, Collections.reverseOrder()); // sorting in reverse order

		System.out.println("\nstudentList is sorted in reverse order by marks:");
		for (Student student : studentList) {
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getMarks());
		}
	}
}
