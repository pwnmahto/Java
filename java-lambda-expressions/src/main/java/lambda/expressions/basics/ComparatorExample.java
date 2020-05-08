package lambda.expressions.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

	int roll;
	String name;
	int age;

	public Student(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class ComparatorExample {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student(1, "Jhon", 21));
		list.add(new Student(3, "Rohan", 23));
		list.add(new Student(2, "Aman", 20));

		System.out.println("Sorting on the basis of name of the students:");
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		
		list.forEach((student) -> {
			System.out.println(student.roll + " " + student.name + " " + student.age);
		});

		System.out.println("Sorting on the basis of roll no of the students:");
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {
				if (student1.getRoll() == student2.getRoll())
					return 0;
				else if (student1.getRoll() > student2.getRoll())
					return 1;
				else
					return -1;
			}
		});

		list.forEach((student) -> {
			System.out.println(student.roll + " " + student.name + " " + student.age);
		});

	}

}
