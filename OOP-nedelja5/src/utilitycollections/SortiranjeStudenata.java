package utilitycollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SortiranjeStudenata {

	public static void main(String[] args) {
		
		
		List<Student> studenti = new ArrayList<Student>();
		studenti.add(new Student("Marko","Markovic", 23,"RN",2016));
		studenti.add(new Student("Pavle", "Markovic", 21,"RN",2016));
		studenti.add(new Student("Danica","Jokic", 45,"RN",2017));
		studenti.add(new Student("Ana", "Markovic", 42,"RM",2017));
		studenti.add(new Student("Biljana", "Jokic", 22,"RN",2014));
		
		Collections.sort(studenti,new StudentComparator());	
		System.out.println(studenti);
		
		Collections.sort(studenti,new StudentComparatorPrezimeIme());
		System.out.println(studenti);
		
		
		
		
		
		// mozemo u konstruktoru TreeSet-a da prosledimo komparator po kome ce se sortirati studenti
		
		Set<Student> studentiSet = new TreeSet<Student>(new StudentComparatorPrezimeIme());
		studentiSet.add(new Student("Marko","Markovic", 23,"RN",2016));
		studentiSet.add(new Student("Pavle", "Markovic", 21,"RN",2016));
		studentiSet.add(new Student("Danica","Jokic", 45,"RN",2017));
		studentiSet.add(new Student("Ana", "Markovic", 42,"RM",2017));
		studentiSet.add(new Student("Ana", "Markovic", 22,"RN",2014));		
		
		System.out.println(studentiSet);
		
		
		
	}
	
	

}




