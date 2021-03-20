package objectdemo;

import nasledjivanjedemo.Zaposleni;

/*
 * svi objekti su instance kalse java.lang.Object - demo
 */

public class SimpleObjectDemo {

	public static void main(String[] args) {
		Integer br = Integer.valueOf(4);
		System.out.println(br instanceof Integer);  // true
		System.out.println(br instanceof Object);  // true
		System.out.println("abc" instanceof String); // string literal je instanca kalse String
		System.out.println("abc" instanceof Object); // ali i klase Object
		Zaposleni z = new Zaposleni("Marko", "Mikic");
		System.out.println(z instanceof Zaposleni);
		System.out.println(z instanceof Object);		
		Object obj = new Zaposleni("Ana","Maric");
		System.out.println(obj instanceof Zaposleni);
		System.out.println(obj instanceof Object);
		
	}

}
