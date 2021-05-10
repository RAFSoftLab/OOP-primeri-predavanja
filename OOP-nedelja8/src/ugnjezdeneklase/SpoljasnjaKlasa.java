package ugnjezdeneklase;

/*
 * primer klase koja sadrži unutrašnju klasu (nestatičku)
 * ilustracija kreiranja objekta unutrašnje klase i pristupa elementima
 * 
 */

public class SpoljasnjaKlasa {
	
	private int brojSk = 4;
	
	private class UnutrasnjaKlasa{
		
		private int brojUk = 2;
		
		public void ispisi() {
			System.out.println("Ovo je unutrasnja klasa");
			brojSk = 7;  // pristup privatnom polju spoljašnje klase			
		}
	}
	
	public static void main(String[] args) {
		SpoljasnjaKlasa sk = new SpoljasnjaKlasa();
		UnutrasnjaKlasa uk = sk.new UnutrasnjaKlasa();
		uk.ispisi();
		System.out.println(sk.brojSk);
		System.out.println(uk.brojUk); // pristup privatnom polju objekta unutrašnje klase		
	}
}



