package skupovi;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPrimer {
	
	public static void main(String[] args){
		Set<String> sortiranSkup = new TreeSet<String>();
		sortiranSkup.add("e");		
		sortiranSkup.add("b");
		sortiranSkup.add("c");
		sortiranSkup.add("a");
		sortiranSkup.add("d");
		
		System.out.println(sortiranSkup);
	}

}
