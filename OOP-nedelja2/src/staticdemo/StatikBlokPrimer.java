package staticdemo;

public class StatikBlokPrimer {
	
	static {
		System.out.println("Prvi static blok");
	}
	
	public static void main(String[] args) {   // kada se pokrene klasa prvo se izvršavaju oba static bloka redom, pa zatim main
		System.out.println("main metoda");    
	}
	
	
	static {
		System.out.println("Drugi static blok");
	}
	

}
