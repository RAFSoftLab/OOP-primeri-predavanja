package initblok;

public class TestBrojac {

	public static void main(String[] args) {
		String naziv;
		/*
		 * lokalne promenljive u metodama nemaju podrazumevane inicijalne vrednosti (kao polja)
		 * vec moraju eksplicitno da se inicijalizuju, bez zakomentarisane sledece naredbe program ne bi mogao da se kompajlira		 
		 */
		//System.out.println(naziv);    
		
		Brojac br1 = new Brojac();
		br1.setNaziv("PRISUTNI_STUDENTI");
		br1.ispisi();
		br1.povecajBrojac();
		br1.povecajBrojac();
		br1.ispisi();

	}

}

