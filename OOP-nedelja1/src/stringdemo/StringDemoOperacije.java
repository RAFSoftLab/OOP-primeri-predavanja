package stringdemo;

public class StringDemoOperacije {
	
	public static void main(String[] args) {
		
		String s5 = "aaaa";
		s5 = s5.concat("bbb");  // s5 dobija vrednost novog objekta koji se vraca iz operacije concat
		System.out.println(s5);   
		
		System.out.println(s5.replaceAll("a", "mmmmm"));  // ispisujemo rezultat operacijem ali s5 ostaje isto
		System.out.println(s5);   // s5 je aaaabbb
		System.out.println(s5.equalsIgnoreCase("aaaaBB"));	// poredjenje nezavisno od velicine slova
		
		
		// split demo
		System.out.println("-----------------split");
		String str1 = "a:avf b:ght c:fgh";		
		String[] strSplit = str1.split(" ");  // delimo string na mestu spejsa, dobijamo niz stringova 
		for(String str:strSplit)   // for-each petlja prolazi kroz niz 
			System.out.println(str);
		
		System.out.println("-------------------------");
		
		// vise delimitera
		String[] strSplit1 = str1.split("[ :]");  // delimo string na mestu spejsa ili dvotacke
		for(String str:strSplit1)
			System.out.println(str);
		System.out.println("-------------------------");
		String str2 = "abc55gtyh67gf";		
		String[] strSplit2 = str2.split("\\d");  // delimo string na mestu cifre, ako dodamo {2} delimo na mestu gde se nalaze dve cifre
		for(String str:strSplit2)
			System.out.println(str);
			
	}



}
