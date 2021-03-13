package preklapanjemetoda;

public class SumaV {
	
	/*
	 * variadik metoda, moze se pozvati sa različitim brojem argumenata
	 */
	
	public int saberi(int ... sabniz) {
		System.out.println("Saberi variadic");
		int rez = 0;
		for(int sub:sabniz) {   // ulazni argument sabniz je tipa niz int-ova
			rez+=sub;
		}
		return rez;
	}
	
	public static void main(String[] args) {
		SumaV s = new SumaV();		
		System.out.println(s.saberi(4,4));		
		System.out.println(s.saberi(4,4,3,5,6,7));  
		System.out.println(s.saberi(3,3,1));
		System.out.println(s.saberi());
		System.out.println(s.saberi(2));
	
		
	}
	

}
