package utilitycollections;

import java.util.Comparator;

public class StudentComparatorSmer implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {		
		return s1.getSmer().compareTo(s2.getSmer());
	}

}
