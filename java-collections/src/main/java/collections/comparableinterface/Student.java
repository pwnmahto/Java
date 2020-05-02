package collections.comparableinterface;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private int marks;

	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public int compareTo(Student student) {
		if (this.marks == student.marks)
			return 0;
		else if (this.marks > student.marks)
			return 1;
		else
			return -1;
	}
}
