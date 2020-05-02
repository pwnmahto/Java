package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

class Student {

	private int roll;
	private String name;
	private int marks;
	private String address;

	public Student(int roll, String name, int marks, String address) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

public class StudentExample {

	public static void main(String[] args) {
		
		// create a list of Student
		List<Student> studentList = new ArrayList<>();
		
		// create Student objects
		Student student1 = new Student(1, "Rohit", 78, "Delhi");
		Student student2 = new Student(2, "Shivan", 56, "Mumbai");
		Student student3 = new Student(3, "Prem", 98, "Patna");

		// add the Student objects to studentList
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		// Traversing list
		for (Student student : studentList) {
			System.out.println("Roll No : "+student.getRoll() + " , Name : " + student.getName() + " , Marks : " + student.getMarks() + " , Address : "
					+ student.getAddress());
		}
	}

}
