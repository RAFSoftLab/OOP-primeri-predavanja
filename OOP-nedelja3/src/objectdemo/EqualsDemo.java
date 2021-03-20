package objectdemo;

import nasledjivanjedemo.Nastavnik;
import nasledjivanjedemo.Sluzbenik;

public class EqualsDemo {
	
	public static void main(String [] args) {
		
		Nastavnik n = new Nastavnik("Milos", "Milosevic", "1234567890123");
		Nastavnik n1 = n;
		Nastavnik n2 = new Nastavnik("Milos", "Milosevic", "1234567890123");
		System.out.println(n.equals(n1));  // true
		System.out.println(n.equals(n2));  // false (sa podrazumevanom implementacijom metode equals,
										   // ako nadjačamo metodu equals da se poredi po jmbg-u, onda vraća ispisuje true)
		
		System.out.println(n.equals(null)); 
		
		System.out.println(n.equals(new Object())); 
	}

}
