package mape;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import utilitycollections.Student;

public class MapaStudenti {
	
	

	public static void main(String[] args) throws ParseException  {
		
		
	
		Student s1 = new Student("Marko","Markovic",LocalDate.of(1999,9,12),23,"RN",2016,2);
		Student s2 = new Student("Milan","Petrovic",LocalDate.of(1990,8,10),10,"RM",2015,3);
		Student s3 = new Student("Ana","Milic",LocalDate.of(1991,9,12),1,"RN",2017,1);
		Student s4 = new Student("Milica","Matic",LocalDate.of(1990,10,05),50,"RN",2016,1);
		
		Map<String,Student> studentiMap = new HashMap<>();
		studentiMap.put(s1.getIndexFull(), s1);
		studentiMap.put(s2.getIndexFull(), s2);
		studentiMap.put(s3.getIndexFull(), s3);
		studentiMap.put(s4.getIndexFull(), s4);
		
			
		Student s = studentiMap.get("1/RN-2017");
		System.out.println(s);
				
		
		// iteracija kroz skup kljuceva mape
		for(String index:studentiMap.keySet()){   
			// index je jedan ključ u mapi i na osnovu njega dobijamo vrednosti
			System.out.println(studentiMap.get(index).getPrezime()); 			
		}
		// iteracija kroz skup entrija
		for(Map.Entry<String, Student> e : studentiMap.entrySet()){
			// e je entri i sadrži u sebi i kljuc i vrednost
			System.out.println("kljuc:" + e.getKey());
			System.out.println("vrednost:"+ e.getValue());
			System.out.println("-----------------------");
		}
		// iteracija kroz entrije koriscenjem iteratora
		Iterator<Map.Entry<String, Student>> it = studentiMap.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry<String, Student> pair = it.next(); // it.next() vraca sledeci entri
		    System.out.println(pair.getKey());
		}
		
		
		
	}

}
