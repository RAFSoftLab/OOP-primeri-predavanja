package izuzeci;

/*
 * kreiranje novog izuzetka
 * nasledjujemo klasu RuntimeException i tako kreiramo runtime izuzetak, ako nasledimo klasu Exception kreiramo checked izuzetak koji
 * mora da se obradi da bi se program kompajlirao
 * Koristi se u Primer9.java
 * 
 */

public class OpsegOceneException extends RuntimeException {
	
	public OpsegOceneException(int ocena) {		
		super("Vrednost "+ocena+" nije validna ocena, ocena mora biti u opsegu [5,10]");		
	}
}



