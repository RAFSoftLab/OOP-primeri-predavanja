package liste;

import java.util.LinkedList;
import java.util.List;

public class ListaPrimer1 {

	public static void main(String[] args) {
		List<ElementListe> lista = new LinkedList<ElementListe>();
		lista.add(new ElementListe("a"));
		lista.add(new ElementListe("b"));
		lista.add(new ElementListe("c"));
		
		System.out.println(lista);
		
		ElementListe novi = new ElementListe("a");
		System.out.println(lista.contains(novi));
		
	}

}
