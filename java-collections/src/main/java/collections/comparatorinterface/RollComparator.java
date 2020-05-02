package collections.comparatorinterface;

import java.util.Comparator;

public class RollComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		if (student1.getRollNo() == student2.getRollNo())
			return 0;
		else if (student1.getRollNo() > student2.getRollNo())
			return 1;
		else
			return -1;

	}

}
