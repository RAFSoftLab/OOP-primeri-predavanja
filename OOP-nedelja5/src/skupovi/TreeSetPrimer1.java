package skupovi;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPrimer1 {

	public static void main(String[] args) {
		Set<ElementSkupa> sortiranSkup = new TreeSet<ElementSkupa>();
		sortiranSkup.add(new ElementSkupa("e"));		
		sortiranSkup.add(new ElementSkupa("b"));
		sortiranSkup.add(new ElementSkupa("c"));
		sortiranSkup.add(new ElementSkupa("a"));
		sortiranSkup.add(new ElementSkupa("d"));
		System.out.println(sortiranSkup);
		
		
	}

}
