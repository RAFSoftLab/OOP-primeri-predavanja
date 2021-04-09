package utilitycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SortiranjeStudenataComp {

	public static void main(String[] args) {
		
		List<StudentComp> studenti = new ArrayList<StudentComp>();
		studenti.add(new StudentComp(23,"RN",2016));
		studenti.add(new StudentComp(21,"RN",2016));
		studenti.add(new StudentComp(45,"RN",2017));
		studenti.add(new StudentComp(42,"RM",2017));
		studenti.add(new StudentComp(22,"RN",2014));
		Collections.sort(studenti);
		System.out.println(studenti);
		
		
		
		/*
		
		List<ElementSkupa> studenti = new ArrayList<>();
		studenti.add(new ElementSkupa("c"));
		studenti.add(new ElementSkupa("a"));		
		Collections.sort(studenti);
		System.out.println(studenti);
		*/
	}

}
