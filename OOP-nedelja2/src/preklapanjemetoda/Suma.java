package preklapanjemetoda;

public class Suma {
	
	/*
	 * primer preklapanja metoda - eng. method overrloading
	 */
	
	public int saberi(int sab1, int sab2) {
		System.out.println("Saberi dva int");
		return sab1+sab2;
	}
	
	
	
	public int saberi(int sab1, int sab2, int sab3) {
		System.out.println("Saberi tri int");
		return sab1+sab2+sab3;		
	}
	
	public double saberi(double sab1, double sab2) {
		System.out.println("Saberi double");
		return sab1+sab2;		
	}
	
	public double saberi(int sab1, double sab2) {
		System.out.println("Saberi int double");
		return sab1+sab2;		
	}
	
	public double saberi(double sab1, int sab2) {
		System.out.println("Saberi double int");
		return sab1+sab2;		
	}
	
	
	public static void main(String[] args) {
		Suma s = new Suma();		
		System.out.println(s.saberi(4,4));	 // na osnovu prosledjenih tipova argumenata poziva se odgovarajuca metoda	
		System.out.println(s.saberi(3,3));		 
		System.out.println(s.saberi(4.0, 5.0));
		System.out.println(s.saberi(4.0,4.1));
		
	}
	
	
	
	
	
	
	
	

}
