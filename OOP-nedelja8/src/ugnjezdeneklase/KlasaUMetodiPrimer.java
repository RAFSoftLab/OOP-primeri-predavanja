package ugnjezdeneklase;

public class KlasaUMetodiPrimer {
	
	private int br;
	
	public void mojaMetoda(){
		
		class KlasaUMetodi{
			
			public void ispisi(){
				System.out.println("klasa u metodi"+br);
			}
			
		}
		
		KlasaUMetodi km = new KlasaUMetodi();
		km.ispisi();
		
	}	
}


