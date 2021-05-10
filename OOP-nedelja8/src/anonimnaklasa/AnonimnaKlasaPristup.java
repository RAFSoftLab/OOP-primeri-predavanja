package anonimnaklasa;

public class AnonimnaKlasaPristup {
	
	public static void main(String[] args){
		
		String ispis = "ispis u anonimnoj klasi";
		
		MojInterfejs mi = new MojInterfejs() {			
			@Override
			public void ispisi() { 
				System.out.println(ispis);		 // pristup promenljivoj iz metode main 	
			}
		};		
		mi.ispisi();
		
	}

}
