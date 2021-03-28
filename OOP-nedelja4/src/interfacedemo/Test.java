package interfacedemo;



public class Test {

	public static void main(String[] args) {
		Bicikl b = new Bicikl(2);
		Vozilo v = new Bicikl(2);
		Pokretljiv p = new Bicikl(2);
			
		
		ProsirivoVozilo p1 = new Bicikl(2);
 		
 		System.out.println(p1 instanceof Vozilo);   // true
 		System.out.println(p1 instanceof Pokretljiv);   // true		
		
		Prosiriv p2 = new Bicikl(2);
		
		System.out.println(p2 instanceof Prosiriv);   // true
 		System.out.println(p2 instanceof ProsirivoVozilo);   // true
 		System.out.println(p2 instanceof Pokretljiv);  // true
 		

 		
 		
 		
 		
 		 
 		
		
		

	}

}
