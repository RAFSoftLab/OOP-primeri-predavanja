package utilitycollections;

import java.util.Comparator;

public class StudentComparatorPrezimeIme implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getPrezime().compareTo(s2.getPrezime())==0) {
			return s1.getIme().compareTo(s2.getIme());
		}else {
		  return s1.getPrezime().compareTo(s2.getPrezime());
		}
	}

}
