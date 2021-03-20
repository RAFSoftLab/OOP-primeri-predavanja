package nasledjivanjedemo;

public class PolimorfizamDemo {
	
	/*
	 * metoda ilustruje upotrebu operatora instanceof i kastovanja objekata
	 * alternativno i bolje rešenje - implementacija nadjačavanjem nestatičke metode ispisiOpetercenje u klasi Zaposleni 
	 * 
	 */
	
	public static void ispisiOpterecenje(Zaposleni z) {
		if(z instanceof Nastavnik)
			System.out.println(((Nastavnik)z).getBrojCasova());
		else if(z instanceof Sluzbenik)
			System.out.println(((Sluzbenik)z).getBrojRadnihSati());
	}
	
	public static void main(String[] args) {
		
		// polimorfizam - demo 
		// polimorfizam u OOP - objekti mogu istovremeno biti instance različitih klasa
		
		Nastavnik n = new Nastavnik("Petar", "Markovic",152);	 
		ispisiOpterecenje(n);	 // n je instanca klase Nastavnik, ali i klase Zaposleni, zato se može proslediti ovoj metodi
		
		Sluzbenik s = new Sluzbenik("Milica", "Krstic",400);		
		ispisiOpterecenje(s);
		
			
		Zaposleni z = new Nastavnik("Petar", "Markovic",180);	
		ispisiOpterecenje(z);
		
		System.out.println(n instanceof Nastavnik);  // true
		System.out.println(n instanceof Zaposleni);   // true
		System.out.println(z instanceof Nastavnik);  // true
		System.out.println(z instanceof Zaposleni);   // true
		System.out.println(z instanceof Sluzbenik);  // false
		
		
		
		
		Zaposleni[] zaposleni = new Zaposleni[3];
		zaposleni[0] = new Nastavnik("Marko","Markovic",140, "docent");		
		zaposleni[1] = new Sluzbenik("Milica","Mitic",500, "referent");
		zaposleni[2] = new Zaposleni("Milos","Stosic");
		
		for(Zaposleni z1:zaposleni)
			z1.ispisi();	 // poziva se metoda objekta koji je sadržan u promenljivoj z1, na primer za prvi element će se pozvati metoda iz klase Nastavnik
		
			
		

	}
	
	
	
	
	
}
