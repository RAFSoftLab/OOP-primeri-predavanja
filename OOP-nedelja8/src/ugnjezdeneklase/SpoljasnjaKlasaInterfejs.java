package ugnjezdeneklase;

public class SpoljasnjaKlasaInterfejs {
	
	private int broj;
	
	
	public interface MojInterface{
		
		public void metoda();
	}
	
	
	
	class UnutrasnjaKlasa{
		
		private int brojUn = broj;	
	}
	
	public static void main(String[] args){
		
		System.out.println(new SpoljasnjaKlasaInterfejs().new UnutrasnjaKlasa().brojUn);
		SpoljasnjaKlasaInterfejs sk = new SpoljasnjaKlasaInterfejs();
		UnutrasnjaKlasa u = sk.new UnutrasnjaKlasa();
		
	}	
	
	
	
	
}



	












