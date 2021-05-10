package izuzeci;

public class Primer8 {

	public static void main(String[] args) {
		int[] a = new int[2];		
		dodajUNiz(a, 3, 1);		
	}
	
	public static void dodajUNiz(int[] niz, int indeks, int vrednost)throws IndexOutOfBoundsException {
		// ispaljivanje izuzetja
		if(indeks>=niz.length) throw new IndexOutOfBoundsException("Pogresan indeks niza");
	}

}
