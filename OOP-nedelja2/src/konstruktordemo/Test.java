package konstruktordemo;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		// tri nacina kreiranja studenta, pozivom tri razlicita konstruktora
		
		Student s1 = new Student();
		
		Student s2 = new Student(35, "RM", 2016);
		
		Student s3 = new Student("Milan","Matic",LocalDate.of(2000, 3, 14), 34,"RN",2017,1);	
		
		
		
		s3.povecajGodinuStudija();
		s1.setGodinaStudija(4);
		s2.setGodinaUpisa(2019);
		
				
		
	}

}
