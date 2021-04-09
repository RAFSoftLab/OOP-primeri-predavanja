package utilitycollections;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {	
	@Override
	public int compare(Student s1, Student s2) {
		
		if (s1.getGodinaUpisa()==s2.getGodinaUpisa()){
			if(s1.getSmer().equals(s2.getSmer()))
				return s1.getBrojIndeksa() - s2.getBrojIndeksa();
			else
				return s1.getSmer().compareTo(s2.getSmer());
			
		}else
			return s1.getGodinaUpisa() - s2.getGodinaUpisa();
	}
	
}


