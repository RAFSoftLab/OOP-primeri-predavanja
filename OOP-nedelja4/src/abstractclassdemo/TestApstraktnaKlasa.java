package abstractclassdemo;


public class TestApstraktnaKlasa {

	public static void main(String[] args) {
		
		Nastavnik n = new Nastavnik("Marko", "Markovic");
		Zaposleni z = new Nastavnik("Petar", "Petrovic");
		System.out.println(n instanceof Nastavnik); // true
		System.out.println(n instanceof Zaposleni); // true
		System.out.println(z instanceof Nastavnik); // true
		System.out.println(n instanceof Zaposleni); // true
		
		/*
		 * apstraktnom klasom deklarisemo elemente kolekcije, a kao vrednosti postavljamo objekte konkretnih klasa koje nasledjuju apstraktnu klasu
		 */
		Zaposleni[] zaposleni = new Zaposleni[3];
		zaposleni[0] = new Nastavnik("Marko","Markovic","docent",140);		
		zaposleni[1] = new Sluzbenik("Milica","Mitic","referent",500);
		zaposleni[2] = new Nastavnik("Marija", "Maric","vanredni profesor",150);
		
		/*
		 * poyov apstraktnih operacija
		 * izvrsavaju se operacije objekata koji su sadrzani u kolekciji		 
		 */
		
		for(Zaposleni z1:zaposleni) { 
			z1.ispisi();
			z1.ispisiOpterecenje();
		}		
		
		Nastavnik n1 = new Nastavnik("Marko","Markovic","docent",140);
		ispisiOpterecenje(n1);  // operacijama koje kao argument uzimaju tip apstraktne klasa, 
								// prosledjujemo objekat konkretne klase koja nju nasledjuje 
		
	}
	
	public static void ispisiOpterecenje(Zaposleni z) {
		z.ispisiOpterecenje();
	}

	 
}
