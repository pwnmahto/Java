package pwnmahto.serialization.basics;

/**
 * Serialization is a mechanism of converting the state of an object into a byte stream.
 * Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
 * The byte stream created is platform independent. So, the object serialized on one platform can be deserialized on a different platform.
 * To make a Java object serializable, the java.io.Serializable interface is implemented.
 */

import java.io.Serializable;

public class Student implements Serializable {

	private int roll;

	private String name;

	private double marks;

	private String college;

	public Student(int roll, String name, double marks, String college) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.college = college;
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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
