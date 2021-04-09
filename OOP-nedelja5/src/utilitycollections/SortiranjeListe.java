package utilitycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortiranjeListe {

	public static void main(String[] args) {
		
		List<String> imena = new ArrayList<>();
		imena.add("Marija");
		imena.add("Brankica");
		imena.add("Mirjana");
		imena.add("Ana");
		System.out.println(imena);   // [Marija, Brankica, Mirjana, Ana]
		Collections.sort(imena);
		System.out.println(imena);   // [Ana, Brankica, Marija, Mirjana]
		Collections.sort(imena,Collections.reverseOrder());
		System.out.println(imena);   // [Mirjana, Marija, Brankica, Ana]
	}
}


