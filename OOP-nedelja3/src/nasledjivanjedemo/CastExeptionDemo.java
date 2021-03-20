package nasledjivanjedemo;

public class CastExeptionDemo {

	public static void main(String[] args) {
		Nastavnik n = new Nastavnik("Marko", "Markovic");
		((Zaposleni)n).setIme("Milan");
		
		Zaposleni z = new Zaposleni("Marko", "Markovic");
		// ((Nastavnik)z).setBrojCasova(10);  //ova naredba proizvodi gresku - ClassCastException jer zaposleni ne moze da se kastuje sa Nastavnik  	
		
		
	}
}
