package skupovi;

import java.util.HashSet;
import java.util.Set;

public class SkupPrimer {
	
	public static void main(String[] args){
		Set<ElementSkupa> skup1 = new HashSet<ElementSkupa>();
		ElementSkupa esa = new ElementSkupa("a");
		ElementSkupa esaNovo = new ElementSkupa("a");
		ElementSkupa esb = new ElementSkupa("b");		
		skup1.add(esa);
		skup1.add(esaNovo);
		skup1.add(esb);
		skup1.add(null);
		System.out.println(skup1);
	}
}

