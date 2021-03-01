package stud;

public class Test {

	public static void main(String[] args) {
		// kreiranje objekta klase Student iz istog paketa
		// u konstruktoru prosledjujemo vrednosti atributa
		Student s1 = new Student("Milan", "Matic", 34, "RN",2017,1);
		
		//ispis vrednosti atributa, vrednosti se preuzimaju preko set metoda
		System.out.printf("ime: %s, prezime: %s, godina studija: %d\n", s1.getIme(), s1.getPrezime(), s1.getGodinaStudija());
		
		s1.povecajGodinuStudija();  // studentu koji je predstavljen objektom s1 povecava se godina studija za 1
		
		System.out.printf("ime: %s, prezime: %s, godina studija: %d\n", s1.getIme(), s1.getPrezime(), s1.getGodinaStudija());
		// kreiranje drugog studenta, na drugoj memorijskoj lokaciji
		
		Student s2 = new Student("Branko", "Brankovic", 12, "RI",2017,2);
		s2.ispisiStudenta();  // umesto prosledjivanja vrednosti atributa kod ispisa, ispis mozemo staviti kao operaciju klase i pozivati za objekat
		
		Student s3 = s2; // s3 i s2 sadrze iste adrese, dva imena za isti objekat
		
		System.out.println(s3==s2);  // poredjenje adresa, ispisuje true
		System.out.println(s1==s2);  // false, razliciti objekti
		
		
		s3.povecajGodinuStudija();		
		s2.ispisiStudenta(); // povecana godina studija

	

	}

}