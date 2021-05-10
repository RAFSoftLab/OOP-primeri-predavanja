package ugnjezdeneklase;

/*
 * primer klase koja sadrži statičku ugnježdeu klasu
 * 
 * 
 */

public class StatickaKlasaPrimer {	
	
	static class StatickaUnutrasnjaKlasa{		
		public int broj;		
	}
	
	public static void proba(){
		StatickaUnutrasnjaKlasa kl = new StatickaUnutrasnjaKlasa();
		System.out.println(kl.broj);
	}
	
	

}
