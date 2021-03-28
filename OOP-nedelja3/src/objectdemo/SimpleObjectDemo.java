package objectdemo;

import nasledjivanjedemo.Zaposleni;

/*
 * svi objekti su instance klase java.lang.Object - demo
 */

public class SimpleObjectDemo {

	public static void main(String[] args) {
		Integer br = Integer.valueOf(4);
		System.out.println(br instanceof Integer);  // true
		System.out.println(br instanceof Object);  // true
		System.out.println("abc" instanceof String); // true, string literal je instanca klase String
		System.out.println("abc" instanceof Object); // true, ali i klase Object
		Zaposleni z = new Zaposleni("Marko", "Mikic");
		System.out.println(z instanceof Zaposleni); // true
		System.out.println(z instanceof Object);	// true
		Object obj = new Zaposleni("Ana","Maric");
		System.out.println(obj instanceof Zaposleni);  // true		
		System.out.println(obj instanceof Object);    // true
		
	}

}
